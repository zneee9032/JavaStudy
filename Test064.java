/*============================================================
■■■지역변수 전역변수	■■■
-전역변수의 초기화 테스트 실습
===========================================================*/
/*
Test 063.java와 비교*/
public class Test064
{

	//전역 변수 선언
	int a;
	//-- 전역 변수를 사용하는 과정에서 초기화를 하지 않았을 경우

	//   자동으로 0으로 초기화 지원
	//전역변수 d 선언
	boolean b;
	//전역변수 c 선언
	char c;
	//전역 변수 d 선언
	double d;

		public static void main(String[] args)

	{

		//Test064 인스턴스 생성

		Test064 ob = new Test064 ();

		System.out.println("ob.a : " + ob.a);

		//--==>> ob.a : 0

		System.out.println("ob.b : " + ob.b);

		//--==>> ob.b : false

		System.out.println("ob.c : " + ob.c);

		//--==>> ob.c : 

		System.out.println("ob.d : " + ob.d);

		//--==>> ob.d : 0.0

	}

}
