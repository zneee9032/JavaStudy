/*	===========================
	����÷��� �����ӿ�ũ���
	=========================== */
/*
��	Map-> Hashtable, HashMap
	java.util.Map �������̽��� 
	Ű(key)�� ��(value)�� ����(mapping)�ϸ�,
	�� Ű�� �Ѱ��� ������ �����ؾ� �Ѵ�.				=> ��, �ϳ��� Ű ���� �����ϴ� �ϳ��� ���� ���� �ڷᱸ���̴�

��Hashtable<K, V>Ŭ����
- �ؽ� ���̺� ������ ��ü �𵨸��� Ŭ������ �˻��� �����ϱ� ������ ��� �󵵰� ���� �� ���Ѵ�.
- �ؽ����̺��̶� Ű(key)�� �׿� �����ϴ� ������ (value)�� ���е� ������ �����̴�
- �����͸� �����ϰ�, �˻��ϱ� ���ؼ� Ű(key)�� �����ϸ� �̱��������� Ű ���� �ο� �ϸ� �ش� �����Ͱ� ��ȯ �ȴ�
- ���� HashtableŬ������ key �Ǵ� value�� ������ null�� ������ �ʴ´�===========================================> ���ǿ��� ���� ���� ����



��- ���� HashtableŬ������ key �Ǵ� value�� ������ null�� ������ �ʴ´�
*/
import java.util.Hashtable;
public class Test166
{
	private static final String[] names
	={"���±�", "������","������","�չ���","�ּ���", "����ȣ"};
	private static final String[] tels
	={"010-3733-7202","010-7389-9032","010-8805-8143","010-4550-7043","010-3288-6988","010-3370-5057"};
	public static void main(String[] args)
	{
		Hashtable<String,String> ht = new Hashtable<String,String>();
		
		//ht��� ����� Hashtable�ڷᱸ����
		//�迭 name, tels)�� ����ִ� �����͸� ��ҷ� ��Ƴ���
		//-> put(k.v)
		for (int i=0; i<names.length; i++)
		{
			ht.put(names[i], tels[i]);
		}

		//ht ��� Hashtable�� ����..key�� �̿��Ͽ� �˻�
		//-> get(k)
		String findName1 = "������";
		String str = ht.get(findName1);
			if (str != null )
			{
				System.out.println(findName1 + "��ȭ ��ȣ : " + str);
			}
			System.out.println();		//��������ȭ ��ȣ : 010-8805-8143

			//ht.��� Hashtable �ڷᱸ����...key�� �����ϴ����� ����Ȯ��
			//--> containsKey()
			String findName2 = "������";
			if (ht.containsKey(findName2))
			{
				System.out.println(findName2 + "�����Ͱ� �����մϴ�.");
			}
			else	
				System.out.println(findName2 + "�����Ͱ� �������� �ʽ��ϴ�");
			System.out.println();		//�����������Ͱ� �������� �ʽ��ϴ�

			String findName3 = "����ȣ";
			if (ht.containsKey(findName2))
			{
				System.out.println(findName3 + "�����Ͱ� �����մϴ�.");
			}
			else	
				System.out.println(findName3 + "�����Ͱ� �������� �ʽ��ϴ�");
			System.out.println();		//����ȣ�����Ͱ� �������� �ʽ��ϴ�

			//ht��� Hashtable �ڷᱸ����...value�� �����ϴ����� ���� Ȯ��
			//->contains()
			String findTel1 =" 010-3733-7202 ";
			if (ht.contains(findTel1))
			{
				System.out.println(findTel1 + "�����Ͱ� �����մϴ�");
			}
			else
				System.out.println(findTel1 + "�����Ͱ� �������� �ʽ��ϴ�.");
			System.out.println();				// 010-3733-7202 �����Ͱ� �������� �ʽ��ϴ�.
		
			//ht��� HashTable�ڷᱸ������..�������� ������ ����
			//--> remove()
			ht.remove("������");
			//��remove()���޼ҵ�� ���ڰ����� key�� �Ѱܹ�����
			// �̶�, key�� �����Ǵ� ���� �ƴϴ�.
			//�ش� key �� ����(�ش�) �Ǿ� �ִ� value�� �Բ� remove()�ȴ�

			//����(remove())���� key �� �����ϴ��� Ȯ��
			if (ht.containsKey("������"))
			{
				System.out.println("���� ���� �մϴ�!");
			}
			else
				System.out.println("���� ��𰬾�~!!!!!");
			System.out.println();				//���� ��𰬾�~!!!!!
			

			//����(remove())���� key�� �����ϴ��� Ȯ��
			if(ht.contains("010-7389-9032"))
				System.out.println("010-7389-9032 �����Ͱ� �����մϴ�.");
			else
			


			//�ߺ��� key �Է�
			ht.put("�չ���","010-1234-1234");
				System.out.println(ht.get("�չ���"));
				System.out.println();			//010-1234-1234
			//���� "010-4550-7043"���� "010-1234-1234"�� ����Ǿ���(����� ����)
			//--------------------------------------------------------------------------------

			//�ߺ� �� value �Է�
			ht.put("�Ǽ���", "010-8805-8143");

			System.out.println(ht.get("������"));
			System.out.println(ht.get("�Ǽ���"));
			System.out.println();				//010-8805-8143
												//010-8805-8143 => value�� �ߺ��� ���� �ԷµǾ ���� �����Ϳ� �ƹ��� ������ ����
		
			
	}
}