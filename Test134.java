/*============================================================
			 ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ���� 2021-08-10
��StringBufferŬ����
===============================================================*/
/*
�� StringBuffer Ŭ������
	���ڿ��� ó���ϴ� Ŭ������ StringŬ������ ��������
								StringŬ������ ���� ���ڿ� �������� ������ �Ұ��� ������
								StringBufferŬ������ ���ڿ��� ����Ҷ�, ���� ���ڿ��� ���� �ܰ�(��Ÿ�� ����)���� ���� ����

	��,String Buffer��ü�� �������� ���̸� �����Ƿ�
		��ü�� �����ϴ� �������� �̸� �� ũ�⳪ ���� �����ϰų� ��������� ������ ũ�⸦ �ٲܼ� �ִ� ����� ������

	+	JDK 1.5���ĺ���, ���ڿ��� ó���ϴ� StringBuilder��� Ŭ������ �����Ѵ�
							String BuilderŬ������ ����� StringBufferŬ������ ����������
							���� ū �������� muli-thread unsafe��� ���̴�
							��, Syncronizaion�� ���� ������
							String Buffer���� ������ ���ü�(����ȭ) ������ ���ٸ�
							String Builder�� ����ϴ°��� ������ ����ų �� �ִ�.��		String Buffer ���ü�(����ȭ) ��� ž�� ->���� ����
																											��
																								String Builder

*/
public class  Test134

{

	public static void main(String[] args)

	{

		StringBuffer sb1 = new StringBuffer("korea");
		StringBuffer sb2 = new StringBuffer("korea");

		System.out.println(sb1 == sb2);			//--==>> false
		System.out.println(sb1.equals(sb2));	//--==>> false
//String Buffer�� ���� �ּҰ��� �ٸ��� ũ�⵵ �ٸ�?
		System.out.println(sb1);				//--==>>korea
//toString�� �������̵�
		System.out.println(sb1.toString());		//--==>>korea


		System.out.println(sb1.hashCode());

		System.out.println(sb2.hashCode());



		

		System.out.println(sb1.toString().equals(sb2.toString()));	//--==>> true
									//   =======
									//	 String�� equals


		/*ȥ�ڿ��� �� ���� ������ �ּҰ��� �ٸ��� Ȯ��

		System.out.println(sb1.toString());		//--==>> korea

		System.out.println(sb1.hashCode());		//--==>> 1829164700

		System.out.println(sb2.toString());		//--==>> korea

		System.out.println(sb2.hashCode());		//--==>> 2018699554

		*/


		StringBuffer sb3 = new StringBuffer();

		//-- StringBuffer �⺻ ������ ȣ�� ��(�ν��Ͻ� ���� ����)
		//   �⺻������ �����Ǵ� ���� ũ��� ��16��


		//capacity()
		System.out.println("���� ũ�� : " + sb3.capacity());
		//==>>������ ũ�� : 16������ ���

		////////////////////////////////////////////////////////////////////////////////////////////////////

		System.out.println(sb3);		
		//--==>> (�������� ����)

		
		String name = "������";
		name += "������";
		name += "������";
		System.out.println(name);	//������������Ʊ����������
		

		sb3.append("seoul");	//append()�� �ٿ��ִ°�	// ��sb3 += "seoul"��
		System.out.println(sb3);
		//--==>> seoul
		sb3.append("korea");
		sb3.append("�츮����");
		sb3.append("���ѹα�");
		System.out.println(sb3);
		//--==>> seoulkorea�츮������ѹα�




		System.out.println("���� ũ�� : " + sb3.capacity());
		//--==>> ���� ũ�� : 34 ---��
		// 34�� ����? 
		//    �⺻������ �����Ǵ� ���� ũ��� ��16�� 
		// ���ڶ�� ������ ���� ũ�⸦ �ø�

		///////////////////////////////////////////////////////////////////////

		//toUpperCase() �ҹ��� -> �빮�� ��ȯ
		String temp1 = "java and oracle";
		System.out.println(temp1.toUpperCase());
		//--==>> JAVA AND ORACLE



		//toLowerCase() �빮�� -> �ҹ��� ��ȯ
		String temp2 = "JAVA AND ORACLE";
		System.out.println(temp2.toLowerCase());	//-- .toLowerCase()�� StringŬ������ ���ǵǾ� �ִٴ°� Ȯ��
		//--==>> java and oracle




		//System.out.println(sb3.toUpperCase());
		//System.out.println(sb3.toLowerCase());	//-- .toLowerCase()�� StringBufferŬ������ ���ǵǾ� ���� �ʴٴ°� Ȯ��
		//--==>> ���� �߻�




		String temp3 = sb3.toString();			//-- StringBuffer��
		System.out.println(temp3.toUpperCase());
		//--==>> SEOULKOREA�츮������ѹα�

		//seoulkorea�츮������ѹα� sb3�� �빮�� ���·� �ٲٰڴٴ°����� ������ �ٲ��� �ʴ´�!!!!!!!!
		
		System.out.println(sb3);
		//seoulkorea�츮������ѹα�



		// �� ��� ���ڿ�(sb3) �� seoul ���ڿ� �տ�
		//    ���ѱ����̶�� ���ڿ� �߰�
		sb3.insert(0, "�ѱ�");				//-- .insert(�� ��ġ, �� ���ڿ�)
		System.out.println("seoul �տ� ���ѱ��� �߰� : " + sb3.toString());
		//--==>> seoul �տ� ���ѱ��� �߰� : �ѱ�seoulkorea�츮������ѹα�

		// �ѱ�seoulkorea�츮������ѹα�

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// �� ��� ���ڿ�(sb3) �� korea ���ڿ� �ڿ�
		//    ��������̶�� ���ڿ� �߰�
		//    ��, ��� ���ڿ��� �ε����� Ȯ������ ����..

		// �׽�Ʈ ��
		System.out.println(sb3.toString());
		//�ѱ�seoulkorea�츮������ѹα�

		//�׽�Ʈ �� 
		sb3.insert(12, "���");
		System.out.println("korea �ڿ� ������� �߰� : " + sb3.toString());
		//--==>> korea �ڿ� ������� �߰� : �ѱ�seoulkorea����츮������ѹα�
	

		// �׽�Ʈ ��
		//sb3.inexof("korea")
		System.out.println(sb3.indexOf("korea"));	//--==>> 7
		//koreark 7��°���� ���´�

		//�׽�Ʈ ��
		System.out.println(sb3.insert(sb3.indexOf("korea"),"���!"));
		//�ѱ�seoul���!korea����츮������ѹα�

		//�׽�Ʈ ��
		//sb3.insert("korea" ���ڿ��ε��� + "korea" ���ڿ�����, "���");
		sb3.insert(sb3.indexOf("korea")+"korea".length(), "���");
		//				=============		============
		//					7					5		
		System.out.println(sb3);
		//--==>> �ѱ�seoulkorea����츮������ѹα�

		/////////////////////////////////////////////////////////////////////////////////////////////////////


		// �� ���츮���� ���ڿ� ����

		//�׽�Ʈ ��
		//sb3.delete(14, 18);		//14���� 18���� ����
		//--==>> �ѱ�seoulkorea������ѹα�


		//�׽�Ʈ ��
		sb3.delete(sb3.indexOf("�츮����"), sb3.indexOf("�츮����")+"�츮����".length());
		System.out.println(sb3);
		//--==>> �ѱ�seoulkorea������ѹα�




		// �� ��� ���ڿ�(sb3) ����
		//    ��korea�� ���� ���ڿ� ���� (korea ����)
		// ��, ó����� ���ѱ�seoul���� ������..!

		sb3.delete(sb3.indexOf("korea"), sb3.length());
				//			   ========   ============
				//					7        18
		System.out.println(sb3);
		//--==>> �ѱ�seoul


		///////////////////////////////////////////////////////////////////////////


		// ���� ũ�� Ȯ��
		System.out.println("���� ũ�� : " + sb3.capacity());
		//--==>> ���� ũ�� : 34 ---��




		// ���ڿ�(sb3)�� ���� Ȯ�� 
		System.out.println("���ڿ��� ���� " + sb3.length());
		//--==> ���ڿ��� ���� 7


		// ���� ũ�� ���� �� ���� ���ڿ��� ��Ƶ� �� �ִ� ������ ũ���...
		sb3.trimToSize();




		// ���� ũ�� ���� ���� ���� ũ�� Ȯ��
		System.out.println("���� ũ�� : " + sb3.capacity());
		//--==>> ���� ũ�� : 7

	}

}


