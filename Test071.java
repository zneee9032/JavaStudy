/*============================================================
■■■클래스와 인스턴스	■■■
===========================================================*/
public class Test071

{

	int x;

	// ※ 생성자의 이름은 항상 예외없이 클래스의 이름과 동일해야 하며

	//    필요할 경우 인수를 받아들이는 것도 가능하고,

	//    같은 이름의 메소드를 정의하는 중복정의가 가능하지만

	//    리턴값(반환값)은 가질 수 없다.

	// ※ 생성자는 다른 일반 메소드처럼 호출될 수 없고

	//    『new』연산자를 이용하여 객체를 생성하기 위해 호출되며,

	//    각 클래스의 인스턴스인 객체를 생성한 후에

	//    생성된 객체의 멤버를 초기화시키는 작업을 수행한다.


	Test071()

	{

		// ※ 생성자 내부에서 다른 생성자를 호출하는 것은 가능하다.

		//    단, 생성자 내부에서 가장 먼저 실행되어야 한다.

		this(200);

		x = 10;

		System.out.println("인자가 없는 생성자");

		System.out.println("Test071 의 x : " + this.x);

	}



	Test071(int x)

	{

		this.x = x;

		System.out.println("인자가 하나인 생성자");

	}

	Test071(double x)

	{

		System.out.println("인자가 하나인 생성자d");

	}

	public static void main(String[] args)

	{

		// Test071 클래스 기반의 인스턴스 생성

		Test071 ob1 = new Test071();

		Test071 ob2 = new Test071(100);

		Test071 ob3 = new Test071(10.0);

		// ※ 생성자는 『new』연산자를 이용하여

		//    객체를 생성하기 위해 호출되며,

		//    클래스 객체에 대한 인스턴스가 생성되면

		//    이 객체는 비로소 메모리를 할당받게 된다.


		System.out.println("main 에서 ob1.x : " + ob1.x);

		System.out.println("main 에서 ob2.x : " + ob2.x);

		//--==>> main 에서 ob1.x : 10

		//       main 에서 ob2.x : 100

	}

}
/*인자가 하나인 생성자
인자가 없는 생성자
Test071 의 x : 10
인자가 하나인 생성자
인자가 하나인 생성자d
main 에서 ob1.x : 10
main 에서 ob2.x : 100
계속하려면 아무 키나 누르십시오 . . .*/