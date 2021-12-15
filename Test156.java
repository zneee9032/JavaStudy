/*==================================================================
  ���� �÷��� ������ ��ũ (Collection Framework) ����
�ڡڡڡڡڡڡڡڡڡڡ�!!�߿���!!�ڡڡڡڡڡڡڡڡڡڡڡڡڡ�2021-08-12
-Vetor���� ���
=====================================================================*/
/*

*/
import java.util.Vector;
import java.util.Collections;
public class Test156
{
	// ���� ���ڿ� �迭 ���� �� �ʱ�ȭ
	private static final String[] colors = {"����","���","�ʷ�","�Ķ�","����","����"};
	public static void main(String[] args)
	{
		//���� �ڷ� ���� ����
		Vector<String> v = new Vector<String>();
		
		//���� �ڷ� ���� v�� colors�����͸� ��ҷ� �߰�

		for (String color:colors)
			v.add(color);
			
		System.out.println("ù��° ��� : " + v.firstElement());
		System.out.println("�ι�° ��� : " + v.get(1));
		System.out.println("������ ��� : " + v.lastElement());
		System.out.println("����� ����: " + v.size());

		/*
			ù��° ��� : ����
			�ι�° ��� : ���
			������ ��� : ����
			����� ����: 6
		*/


		System.out.println();

		//<ù���� ��Ҹ� "�Ͼ�"���� ���� -> set()>
		v.set(0, "�Ͼ�");
		
		System.out.println("ù��° ��� : " + v.firstElement());
		System.out.println("�ι�° ��� : " + v.get(1));
		System.out.println("����� ����: " + v.size());
		/*
			ù��° ��� : �Ͼ�
		�ι�° ��� : ���
		����� ����: 6
		*/		
		System.out.println();


		//<ù���� ��ҿ� "����"���� �߰� -> insertElementAt()>
		v.insertElementAt("��Ȳ",0);

		System.out.println("ù��° ��� : " + v.firstElement());
		System.out.println("�ι�° ��� : " + v.get(1));
		System.out.println("����� ����: " + v.size());
		/*
			ù��° ��� : ��Ȳ
			�ι�° ��� : �Ͼ�
			����� ����: 7
		*/

		System.out.println();

		//<��ü ���>
		System.out.print("��ü ���");
		for(String str : v)
			System.out.print(str + " ");
		System.out.println();
		//��ü �����Ȳ �Ͼ� ��� �ʷ� �Ķ� ���� ����


		// �� �˻�				//��import java.util.Collections;��

		// Collections.binarySerch()

		// �˻� ��� ����. ��, �������� ���ĵ� �ڷῡ���� ��� ����

		// �˻� ����� �������� ���� ���... ������ ��ȯ�Ѵ�.

		int idxBlue = Collections.binarySearch(v, "�Ķ�");

		System.out.printf(">> �Ķ� : %d ��° �ε����� ��ġ�ϰ� �ִ�.\n", idxBlue);

		//--==>> >> �Ķ� : 5 ��° �ε����� ��ġ�ϰ� �ִ�.




		int idxNavi = Collections.binarySearch(v, "����");

		System.out.printf(">> ���� : %d ��° �ε����� ��ġ�ϰ� �ִ�.\n", idxNavi);

		System.out.println();

		//--==>> >> ���� : -1 ��° �ε����� ��ġ�ϰ� �ִ�. �� �˻���� ����.



		// �� �������� ����

		Collections.sort(v, Collections.reverseOrder());

		System.out.print("�������� ���� �� ��ü ��� : ");

		for	(String str : v)

			System.out.print(str + " ");

		System.out.println();

		//--==>> �������� ���� �� ��ü ��� : �Ͼ� �Ķ� �ʷ� ��Ȳ ���� ���� ���




		idxBlue = Collections.binarySearch(v, "�Ķ�");

		System.out.printf(">> �Ķ� : %d ��° �ε����� ��ġ�ϰ� �ִ�.\n\n", idxBlue);

		//--==>> >> �Ķ� : -8 ��° �ε����� ��ġ�ϰ� �ִ�.--------->> ��ã��
		// ���������� -1�� �ƴ� �ٸ� ���ڰ� ������ ã�� �� ���� ȯ��




		idxBlue = Collections.binarySearch(v, "�Ķ�", Collections.reverseOrder());

		System.out.printf(">> �Ķ� : %d ��° �ε����� ��ġ�ϰ� �ִ�.\n\n", idxBlue);

		//--==>> >> �Ķ� : 1 ��° �ε����� ��ġ�ϰ� �ִ�.

		

		System.out.print("�������� ���� �� ��ü ��� : ");

		for	(String str : v)

			System.out.print(str + " ");

		System.out.println();
		//�������� ���� �� ��ü ��� : �Ͼ� �Ķ� �ʷ� ��Ȳ ���� ���� ���

	}

}


