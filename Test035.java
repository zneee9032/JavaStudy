/*============================================================
■■■실행 흐름의 컨트롤 (제어문, 조건문과 반복문)■■■
-if ~ else 문 실습
===========================================================*/

/*
과제
사용자로부터 알파벳 한문자를 입력 받아 이를 판별하여
소문자를 입력받았을 경우 ..대문자로 변환하고
대문자를 입력 받았을 경우.. 소문자로 변환하는
프로그램을 작성한다
단, 입력은 『System.in.read()』메소드 활용하여 구현

실행 예)
// 알파벳 한 문자 입력 :A
>> a
//계속하려면 아무키나..

// 알파벳 한 문자 입력 :c
>> C
//계속하려면 아무키나..

// 알파벳 한 문자 입력 :7
>> 입력 오류
//계속하려면 아무키나..
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test035
{
	public static void main(String[] args) throws IOException
	{
		//주요 변수 선언

		int a;		//『System.in.read()』메소드 활용하여 구현 하기 위해 int형 변수 선언
		

		System.out.print("알파벳 한 문자 입력 : ");
		a = System.in.read();		//아스키 코드 불러오는 문

		
		if ((a>=65 && a<=90) || (a>=97 && a<=122))		//대소문자 아스키코드 논리연산자 작성
		{
			if (a<=90)		// 만약  대문자라면
			{
				a = a+32;	// 아스키코드 대문자 + 32 = 아스키코드 소문자
				System.out.printf("알파벳 한 문자 입력 :%c \n",a);
			}
			else			// 값이 소문자라면
			{
				a = a-32;	// 아스키코드 소문자 - 32 = 아스키코드 대문자
				System.out.printf("알파벳 한 문자 입력 :%c \n",a);
			}
			
		
		}
		else //n이 알파벳이 아닐때,
			System.out.println("입력 오류");
		return;
		
	}
}

