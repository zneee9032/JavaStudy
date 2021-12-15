/*==================================================================
  ���� �÷��� ������ ��ũ (Collection Framework) ����
�ڡڡڡڡڡڡڡڡڡڡ�!!�߿���!!�ڡڡڡڡڡڡڡڡڡڡڡڡڡ�2021-08-12
- Vector
=====================================================================*/
// Vector v = new Vector();
//��� �ִ� Vector�ڷᱸ�� ����

//Vector v = new Vector(8);
//8���� �ʱ�element�� ����Vector�ڷᱸ�� ����
// 8���� ��� ä������ �Ǹ� (���ڶ�� �Ǹ�) �ڵ����� Ȯ��ȴ�

//Vector v = new Vector(3, 5);
//3���� �ʱ� element�� ���� Vector�ڷᱸ�� ����
//3���� ��� ä������ �Ǹ�(���ڶ�� �Ǹ�) �ڵ����� 5�� �����ȴ�

//���ʹ� ������ ��ҷμ� ������/�Ǽ���/���ڿ� ���� ��Ƴ��� ���� �����ϴ� -> ������ ������ Ȯ��

import java.util.Vector;
import java.util.Iterator;

class MyVector extends Vector<Object>	// <Object>���·� ��ӹ����� <Object>�� ���δ�.
{
	// ������
	MyVector()
	{
		//--Vector(1,1) : �θ� �����ڿ� �� ���� �Ű������� ���� (���� Ŭ����)
		super(1,1);
		//-- ù ��° ���� : �־��� �뷮
		//   �� ��° ���� : ������
	}
	void addInt(int i)
	{
		addElement(new Integer(i));
	}
	void addFloat(float f)
	{
		addElement(new Float(f));
	}
	void addString(String s)
	{
		addElement(s);
	}

	void addCharArray(char[] a)
	{
		addElement(a);
	}


	void write()
	{
		Object o;
		int length = size();
		System.out.println("������ ũ�� : " + length);

		for (int i=0; i<length; i++)
		{
			o = elementAt(i);
			// ��instanceof�� ������

			//-- ó���ؾ� �ϴ� ����� ��ü Ÿ�� Ȯ��
			if (o instanceof char[])
			{
				// System.out.println("���ڹ迭 : " + o.toString());
				System.out.println("���ڹ迭 : " + String.copyValueOf((char[])o));

			}
			else if (o instanceof String)	//-- o�� StringŸ������ Ȯ���ϴ� ������
			{
				System.out.println("���ڹ迭 : " + o.toString());
			}

			else if (o instanceof Integer)

			{
				System.out.println("������ : " + o);
			}

			else if (o instanceof Float)

			{
				System.out.println("�Ǽ��� : " + o);
			}

			else

			{
				System.out.println("Ÿ�� Ȯ�� �Ұ�~!!!");
			}

		}
		//--==>> ������ ũ�� : 4
		//       ������ : 5
		//       �Ǽ��� : 3.14
		//       ���ڹ迭 : �ȳ��ϼ���
		//       ���ڹ迭 : study

		//-------------------------------------------------------------------------
		System.out.println();


		Iterator<Object> it = this.iterator();	//<Object> Ȯ��
		while (it.hasNext())

		{

			System.out.println(it.next());
		}

		//--==>> 5
		//       3.14
		//       �ȳ��ϼ���
		//       [C@6d06d69c
	}

}
public class Test155

{
	public static void main(String[] args)

	{

		// MyVector Ŭ���� �ν��Ͻ� ����
		MyVector v = new MyVector();

		// �ֿ� ���� ���� �� �ʱ�ȭ
		int digit = 5;
		float real = 3.14f;
		String s = new String("�ȳ��ϼ���");
		char[] letters = {'s','t','u','d','y'};


		v.addInt(digit);			//-- ���� �ڷᱸ���� ���� ����
		v.addFloat(real);			//-- ���� �ڷᱸ���� �Ǽ� ����
		v.addString(s);				//-- ���� �ڷᱸ���� ���ڿ� ����
		v.addCharArray(letters);	//-- ���� �ڷᱸ���� �迭�ּ�(�迭����ü������ߴ�) ����

		//--==> 5
		//      3.14
		//      �ȳ��ϼ���
		//      [C@6d06d69c

		v.write();

	}
 
}


