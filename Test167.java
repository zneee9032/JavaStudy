/*	===========================
	����÷��� �����ӿ�ũ���
	=========================== */
/*
��	Map-> Hashtable, HashMap
	java.util.Map �������̽��� 
	Ű(key)�� ��(value)�� ����(mapping)�ϸ�,
	�� Ű�� �Ѱ��� ������ �����ؾ� �Ѵ�.				=> ��, �ϳ��� Ű ���� �����ϴ� �ϳ��� ���� ���� �ڷᱸ���̴�

��HashMap<K, V>Ŭ����
- Hashtable Ŭ������ ���������� Map�������̽����� ��ӹ���
	HashMapŬ������ ����� Hashtable�� ����������
	Synchronozation�� ���� ������ ���ü� ������ ���ٸ�
	(��, �ָ� ������ ���α׷��� �ƴ� �����)
	HashMap�� ����ϴ°��� ������ ���!!!!!!

����, HashMap�� HashtableŬ������ �޸� null�� ���
*/
import java.util.HashMap;
import java.util.Map;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test167 
{
	public static void main(String[] args)	throws IOException
	{
		// HashMap�ڷᱸ�� �ν��Ͻ� ����
		//HashMap<String,String> map = new HashMap<String,String>();
		Map<String,String> map = new HashMap<String,String>();
		
		//Map�̶�� �ؽø� �ڷᱸ���� ��� �߰�
		//-> put()			//Ű,���� ����
		map.put("���", "����");	
		map.put("��ȭ", "�׷���Ƽ");	
		map.put("��ȭ", "���󿡸�");	
		
		//���� Ȯ��
		System.out.println(map);			//{���=����, ��ȭ=�׷���Ƽ, ��ȭ=���󿡸�}


		System.out.println("====================");

		//null�Է½õ�
		map.put(null,null);
		map.put("�Ҽ�",null);
		map.put(null,"�����ϴ»��");		// null ���� ��
		// ���� ������ �Է� ������ ���� ��� ������ ������ �Է��� ����������
		//������ null �� key�� ���� �� "�����ϴ� ���"��
		//���� null�� key�� �����ϴ� null�� ����� ��Ȳ�� �߻��ϰ� �ȴ�.
		//��!HashMap�� null�� �ϳ��� ������ key ������ �����Ѵ�(�ν��Ѵ�)

		//���� Ȯ��
		System.out.println(map);			//{null=�����ϴ»��, �Ҽ�=null, ���=����, ��ȭ=�׷���Ƽ, ��ȭ=�� �󿡸�}


		System.out.println("====================");

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("ī�װ�,Ÿ��Ʋ �Է�(�ĸ�����): ");		//"�׸�, �𳪸���"
		String[]  temp;
		
			for (String str; ((str=br.readLine()) != null); )
			{
				temp = str.split(",")	;		//"�׸�, �𳪸���"
				if (temp.length<2)
				{
					System.out.print("ī�װ�,Ÿ��Ʋ �Է�(�ĸ�����): ");
					continue;
				}
				map.put(temp[0].trim(),temp[1].trim());
				System.out.println(map);

				//ī�װ�,Ÿ��Ʋ �Է�(�ĸ�����): �׸�, �𳪸���
				//{null=�����ϴ»��, �Ҽ�=null, �׸�=�𳪸���, ���=����, ��ȭ=�� ����Ƽ, ��ȭ=���󿡸�}
			}
		
	}
}
/*
{���=����, ��ȭ=�׷���Ƽ, ��ȭ=���󿡸�}
====================
{null=�����ϴ»��, �Ҽ�=null, ���=����, ��ȭ=�׷���Ƽ, ��ȭ=�� �󿡸�}
====================
ī�װ�,Ÿ��Ʋ �Է�(�ĸ�����): �׸�,�𳪸���
{null=�����ϴ»��, �Ҽ�=null, �׸�=�𳪸���, ���=����, ��ȭ=�� ����Ƽ, ��ȭ=���󿡸�}

*/