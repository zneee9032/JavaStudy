/*============================================================
			 ■■■ 자바의 주요(중요) 클래스 ■■■2021-08-09
  - import 문 『java.lang.Object』클래스 /jdk1.5부터 가능
===============================================================*/
/*
※ 개요
 
   일반적으로 클래스는 하나만 존재하는 것이 아니라 
	같은 종류의 클래스를 여러 개 묶어서 사용하게 되는데
   이러한 클래스나 인터페이스의 묶음을 패키지(Package)라고 한다. 
	Sun(Oracle)사에서는 자바 프로그램을
   효율적으로 작성할 수 있도록 자바 표준 패키지를 제공하며, 
	자바 표준 패키지에는 그래픽, 네트워크 데이터베이스 등의
   다양하고 유용한 클래스들이 포함되어 있다.


※ import 문

   자바 표준 패키지나 사용자에 의해 외부에서 만들어진 패키지를 
	사용하기 위해서는 컴파일을 수행하기에 앞서
   프로그램에 포함시키는 과정이 필요한데 이 때, 『import』문을 이용하여 패키지 또는 클래스를 프로그램에 포함시키게 된다.
   하지만, 『java.lang.*』패키지는 자바 프로그램에 기본적으로 import 되어 있기 때문에 이 패키지의 클래스들은 import 하지 않고
   바로 사용하는 것이 가능하다.

   import 문은 반드시 클래스 설계 구문 전에 선언되어 있어야 하며 형식은 다음과 같은 두 가지가 있다.
   ┌ import [static] 패키지.클래스;		//[static] 생략 가능
   └ import [static] 패키지.*;


※ JDK 1.5부터는 import 다음에 『static』 키워드를 붙임으로써 정적으로 패키지를 import 할 수 있는 기능을 제공하게 되었다.
   만약 패키지를 정적으로 import 한 경우라면 모든 접근 가능한 메소드와 멤버 변수들은 접두사(ex → ob, br, sc)를 붙이지 않고
   사용하는 것이 가능하다.


※ Object 클래스
   『java.lang.Object』 클래스는 자바 클래스의 최상위 클래스로
	자바 표준 패키지의 클래스나 사용자에 의해 작성된 모~~~~~~든 클래스는
	기본적으로 이 클래스로부터 상속받는다	
	따라서 자바의 모든 클래스는 『java.lang.Object』클래스의 
	메소드를 가지고 있으며, 바로 사용하는것이 가능하다.

※	Java Plaform, Standard Edition 8 Specification Url
	-> http;//docs.oracle.com/javase/8/docs/api/
*/


//import java.io.*;
	//--> import java.lang.Object;
public class Test122		//extends Object
{
	public static void main(String[]args)
	{
	/*
	Object 클래스로부터 상속받은 메소드들...

	*/

	//public Test121()

	/*	 
		public String toStirng()
		{
			...;
		}
	*/

		Test122 ob = new Test122();

		//ⓐ
		//문자열.xxx(); //-- String 클래스가 갖고 있는 메소드 xxx() 호출
							//객체.xxx();
							//br.readeLnine();
							//sc.next();
		//-- 해당 객체를 생성시키는 대상 클래스의 메소드 xxx() 호출

		//ⓑ
		//rect ob = Rect();
		//ob.input();
		//-- ob 객체를 생성시키는 대상 클래스 -> Rect클래스
		//Rect클래스에 정의 되어 input() 메소드 호출	


		
		//객체.xxx();
		//-- 해당 객체를 생성시키는 대상 클래스에
		//   xxx() 메소드가 존재하지 않을 때...
		//   상속받은 클래스의 메소드 xxx() 호출

		//System.out.prinln(ob.test());
		//컴파일 에러


		System.out.println(ob.toString());
		//--==>> Test121@6d06d69c
		//-- 자바가 객체를 구분하기 위해 임의로 부여하는 식별 번호
		//에러 발생하지 않은 상황
		//	-> toString() 메소드가 Test122클래스에 존재
		//		-> Object 클래스로부터 상속



		System.out.println(ob);
		//--==>> Test121@6d06d69c

	}

}


