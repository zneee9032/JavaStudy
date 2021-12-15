/*==============================
자바의 개요 및 특징
-변수와 자료형
-키워드 및 식별자
=================================*/

public class Test004
{
	public static void main(String[] args)
	{
		double height = 163.8;
		int age = 23;
		char degree = 'A';
		
		String name = "김진희";
		//String name = "김진아";
		// * 스코프 영역 안에서 변수명은 식별자

		//String #name = "이주안"
		// $ _ 를 제외한 다른 특수문자는
		// 변수의 이름으로 활용할 수 없다.
		// 하지만, 그나마 사용 가능한 이들 특수문자도
		// 함부로 사용하는것은 고려해야한다

		//int tel = 01073899032;
		// ==>> 진법 변환으로 인한 0은 안됌
		//전화번호나 주민번호는 정수형태로 사용 불가
		String tel = "01073899032";
		String _tel = "010-7389-9032";

		String 주소 = "경기도 김포시";
		//-- 문법적으로 한글 단어를 변수명으로 사용할 수 있지만
		//	실무적인 측면에서 접근한다면
		//	절대로 한글 XX

		// 결과 출력
		System.out.println("name:" + name);
		System.out.println("tel : " + tel);
		System.out.println("_tel : " +_tel);	
		System.out.println("주소 : " + 주소);


	
	}
}

/*
name:김진희
tel : 01073899032
_tel : 010-7389-9032
주소 : 경기도 김포시
계속하려면 아무 키나 누르십시오 . . .
*/