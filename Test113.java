/*==============================================
	■■■ 클래스 고급■■■				
-인터페이스(Interface)
================================================*/
/*
※	인터페이스란?
	완전히 미완성된 채로 남겨져
	인터페이스 안에 존재하는 그 어떤 메소드도
	몸체(정의부)가 없기 때문에 사실상 실행 부분이 존재 하지않는다
	클래스를 위한 템플릿으로서의 기능을 수행하는 추상 클래스의 한 종류이다
	=========================================================================!(추상클래스의 한 종류!!)

※	인터페이스는 클래스와 달리 다중상속이 가능하며 
	인터페이스 자체도 상속된다
	기존의 c++언어등에서 지원되는 다중 상속이
	사용과정에서 많은 문제점을 노출시켰기 떄문에
	자바에서는 다중 상속의 개념을 인터페이스라는 개념으로 변형하여
	인터페이스를 통해 다중 상속을 구현하는 방법을 지원한다
	==========================================================================!(다중 상속 가능!!)

※	인터페이스는 상수와 추상 메소드만 가 질 수 있으며
	인터페이스 안의 메소드들은 접근제어지시자를 명시하지 않아도
	『public』으로 설정되어 클래스에서 구현함으로써 
	바로 접근이 이루어질 수 있다
=============================================================================! 접근 제시자 안쓰면 인터페이스는 public!

※특징
	- 추상클래스의 일종으로 선언만 있고 정의가 없다
	- final변수는 가질수 있다(상수 개념)
	- 인터페이스는 『public Static final』 상수만 만들 수 있다
	- 인터페이스를 구현하기 위해선 『extends』대신에 『implements』를 이용한다
	- 하나 이상의 인터페이스를 『implements』 할 수있다
	- 인터페이스를 『implements』 한클래스는 인터페이스의 모든 메소드를 Overriding해야한다
	  인터페이스가 다른 인터페이스를 상속 받을 수 있으며, 이때 『extends』키워드를 사용한다
	  또한,클래스와 달리 인터페이스는 다중 상속이 가능하다
=======================================================================================static final만 가능!

클래스 interface 클래스

클래스 implements 인터페이스

인터페이스 interface 인터페이스 인터페이스
*/

//Demo 인터페이스
interface Demo
{
	public static final double PI = 3.1241592;	//가능		static final만 가능!
	
	//인터페이스의 멤버 변수는
	//『static final』을 별도로 명시하지 않아도 자동으로 static final 인상태~
	public int a = 10;				//int a 의 의미(x)



	//인테이스의 메소드는 선언만 가능(정의 불가), 자동으로 abstract인 상태
	//public abstract void print();		
	public void print();//---------------------->abstract붙이지 않더라도 가능!
	/*
	{
		System.out.println("PI : " + PI);		//선언만 해야지 정의 안됌
	}
	*/	
		
}

//클래스 
//class DemoImpl
//class DemoImpl extends Demo(x)
//abstract class DemoImpl extends Demo(x)
//class DemoImpl implements Demo(x)
// ↓
// 추상 클래스 - 인터페이스를 구현하는 추상 클래스
//abstract class DemoImpl implements Demo
// ↓
//클래스 - 인터페이스를 구현하는 클래스
class DemoImpl implements Demo
{
	@Override
	public void print()
	{
		System.out.println("인터페이스 메소드 재정의...");
	}

	public void write()
	{
		System.out.println("클래스에 정의된 메소드...");
	}
}






//main() 메소드를 포함하고 있는 외부의 다른클래스
public class Test113
{
	public static void main(String [] args)
	{
		//Demo ob = new Demo();			//Demo 인스턴스 가능? = 추상클래스는 인스턴스 생성 불가 = 인터페이스는 추상클래스보다 더 추상적
										//생성불가!!

		//DemoImpl ob = new DemoImpl();	//추상클래스여서 생성불가!!!
		//==> print()-------------------> print()메소드 재정의 후 가능


		// DemoImpl obTemp = new DemoImpl();
		//Demo ob = (Demo)obTemp;
		// Demo ob = obTemp;


		//● 업 캐스팅
		// 인터페이스 객체는 상위 객체
		Demo ob = new DemoImpl();		
		ob.print();
		//--==>> 인터페이스 메소드 재정의...
		// ob.write();
		//--==>> 에러 발생

		((DemoImpl)ob).write();			//-- 다운 캐스팅----------------------> 형변환
		//--==>> 클래스에 정의된 메소드...


		System.out.println(Demo.PI);	//-- static 이기 때문에...
		//--==>> 3.141592

		System.out.println(Demo.a);		//-- static 이기 때문에...
		//==>10

		//Demo.a = 30;					//-- final 이기 때문에...
		//--==>> 에러 발생

	}

}
/*
인터페이스 메소드 재정의...
클래스에 정의된 메소드...
3.1241592
계속하려면 아무 키나 누르십시오 . . .
*/

