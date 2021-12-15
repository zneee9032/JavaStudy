/*============================================================
■■■클래스와 인스턴스	■■■
-생성자(Constructor)와 초기화 블럭(Initialized Bolock)
===========================================================*/
public class Test073

{

	int n;

	int m;




	// 생성자(Constructor)

	Test073()

	{

		n = 100;

		m = 200;

		System.out.println("생성자 실행...");

	}




	// 초기화블럭(Initialized Block)

	{

		n = 10;

		m = 20;

		System.out.println("초기화 블럭 실행...");

	}




	// 생성자(Constructor)

	Test073(int n, int m)

	{

		this.n = n;

		this.m = m;

	}




	// 출력 메소드 정의

	void write()

	{

		System.out.println("n : " + n + ", m : " + m);

	}




	public static void main(String[] args)

	{

		Test073 ob1 = new Test073();

		ob1.write();

		//--==>> n : 100, m : 200




		Test073 ob2 = new Test073(1234, 4567);

		ob2.write();

		//--==>> n : 1234, m : 4567

	}

}

/*
초기화 블럭 실행...
생성자 실행...
n : 100, m : 200
초기화 블럭 실행...
n : 1234, m : 4567
계속하려면 아무 키나 누르십시오 . . .

=> 클래스 안에서 연산은 불가능
=> */