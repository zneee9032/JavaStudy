/*============================================================
			 ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ���� 2021-08-09
-_ Wrapper Ŭ���� 
-java.math.BigDecimal(�Ǽ� ����)
===============================================================*/

import java.math.BigDecimal;

public class Test129
{
	public static void main(String [] args)
	{
		BigDecimal a = new BigDecimal("123456789.123456789"); 

		//movePointLeft: �Ҽ����� �������� �̵�
		BigDecimal b = a.movePointLeft(3);
		System.out.println(b);
		//==>123456.789123456789

		//������ : divide()->��ü �Ӽ�Ȯ��,�ݿø� ���� �ʴ´�-> ����
		BigDecimal c = a.divide(b,BigDecimal.ROUND_DOWN);	//BigDecimal.ROUND_DOWN _ static final
		System.out.println(c);
		//1000.000000000
		System.out.println(BigDecimal.ROUND_DOWN);	
		//1

		//toBigInter()-> BigInteger��ü�� ��ȯ
		System.out.println(a.toBigInteger());	//�Ǽ��� ������ ��ȯ
		//123456789 
	}
}