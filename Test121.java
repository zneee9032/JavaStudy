/*============================================================
  ���� Ŭ���� ��� ����2021-08-09
  - ��ø Ŭ����_AnnoymousŬ����(�͸��� Ŭ���� : ���� Ŭ����)
===============================================================*/
/*
��AnnoymousŬ����(�͸��� Ŭ���� : ���� Ŭ����)

-�̸� ���� Ŭ����

-Ŭ���� �Ǵ� �������̽��� ���� ��ü�� �����ϸ鼭
 �ٷ� Ŭ���� �Ǵ� �������̽��� �����ϴ� Ŭ����

-�����ϴ� �κа� �����ϴ� �κ��� �ϳ��� ������ new������ �ִ°�����
 �ٷ� Ŭ���� �Ǵ� �������̽��� ���� �ϴ°��� �ǹ��Ѵ�

-awt�� �ȵ���̵� �̺�Ʈ ó������ �Ϲ������� ���		(awt�ǹ����� ���� ������� ����)

-���� Ŭ���� �޼ҵ带 �ϳ� ���� ������ �� �ʿ伺�� ������ ���

-Ŭ������ ��ü�� �ʿ��ϸ� �� �ٽ� Ŭ������ �����ؾ� �ϴ�
  ���ŷο� ������ �͸��� Ŭ������ �����ϸ� ó���Ѵ�.	(��� ���� �����Ŷ� �̸��� ������ �ʴ´�!)


�� ���� ����
new ����Ŭ������ ������()
{
	�������������� �ڷ��� �޼ҵ�()
	{
		...;
	}
};		//�����ݷ� check~!!!

class()

*/

class Test3	// extends Object �ڿ� ���� => Object�� ���� Ŭ����
{
	/*
	ObjectŬ������ �����
	...
	
	ex)
	 public String toStirng()
		{
			...;
		}
	*/
	public Object getString()
	{
		/*��,�δ� ���� �����̴�
		��
		Object result;
		result = new Object();
		return result;
		*/

		/*��
		return new Object();
				----------------->Object ��
		*/	

		return new Object()
		{
			@Override	
			public String toString()
			{
				return "�͸��� Ŭ����...";
			}
		};		//�����ݷ� üũ~!
	
	}	//getString()
}//Test3



public class Test121 // extends Object

{

	public static void main(String[] args)

	{

		Test3 ob1 = new Test3();
		Test3 ob2 = new Test3();
		System.out.println(ob1.toString());
		//==>Test3@15db9742
		
		Test121 ob3 = new Test121();
		System.out.println(ob2.toString());
		//--==> Test3@6d06d69c

        System.out.println(ob2.getString());
		//.toString()); �� ����, toString()�� Object�� ���� �޼ҵ�� ��ӹ޾� �ҷ�����
		//      �͸��� Ŭ����...

	}

}


