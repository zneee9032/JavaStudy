/*=======================================
  ���� ���� ó��(Exception) ���� 2021-08-11
- ���� �ٽ� ������
=======================================*/
public class Test149
{
	public int getValue(int value) throws Exception				//(7) ���� ������ (�Ķ� ���߹�)
	{
		int a = 0;
		try
		{
			a= getData(-2);										//(3) ���� �߻� -> ���� ���߹�
		}
		catch (Exception e)										//(4) ���� ��Ƴ���
		{
			//(5) ���� ó�� (���� ���߹�)
			System.out.println("printStackTrace.............");
			e.printStackTrace();
		
			//throw e;
			throw new Exception("vlaue �� �����Դϴ�.");
			//(6) ���� �߻�(�Ķ� ���߹�)
		}
		return a;
	}
	
	public int getData(int data) throws Exception				//(2) ���� ������ -> ���� ���߹�
	{	
		if (data <0)
		
			throw new Exception("data�� 0 ���� �۽��ϴ�.");		// (1) ���� �߻�
																// ���� ���߹�
		
		return data +10;
	}
	public static void main(String [] args)
	{
		Test149 ob = new Test149();		//�ν��Ͻ� ����

		try
		{
			int a = ob.getValue(-1);							//(8) ���� �߻� _ �Ķ����߹�
		System.out.println("a : " + a);
		}
		catch (Exception e)										//(9) ���� ��Ƴ���_ �Ķ� ���߹�
		{
			//(10) ���� ó��_ �Ķ� ���߹�
			System.out.println("printStackTrace.............");
			e.printStackTrace();
		}
	}
}		

/*
printStackTrace.............
java.lang.Exception: data�� 0 ���� �۽��ϴ�.
        at Test149.getData(Test149.java:31)
        at Test149.getValue(Test149.java:12)
        at Test149.main(Test149.java:42)
printStackTrace.............
java.lang.Exception: vlaue �� �����Դϴ�.
        at Test149.getValue(Test149.java:21)
        at Test149.main(Test149.java:42)
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/