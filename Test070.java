/*============================================================
■■■클래스와 인스턴스	■■■
-생성자(constructor)
===========================================================*/

class NumberTest2

{
	int num;
	// 사용자 정의 생성자
	NumberTest2(int n)

	{
		num = n;
		System.out.println("생성자 호출 시 매개변수 전달 : " + n);
	}

	int getNum()

	{
		return num;

	}

}

public class Test070
{
	public static void main(String[] args)

	{

		// NumberTest2 클래스 기반의 인스턴스 생성

		// NumberTest2 nt = new NumberTest2();		//-- 컴파일 에러 발생


		//-- NumberTest2 클래스에는
		//   사용자 정의 생성자가 존재하고 있는 상황이기 때문에

		//   『default 생성자』가 자동으로 생성되지(삽입되지) 않는다.
		//	 사용자 정의 생성자는 매개변수를 갖는 형태이끼 떄문에
		//	위와 같이 매개변수 없는 생성자 호출 시 문제가 발생하는것이다.

		NumberTest2 nt = new NumberTest2(10);

		//--==>> 생성자 호출 시 매개변수 전달 : 10

		//-- 인스턴스 생성과 동시에 인자값이 있는 사용자 정의 생성자 호출~!!


		System.out.println("메소드 반환 값 : " + nt.getNum());

		//--==>> 메소드 반환 값 : 10

		NumberTest2 nt2 = new NumberTest2(5214);

		//--==>> 생성자 호출 시 매개변수 전달 : 5214


		System.out.println("메소드 반환 값 : " + nt2.getNum());

		//-->> 메소드 반환 값 : 5214

	}

}
/*
실행 결과

생성자 호출 시 매개변수 전달 : 10
메소드 반환 값 : 10
생성자 호출 시 매개변수 전달 : 5214
메소드 반환 값 : 5214
계속하려면 아무 키나 누르십시오 . . .*/