/*==================================================================
  ���� �÷��� ������ ��ũ (Collection Framework) ����
�ڡڡڡڡڡڡڡڡڡڡ�!!�߿���!!�ڡڡڡڡڡڡڡڡڡڡڡڡڡ�2021-08-12

- ����(vector)< = > �迭_ �����Ѽ������� �����͸� ����/ ���� /����Ÿ��
=====================================================================*/
/*
�� Vector(����)

   �ڹ��� �ڷ� ���� ����� �����ϴ� Ŭ������ �� ���� �⺻���� Ŭ������
   �迭�� ���������, �迭���� �޸� �ٸ� ������ ������ ���� ����
   ������ ��Ҹ� ���� �� ������, �����Ͱ� ���� ���� �ڵ����� ���� ������
   �÷��ְ� �ȴ�.


   ���� ��ü ���۷����� �����ϱ� ������
   JDK 1.5 �������� �ڹ� �⺻�� �����ʹ� ������ �� ��������
   JDK 1.5 ���ĺ��ʹ� ����ڽ� / ���� ��ڽ� ����� �����Ǹ鼭
   �⺻ ���������� ������ �����ϴ�.

   ���� Ŭ������ �⺻ ������ ������(sequence) ������ ������ ����ϸ�		==> �������� ������
   ������ ������ ������ �������� �ε��� ���� ���� ��ġ�� �����ϰ� �ȴ�.
   ����, �ڷᱸ���� �� ���ܿ����� ������ ������ ť�� ���� �������� ������ ������ ���ð� �޸�
   ������ ������ �ε��� ���� �̿��Ͽ� �ڷ� ������ ������ �������� ���� �� ������ �����ϴ�.


   ���� ������ ������
   List �������̽��� ���� �����ް� �ֱ� ������
   List �������̽��� ��� �޼ҵ带 ����� �� �ִ�.


   - void add(int index, E element)
   - void insertElementAt(E obj, int index)
     : �־��� ��ġ�� ��ü�� �����Ѵ�.
       �־��� ��ġ�� ��ü���� ���������� �ϳ��� �̵��Ѵ�.

   - void addElement(E obj)
   - boolean add(E e)
     : ��ü�� ���� ���� �߰��Ѵ�.


   - void removeElementAt(int index)
   - E remove(int index)
     : �־��� ��ġ�� ��ü�� �����Ѵ�.
       ���� �� �־��� ��ġ ������ ��ü���� �ϳ��� �������� �̵��ϸ�
       E remove(int index) �޼ҵ�� ����Ǿ��� ��ü�� ��ȯ�Ѵ�.

   - boolean removeElement(Object obj)
   - boolean remove(Object obj)
     : �־��� ��ġ�� ��ü�� �����Ѵ�.
      ���� �� �־��� ��ġ ������ ��ü���� �ϳ��� �������� �̵��Ѵ�.
      ��ü�� ���������� ���ŵǾ����� true �� ��ȯ�Ѵ�.

   - void removeAllElement()
   - void clear()
      : ������ ��� ��Ҹ� �����Ѵ�.

    - void setElementAt(E obj, int index)
   - E set(int index, E element)
     : ������ index ��ġ�� �־��� ��ü�� �����Ѵ�.
       �־��� ��ġ�� ����Ǿ� �ִ� ��ü�� �Ҹ��Ѵ�.(�� ������� ����)


   - E elementAt(int index)
   - E get(int index)
     : �־��� ��ġ�� ����� ��ü�� ��ȯ�Ѵ�.

   - Enumeration<E> elements()
     : ������ ��� ��Ҹ� ��ȯ�Ѵ�.


   - int indexOf(Object o)
     : �־��� ��ü�� ����� ��ġ�� ��ȯ�Ѵ�.
      �������� ���� ��� ���������� ��ȯ�Ѵ�.


   - int indexOf(Object o, int index)
     : �־��� ��ü�� ����� ��ġ�� index ��ġ���� ã�Ƽ� ��ȯ�Ѵ�.
       index ��ġ�� ��ĵ�� �����ϴ� ��ġ.

   - boolean contains(Object o)
     ���Ͱ� �־��� ��ü�� �����ϰ� �ִ����� ���θ� ��ȯ�Ѵ�.

   - void ensureCapacity(int minCapacity)
     : ������ �뷮�� �־��� ũ�⺸�� ũ���� �����Ѵ�.

   - E firstElement()
     : ������ ù ��° ����� �����͸� ��ȯ�Ѵ�.

   - E lastElement()
     : ������ ������ ����� �����͸� ��ȯ�Ѵ�.

   - void setSize(int newSize)
     : ������ ũ�⸦ �����Ѵ�.
      ���� �־��� ũ�Ⱑ ���� ũ�⺸�� �۴ٸ� �������� ������.
      �ݴ�� �־��� ũ�Ⱑ ���� ũ�⺸�� ũ�ٸ�
      �� ������ null ��ü�� ä��� �ȴ�. (��ü�� �������� ������ �ǹ�)

   - int capacity()
     : ���� ������ �뷮�� ��ȯ�Ѵ�.


   - int size()
     : ���� ���Ϳ� ����� ��ü�� ����(size)�� ��ȯ�Ѵ�.

   - int trimToSize()
     : ������ �뷮�� ����� ��ü�� ������ �µ��� �ּ�ȭ�Ѵ�.

�� ȣȯ�� ���� ���ܵ����� �߾Ⱦ��� �ڷᱸ���̴�.


*/
import java.util.Vector;
import java.util.Iterator;

public class Test154
{
	// ���� ���ڿ� �迭 ���� �� �ʱ�ȭ
	private static final String[] colors = {"����","���","�ʷ�","�Ķ�","�Ķ�","����"};

	public static void main(String[] args)
	{

		int i;
		String str;

		//Vector(����) �ڷᱸ�� v����
		Vector<Object> v = new Vector<Object>();
		//v��� Vector(����) �ڷᱸ���� 
		//colors�迭�� ��� �ִ� ������ ��Ƴ���
		//add()
			
		for (i=0; i<colors.length;i++)
		{
			v.add(colors[i]);
		}

		// �߰�
		// addElement()
		v.addElement("����");


			
		//firstElement()
		str = (String)v.firstElement();
		System.out.println("ù��° ��� : " + str);			//===>>ù��° ��� : ����

		//get()      �ι�° ���� �迭�� ��� ���� ===> ����
		str = (String)v.get(1);
		System.out.println("�ι�° ��� : " + str);			//==>>�ι�° ��� : ���

		//get()
		str = (String)v.get(0);
		System.out.println("ù��° ��� : " + str);			//===>>ù��° ��� : ����


		//get()
		str = (String)v.elementAt(1);
		System.out.println("�ι�° ��� : " + str);			//�ι�° ��� : ���

		//lastElement()
				str = (String)v.lastElement();
		System.out.println("������ ��� : " + str);			//������ ��� : ����
															//������ �߰� �� ===> ������ ��� : ����(140 ����)

		//* ���� �ڷᱸ���� ��� �߰���((->add)/addElement())
		//	�ε��� ������(���� ��)�� ��ġ�� �߰��Ǵ°��� Ȯ�� �� ���ִ�.
		
		
		// ��ü ��� ��� -- check~!!!
		// Iterator(���ͷ�����)�� ���� ��ü ���					//import java.util.Iterator;�Ұ�!
		// hasNext() : ���� ������ ��Ұ� �ִ����� ���θ� ��ȯ.
		// next()    : ���� ������ ��Ҹ� ���������� ��ȯ.
		Iterator it = v.iterator();

		while (it.hasNext())
		{
			str = (String)it.next();
				System.out.print(str + " ");
		}
		System.out.println();
		//--==>> ���� ��� �ʷ� �Ķ� �Ķ� ���� ����

	}
}