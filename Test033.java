/*============================================================
■■■실행 흐름의 컨트롤 (제어문, 조건문과 반복문)■■■
-if ~ else 문 실습
===========================================================*/
/*
사용자로부터 임의의 정수 세개를 입력 받아
작은 수에서 큰 수 순으로 출력하는 프로그램을 구현한다.
실행 예)
첫 번째 정수 입력 : 5
두번째 정수 입력 : 15
세번째 정수 입력 : 10

>> 정렬 결과 :5 10 15
계속하려면 아무 키나 누르세요...
*/

import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.io.IOException;


public class Test033

{

	public static void main(String[] args) throws IOException

	{
		//주요 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n1, n2, n3;	//-- 사용자가 입력하는 임의의 정수 세 개 를 담을 변수
		int temp;		//-- 임시 저장 변수

		// 연산 및 처리
		System.out.print("첫 번째 정수 입력 : ");		//형변환
		n1 = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");		//형변환
		n2 = Integer.parseInt(br.readLine());

		System.out.print("세 번째 정수 입력 : ");		//형변환
		n3 = Integer.parseInt(br.readLine());

		//논리
		//만약 첫 번째 정수 (a)가 두번째 정수 (b)보다 크다면 
		//					a와 b 두정수의 자리를 바꾼다

		//만약 첫 번쨰 정수 (a)가 세번째 정수 (c)보다 크다면
		//					a 와 c 두정수의 자리를 바꾼다

		//만약 두번째 정수 (b)가 세버째 정수 (c)보다 크다면
		//					b와c 두정수의 자리를 바꾼다


		if (n1>n2)    //   ⓐ첫 번째 정수가 두 번째 정수보다 클때

		{
												//두번째 방법
			temp = n1;							//n1=n1^n2;
			n1 = n2;							//n2=n2^n1;
			n2 = temp;							//n1=n1^n2;
			//테스트
			System.out.println("자리바꿈 발생");			//몇번의 자리바꿈발생하는지 출력
		}

		if (n1>n3)    //   ⓑ 첫 번째 정수가 세 번째 정수보다 클때

		{

			temp = n1;							//n1=n1^n3;				
			n1 = n3;							//n3=n3^n1;
			n3 = temp;							//n1=n1^n3;
			//테스트
			System.out.println("자리바꿈 발생");

		}

		if (n2>n3)    //  ⓒ 두 번째 정수가 세 번째 정수보다 클때

		{
			
			temp = n2;							//n2=n2^n3;
			 n2 = n3;							//n3=n3^n2;
			 n3 = temp;							//n2=n2^n3;
			//테스트
			System.out.println("자리바꿈 발생");

		}


		// 결과 출력

		System.out.printf("정렬결과 \n>> %d %d %d\n", n1, n2, n3);

	}

}


