/*==============================================
	■■■주민등록번호 유효성 검사■■■
================================================*/
/*
○주민등록번호 검증 공식
ⓐ마지막 자리를 제외한 앞자리 수를 규칙에 맞게 곱한다
	ex) 123456-1234567(주민번호)
		****** ****** ----------------------
		234567 892345 (각 자리에 곱해질 수)

ⓑ 규칙에 맞게 곱셈 연산을 수행한 결과를 모두 더한다
ex) 7 5 0 6 1 5 - 1 8 6 2 1 3 3 
    * * * * * *   * * * * * * *
	2 3 4 5 6 7   8 9 2 3 4 5 
---------------------------------------
→ 14+15+0+30+6+35+8+72+12+6+4+15
	== 217
ⓒ 더해진 결과값을 11로 나누어 『나머지』를 취한다
	  19
	------
  11|217
	 11
-------------
	107
	 99	
--------------
	  8 → 나머지

ⓓ11에서 나머지(→8)를 뺀 결과값을 구한다
	11 - 8 = 3

	※ⓒ의 처리 과정에서 나머지가 0인경우 →11→1
								  1인경우 →10→0
	이를 다시 10으로 나누어 나머지를 취한다.

ⓔ 『ⓓ』의 연산 결과가 주민번호를 구성하는 마지막 숫자와
		일치하는지의 여부를 확인한다
	
	일치   → 유효한 주민번호
	불일치 → 잘못된 주민번호
*/

//실행 예) 
// 주민번호 입력(xxxxxx-xxxxxxx) : 123456-12345678 → 입력 갯수 초과
// >>입력 오류
//계속하려면 아무키나 누르세요..

// 주민번호 입력(xxxxxx-xxxxxxx) : 123456-123456 → 입력 갯수 미달
// >>입력 오류
//계속하려면 아무키나 누르세요..

// 주민번호 입력(xxxxxx-xxxxxxx) : 990320-2254415 → 유효한 주민번호
// >>정확한 주민번호~!!

// 주민번호 입력(xxxxxx-xxxxxxx) : 990320-2254417 → 유효하지 않은 주민번호
// >>잘못된 주민번호~!!
//계속하려면 아무 키나 누르세요

//※추가 팁 ~!!!
//배열.length		→ 배열의 길이(배열방의 갯수) 반환
//문자열.length()	→ 문자열의 길이 반환
//String str = "abcdefg";
//str.length();		→ 7
//"abcdefg".length(); →7
//문자열.substring() →문자열 추출

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test102
{
	public static void main(String [] args)throws IOException
	{
		
/*
		//테스트
		String strTemp = "김진희";
		System.out.println(strTemp.length());
		//==> 3
		
		strTemp = "동해물과 백두산이";
		System.out.println(strTemp.length());
		// ==> 9

		strTemp = "study-hard";
		System.out.println(strTemp.length());
		//==>10

		strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(3,5));
		//==>DE
		//ABC DE FGHIJKLMNOPQRSTUVWXYZ
		//012 34 56789...

		strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(13,17));
		// ABCDEFGHIJKLM NOPQ RSTUVWXYZ==> 13부터 16까지
		//	==>>	NOPQ
		
		//strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		//System.out.println(strTemp.substring(13,85));
		// ABCDEFGHIJKLMNOPQRSTUVWXYZ==> 13부터 84까지
		//에러 발생 (컴파일에러)
		// StringIndexOutOfBoundsException:

		strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(5));
		//	==>>	FGHIJKLMNOPQRSTUVWXYZ

		System.out.println(strTemp.substring(5,strTemp.length()));
											// ---------------(strTemp의 전체 길이)
		//==>>	FGHIJKLMNOPQRSTUVWXYZ
		
*/
		//BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//입력 받은 주민번호
		String str;
	
		//주민번호의 각 자릿수에 곱해지는 수 배열 구성
		int[] gop = {2,3,4,5,6,7,0,8,9,2,3,4,5};
		//           * * * * * * * * * * * * * 
		//			 9 9 0 3 2 0 - 2 2 5 4 4 1  5

		//곱셈 연산 후 누적합(즉, 각 곱셈의 결과를 더해 나갈수 있도록 처리~)
		int tot =0;

		//사용자에게 안내 메세지 출력 및 주민번호 입력 받기
		System.out.print("주민번호 입력 (xxxxxx-xxxxxxx) : ");
		str = br.readLine();	//Integer은 안됌
		
		if (str.length() !=14)
		{
			System.out.println(">>입력 오류~!!");
			return;			//메소드 종료 -> main() 메소드 종료 -> 프로그램 종료
		}
		//테스트
		//System.out.println("자릿수 적합");
		/*
		주민번호 입력 (xxxxxx-xxxxxxx) : 990320-2254415
		자릿수 적합*/
		// ex) "990320-2254416"
		
		for (int i=0;i<13 ;i++ )
		{
			// System.out.println(i+ " ");	//0 ~ 12


			if (i==6)
			{
				continue;		//뒷부분 무시하고 계속해라
			}

																						//뒷부분
			tot += gop[i] * Integer.parseInt(str.substring(i,(i+1)));
			//		0→2									0 1 →"9" ==> tot += 2*9
			//		1→3									1 2 →"9" ==> tot += 3*9

			//     12→5								  12 13 →"1" ==> tot += 5*1
		}

		//---------------------------------------여기 까지 수행하면 규칙에 맞게 곱셈 연산을 수행한 결과를 모두 더한다까지~!!
																// 변수 tot에 담겨 있는 상황이 된다.

		int su = 11 - tot % 11;
		//테스트
		//System.out.println(su);
		/*
		주민번호 입력 (xxxxxx-xxxxxxx) : 990320-2254415
		5--------------------------------------------------->> 주민 번호 끝자리는 5
		su에 대한 연산결과가 두자리로 나올 경우 주민번호 마지막 자릿수와 비교 할 수 없는 상황
		*/
		su = su % 10;
		
		//여기까지 수행하면 『11에서 나머지를 뺀 결과값이 주민번호를 구성하는 마지막 숫자와 숫자와 일치 하는지 비교한다』최종 연산 결과는 변수 su 에 담겨 있는 상황이 된다.
	
		//최종 결과 출력
		//if (su= 주민등록 마지막 한자리 숫자)
		if (su==Integer.parseInt(str.substring(13)))
		
			System.out.println(">>정확한 주민번호~!!");
		else
			System.out.println(">>잘못된 주민번호~!!");
		
	} 
}
/*
주민번호 입력 (xxxxxx-xxxxxxx) : 990320-2254415
>>정확한 주민번호~!!
계속하려면 아무 키나 누르십시오 . . .

주민번호 입력 (xxxxxx-xxxxxxx) : 990320-2254417
>>잘못된 주민번호~!!
계속하려면 아무 키나 누르십시오 . . .

<자릿수 미달>
주민번호 입력 (xxxxxx-xxxxxxx) : 990320225441
>>입력 오류~!!
계속하려면 아무 키나 누르십시오 . . .

<자리수 초과>
주민번호 입력 (xxxxxx-xxxxxxx) : 99032022544156
>>잘못된 주민번호~!!
계속하려면 아무 키나 누르십시오 . . .
*/