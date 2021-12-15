/*============================================================
■■■지역변수 전역변수	■■■
-지역변수의 초기화 테스트 실습
===========================================================*/
/*
Test 064.java와 비교
※지역 변수는 초기화 과정을 거치지 않으면 사용할 수없다.
(→ 즉, 자바가 자동으로 초기화를 수행해 주거나 하지 않는다.)*/
public class Test063
{
	public static void main(String[] args)
	{
		// 지역변수선언
		int a;
		//-- 선언 후 초기화 과정을 거치지 않은 상태~!!

		System.out.println("a : " + a);
		//-- 지역 변수 a에 접근하여 그 값을 출력하고자 하는 구문
		//--==>> 컴파일 에러 발생
		//-- variable a might not have been initialized
	}

}
/*
Test063.java:26: error: variable a might not have been initialized
                System.out.println("a : " + a);
                                            ^
1 error
계속하려면 아무 키나 누르십시오 . . .

*/