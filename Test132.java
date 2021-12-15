/*============================================================
			 ■■■ 자바의 주요(중요) 클래스 ■■■ 2021-08-09
-Strig클래스
StringBuffer / StringBuild / append()
===============================================================*/

//String str = new String();
//int a = 10;
//String name = "김진희";


/*
○String 클래스는 내부 문자열 데이터에 대한 수정이 불가능하다
=============================================================
		★즉, 내용 불변 : Immutable★
		================================!!
	문자열의 냐용이 변경되면 새로운 객체를 생성하며 참조 대상을 읽어버린 객체는 가비지 컬랙션의 대상이 되고, 새로운 객체에 새 주소를 할당하게 되므로 해시코드도 변함

○String 클래스 객체 간에 『+』연산자를 사용하게 되면 문자열 간의 결합이 가능하며, Strig클래스와 다른 클래스 객체, 또는 기본형 데이터간에 『+』연산자를 사용하는 경우에도 내부적으로 자동 String클래스로 변환이 가능

○눈으로 확인되는 결과는 이렇게 되지만..!
	String은 내용을 변경 할 수 없기 때문에 『+』연산자를 사용하게 되면 내부적으로 StringBuffer를 생성하여 append()메소드를 이용하여
	문자열 대한 결합을 수행하게 된다.
	따라서, 동적인 문자욜을 많이 사용하는 Servlet등에서는 되도록이면 String을 사용하는것 보다
	StringBuffer나 char[]를 사용하는것이 효율적일 수 있다

-==> 정적인 문자열을 처리하는경우에는 주로 String 클래스를 사용
	동적인 문자열으러 처리하는 경우에는
	런타임 시 동적으로 처리해주는 StrigBuffer 클래스를 사용하는것이 효율적이다

○ String객체의 생성 및 특징
String객체를 생성하는 방법은
1) 문자열 상슈를 지정하는 방법과
2)String클래스의 생성자를 이용하는 방법

String str1 = "Java";
String str2 = new String ("Java");

하지만 『=』 대입 연산자를 사용하여 문자열 상수를 지정하는 방법을 통해 객체를 생성하는 경우와
   『new』 연산자를 이용하여 객체를 생성하는 것은 객체의 위상과 의미가 다르다.

*/
public class Test132
{
	public static void main (String [] args)
	{
		String s1 = "seoul";
		String s2 = "seoul";
		String s3 = new String("seoul");
		String s4 = new String("seoul");
		//s1 과 s2객체가 참조하는 문자열 상수가 동일한경우
		//문자열이 저장된 기억장소의 영역이 동일하기 때문에 s1객체와 s2객체는 동일한 기억장소를 참조하게 된다.
		//하지만,
		//s3 과 s4는 동일한 영역이 아닌 다른 기억공간을
		//새롭게 (new)확보하여 문자열 상수를 그 공산에 대입한 경우이므로 두인스턴스는 같은 영역을 참조하는 것이아니다

		//따라서 『s3==s4』눈 거짓이되며 만약 같은 문자열 상수인지의 여부를 비교해야 할 경우하면 『equals()』메소드 이용

		System.out.println(s1==s2);		//true
		System.out.println(s1==s3);		//false
		System.out.println(s1==s4);		//false

		System.out.println();




		System.out.println("s1 : " + s1);	//--==>> s1 : seoul
		System.out.println("s2 : " + s2);	//--==>> s2 : seoul
		System.out.println("s3 : " + s3);	//--==>> s3 : seoul
		System.out.println("s4 : " + s4);	//--==>> s4 : seoul

		System.out.println();



		
		System.out.println(s1.equals(s2));	//-==> true
		System.out.println(s2.equals(s3));	//-==> true
		System.out.println(s3.equals(s4));	//-==> true
		System.out.println(s4.equals(s1));	//-==> true
		//eqyals()는 주소값을 비교 XXXX 
		System.out.println();


		System.out.println("s1 : " + s1.hashCode());	//s1 : 109324212
		System.out.println("s2 : " + s2.hashCode());	//s2 : 109324212
		System.out.println("s3 : " + s3.hashCode());	//s3 : 109324212
		System.out.println("s4 : " + s4.hashCode());	//s4 : 109324212
		System.out.println();
		// 객체가 같으면 hashCode 가 같지만, hashCOde가 같다고 해서 같은 객체는 XXXXXX

		s2 += "Korea";			// += 
		System.out.println(s2);
		//==>seoulKorea

		s2 = "Korea";			// =
		System.out.println(s2);
		//==>Korea

		// 이와 같은 경우
		// s2가 참조한 "seoul"이 저장된 영역은
		//『s2 += "Korea";』가 구행되는 시점에서 가비지 컬렉션의 대상이 되며
		//"seoul Korea" 상수가 저장된 영역을 s2가 참조하게 되었다가
		//다시 s2가 참조한 "seoul Korea"가 저장된 영역은
		//『s2 = "Korea";』가 수행되는 시점에서 가비지 컬렉션의 대상이 되며 "Korea"문자열 상수가 새롭게 저장된 영역을 s2가 참조하게 됨

		//★===>>String 객체의 내용은 불변이다
	}
}