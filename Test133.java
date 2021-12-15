/*============================================================
			 ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ���� 2021-08-09
-StrigŬ����
��s.substring
===============================================================*/
public class Test133
{
	public static void main(String [] args)
	{
		String s = "seoul Korea";
		System.out.println(s); //seoul Korea


		//�۹��ڿ� ����
		System.out.println(s.substring(6,9)); //==substring  >seoul Korea �߿��� Kor (678)�� ���
											  //					                  ===
		// ��String.substring(s,e)��
		// String ���ڿ��� ������� 
		// s��°���� ...e-1��° ����..
		//(��, �ε����� 0���� ����)

	System.out.println(s.substring(7));		//==>orea
	// lanf ��Ű���� StringŬ������ suvstring �޼ҵ�� �����ε��Ǿ� ������ ��������
	// ��String.substring(s)��
	//	String ���ڿ��� �������
	// s�������� ������ (��, ���ڿ��� ���� ���̸�ŭ)

	//�� ���ڿ��� ������ �� �� : equals
		System.out.println(s.equals("seoul korea"));	//--==>> true
		System.out.println(s.equals("Seoul Korea"));	//--==>> false	//-- ��ҹ��� ����

	
		System.out.println(s.equalsIgnoreCase("Seoul Korea"));	//--==>> true	//-- ��ҹ��� ���� ����


		// �� ã���� �ϴ� ��� ���ڿ�(s)��
		//    ��kor�����ڿ��� �����ұ�?
		//    �����Ѵٸ� �� ��ġ�� ��� �ɱ�?--------------------------->s.indexOf�޼ҵ带 ���


		// "seoul korea"==============================> �տ��� ���� ã�´�!(0���� ����!)

		System.out.println(s.indexOf("kor"));     //--==>> 6
		//System.out.println(s.indexOf("ea"));    //--==>> 9
		//System.out.println(s.indexOf("e"));     //--==>> 1		seoul �� e / korea�� e �� �ִµ� �̶��� ���� �ռ��� seoul�� e�� 1�� ���
		//System.out.println(s.indexOf("tt"));     //--==>>-1	    ã���� �ϴ� ���ڰ� ������ ��������!

		//-- ã���� �ϴ� ���ڿ��� ��� ���ڿ��� ������ ���
		//   �� ���ڿ��� �ε����� ��ȯ������
		//   �������� ���� ��� ������ ��ȯ�ϰ� �ȴ�. (-1)
		
		//===================================================================================================>2021-08-09



		// �� ��� ���ڿ�(s)�� ��rea���� ���������� ���� Ȯ��	==>endsWith _ ����ڿ��� ������? True false
		//    (true / false)
		System.out.println(s.endsWith("rea"));	//--==>> true
		System.out.println(s.endsWith("oul"));	//--==>> false




		// �� ã���� �ϴ� ��� ���ڿ�(s)��
		//    ��e�����ڿ��� �����ұ�?
		//    �����Ѵٸ� �� ��ġ�� ��� �ɱ�?		_indexOf
		//    (��, �ڿ������� �˻�)
		//    seoul korea

		System.out.println(s.indexOf("e"));		//--==>> 1			,seoul �� 'e'
		System.out.println(s.indexOf("o"));		//--==>> 2			,seoul �� 'o'
		System.out.println(s.lastIndexOf("e"));		//--==>> 9		,korea �� 'e'		ã�°͸� �ڿ��� ���� ī������ �տ���!
		System.out.println(s.lastIndexOf("o"));		//--==>> 7		,korea �� 'e'




		// �� ��� ���ڿ�(s) ��
		//    ��6����° �ε��� ��ġ�� ���ڴ�?		=> charAt
		//    seoul korea
		System.out.println(s.charAt(6));	//--==>> k
		System.out.println(s.charAt(0));	//==>> s
		System.out.println(s.charAt(1));	//==>> e
		System.out.println(s.charAt(10));	//==>> a
		//System.out.println(s.charAt(22));	//==>> ���� �߻� (��Ÿ�� ����) StringIndexOutOfBoundsException

		
		System.out.println();

		// �� ��� ���ڿ�(s)�� �� ���ڿ� ��seoul corea�� ��
		//    � ���ڿ��� �� ū��?							=>s.compareTo
		//    �� ���ڿ��� �ٸ��ٸ� ���̸� Ȯ��(������ �迭)
	
		System.out.println(s.compareTo("seoul korea"));		//-32
		System.out.println(s.compareTo("seoul corea"));		//-24
		



		// �� ��� ���ڿ�(s) ��
		//    �ش� ���ڸ� ã�Ƽ� ���ϴ� ���·� ����
		s = "�츮���� ���ѹα� ���ѵ��� ����";
		s = s.replaceAll("����", "����");
		System.out.println(s);
		//--==>> �츮���� ���ֹα� ���ֵ��� ����




		// �� ��������
		s = "     ��       ��     ";
		System.out.println(s);
		System.out.println(":" + s + ":");
		//--==>> :     ��       ��     :

		System.out.println(":"+s.trim()+":");
		//--==>> :��       ��:
		//-- ���� �����ڸ� ���� ���� =================================>'trim'�Լ� _ ���� ���ʸ�  �����
		System.out.println(":"+s.replaceAll(" " , "") + ":");
		//-- ���� �����ڸ� + ��� ���鵵 ������� ==================> 'replaceAll'
		//--==>> :���:



		//String temp = Integer.pasrseInt("30");
		s = Character.toString('b');
		System.out.println(s);
		//--==>>b
		
		s = Integer.toString(30);
		System.out.println(s);
		//===>30



		int n = 2345678;
		//System.out.printf("%d", n);
		System.out.format("%d", n);		//--==>> 30
		s = String.format("%d", n);		//--==>> 2345678
		System.out.println(s);



		s = String.format("%,d",n);				//print f ��ſ� format ���
		System.out.println(s);			//--==>> 2,345,678

		String.format("%.2f",3.1241592);
		System.out.println();
		//==> 3.14�������� ������ ������ ��� x

		s = String.format("%.2f", 3.141592);	//"3.14"
		System.out.println("s ��� : " + s);
		//s ��� : 3.14


		String[] sArray = "�⺻,����,���".split(",");				//split =>���ڿ��� �ڸ��� ���
		for(String str : sArray)						//���� for�� => 

		{
			System.out.print(str + " ");
		}

		System.out.println();
		//--==>> �⺻ ���� ���		

		//��sArray=> ���ڿ� �迭
	}

}


