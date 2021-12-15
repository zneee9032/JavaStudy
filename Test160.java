/*	===========================
	����÷��� �����ӿ�ũ���
	=========================== */
/*
��Enumeration�� Interator�������̽�

Collection�� Framework����
Enumeration�� Interator��� �������̽��� �ִ�
�������� �ǹ̷δ� �ݺ�, ��ȯ�̶�� �ǹ̸� ������ ������
� ��ü���� ������ ������.
�� ��ü���� ��������� ���� �ϳ��������Ͽ� ����ϱ� ���Ѱ��� �������̽���� �� �� �ִ�.

- java.util.Enumeration<E>�������̽�
: �� �������̽��� ���� �ΰ��� �޼ҵ常�� �����ϸ� ��hasMoreElements()���޼ҵ带 ���� 
�������̽� �ȿ� ������Ұ� �ִ����� ���� ���Ǹ� �Ѵ� 
���� true�� ��ȯ �Ǿ��ٸ� ���� �ε����� ��Ұ� �����Ѵٴ� �ǹ� �̸�
��nextElement()���޼ҵ�� ������Ҹ� ������ ����ϸ� �ȴ�

ex)	v��� ���� �ڷᱸ���� ����� ��� ��� ���� �� ���
	for(Enumeration e = v.elements(); e.hasMoreElements();)

	{
		System.out.println(e.nextElement());
	}

-java.util.Interator<E>�������̽�
	: Enumeration���� �������� ���� ��remove()���޼ҵ尡 �߰��� �� ��!
		Iterator �� ������ �ִ� ��hasNext()���� ��next()���޼ҵ��
�̸��� �ణ �ٸ� �� Enumeration�������̽��� ������ �ִ�
��hasMoreElements()���� ��nextElement()����
��Ȯ�� ��ġ�ϴ� ����� �����Ѵ�
Enumeration��� Iterator�� JDK1.2���� �߰��Ͽ� ����ϰ� �� ������
Enumeration �������̽��� ���ճ����� ��Ҹ� ���� �� ����� ���⋚���� 
�̸� �����ϱ� ���� ���°��� Iterator �������̽��̴�


*/
import java.util.Vector;
import java.util.Enumeration;
import java.util.Iterator;

public class Test160
{
	public static void main(String[] args)
	{	
	//�����ڷᱸ�� �ν��Ͻ�
	Vector<String> v = new Vector<String>();

	//���� �ڷᱸ�� v ����߰�
		v.add("Java");
		v.add("Oracle");
		v.add("Jsp");
		v.add("Servlet");
		v.add("Spring");
	
		//(1) Enumeration
		//    hasMoreElements()	//-s ��ҵ�!
		//    nextElement()		//�Ѱ��ִ� ���ΰ�?

		Enumeration<String> e = v.elements();	//�ڹ� ����Ŭ ���̿����� ....
		while (e.hasMoreElements())	//-----====>true,false ��ȯ!=====>�ڹٸ� ���� ���Ե� ->nextElement:�� ������ ����Ŭ�� ���� ��
		{
			System.out.println(e.nextElement());
		}
		
		System.out.println();
		/*
			Java
			Oracle
			Jsp
			Servlet
			Spring
		*/

		System.out.println("===============================================================");	//(1)���� �����ϰ� ���
		//(2)	Iterator
		//		hasNext()
		//		next()

		Iterator<String> it = v.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
			System.out.println();
		/*
			Java
			Oracle
			Jsp
			Servlet
			Spring
		*/
	}
}