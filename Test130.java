/*============================================================
			 ■■■ 자바의 주요(중요) 클래스 ■■■2021-08-09
_ Wrapper 클래스 2021-08-09
_ .intValue() .byteValue()
===============================================================*/
public class Test130
{
	public static void main(String[] args)
	{
		byte b = 3;
		int i = 256;

		Byte b2 = new Byte(b);		//-- boxing 3
		Integer i2 = new Integer(i);	//-- boxing 256

		System.out.println(b2);		//--unboxing	(객체임에도 자동 형변환 되어 값으로 출력됨)
		System.out.println(i2);		//--unboxing
		//3
		//256

		print(b2);
		print(i2);
		
		byte b3 = b2.byteValue();	//-- unboxing 프리미티브자료형 바이트를 반환, b2로 , b3에 담아냄
		int i3 = i2.intValue();		//-- unboxing 프리미티브자료형 Integer i2를 반환, i3에 담아냄


		// check~!!!
		int i4 = b2.byteValue();
		// byte b4 = i2.intValue();	//--==>> 에러발생 (int를 byte로는 변환 불가)
		byte b4 = i2.byteValue();


		System.out.println(b3);	//--==>> 3
		System.out.println(i3);	//--==>> 256




		// check~!!!
		System.out.println(i4);	//--==>> 3
		System.out.println(b4);	//--==>> 0


		//2의 8승이 255 이어서 

	}

	
	/*

	static void print(Byte xxx)	//-- 이렇게 하는게 오버로딩되니 따로 구성해도 상관없다.

	{

	}

	static void print(Integer xxx)	//"

	*/

	
//---------------------------------------------------------------------------------------------------------------------------

	/*

	static void print(Object xxx)	//-- 최상위에 있는 객체타입이기 때문에... 모든 타입을 수용하지만 바람직하진 않다.

	{

	}

	*/

//---------------------------------------------------------------------------------------------------------------------------
	

	// java.lang.Number 클래스(추상클래스)는
	// 모든 Wrapper 클래스들의 부모 클래스(슈퍼클래스, 상위클래스)이다.
	// b2, i2 자료형이 Number n 에 넘어오면서
	// Auto-Boxing 이 일어나게 된다.

	static void print(Number n)	//https://docs.oracle.com/javase/8/docs/api/

	{

		System.out.println(n);
		System.out.println(n.intValue());

	}

}


