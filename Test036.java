 /*============================================================
■■■실행 흐름의 컨트롤 (제어문, 조건문과 반복문)■■■
-switch 문 실습
===========================================================*/

/*
○다중 선택문이라 하며,switch 문 다음의 수식 값에 따라
실행 순서를 여러 방향으로 분기 할 때 사용하는 문장이다.
○ 형식구조
switch(수식)
{
	case 상수1 : 문장1; [break;]
	case 상수2 : 문장2; [break;]

	[default :문장 n+1 ;[break;]]
}

switch문의 『수식』과 case의 『상수』는
byte,short,int,long이어야한다.

case문 뒤에 『break;』가 없는 형태인 경우
다음 case문의 문장을 계속해서 (이어서) 수행하게 된다 => 기본모델	*/

//당신의 이름은 김진희입니다.
//총점은 xx,평균은 xx입니다
//등급은 A입니다

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test036
{
	public static void main(String[]args) throws IOException
	{
		//BufferedReader인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//주요변수 선언
		String name;
		int Kor,Mat,Eng,Tot;
		int Avg;
		char Grade;
		
		//입력 및 출력
		System.out.print("왓 유얼 네임? : ");
		name = br.readLine();	

		System.out.print("국어는 몇 점? : ");
		Kor = Integer.parseInt(br.readLine());

		System.out.print("수학은 몇 점? : ");
		Mat = Integer.parseInt(br.readLine());

		System.out.print("영어는 몇 점? : ");
		Eng = Integer.parseInt(br.readLine());

		 Tot = Kor + Eng + Mat;
		 Avg = Tot/3;
		System.out.printf("총점은 : %d\n",Tot); 
		System.out.printf("평균은 : %d\n",Avg); 
		/*
			왓 유얼 네임? : 김진희
			국어는 몇 점? : 99
			수학은 몇 점? : 88
			영어는 몇 점? : 77
			총점은 : 264
			평균은 : 88.00
			계속하려면 아무 키나 누르십시오 . . .
		*/

		switch (Avg / 10)
		{
			case 10 : case 9 :		//==>Check~!!!
				Grade = 'A';
				break;
			case 8 :
				Grade = 'B';
				break;
			case 7 :
				Grade = 'C';
				break;
			case 6 :
				Grade = 'D';
				break;
			default :
				Grade = 'F';
		}
		System.out.printf("등급은 %c 입니다.\n", Grade);
	}
}
/*
왓 유얼 네임? : 김진희
국어는 몇 점? : 90
수학은 몇 점? : 99
영어는 몇 점? : 100
총점은 : 289
평균은 : 96
등급은 A 입니다.
계속하려면 아무 키나 누르십시오 . . .

왓 유얼 네임? : 김진아
국어는 몇 점? : 77
수학은 몇 점? : 66
영어는 몇 점? : 55
총점은 : 198
평균은 : 66
등급은 D 입니다.
계속하려면 아무 키나 누르십시오 . . .

*/