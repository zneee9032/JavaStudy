/*	===========================
	����÷��� �����ӿ�ũ���
	=========================== */
/*
List (���)->Vector,ArrayList....

=> ���� ����
=> �迭�� ����
=> �ߺ��� ���

��ArrayList Ŭ����
-ArrayList�� VectorŬ������
List�� ũ�� ������ ������ �迭�� �����Ѱ�����
��������VectorŬ������ ��ü�� �⺻������ ����ȭ ������,
ArrayList�� �׷��� �ʴ�

- �񵿱�ȭ �÷����� ����ȭ�� �÷��Ǻ��� �� ���� ������ �����Ͽ�
��������� �÷����� �������� �ʴ� ���α׷�������
�Ϲ������� AraayList�� Vector���� ����ȣ�ϸ�,
ArrayList�� ����ȭ�� ������� ���� Vectoró�� ���������� 
������ ����ȭ�� ������ �δ��� ������ �ʾ�Vector���� �� ������ ����

- null�� ������ ��� ��Ҹ� ����ϸ�
List�������̽��� �����ϴ°� �ܿ� ����Ʈ�� �ݳ��ϱ� ����
���������� ���Ǵ� �迭�� ����� �����ϴ� �޼ҵ带 �����Ѵ�!

=>
ArrayList �񵿱�ȭ,Vector���� ����������
*/

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Test161
{
	public static void main (String[]args)
	{
		//ArrayList�ڷᱸ�� �ν��Ͻ� ����
		//ArrayList<String> list = new ArrayList<String>();
		//Vector<String> list = new Vector<String>();
		//List<String> list = new Vector<String>();
		List<String>list1 = new ArrayList<String>();

		//list1 �� ��� �߰� ->add()
		list1.add("���̺꽺�ƿ�");
		list1.add("�μ���");
		list1.add("���ͽ��ڶ�");
		
		//ArrayList �ڷᱸ�� �ν��Ͻ�����
		List<String> list2 = new ArrayList<String>(list1);		//list1�� list2�� �߰�
		
		//list2�� ��� �߰�
		list2.add("�𰡵�");

		//ArrayList�ڷᱸ�� �ν��Ͻ� ����
		List<String> list3 = new ArrayList<String>();
		
		//list3�� list2�� ��ü��� �߰� ->��addAll();��				//��ü�� ���
		list3.addAll(list2);

		//"�μ���" �տ� "ũ�翤��"�߰�
		//(1) �μ��� ã�� -> indexOf()-> ��ġ�� �ε��� ��ȯ
		int n = list3.indexOf("�μ���");
		
		//System.out.println("�μ��� ��ġ : " +n );			//==>�μ��� ��ġ : 1

		//(2) "�μ���"ã�� �ε��� ��ġ�� "ũ�翤��" �߰�
		list3.add(n, "ũ�翤��");
		



		//���-> ���� ������ Ȯ��
		System.out.println("==============================================================");
		System.out.println(list1);		//==>[���̺꽺�ƿ�, �μ���, ���ͽ��ڶ�]

		System.out.println(list2);		//==>[���̺꽺�ƿ�, �μ���, ���ͽ��ڶ�, �𰡵�]

		System.out.println(list3);		//==> [���̺꽺�ƿ�, �μ���, ���ͽ��ڶ�, �𰡵�]
										//==>("ũ�翤��") �߰� ��--> [���̺꽺�ƿ�, ũ�翤��, �μ���, ���ͽ��ڶ�, �𰡵�]

		System.out.println();
		// ��� -> listIterator() �޼ҵ带 Ȱ���Ͽ� ���
		System.out.println("==============================================================");
		ListIterator<String> li = list3.listIterator();		//li==>List iterator�� ����!
		
		while (li.hasNext())
		{
			System.out.print(li.next() + " ");
		}
		System.out.println();
		//���̺꽺�ƿ� ũ�翤�� �μ��� ���ͽ��ڶ� �𰡵�

		//��� -> �������� ���
		System.out.println("==============================================================");
		while (li.hasPrevious())
		{
			System.out.print(li.previous() + " ");
		}
		System.out.println();
		//�𰡵� ���ͽ��ڶ� �μ��� ũ�翤�� ���̺꽺�ƿ�



	}
}