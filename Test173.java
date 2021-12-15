/*	================================================================================
	��ᰴü ����ȭ (Object Serialization)��� <-> object synchronization: ����ȭ
2021-08-17
	================================================================================ */
/*
�۰�ü ����ȭ (Object Serialization)

�޸𸮿� ������ Ŭ���� ��ü�� ��� ������ ���� ���¸� �״�� �����ؼ� ���Ͽ� �����ϰų�
��Ʈ��ũ�� ���� ���� �� �� �ִ� �������
��������� ���� �����Ѵٰų�
�ٸ� ��Ʈ��ũ�� �ִ� ȣ��Ʈ�� ���� ���� ��� ����ϰ� �ȴ�

��, ��ü ����ȭ�� ���빰(=������)�� ����Ʈ������ ��ȯ�Ͽ� 
���� �Ǵ� ��Ʈ��ũ�� ���� �ۼ���(��Ʈ��)�� �����ϰ� ������ִ� ������
�̶� ��ü�� ��� ������ �޸𸮸����� �����Ȱ��̴�

���� �޼ҵ�� �����ڴ� ��ü ����ȭ�� ��󿡼� ����==> check~!

�۰�ü ����ȭ ����
��ü ��ü�� ������ ����� ���Ŀ� ���ֹ��� �ʰ� ��ü�� ���Ͽ� ���������μ� ���Ӽ�(���������� ����)�� ������ �� ������ 
��ü ��ü�� ��Ʈ��ũ�� ���� �ս��� ��ȯ �Ҽ� �ִ�

��ü ����ȭ�� �ڹ� 1.1 ���Ŀ� ���Ե� ���µ� ������ RMI�� Bean�����̴�
RMI�� ���� ��ü ����� �����ϱ� ������ ��ü�� �״�� �̵��� �� �־���Ѵ�
���� �̸� �����ϱ� ���ؼ��� ��ü ����ȭ�� �ʼ�

���� Bean�� ����� ���¿� ���� ������ �����Ҷ� �̰�ü ����ȭ�� ����ϸ� ���ϰ� ��ü ���¸� ���� �� �� �ִ�.

��RMI(Remote Method Invocation)
���� �ٸ� ���� �����ġ�� �����ϴ� �Լ��� ȣ���ϰ� �����ϴ� ����� ����Ѵ�.
���� �ٸ� ��� ������ ��ġ�� ������ ���� ��ü�� ����
��� ������ �����ϴ°������� �����ؾ��Ѵ�.

��Bean(��)
C/S(Client �� Server)������ �𵨿��� ������ ������ �ش��ϸ�
���� ������ ����Ʈ���� ��ü�� ����� �ְ� �ϴ� ������Ʈ ���
�ۼ��� ��ü�� ������ �����ϸ� ������Ʈ�� ���� ���Խ�ų�� �ֵ��� �Ѵ�
Ŭ���̾�Ʈ���� ���̶�� ���α׷� ������Ʈ�� �й��ϴ� ������� ó��

��Serializable�������̽�
��ü ����ȭ�� �ϱ� ���ؼ� ���� ��ü ����ȭ�� �����ϵ���
java.io.Serializable�������̽��� ������ �־���Ѵ�.
�� �������̽��� ��ü ����ȭ�� �����Ǿ�� �Ѵٴ� ����� JVM���� �˷��ִ� ����
����, Serializable�������̽��� �ٸ� �������̽��� �޸� �����ؾ��� �޼ҵ尡 ���� ���� ���� ���ָ� �ȴ�

����)
public class Ŭ���� �� implements Serializable
{
	//..
}

Serializable�ζ����̽��� ������ ��
ObjecInputStreamŬ������ ObjectOutputStreamŬ������ �̿��Ͽ� ��ü ������ ������� �����ϰ� �ȴ�
* �޹� ������ static���� ����� ���(��, Ŭ���� ���� �� ���) ��ü ����ȭ�� ��󿡼� ���ܵȴ�


��Object Stream
java.io.ObjectInputStram
ObjectInputStreamŬ������ ObjectOutputStreamŬ������ ���� ���Ͽ� ����Ǿ� �ִ� ��ü�� ��Ʈ��ũ�� ���� ���޵� ��ü�� ����ȭ�� �����ϴ� ����� ����
��,java,io.Enternaluzable�������̽��� �������ִ� ��ü�� ���ؼ��� ����� ����

��, Serializable�������̽��� Enternalizable�������̽��� ������ ��ü������ ����� �����ϴ�
�̶�, readObject()�޼ҵ带 �̿��Ͽ� ��Ʈ�����κ��� ����ȭ�� ��ü�� ������ ������ 
�̷��� ������ü�� �迭,���ڿ� �Ǵ� �� ��ü������� ��(Type)���� ĳ���� �� ����Ѵ�

*/
import java.io.File;
import java.util.Hashtable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Enumeration;

public class Test173
{
	public static void main(String []args) throws Exception
	{
		 String appDir = System.getProperty("user.dir");

		//�׽�Ʈ
		//System.out.println(appDir);
		//==>C:\JavaStudy

		//���ϰ�ü ����
		File f0 = new File(appDir, "\\data\\test.ser");
		//--appDir->c:\JavaStudy
		//--appDir ��ġ (���)�� �߽����� "\\data\\test.ser"��
		//�����ϰڴٴ� �ǹ�
		//��������� ��C:\JavaStudy\data\\test.ser������

		//�׽�Ʈ
		//��
		//System.out.println(f0.getParentFile().exists());
		//==>>false		
		

		//�׽�Ʈ
		//�Ρ�C:\JavaStudy����ο� ��data�����丮 ������ Ȯ��
		//System.out.println(f0.getParentFile().exists());
		//==>>true	

		//���͸� ������ �������� �ʴ� ��Ȳ�̶��
		if (!f0.getParentFile().exists())
		{
			//���͸��� ����ڴ�
			f0.getParentFile().mkdirs();
		}	
		// data���͸� �����ϰ� ���� if���� ����ؼ� ���͸��� ����ڴ� �ϴ��� data������ �� ����---> ���� �ڹپȿ��� ���� ���� ����

		//Hashtable �ڷᱸ�� �ν��Ͻ� ����
		Hashtable<String,String> h1 = new Hashtable<String,String>();

		//������ h1 �̶�� Hashtable �ڷᱸ���� ��� �߰�
		h1.put("3","�չ���");
		h1.put("4","ä����");
		h1.put("2","������");
		h1.put("5","�Ǽ���");
		h1.put("1","�����");
		
		//�׽�Ʈ
		//System.out.println(h1.get("1"));
		//==>>�����

		//���� ���� ��� ��Ʈ�� ����(�������� ����)
		FileOutputStream fos = new FileOutputStream(f0);
		//���� ���� ��� ��Ʈ��(���ٱ�)��
		//f0��� ���� ��ü�� ���ڴ� (��� �������� �ֵ���...)
		//InputStreamReader isr = new InputStreamReader(System.in);

		//��ü �������� ��Ʈ�� ����
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//��ü ���� ��� ��Ʈ��(���ٱ�)����
		//fos��� ���� ���� ��� ��Ʈ���� ���ΰڴ�
		//BufferedReader br =new BufferedREader(isr);



		//���� ������ ������ ���� 
		//ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f0));
		
		//���� ����� ���� ���������� ������ ����
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in))

		//* ObjectOutputStreamŬ������
		//��ü���� ����ϴ� ����� �����ϴ� Ŭ������ ��� ��Ʈ���� ����ϱ����� ���������� ��ü ����ȭ�� �����ϰ� �ȴ�
		//�ڹٰ�ü���� ���Ͽ� �����ϰų� ��Ʈ��ũ�� ���� �����ϱ� ����
		//������ ��ü�� ����ȭ�ϴ� ����� �����ϴ°��̴�
		
		//������ ��Ʈ���� ������ ��ü�� ���
		oos.writeObject(h1);

	
		oos.close();	
		//ObjectOutputStream ���ҽ� �ݳ�

		fos.close();
		//FileOutputStream ���ҽ� �ݳ�

		//�������� ��!
		//=============================================================================================����ȭ
		//Java.Study �ȿ� ������ ���� ����� ������ �����ϸ�
		// �ٽ� data���� �����ϰ� ��test.ser�� ����ȭ ���� ����������


		
		//�о���̱� ����!!!
		if (f0.exists())	//f0 ���ϰ�ü�������Ұ�쿡�� �б�
		{
			FileInputStream fis = new FileInputStream(f0);
			ObjectInputStream ois = new ObjectInputStream(fis);

			//ois(ObjectInputStram)�� ���� �о���� ��ü (Object)��  (-> readObject �� ���� ó��)
			//������ �� (Hashtable)���� ĳ�����Ͽ�
			//h2 ��� Hashtable �ڷᱸ���� ��Ƴ���			
			Hashtable h2 = (Hashtable)ois.readObject();		//��ĳ����,,,?  �ȉ�! ��� �ٿ� ĳ�������� ���� ����ȯ ���ֱ�
			//object obj = ois.readObject();
			//Hashtable h2 = (Hashtable)obj;

			ois.close();
				// ois���ҽ� �ݳ� -> ObjectInputStream���ҽ� �ݳ�
			fis.close();
			// fis���ҽ� �ݳ� -> FileInputStream���ҽ� �ݳ�


		//------------------------------------------------------------------------------> ��

		//�о���̴� ��ü
			String key;
			String value;
	
		//Iterator ����� �� ����
		Enumeration e = h2.keys();
			while (e.hasMoreElements())
			{
				key= (String)e. nextElement();
				//key ���� �о���̴� ����
			//Ȯ��
			//System.out.println(key);
			/*
				5
				4
				3
				2
				1
				����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
			*/

			value = (String)h2.get(key);
			//key�� Ȱ���Ͽ� vlaue ��� ����
			System.out.println(key + "-> " + value);
/*
5-> �Ǽ���
4-> ä����
3-> �չ���
2-> ������
1-> �����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/
			}
		}

	}
}
