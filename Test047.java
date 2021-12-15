/*============================================================
■■■실행 흐름의 컨트롤 (제어문, 조건문과 반복문)■■■
-반복문(while문) 실습
===========================================================*/

/*
사용자로부터 임의의 두 정수를 입력받아
작은 수 부터 큰수 까지의 합을 구하여
결과를 출력하는 프로그램을 구현한다

실행 예)
첫번째 정수입력 : 10
두번째 정수 입력 : 20
>> 10 ~ 20 까지의 합 : XXX
계속하려면 아무 키나 누르세요

//첫번째 정수 입력 : 10
두번 째 정수 입력 : 2
>> 2~10 까지의 합 :XXX
//계속하려면 아무키나 누르세요
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test047
{
	public static void main(String[] args) throws IOException
	{
		int n1,n2; //사용자로부터 입력받을 두정수를 담을 변수
		int sum = 0;  //두 정수의 합을 담을 변수
		int i;  //증가시킬 변수

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("첫 번째 정수 입력 : ");
		n1 = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		n2 = Integer.parseInt(br.readLine());

		if(n1>n2) 
		{
			n1=n1^n2;
			n2=n2^n1;
			n1=n1^n2;
		}

		i = n1; 
		while (i<=n2)
		{
			sum += i;
			i++;	
		}
			

		System.out.printf("%d ~ %d 까지의 합 : %d\n",n1,n2,sum);



	}
}
/*
첫 번째 정수 입력 : 4
두 번째 정수 입력 : 1
>> 1 ~ 4 까지의 합 : 10
계속하려면 아무 키나 누르십시오 . . .*/
