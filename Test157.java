/*==================================================================
  ���� �÷��� ������ ��ũ (Collection Framework) ����
�ڡڡڡڡڡڡڡڡڡڡ�!!�߿���!!�ڡڡڡڡڡڡڡڡڡڡڡڡڡ�2021-08-12
-Vetor���� ���
=====================================================================*/
//�˻� �� ����
import java.util.Vector;
public class Test157
{
	
	// ���� ���ڿ� �迭 ���� �� �ʱ�ȭ
	private static final String[] colors = {"����","���","�ʷ�","�Ķ�","����","����"};

	public static void main(String [] args)
	{
		//���� �ڷᱸ�� v����
		Vector<String> v = new Vector<String>();
		//���� �ڷᱸ���� v�� color �����͸� ��ҷ� �߰�
		for(String color : colors)
		v.add(color);

		//���� �ڷᱸ�� v�� ��ü��� ���
		System.out.print("��ü ��� ��� : " );
		for(String str : v)
			System.out.print(str + " " );
		System.out.println();
		//��ü ��� ��� : ���� ��� �ʷ� �Ķ� ���� ����

		//indexOf()
		int i  =v.indexOf(s1);
		System.out.println(s1 + "-->index ��ġ : " + i);
		System.out.println(); 

		String s2 ="���";
		//��v.contains(s)��
		//���� �ڷᱸ�� v�� ã���� �ϴ� s�� ���ԵǾ� �ִٸ�..
		if(v.indexOf(s2))
		{
			//���� �ڷᱸ�� v���� s2�� �ε��� ��ġ Ȯ��
			System.out.println(s2 + "--->index ��ġ : " +i);
			//�켱 ���� �ڵ带 ���� �����ϰ� �ϴ� ����� ��ġ�� ã�� ã������ ����~!!
			v.remove(i);
		}
		
	}
}