/*============================================================
			 ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����2021-08-09
  - Wrapper Ŭ����
-Integer.parseInt(a, b);	
===============================================================*/
public class Test127
{
	public static void main (String [] args)
	{
		/*
		boolean bi = true;					//�⺻�� �ڷ�
		Boolean wrapBi = new Boolean(bi);	//boolean �ν��Ͻ� ����
		Boolean wBi = bi;					//�⺻���ڷḦ ���� ���� ������ �ڽ̡�

		int ni =300;
		Integer wrapNi = new Integer(ni);
		int ni2 = wrapNi;					//������ ��ڽ̡�

		float fi = 300.3f;
		Float wrapFi = new Float(fi);

		System.out.println(wrapBi.toString());		//object ����
		System.out.println(wrapNi.toString());		//object ����
		System.out.println(wrapFi.toString());		//object ����
		//==> true
		//==> 300
		//==> 300.3

		System.out.println(wrapBi);
		System.out.println(wrapNi);
		System.out.println(wrapFi);
		//==> true
		//==> 300
		//==> 300.3
		*/

		//Integer Ŭ����

		String sn = "12";
		int ni = Integer.parseInt(sn);			// ���� ��� parseInt
		System.out.printf ("ni : %3d\n ", ni);
		//ni :  12

		ni = Integer.parseInt("0101",2);		//�Ű����� 2�� �޴� parseInt�� �ִ�===> �����ε�, 0101 2������ȯ
		System.out.printf("ni : %3d\n", ni);
		// ni :   5

		ni = Integer.parseInt("12",8);		//�Ű����� 2�� �޴� parseInt�� �ִ�===> �����ε�, 8������ȯ
		System.out.printf("ni : %3d\n", ni);
		//ni :  10

		ni = Integer.parseInt("A",16);		//�Ű����� 2�� �޴� parseInt�� �ִ�===> �����ε�, 16������ȯ
		System.out.printf("ni : %3d\n", ni);
		//ni :  10

		sn = Integer.toBinaryString(20);		//12�� 2����
		System.out.printf("sn : %s\n", sn);
		//sn : 10100

		sn = Integer.toHexString(31);			//12�� 8����
		System.out.printf("sn : %s\n", sn);
		//sn : 1f

		sn = Integer.toOctalString(31);			//12�� 16����
		System.out.printf("sn : %s\n", sn);
		//sn : 37


		Integer num = new Integer(50);
		System.out.println(num.toString());
		//50

		int n3 = 345;
		Integer n4 =Integer.valueOf(n3);
		System.out.println(n4);
		//345

		










	}
}