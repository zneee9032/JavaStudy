package JavaStudy01;

/*■■■클래스와 인스턴스■■■
-생성자 (Constructor)

생성자의 역할
1. 메모리 할당  //인스턴스 생성 시에 생성자가 호출됨
2. 초기화		// 멤버변수들을 초기화 cf.상수화 된 변수 (Final)초기화 할수 있음

생성자 특징
1. 생성자는 클래스의 이름과 동일한 이름을 가져야한다 (대소문자까지도 정확히 일치해야한다. 첫글자는 대문자)
2. 생성자도 메소드이지만, 일반 메소드처럼 호출될 수 없으며, 반환자료형을 가질수 없다 (『void』조차 가질 수 없으며, 값도 반환할 수 없다)
3. 생성자는 객체를 생성하는 과정에서 『new생성자()』의 형태로 호출된다. (인스턴스 생성 시 딱 한번만 호출된 후 그이후 호출될수 없다)*/
class NumberTest
{
	int num;	//전역 변수, 멤버 변수
				//자동으로 삽입되는 default 생성자
				//컴파일 과정에서 자동으로 생성되는 이 생성자는
				//사용자 정의 생성자가 존재하지 않을 경우에만 만들어진다.
	/*
	  NumberTest() 
	 { 
	 	//텅 비어있는 상태 
	 }
	 */
	
	//사용자 정의 생성자
	NumberTest()
	{
		num=10;
		System.out.println("사용자 정의 생성자 호출");
	}
	int getNum()
	{
		return num;
	}
}
// ※ 모든 클래스에는 생성자가 존재 한다.
//(사용자 정의 생성자를 따로 만들지 않을 경우..
// 컴파일 과정에서 default생성자가 자동으로 삽입된다.)
public class Test069
{
	public static void main(String[] args)
	{
		//NumberTest 클래스 기반 인스턴스 생성
		//존재 하지 않은 인스턴스 인데도 텅비어 있는 상태 즉 degault상태
		//사용자 정의 생성자가 존재 하지 않을 경우에만 만들어진다
		NumberTest nt1 = new NumberTest();
		//--===>>사용자 정의 생성자 호출
		// 인스턴스가 생성되는 시점에서 이와 동시에 생성자 호출이 이뤄진다.
		
		System.out.println(nt1.getNum());		//==>> 생성자 구성 이전 0, 생성자 구성이후 10
		//--==>>사용자 정의 생성자 호출
		//--==>>10
		
		//다 다른 객체 
		NumberTest nt2 = new NumberTest();
		NumberTest nt3 = new NumberTest();
		NumberTest nt4 = new NumberTest();
		NumberTest nt5 = new NumberTest();
	}
}
