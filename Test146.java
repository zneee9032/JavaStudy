/*=======================================
  ���� ���� ó��(Exception) ���� 2021-08-11
-Test147.java ���ϰ� ��~!!!
=======================================*/
/*
setter => 0���� ������ ����
getter => ?

*/

class Demo
{
	private int value;
	
	public void setValue(int value)
	{
		if (value<=0)
		return;		//���� -> �޼ҵ� ����
		
		this.value = value;
	}
	public int getValue()
	{
		return value;
	}
}


public class Test146
{
	public static void main(String [] args)
	{
		Demo ob = new Demo();
		ob.setValue(-3);			//-3 �־��µ� 0�� ������ ������? value�ʱⰪ�� 0�̶�
		int result = ob.getValue();
		System.out.println(result);
	}
}