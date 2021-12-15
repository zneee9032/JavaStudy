/*============================================================
■■■실행 흐름의 컨트롤 (제어문, 조건문과 반복문)■■■
-if ~ else 문 실습
===========================================================*/

/*
사용자로부터 임의의 두 정수와 연산자를 입력받아
해당 연산자의 연산 처리 결과를 출력하는 프로그램을 구현한다
단,if 조건문을 활용하여 처리할 수 있도록 하며,
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

public class Test032
{
	public static void main(String[] args) throws IOException
	{
		
		/* 방법 ⓐ
		//주요 변수선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b;				// 첫 번째, 두번째 정수
		char op;				// 연산자
		
		
		//연산 및 처리	
		System.out.print("첫 번째 정수 입력	: ");
		a = Integer.parseInt(br.readLine());

		
		System.out.print("두 번째 정수 입력	: ");
		b = Integer.parseInt(br.readLine());

		// Integer.pareInt()
		// "1234" →Integer.pareInt()→ 1234
		// "abcd"→Integer.pareInt()→ (x)

		System.out.print("연산자 입력[+ - * /]  : ");

		//op = System.in.read();				문자형태 일때,System.in.read();
		op = (char) System.in.read();	  //---------> 아스키코드 출력 할때만 System.in.read();

		//확인(테스트)
			//System.out.println("op : " + op);


		if(op=='+')				//아스키 코드 43==43
		{
			System.out.printf("\n>> %d + %d = %d\n",a,b, (a+b)); 
		} 
		else if (op=='-')		//45==45
		{
			 System.out.printf("\n>> %d - %d = %d\n",a,b,(a-b)); 
		} else if (op =='*')		//42==42
		{
			System.out.printf("\n>> %d * %d = %d\n",a,b,(a*b)); 	
		}else if (op=='/')		//47==47
		{
		   System.out.printf("\n>> %d / %d = %d\n",a,b,(a/b)); 		
		} else					
		{ 
			System.out.println("\n>> 입력 과정에서 오류");
		}																		*/

		/*
		//방법ⓑ

		//주요 변수선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

		int a, b,op;				// 첫 번째, 두번째 정수, 연산자
		
		
		//연산 및 처리	
		System.out.print("첫 번째 정수 입력	: ");
		a = Integer.parseInt(br.readLine());

		
		System.out.print("두 번째 정수 입력	: ");
		b = Integer.parseInt(br.readLine());

		// Integer.pareInt()
		// "1234" →Integer.pareInt()→ 1234
		// "abcd"→Integer.pareInt()→ (x)

		System.out.print("연산자 입력[+ - * /]  : ");

		//op = System.in.read();		문자형태 일때,System.in.read();
		op = Integer.parseInt(br.readLine());

		//확인(테스트)
		//System.out.println("op : " +op);


		if(op==43)				//아스키 코드 43==43
		
			System.out.printf("\n>> %d + %d = %d\n",a,b, (a+b)); // -->한줄일 때만 괄호 생략 가능
		 
		else if (op==45)		//45==45
		
			 System.out.printf("\n>> %d - %d = %d\n",a,b,(a-b)); 
		else if (op ==42)		//42==42
		
			System.out.printf("\n>> %d * %d = %d\n",a,b,(a*b)); 	
		else if (op==47)		//47==47
		
		   System.out.printf("\n>> %d / %d = %d\n",a,b,(a/b)); 		
		 else				//이것도 저것도 아니라면 else
		 
			System.out.println("\n>> 입력 과정에서 오류");          */



		//방법ⓒ
		//주요 변수선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

		int a, b, result=0;	//---------------->else : result 설정
		char op;				
		
		
		//연산 및 처리	
		System.out.print("첫 번째 정수 입력	: ");
		a = Integer.parseInt(br.readLine());

		
		System.out.print("두 번째 정수 입력	: ");
		b = Integer.parseInt(br.readLine());

		// Integer.pareInt()
		// "1234" →Integer.pareInt()→ 1234
		// "abcd"→Integer.pareInt()→ (x)

		System.out.print("연산자 입력[+ - * /]  : ");

		//op = System.in.read();		문자형태 일때,System.in.read();
		op = (char)System.in.read();

		//확인(테스트)
		//System.out.println("op : " +op);


		if(op=='+')				//아스키 코드 43==43
		
			result = a + b;
		 
		else if (op=='-')		//45==45
		
			result = a - b;
		else if (op =='*')		//42==42
		
			result = a * b;	
		else if (op=='/')		//47==47
		
		   result = a / b;	

	System.out.printf("\n >> %d %c %d = %d\n",a , op, b, result);	
		    

	}
}
/* 
첫 번째 정수 입력       : 3
두 번째 정수 입력       : 2
연산자 입력[+ - * /]  : +

 >> 3 + 2 = 5
계속하려면 아무 키나 누르십시오 . . .

첫 번째 정수 입력       : 3
두 번째 정수 입력       : 2
연산자 입력[+ - * /]  : ^

 >> 3 ^ 2 = 0
계속하려면 아무 키나 누르십시오 . . .

『result=0;	//---------------->else : result 설정』
*/