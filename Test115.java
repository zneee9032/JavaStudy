/*==============================================
	■■■ 클래스 고급■■■				
-인터페이스(Interface)
================================================*/

//인터 페이스
interface Demo
{
	public void write();
	public void print();
}

//인터페이스를 구현하는 추상 클래스
abstract class DemoImpl implements Demo
{
	@Override
	public void write()
	{
		System.out.println("write() 메소드 재정의...");
	}
	// public void print();
}
//추상 클래스 상속받는 클래스
class DemoImplSub extends DemoImpl
{
	@Override
	public void print()
	{
		System.out.println("print() 메소드 재정의...");
	}
}

//main() 메소드 포함하고 있는 외부 클래스
public class Test115
{
	public static void main(String[] args)
	{
		// Demo ob1 = new Demo();			//-- 인터페이스 → 인스턴스 생성 불가
		// DemoImpl ob2 = new DemoImpl();	//-- 추상클래스 → 인스턴스 생성 불가

		DemoImplSub ob3 = new DemoImplSub();

		ob3.print();
		ob3.write();
		//print() 메소드 재정의...
		//write() 메소드 재정의...
	}

}


