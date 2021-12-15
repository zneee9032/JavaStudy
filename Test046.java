/*============================================================
■■■실행 흐름의 컨트롤 (제어문, 조건문과 반복문)■■■
-반복문(while문) 실습
===========================================================*/

/*
사용자로부터 임의의 정수를 입력받아
입력받은 정수가 소수인지 아닌지를 판별하여
졀과를 출력하는 프로그램을 구현

//실행예
//임의의 정수 입력 : 10
10 → 소수 아님
계속하려면 아무키나 누르세요

//임의의 정수 입력 : 11
11 → 소수 
계속하려면 아무키나 누르세요

＊소수 : 1또는 자기자신의 값 이외의 어떤수로도 나누어 떨어지지 않는 수 단, 1은 소수아님
*/

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test046
{
	public static void main(String[] args) throws IOException
	{

		// ○ 주요 변수 선언 		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		int num;    //--사용자 입력값을 담아낼 변수
		System.out.print("임의의 정수 입력 : ");
		num = Integer.parseInt(br.readLine());
	
			
		// 입력 및 처리
		int n = 2;	//--입력값을 대상으로 나눗셈연산을 수해할 변수
					//  (1씩 증가)		  5 → 2 3 4
		boolean flag = true;	//우왓~소수다~!!
		

		while (n<num)		//num=5 → n=2~4	//num=15 →n=2~14
		{

			//입력값(num=5)이 n(2,3,4)로 나누어 떨어지는지 확인
			if(num%n==0)	//값이 0으로 떨어지는 것은 소수 아님
			{	
				//num은 소수가 아니다.
				flag = false;		//--에이~ 소수가 아니엇네~!!!
						break;		// --------------------------------------------------> 여러 반복문을 할 필요 XXX
			}
				n++;
		}
			//결과 출력 (출력 전에 수행해야 할 추가 확인 → 1인지 아닌지에 대한 추가 검토)
		
		if(flag  && num!=1) // flag의미는 true ,false담아둠
			System.out.printf("%d -> 소수 ~!!!\n",num); 
		else 
			System.out.printf("%d -> 소수 아님~!!!\n",num);

	}
}


/*
임의의 정수 입력: 1
1 → 소수아님
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력: 11
11 → 소수
계속하려면 아무 키나 누르십시오 . . .
*/
