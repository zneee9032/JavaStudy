/*============================================================
			 ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����2021-08-09
_ Wrapper Ŭ���� 2021-08-09
_ .intValue() .byteValue()
===============================================================*/
public class Test130
{
	public static void main(String[] args)
	{
		byte b = 3;
		int i = 256;

		Byte b2 = new Byte(b);		//-- boxing 3
		Integer i2 = new Integer(i);	//-- boxing 256

		System.out.println(b2);		//--unboxing	(��ü�ӿ��� �ڵ� ����ȯ �Ǿ� ������ ��µ�)
		System.out.println(i2);		//--unboxing
		//3
		//256

		print(b2);
		print(i2);
		
		byte b3 = b2.byteValue();	//-- unboxing ������Ƽ���ڷ��� ����Ʈ�� ��ȯ, b2�� , b3�� ��Ƴ�
		int i3 = i2.intValue();		//-- unboxing ������Ƽ���ڷ��� Integer i2�� ��ȯ, i3�� ��Ƴ�


		// check~!!!
		int i4 = b2.byteValue();
		// byte b4 = i2.intValue();	//--==>> �����߻� (int�� byte�δ� ��ȯ �Ұ�)
		byte b4 = i2.byteValue();


		System.out.println(b3);	//--==>> 3
		System.out.println(i3);	//--==>> 256




		// check~!!!
		System.out.println(i4);	//--==>> 3
		System.out.println(b4);	//--==>> 0


		//2�� 8���� 255 �̾ 

	}

	
	/*

	static void print(Byte xxx)	//-- �̷��� �ϴ°� �����ε��Ǵ� ���� �����ص� �������.

	{

	}

	static void print(Integer xxx)	//"

	*/

	
//---------------------------------------------------------------------------------------------------------------------------

	/*

	static void print(Object xxx)	//-- �ֻ����� �ִ� ��üŸ���̱� ������... ��� Ÿ���� ���������� �ٶ������� �ʴ�.

	{

	}

	*/

//---------------------------------------------------------------------------------------------------------------------------
	

	// java.lang.Number Ŭ����(�߻�Ŭ����)��
	// ��� Wrapper Ŭ�������� �θ� Ŭ����(����Ŭ����, ����Ŭ����)�̴�.
	// b2, i2 �ڷ����� Number n �� �Ѿ���鼭
	// Auto-Boxing �� �Ͼ�� �ȴ�.

	static void print(Number n)	//https://docs.oracle.com/javase/8/docs/api/

	{

		System.out.println(n);
		System.out.println(n.intValue());

	}

}


