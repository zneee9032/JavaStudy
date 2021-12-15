/*=========================
  ■■■ 클래스 고급 ■■■
  - 중첩 클래스
=========================*/


//-- outer class
class Test2	//extends Object
{
	static int a=10;	//-- 전역변수 / Test2의 멤버변수 / static변수(class 변수 / 클래스 변수)
	int b=20;			//-- 전역변수 / Test2의 멤버변수 / nonstatic 변수 『instance변수(인스턴스 변수)』

	void write()		//-- ◆ 첫 번째 write() 메소드
	{

		System.out.println("write()...①");
		final int c=30;		//-- 지역변수 상수화된변수(값이변하지않는변수) ____> final int
		int d=40;			//-- 지역변수 (값이 수시로 변할 수 있는 변수) _____> int


		// ※ 변수 c 와 변수 d 는 둘 다 지역변수이지만...
		//    c 는 final 변수이기 때문에 두 번째 write() 메소드에서
		//    언제 접근하더라도 30의 고정된 값임을 보장받을 수 있다.

		//    반면에 d 는 그 값이 수시로 변동될 수 있는 상황이므로
		//    LocalTest 클래스의 인스턴스 생성 시점을 보장 받을 수 없기 때문에
		//    d 에 접근하는 것은 피해야 한다.



		// 메소드 안에 존재하는 또 다른 클래스(local class = 지역 클래스 )
		class LocalTest		//-- inner class

		{

			void write()	//-- ◆ 두 번째 write() 메소드

			{

				System.out.println("write()...②");
				System.out.println("a : " + a);
				System.out.println("b : " + b);
				System.out.println("c : " + c);
				//System.out.println("d : " + d);

				//===> ★check~! 에러 발생 (인스턴스 지역변수는 가변성을 띄기 때문에 할당 시기를 염려. 자바는 에러를 내버린다.)

			}//end write

		}

		// 첫 번째 write() 메소드에서 생성한 인스턴스

		LocalTest ob1 = new LocalTest();

		ob1.write();	//-- 두 번째 write() 메소드 호출
	}
}


public class Test119
{
	public static void main(String[] args)
	{
		Test2 ob2 = new Test2();
		ob2.write();	//-- 첫 번째 write() 메소드 호출

	}

}


