/*=========================
  ■■■ 클래스 고급 ■■■
  - 중첩 클래스
=========================*/
// outer
class InnerOuterTest 
{
	static int a=10;
	int b=20;

	// inner
	class InnerNested
	{
		int c=30;

		void write() //-- inner 의 write()
		{

			System.out.println("inner 의 write()...");
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			System.out.println("c : " + c);
		}
	}

	void write() //-- outer 의 write()
	{
		System.out.println("outer 의 write()...");
		InnerNested ob1 = new InnerNested();
		ob1.write(); //-- inner 의 write()
	}

}// end class InnerOuterTest

// main() 메소드를 포하하고 있는외부의 다른 클래스
public class Test120
{
	public static void main(String[] args)
	{
		//out 의 인스턴스 생성
		InnerOuterTest ob2 = new InnerOuterTest();
		ob2.write();	//-- outer 의 write 메소드 호출

		// InnerNested ob3 = new InnerNested();
		// --==>> 에러 발생


		// InnerOuterTest.InnerNested ob3 = new InnerOuterTest.InnerNested();
		// --==>> 에러 발생


		// ※ 중첩 내부 클래스와는 달리 
		//		외부 클래스의 인스턴스(객체)를
		//    사용하지 않고 단독으로 내부 클래스의 인스턴스를 생성하는 것은 불가능하다.


		// ※ Test118 과 비교할 것~!!
		//	★	★	★	★	★	★	★	★		★	
		InnerOuterTest.InnerNested ob3 = ob2.new InnerNested();
		//-->>InnerOuterTest.InnerNested ob3 = new InnerOuterTest().new InnerNested(); 와 같은 구문
		ob3.write();
		//===>inner 의 write()...
				//a : 10
				//b : 20
				//c : 30
		InnerOuterTest.InnerNested ob4 = new InnerOuterTest().new InnerNested();
		ob4.write();		
		//inner 의 write()...
			//a : 10
			//b : 20
			//c : 30


		//outer 클래스명.inner 클래스명 참조변수명 = new outer생성자().new inner 생성자();

		// cf) static ->중첩 내부 클래스
		//Test.StaticNested ob = new Test.StaticNested();

		//outer클래스명.inner클래스명 참조변수명 = new outer클래스명.inner 생성자();


	}

}


