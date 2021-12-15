/*=========================
  ���� Ŭ���� ��� ����
  - ��ø Ŭ����
=========================*/


//-- outer class
class Test2	//extends Object
{
	static int a=10;	//-- �������� / Test2�� ������� / static����(class ���� / Ŭ���� ����)
	int b=20;			//-- �������� / Test2�� ������� / nonstatic ���� ��instance����(�ν��Ͻ� ����)��

	void write()		//-- �� ù ��° write() �޼ҵ�
	{

		System.out.println("write()...��");
		final int c=30;		//-- �������� ���ȭ�Ⱥ���(���̺������ʴº���) ____> final int
		int d=40;			//-- �������� (���� ���÷� ���� �� �ִ� ����) _____> int


		// �� ���� c �� ���� d �� �� �� ��������������...
		//    c �� final �����̱� ������ �� ��° write() �޼ҵ忡��
		//    ���� �����ϴ��� 30�� ������ ������ ������� �� �ִ�.

		//    �ݸ鿡 d �� �� ���� ���÷� ������ �� �ִ� ��Ȳ�̹Ƿ�
		//    LocalTest Ŭ������ �ν��Ͻ� ���� ������ ���� ���� �� ���� ������
		//    d �� �����ϴ� ���� ���ؾ� �Ѵ�.



		// �޼ҵ� �ȿ� �����ϴ� �� �ٸ� Ŭ����(local class = ���� Ŭ���� )
		class LocalTest		//-- inner class

		{

			void write()	//-- �� �� ��° write() �޼ҵ�

			{

				System.out.println("write()...��");
				System.out.println("a : " + a);
				System.out.println("b : " + b);
				System.out.println("c : " + c);
				//System.out.println("d : " + d);

				//===> ��check~! ���� �߻� (�ν��Ͻ� ���������� �������� ��� ������ �Ҵ� �ñ⸦ ����. �ڹٴ� ������ ��������.)

			}//end write

		}

		// ù ��° write() �޼ҵ忡�� ������ �ν��Ͻ�

		LocalTest ob1 = new LocalTest();

		ob1.write();	//-- �� ��° write() �޼ҵ� ȣ��
	}
}


public class Test119
{
	public static void main(String[] args)
	{
		Test2 ob2 = new Test2();
		ob2.write();	//-- ù ��° write() �޼ҵ� ȣ��

	}

}


