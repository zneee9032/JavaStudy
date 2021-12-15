/*============================================================
			 ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ���� 2021-08-09
-StrigŬ����
StringBuffer / StringBuild / append()
===============================================================*/

//String str = new String();
//int a = 10;
//String name = "������";


/*
��String Ŭ������ ���� ���ڿ� �����Ϳ� ���� ������ �Ұ����ϴ�
=============================================================
		����, ���� �Һ� : Immutable��
		================================!!
	���ڿ��� �Ŀ��� ����Ǹ� ���ο� ��ü�� �����ϸ� ���� ����� �о���� ��ü�� ������ �÷����� ����� �ǰ�, ���ο� ��ü�� �� �ּҸ� �Ҵ��ϰ� �ǹǷ� �ؽ��ڵ嵵 ����

��String Ŭ���� ��ü ���� ��+�������ڸ� ����ϰ� �Ǹ� ���ڿ� ���� ������ �����ϸ�, StrigŬ������ �ٸ� Ŭ���� ��ü, �Ǵ� �⺻�� �����Ͱ��� ��+�������ڸ� ����ϴ� ��쿡�� ���������� �ڵ� StringŬ������ ��ȯ�� ����

�۴����� Ȯ�εǴ� ����� �̷��� ������..!
	String�� ������ ���� �� �� ���� ������ ��+�������ڸ� ����ϰ� �Ǹ� ���������� StringBuffer�� �����Ͽ� append()�޼ҵ带 �̿��Ͽ�
	���ڿ� ���� ������ �����ϰ� �ȴ�.
	����, ������ ���ڿ��� ���� ����ϴ� Servlet����� �ǵ����̸� String�� ����ϴ°� ����
	StringBuffer�� char[]�� ����ϴ°��� ȿ������ �� �ִ�

-==> ������ ���ڿ��� ó���ϴ°�쿡�� �ַ� String Ŭ������ ���
	������ ���ڿ����� ó���ϴ� ��쿡��
	��Ÿ�� �� �������� ó�����ִ� StrigBuffer Ŭ������ ����ϴ°��� ȿ�����̴�

�� String��ü�� ���� �� Ư¡
String��ü�� �����ϴ� �����
1) ���ڿ� �󽴸� �����ϴ� �����
2)StringŬ������ �����ڸ� �̿��ϴ� ���

String str1 = "Java";
String str2 = new String ("Java");

������ ��=�� ���� �����ڸ� ����Ͽ� ���ڿ� ����� �����ϴ� ����� ���� ��ü�� �����ϴ� ����
   ��new�� �����ڸ� �̿��Ͽ� ��ü�� �����ϴ� ���� ��ü�� ����� �ǹ̰� �ٸ���.

*/
public class Test132
{
	public static void main (String [] args)
	{
		String s1 = "seoul";
		String s2 = "seoul";
		String s3 = new String("seoul");
		String s4 = new String("seoul");
		//s1 �� s2��ü�� �����ϴ� ���ڿ� ����� �����Ѱ��
		//���ڿ��� ����� �������� ������ �����ϱ� ������ s1��ü�� s2��ü�� ������ �����Ҹ� �����ϰ� �ȴ�.
		//������,
		//s3 �� s4�� ������ ������ �ƴ� �ٸ� ��������
		//���Ӱ� (new)Ȯ���Ͽ� ���ڿ� ����� �� ���꿡 ������ ����̹Ƿ� ���ν��Ͻ��� ���� ������ �����ϴ� ���̾ƴϴ�

		//���� ��s3==s4���� �����̵Ǹ� ���� ���� ���ڿ� ��������� ���θ� ���ؾ� �� ����ϸ� ��equals()���޼ҵ� �̿�

		System.out.println(s1==s2);		//true
		System.out.println(s1==s3);		//false
		System.out.println(s1==s4);		//false

		System.out.println();




		System.out.println("s1 : " + s1);	//--==>> s1 : seoul
		System.out.println("s2 : " + s2);	//--==>> s2 : seoul
		System.out.println("s3 : " + s3);	//--==>> s3 : seoul
		System.out.println("s4 : " + s4);	//--==>> s4 : seoul

		System.out.println();



		
		System.out.println(s1.equals(s2));	//-==> true
		System.out.println(s2.equals(s3));	//-==> true
		System.out.println(s3.equals(s4));	//-==> true
		System.out.println(s4.equals(s1));	//-==> true
		//eqyals()�� �ּҰ��� �� XXXX 
		System.out.println();


		System.out.println("s1 : " + s1.hashCode());	//s1 : 109324212
		System.out.println("s2 : " + s2.hashCode());	//s2 : 109324212
		System.out.println("s3 : " + s3.hashCode());	//s3 : 109324212
		System.out.println("s4 : " + s4.hashCode());	//s4 : 109324212
		System.out.println();
		// ��ü�� ������ hashCode �� ������, hashCOde�� ���ٰ� �ؼ� ���� ��ü�� XXXXXX

		s2 += "Korea";			// += 
		System.out.println(s2);
		//==>seoulKorea

		s2 = "Korea";			// =
		System.out.println(s2);
		//==>Korea

		// �̿� ���� ���
		// s2�� ������ "seoul"�� ����� ������
		//��s2 += "Korea";���� ����Ǵ� �������� ������ �÷����� ����� �Ǹ�
		//"seoul Korea" ����� ����� ������ s2�� �����ϰ� �Ǿ��ٰ�
		//�ٽ� s2�� ������ "seoul Korea"�� ����� ������
		//��s2 = "Korea";���� ����Ǵ� �������� ������ �÷����� ����� �Ǹ� "Korea"���ڿ� ����� ���Ӱ� ����� ������ s2�� �����ϰ� ��

		//��===>>String ��ü�� ������ �Һ��̴�
	}
}