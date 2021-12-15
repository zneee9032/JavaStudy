/*============================================================
  ■■■ 클래스 고급 ■■■2021-08-09
  - 중첩 클래스_Annoymous클래스(익명의 클래스 : 무명 클래스)
===============================================================*/
/*
○Annoymous클래스(익명의 클래스 : 무명 클래스)

-이름 없는 클래스

-클래스 또는 인터페이스에 대한 객체를 생성하면서
 바로 클래스 또는 인터페이스를 정의하는 클래스

-정의하는 부분과 생성하는 부분이 하나로 묶어져 new수식이 있는곳에서
 바로 클래스 또는 인터페이스를 정의 하는것을 의미한다

-awt나 안드로이드 이벤트 처리에서 일반적으로 사용		(awt실무에서 별로 사용하지 않음)

-상위 클래스 메소드를 하나 정도 재정의 할 필요성이 있을떄 사용

-클래스의 객체가 필요하면 또 다시 클래스를 생성해야 하는
  번거로움 떄문에 익명의 클래스를 생성하며 처리한다.	(잠깐 쓰고 버릴거라서 이름을 붙이지 않는다!)


○ 형식 구조
new 상위클래스의 생성자()
{
	접근제어지시자 자료형 메소드()
	{
		...;
	}
};		//세미콜론 check~!!!

class()

*/

class Test3	// extends Object 뒤에 붙임 => Object의 하위 클래스
{
	/*
	Object클래스의 멤버들
	...
	
	ex)
	 public String toStirng()
		{
			...;
		}
	*/
	public Object getString()
	{
		/*ⓐ,ⓑ는 같은 구문이다
		ⓐ
		Object result;
		result = new Object();
		return result;
		*/

		/*ⓑ
		return new Object();
				----------------->Object 형
		*/	

		return new Object()
		{
			@Override	
			public String toString()
			{
				return "익명의 클래스...";
			}
		};		//세미콜론 체크~!
	
	}	//getString()
}//Test3



public class Test121 // extends Object

{

	public static void main(String[] args)

	{

		Test3 ob1 = new Test3();
		Test3 ob2 = new Test3();
		System.out.println(ob1.toString());
		//==>Test3@15db9742
		
		Test121 ob3 = new Test121();
		System.out.println(ob2.toString());
		//--==> Test3@6d06d69c

        System.out.println(ob2.getString());
		//.toString()); 와 동일, toString()은 Object가 가진 메소드라 상속받아 불러와짐
		//      익명의 클래스...

	}

}


