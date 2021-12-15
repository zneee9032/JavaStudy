/*==============================================
	���� Ŭ���� ��ޡ���				
-�������̽�(Interface)
================================================*/

//���� ���̽�
interface Demo
{
	public void write();
	public void print();
}

//�������̽��� �����ϴ� �߻� Ŭ����
abstract class DemoImpl implements Demo
{
	@Override
	public void write()
	{
		System.out.println("write() �޼ҵ� ������...");
	}
	// public void print();
}
//�߻� Ŭ���� ��ӹ޴� Ŭ����
class DemoImplSub extends DemoImpl
{
	@Override
	public void print()
	{
		System.out.println("print() �޼ҵ� ������...");
	}
}

//main() �޼ҵ� �����ϰ� �ִ� �ܺ� Ŭ����
public class Test115
{
	public static void main(String[] args)
	{
		// Demo ob1 = new Demo();			//-- �������̽� �� �ν��Ͻ� ���� �Ұ�
		// DemoImpl ob2 = new DemoImpl();	//-- �߻�Ŭ���� �� �ν��Ͻ� ���� �Ұ�

		DemoImplSub ob3 = new DemoImplSub();

		ob3.print();
		ob3.write();
		//print() �޼ҵ� ������...
		//write() �޼ҵ� ������...
	}

}


