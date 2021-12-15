/*=========================
  ���� Ŭ���� ��� ����
  - ��ø Ŭ����
=========================*/
// outer
class InnerOuterTest 
{
	static int a=10;
	int b=20;

	// inner
	class InnerNested
	{
		int c=30;

		void write() //-- inner �� write()
		{

			System.out.println("inner �� write()...");
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			System.out.println("c : " + c);
		}
	}

	void write() //-- outer �� write()
	{
		System.out.println("outer �� write()...");
		InnerNested ob1 = new InnerNested();
		ob1.write(); //-- inner �� write()
	}

}// end class InnerOuterTest

// main() �޼ҵ带 �����ϰ� �ִ¿ܺ��� �ٸ� Ŭ����
public class Test120
{
	public static void main(String[] args)
	{
		//out �� �ν��Ͻ� ����
		InnerOuterTest ob2 = new InnerOuterTest();
		ob2.write();	//-- outer �� write �޼ҵ� ȣ��

		// InnerNested ob3 = new InnerNested();
		// --==>> ���� �߻�


		// InnerOuterTest.InnerNested ob3 = new InnerOuterTest.InnerNested();
		// --==>> ���� �߻�


		// �� ��ø ���� Ŭ�����ʹ� �޸� 
		//		�ܺ� Ŭ������ �ν��Ͻ�(��ü)��
		//    ������� �ʰ� �ܵ����� ���� Ŭ������ �ν��Ͻ��� �����ϴ� ���� �Ұ����ϴ�.


		// �� Test118 �� ���� ��~!!
		//	��	��	��	��	��	��	��	��		��	
		InnerOuterTest.InnerNested ob3 = ob2.new InnerNested();
		//-->>InnerOuterTest.InnerNested ob3 = new InnerOuterTest().new InnerNested(); �� ���� ����
		ob3.write();
		//===>inner �� write()...
				//a : 10
				//b : 20
				//c : 30
		InnerOuterTest.InnerNested ob4 = new InnerOuterTest().new InnerNested();
		ob4.write();		
		//inner �� write()...
			//a : 10
			//b : 20
			//c : 30


		//outer Ŭ������.inner Ŭ������ ���������� = new outer������().new inner ������();

		// cf) static ->��ø ���� Ŭ����
		//Test.StaticNested ob = new Test.StaticNested();

		//outerŬ������.innerŬ������ ���������� = new outerŬ������.inner ������();


	}

}


