/*==============================================
	���� Ŭ���� ��ޡ���				
-�������̽�(Interface)
================================================*/
/*
�� JDK 1.5(5.0)������ �������̽� �޼ҵ带 �������̵�(Overriding)�� �� ��@Overriding�� ������̼�(annotation)�� ����� �� ����.
   JDK 1.6(6.0) ���� ���� ���� ������ �����̴�. ��, ��ӹ��� Ŭ������ �޼ҵ带 �������̵�(Overriding)�� ������
   JDK 1.5(5.0) ������ ��@Overriding�� ������̼�(annotation) ����� �����ϴ�.

*/
// �������̽�
interface ADemo
{
	public void write();
}
// �������̽�
interface BDemo
{
	public void print();
}

//�������̽� 2�� �̻��� ����(implements)�� �� �ִ�
//->���� ����� ���� �ʴ� �κ��� ���� (����)�ϴ� ����


//Ŭ����
//class DemoImpl
//class DemoImpl extends ADemo, BDemo
//			��
//�߻�Ŭ����=============================================> �� �������̽��� ������ �߻� Ŭ����
//abstract class DemoImpl implements ADemo, BDemo			
//			��
//Ŭ���� - �� �������̽��� ������ Ŭ����	
class DemoImpl implements ADemo, BDemo						//abstract�� ������� �������̵� (write, print)�� ������ �ؾ��Ѵ�
															//==> Override
{
	@Override
	public void write()//public void write();�Ѱܹ���
	{
		System.out.println("ADemo �������̽� �޼ҵ� write()...");
	}

	@Override
	public void print()//public void print();�Ѱܹ���
	{
		System.out.println("BDemo �������̽� �޼ҵ� print()...");
	}
}


//main()�ɼҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test114
{
	public static void main(String[] args)
	{
		// ADemo ob = new ADemo();		//-- �������̽� �� �ν��Ͻ����� �Ұ�
		// BDemo ob = new BDemo();		//-- �������̽� �� �ν��Ͻ� ���� �Ұ�

		// ADemo, BDemo �������̽��� ����(implements)�� Ŭ����(�� DemoImpl)
		// ����� �ν��Ͻ� ����
		DemoImpl ob1 = new DemoImpl();			//------> ������ ����


		ob1.write();
		ob1.print();

		//--==>> ADemo �������̽� �޼ҵ� write()...
		//       BDemo �������̽� �޼ҵ� print()...


		ADemo ob2 = new DemoImpl();			//-- �� ĳ����
		BDemo ob3 = new DemoImpl();			//-- �� ĳ����


		// ob2.print();						//-- ���� �߻�
		// ob3.write();						//-- ���� �߻�


		ob3.print();
		//--==>> BDemo �������̽� �޼ҵ� print()...
		ob2.write();
		//--==>> ADemo �������̽� �޼ҵ� write()...


		((BDemo)ob2).print();
		((ADemo)ob3).write();
		//--==>> BDemo �������̽� �޼ҵ� print()...
		//--==>> ADemo �������̽� �޼ҵ� write()...
		//-- DemoImpl Ŭ������ �� �������̽��� ��� �����߱� ������ �����ϴ�.
		//   ����... DemoImplŬ������ �̵� �� �� �������̽��� ������ ��Ȳ�̶��..
		//  �̱����� �� Ÿ�� ���� �߻��ϴ� ������ �ȴ�.


		//�ܴٿ� ĳ����
		((DemoImpl)ob3).write();		
		//ADemo �������̽� �޼ҵ� write()...

	}

}


