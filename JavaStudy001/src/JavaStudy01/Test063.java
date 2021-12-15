/*================================
 * ■■■지역 변수와 전역 변수■■■
 * -지역 변수의 초기화 테스트 실습
 * 
 * Test064.java와 비교하기
 * 
 * ※지역 변수는 초기화 과정을 거치지 않으면 사용할 수 없다
 * (→자바가 자동으로 초기화를 수행해주거나 하지 않는다.)
 =================================*/
package JavaStudy01;

public class Test063
{
	public static void main(String[] args)
	{
		//지역 변수 선언
		int a;
		//선언 후 초기화 과정을 거치지 않은 상태!!
		
		boolean b;
		System.out.println("a : " +a);
		//지역 변수 a에 접근하여 그 값을 추력하고자 하는 구문
		
		System.out.println("b : " +b );
	}
}
