/*=============================
자바 프로그래밍
-산술 연산자
-BufferedReader
-printf()
==============================*/

// 사용자로부터 임의의 정수를 두번 입력받아
//사칙연산 및 나머지 연산을 수행하여
// 그 결과를 출력하는 프로그램을 구현한다.
//단, 입력받은 과정은BufferdReader를 활용할 수 있도록하고,
//출력하는 과정은 printf() 메소드를 활용 할 수 있도록 한다.
// 또한, 나눗셈 연산은 편의상 정수 기반으로 처리한다

// 실행 예)
//첫 번째 정수 입력 : 10
//두번째 정수 입력 : 2

//====[결과]====
//10 + 2 =12
//10 - 2 = 8
//10 *2 = 20
//10 /2 =5
//10 % 2 =0
//==============
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test019
{
	public static void main(String[] args) throws IOException
		{

			
			//☆주요 변수 선언
			// BufferedReader 인스턴스 생성
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int num1, num2;						// 사용자 입력 값을 담을 변수
			int res1, res2,res3,res4,res5;		 // 각 연산에 대한결과를 담을 변수

			//☆연산 및 처리
			//- 사용자에게 안내 메세지 출력 및 입력값얻어오기
			System.out.print("첫번째 정수 입력 :");	
			num1 = Integer.parseInt(br.readLine());

			System.out.print("두번째 정수 입력 :");	
			num2 = Integer.parseInt(br.readLine());

			res1 = num1 + num2;
			res2 = num1 - num2;
			res3 = num1 * num2;
			res4 = num1 / num2;
			res5 = num1 % num2;
			//☆결과 출력
			System.out.printf("\n=====[결과]=====\n");

			System.out.printf("%d + %d = %d\n",num1,num2,res1);	
			System.out.printf("%d - %d = %d\n",num1,num2,res2);
			System.out.printf("%d * %d = %d\n",num1,num2,res3);
			System.out.printf("%d / %d = %d\n",num1,num2,res4);
			System.out.printf("%d %% %d = %d\n",num1,num2,res5);
		
			System.out.printf("\n================\n");
			
		}
}

/*
첫번째 정수 입력 :20
두번째 정수 입력 :4

=====[결과]=====
20 + 4 = 24
20 - 4 = 16
20 * 4 = 80
20 / 4 = 5
20 % 4 = 0

================
계속하려면 아무 키나 누르십시오 . . .*/