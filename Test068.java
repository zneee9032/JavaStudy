/*============================================================
■■■클래스와 인스턴스	■■■
===========================================================*/
/* 사용자로부터 임의의 두 정수와 연산자를 입력받아 
사칙연산을 수행하는 프로그램을 구현한다.
단, 클래스와 인스턴스의 개념을 활용하여 작성할 수 있도록 한다.

실행 예)
임의의 두 정수 입력 (공백 구분) : 10 5
임의의 연산자 입력(+ - * /)     : +
>> 10 +5 = 15
계속하려면 아무키나 누르세요

*/


import java.util.Scanner;
import java.io.IOException;

class Calculate
{	
	//주요변수 선언
	int a, b;	//사용자로부터 입력받은 두 정수를 담아둘 변수
	char c;
	// 메소드 정의(기능 : 입력
	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("임의의 두 정수 입력(공백 구분)    : ");
		a = sc.nextInt();
		b = sc.nextInt();

		System.out.print("임의의 연산자 입력(+ - * /)	  : ");
		c = (char)System.in.read();
	}
	// 메소드 정의(기능 : 연산)
	double cal()
	{
		double result = 0;

		if (c == '+')
			result = a+b;

		else if (c == '-')
			result = a-b;

		else if (c == '*')
			result = a*b;

		else if (c == '/')
			result = a/b;

		return result;
	}

	// 메소드 정의(기능 : 출력)
	void print(double s)
	{
		System.out.printf(">> %d %c %d = %.2f\n", a, c, b, s);
	}	

}

public class Test068
{
	public static void main(String[] args) throws IOException
	{
		Calculate ob = new Calculate();	// Calculate 클래스 기반의 인스턴스 생성	
		ob.input();					// 생성한 인스턴스를 통한 입력 메소드 호출

		double s = ob.cal();		   // 생성한 인스턴스를 통한 연산 메소드 호출

		ob.print(s);					// 생성한 인스턴스를 통한 출력 메소드 호출
		

	}
}