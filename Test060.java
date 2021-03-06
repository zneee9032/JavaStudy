/*============================================================
■■■실행 흐름의 컨트롤 (제어문, 조건문과 반복문)■■■
-break문
===========================================================*/
/*
아래와 같은 처리가 이루어지는 프로그램을 구현한다
단 입력 받는 정수는 1~100 범위 안에서만
가능하도록 작성한다.

실행예)

임의의 정수 입력 : -20

임의의 정수 입력 : 0

임의의 정수 입력 :2021

임의의 정수 입력 : 10
1~10 까지의 합 : 55
계속하시겠습니까(Y/N)? : Y

임의의 정수 입력 : 100
1~100 까지의 합 :5050
계속 하시겠습니까?(Y/N)? : N

계속하려면 아무키나 누르세요..→프로그램 종료
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test060

{
	public static void main(String[] args) throws IOException

	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//주요변수선언
		int n, s, i;		
		//n: 외부로부터 사용자의 입력값을 담아둘 변수
		//s: 누적합 연산 결과를 담아둘 변수
		//i: 1부터 1씩 사용자의 입력값 까지 증가할 변수
		char ch;
		//계속 진행할지 말지에 대한 의사표현 결과를 담아둘 변수

		while (true)											//-------------------------------->> 4번째 무한루프 구문
		{
			do													//-------------------------------->> 1번째 do while
			{
				System.out.print("\n임의의 정수 입력 : ");
				n = Integer.parseInt(br.readLine()); // BufferedReader에는 엔터 스킵이 내장되어있다.

			} 
			 while (n<1 || 100<n);			//&&이면 1보다 작으면서 100보다 크다라고 하기 때문에 안됌

			// 누적합 변수의 초기화 위치 확인 ~!!!!
			s=0;												//-------------------------------->> 2번째 누적합 산출


			for (i=1; i<=n; i++)

				s+=i;


			System.out.printf(">> 1 ~ %d 까지의 합 : %d\n", n, s);

			System.out.print("계속 하시겠습니까?(Y/N) : ");		//--------------------------->> 3번째 계속할지 말지의 여부

			ch = (char)System.in.read();

			System.in.skip(2); //System.inread()는 엔터가 스킵되지않기 때문에 스킵처리를 해줘야 에러가 나지않는다.


			//  ch!='y' && ch!='Y'   ← 모두 부정으로 바뀔 경우 논리연산자도 바뀐다.

			//          ↓

			//  ch=='y' || ch=='Y'		


			if (ch!='y' && ch!='Y')

			{

				// (while) 반복문을 빠져나갈 수 있는 코드 작성 필요

				//-- 위와 같은 의사 표현을 했다면

				//   그동안 수행했던 반복을 멈추고 빠져나가야 한다.

				break;

				//-- 멈춘다. 그리고 빠져나간다.         check~!!

			}
											//Y + 엔터 /y + 엔터=============★★5번째★★================>76번줄: 57번줄에서 숫자모양이 되어야함
											//=================> 엔터는 키값이 두개 이기에 걸러야한다

		}//end while

	}// end main()

}//end class Test060


/*

임의의 정수 입력 : -20

임의의 정수 입력 : 0

임의의 정수 입력 : 30
>> 1 ~ 30 까지의 합 : 465
계속 하시겠습니까?(Y/N) : y

임의의 정수 입력 : 60
>> 1 ~ 60 까지의 합 : 1830
계속 하시겠습니까?(Y/N) : n
계속하려면 아무 키나 누르십시오 . . .

*/