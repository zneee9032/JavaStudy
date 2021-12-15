/*==============================================
	■■■ 클래스 고급■■■
-상속(Inheritance)
================================================*/

/*
※ 메소드 오버라이딩(mathod Overriding)의 특징
   ★ 메소드 이름, 리턴타입, 파라미터 수나 타입이 완전히 일치해야 한다.              //+ 접근제어지시자 빼고~!!!!!!!

   ★ 반드시 상속 관계가 있어야 한다.

   ★ 재정의된 하위 클래스의 메소드 접근제어지시자는 상위 클래스의 메소드 접근제어지시자보다 범위가 크거나 같아야 한다.
				-----------------------------------------------------------------------------------------------------------!
		★★★★★privite < defulf < protected < public(크기 순서)★★★★★
																			
     예를 들어 상위 클래스 메소드의 접근제어지시자가 『protected』 인 경우
     하위 클래스가 이 메소드를 오버라이딩(Overriding)하는 경우
     접근제어지시자는 『protected』 또는 『public』 이어야 한다.

   ★ 『static_ (메모리를 잡음!)』, 『final_ 변수의 상수화(메소드에도 붙을 수 있다: 최종적인 개념)』, 『private_(상속에서 제외..?)』 메소드는 오버라이딩(Overriding)할 수 없다.

   ★ Exception 의 추가가 불가능하다.
     즉, 상위 클래스의 메소드가 가지고 있는 기존 예외 사항에 새로운 Exception 을 추가하는 것은 불가능하다는 것이다.

※ 자식은 부모가 누군지 아는데 부모는 자식이 누군지 모른다.
   자식 : 하위 클래스
   부모 : 상위 클래스

// 상위 클래스, 부모 클래스, Super class

*/
//부모 클래스 (상위클래스,super class)
class SuperTest110
{
	private int a =5;
	protected int b = 10;
	public int c =20;

	public void write()
	{
		System.out.println("Super ...write() : " + a + " : " + b + " : " + c);
	}
}
//자식 클래스(하위 클래스,sub class)
class SubTest110 extends SuperTest110
{
	/*
	// 앞서 private는 상속 불가
	protected int b = 10;
	public int c =20;

	public void write()
	{
		System.out.println("Super ...write() : " + a + " : " + b + " : " + c);
	}
	*/

	protected int b = 100;	//나의 b =100 ,부모의 b =10
	
	public void print()
	{
		//System.out.println("Sub...print() : " + a + " : " + b + " : " + c);
		// System.out.println("Sub...print() : " + a + " : " + b + " : " + c);
		//==> 슈퍼 클래스 에서 선언된 변수 a에는 접근할수 없다(private)

		System.out.println("Sub...print() : " + b + " : " + c);
		//System.out.println("Sub...print() : " + b );//==>Sub...print() : 100
		//System.out.println("Sub...print() : " + this.b );//==>Sub...print() : 100
		//System.out.println("Sub...print() : " + super.b );//==>Sub...print() : 10
		
		//변수 b는 접근 방법에 따라 다른 b로 접근 및 출력이 이뤄진다
		//슈퍼 클래스에서 선언된 b,서브 클래스에서 선언된 b

		//System.out.println("Sub...print() : " + c);//Sub...print() : 20
		//System.out.println("Sub...print() : " + this.c);//Sub...print() : 20
		//System.out.println("Sub...print() : " + super.c);//Sub...print() : 20
		
		//변수 c는 접근하는데 아무런 제약과 제한이 없다.
		//슈퍼 클래스에서 선언된 c
		
	}
	@Override
	public void write()
	{
		//System.out.println("Sub ...write() : " + a + " : " + b + " : " + c);
		// System.out.println("Sub ...write() : " + a + " : " + b + " : " + c); (컴파일 에러 슈퍼클래스에서 선언된 변수 a는 불가: private)
		System.out.println("Sub...write() : " + b + " : " + c);
		//Sub...write() : 100 : 20
	}
}

//main() 메소드를 포함하는 외부의 다른 클래스
public class Test110
{
	public static void main(String[] args)
	{
		//하위 클래스(SubTest110) 인스턴스 생성
		SubTest110 ob = new SubTest110();
		
		ob.print();
		//Sub...print() : 100 : 20

		ob.write();									//부모의 write
		//Super ...write() : 5 : 10 : 20

		System.out.println("=========================================구분선");

		System.out.println(ob.b);
		//====> 100

		System.out.println(((SuperTest110)ob).b);
		//==>> 10
		// 슈퍼 부름 ~!!!(★★★★★형변환★★★★★: 중요)

		((SuperTest110)ob).write();
		//Sub...write() : 100 : 20으로 결과값 나옴 (부모의 write로 호출 아님)

		//★ 메소드와 변수를 꼭~!! 구분하여 정리~!!!

	}
}
/*
Sub...print() : 100 : 20
Sub...write() : 100 : 20
=========================================구분선
100
10
Sub...write() : 100 : 20
계속하려면 아무 키나 누르십시오 . . .
*/