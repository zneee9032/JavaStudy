/*=======================================
  ���� ���� ó��(Exception) ���� 2021-08-11
- Test146�� ��~!
=======================================*/
class Demo2
{
	private int value;
	
	public void setValue(int value) throws Exception //lang ��Ű���� �ִ� Exception
	{
		if (value<=0)
		{
			//���� ����(�߻�)
			throw new Exception("value�� 0���� �۰ų� ���� �� �����ϴ�!");	//�ک� throw _ ���ܸ� �߻���ų ��!
		}
		this.value = value;
	}
	public int getValue()
	{
		return value;
	}
}


public class Test147
{
	public static void main(String [] args) //��throws Exception
	{
		//��throws Exception���
		Demo2 ob = new Demo2();
		// ������ ��ü�� �־����~~ �Ф�

		/*
		ob.setValue(-3);			//-3 �־��µ� 0�� ������ ������? value�ʱⰪ�� 0�̶�
		int result = ob.getValue();
		System.out.println(result);
		*/

		try
		{
			ob.setValue(-3);
			int result = ob.getValue();
			System.out.println(result);
		}
		catch (Exception e)  // checked Exception
		{
			System.out.println(e.toString());
		}

	}
}
/*
java.lang.Exception: value�� 0���� �۰ų� ���� �� �����ϴ�!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/