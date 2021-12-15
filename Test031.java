/*=============================
연산자(operator)
-삼항 연산자 == 조건 연산자
==============================*/

/*
사용자로부터 임의의 연도를 입력 받아
입력 받은 연도가... 윤년인지 평년인지 판별하여
그결과를 출력하는 프로그램을 구현 한다
단, 입력 데이터는 BuffereddReader 를 활용하고
처리 과정은 if 조건문을 활용하여 수행할 수 있도록 한다

//실행 예)
임의의 연도 입력 : 2021
2021 → 평년
//계속하려면 아무키나 누르세요

임의의 연도 입력 : 2020
2021 → 윤년
//계속하려면 아무키나 누르세요

임의의 연도 입력 : 2012
2021 → 윤년
//계속하려면 아무키나 누르세요

//2월이 28일 까지 있는 해는 →평년
		29일 까지 있는 해는 →윤년                           
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;						//BufferedReader 설계도	작성

public class Test031
{

	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		 int year;								//사용자가 입력하는 연도를 담아 둘 변수
		 String strResult;						//윤년 평년에 대한 판별 결과를 담아둘 변수

		// 연산 및 처리
		 System.out.print("임의의 연도 입력 : ");
		 year = Integer.parseInt(br.readLine());

		 //☆윤년의 판별 조건 => 연도가 4의 배수이면서 100의 배수가 아니거나
								//400의 배수이면 윤년
								//그렇지 않으면 평년
		//조건문 작성, 논리연산자						
		if (year%4==0 && year%100!=0 || year%400==0)
		{
					strResult="윤년";
		}			
		else
		{
					strResult="평년";
		}
	
		// 결과 출력
		System.out.printf("%d년 -> %s\n", year, strResult);
		//System.out.printf ("2012->평년",year, strResult);
		
	}
}
/*
임의의 연도 입력 : 2012
2012년 -> 윤년
계속하려면 아무 키나 누르십시오 . . .

임의의 연도 입력 : 2020
2020년 -> 윤년
계속하려면 아무 키나 누르십시오 . . .

임의의 연도 입력 : 2021
2021년 -> 평년
계속하려면 아무 키나 누르십시오 . . .
*/