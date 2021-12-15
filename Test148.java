/*=======================================
  ���� ���� ó��(Exception) ���� 2021-08-11
- ���� �ٽ� ������
=======================================*/
public class Test148
{
	public static void main(String[] args)
	{
		Test148 ob = new Test148();

		try
		{
			int a = ob.getValue(-2);		//�� ���� �߻�
			System.out.println("a : " + a);
		}

		catch (Exception e)					//�� ���� ��Ƴ���
		{

			System.out.println("��printStackTrace......(main)");
			e.printStackTrace();
		}
		
	}


	public int getData(int data) throws Exception
	{
		if (data<0)
			throw new Exception("data �� 0 ���� �۽��ϴ�.");	// �� ���ܹ߻�

		return data + 10;
	}


	public int getValue(int value) throws Exception
	{

		int a=0;

		try
		{
			a = getData(-2);	// �� ���ܹ߻�
		}

		catch (Exception e)		// �� ���� ��Ƴ���
		{

			// �� ��Ƴ� ���ܿ� ���� ó��
			System.out.println("��printStackTrace......(getValue)");
			e.printStackTrace();


			// �� ��Ƴ� ���ܸ� �ٽ� ������
			throw e;
			//-- �ּ� ó�� �� (��, ��Ƴ� ���ܸ� �ٽ� ������ ���� ���)
			//   main() �޼ҵ��� try~catch()�� ������� �ʴ´�.
		}
		return a;

	}

}


/*
��printStackTrace......(getValue)
java.lang.Exception: data �� 0 ���� �۽��ϴ�.
        at Test148.getData(Test148.java:30)
        at Test148.getValue(Test148.java:43)
        at Test148.main(Test148.java:13)
��printStackTrace......(main)
java.lang.Exception: data �� 0 ���� �۽��ϴ�.
        at Test148.getData(Test148.java:30)
        at Test148.getValue(Test148.java:43)
        at Test148.main(Test148.java:13)
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


*/