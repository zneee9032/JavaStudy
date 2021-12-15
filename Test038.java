/*============================================================
■■■실행 흐름의 컨트롤 (제어문, 조건문과 반복문)■■■
-switch 문 실습
===========================================================*/
/*
사용자로부터 임의의 두 정수와 연산자를 입력받아
해당 연산자의 연산 처리 결과를 출력하는 프로그램을 구현한다
단, switch 조건문을 활용하여 처리할 수 있도록 하며,
연산 결과는 편의상 정수형으로 처리 될 수 있도록 한다

실행예)
첫 번째 정수 입력		:20
두 번째 정수 입력		:14
연산자 입력 [+ = * /]	: +

>> 20 + 14 = 34
>> 계속하려면 아무 키나 누르세요
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test038
{
	public static void main(String[] args) throws IOException
	{
		
		// ⓐ주요 변수 선언		==========================================================> char op;
			
		/*BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int a, b, result=0;
		char op;

		//입력 및 처리
		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("연산자 입력[+ - * /] : ");
		op = (char)System.in.read();	

		switch (op)
		{
		case '+': result = a + b; break;
		case '-': result = a - b; break;
		case '*': result = a * b; break;
		case '/': result = a / b; break;
		default : return;
		}
		System.out.printf("\n>> %d %c %d = %d\n",a,op,b,result);
*/



		//ⓑ주요 변수 선언		==========================================================> String op;
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int a, b, result=0;
		String op;				//check~!!!!!!!!!!!!!

		//입력 및 처리
		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("연산자 입력[+ - * /] : ");
		op = br.readLine();		//check~!!!!!!!!!!!!!

		switch (op)				//check~!!!!!!!!!!!!!
		{
		case "+": result = a + b; break;
		case "-": result = a - b; break;
		case "*": result = a * b; break;
		case "/": result = a / b; break;
		default : return;
		}
		System.out.printf("\n>> %d %s %d = %d\n", a,op,b,result);

	}
}
/*ⓐ
첫 번째 정수 입력 : 3
두 번째 정수 입력 : 4
연산자 입력[+ - * /] : *

>> 3 * 4 = 12
계속하려면 아무 키나 누르십시오 . . .


ⓑ
첫 번째 정수 입력 : 4
두 번째 정수 입력 : 4
연산자 입력[+ - * /] : *

>> 4 * 4 = 16
계속하려면 아무 키나 누르십시오 . . .


*/