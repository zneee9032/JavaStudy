package JavaStudy01;

import java.io.IOException;
import java.util.Scanner;

// * ■■■클래스와 인스턴스■■■
// * -클래스 설게 실습
// * 
// *○ 실습 문제 
// *사용자로부터 임의의 두 정수와 연사자를 입력 받아 
// *사칙 연산을 수행하는 프로그램을 구현한다
// *단, 클래스와 인스턴스 개념을 활용하여 작성할 수 있도록 한다.
// *
// *실행 예) 
// *임의의 두정수 입력(공백 구분) : 10 5
// *임의의 연산자 입력(+ - */)    : +
// * >>10 + 5 = 15

class Operate
{
	//주요 변수 선언
	int num1,num2,result;			//전역 변수는 '0'으로 자동초기화 지원됨
	char op;
	
	//입력 메소드 정의
	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);
			System.out.print("임의의 두 정수 입력 (공백 구분) : ");
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			System.out.print("임의의 연산자 입력(+ - * /) : ");
			op = (char)System.in.read();
	}
	//연산 메소드 정의
	void calculate() 
	{
		switch (op)
		{
		case '+' : result = num1 + num2;break;
		case '-' : result = num1 - num2;  break;
		case '*' : result = num1 * num2;  break;
		case '/' : result = num1 / num2;  break;
	//	default : return;
		}
	}
	
	//출력 메소드 정의
	void print()
	{
		System.out.printf(">> %d %c %d = %d",num1,op,num2,result);
	}
}



public class Test068
{
	public static void main(String[] args) throws IOException
	{
		//Operate 인스턴스 생성
		Operate ob = new Operate();
		ob.input();
		ob.calculate();
		ob.print();
	}
}

//임의의 두 정수 입력 (공백 구분) : 10 2
//임의의 연산자 입력(+ - * /) : /
//>> 10 / 2 = 5
