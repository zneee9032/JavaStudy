/*=====================================
 * ■■■지역 변수와 전역 변수■■■
 * -지역 변수의 초기화 테스트 실습
 * 
 * Test063.java와 비교하기
 *  
 =====================================*/
package JavaStudy01;

public class Test064
{
	//전역 변수 선언(=글로벌 변수)
	int a;
	//전역 변수는 사용하는 과정에서 초기화를 수행 하지 않았을 경우
	//자동으로 0으로 초기화 지원(cf.boolean -> false. char->" ";,double->0.0 )

	boolean b;
	
	char c;
	
	double d;
	
	public static void main(String[] args)
	{
		//System.out.println("a : " + a);
		//static이 인스턴스보다 먼저 메모리를 할당 받기 때문에 출력될 수 없음
		
		//Test064 기반의 인스턴스 생성
		Test064 ob = new Test064();
		
		System.out.println("ob.a : " + ob.a);
		//ob.a : 0
		
		System.out.println("ob.b : " + ob.b);
		//ob.b : false
		
		System.out.println("ob.c : " + ob.c);
		//ob.c : 
		System.out.println("ob.d : " + ob.d);
		//ob.d : 0.0
		
		
		
		
		
		
		
	}





}
