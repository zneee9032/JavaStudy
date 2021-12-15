/*==================================================================
  ���� �÷��� ������ ��ũ (Collection Framework) ����
�ڡڡڡڡڡڡڡڡڡڡ�!!�߿���!!�ڡڡڡڡڡڡڡڡڡڡڡڡڡ�2021-08-11

- ť(Queue)
=====================================================================*/
/*
�� ť(Queue)

   : ť(Queue)�� FIFO(First Input First Output): ���Լ��� ������
												===============

    ���� �Էµ� �ڷḦ ���� ����ϸ� Queue �������̽��� ������ Ŭ������
    ť�� ���õ� �پ��� ����� �����Ѵ�.



�� Queue �������̽� �ν��Ͻ��� �����ϱ� ���ؼ��� new �����ڸ� �̿��Ͽ�
   Queue �������̽��� ������(implements) Ŭ������ �����ڸ� ȣ���Ѵ�.
   ex) Queue ob = new LinkedList();



�� �ֿ� �޼ҵ�

   - E element()

     : ť�� head ��Ҹ� ��ȯ�ϸ� �������� �ʴ´�.

   - boolean offer(E o)

     : ������ ��Ҹ� ť�� �����Ѵ�.

   - E peek()

     : ť�� head ��Ҹ� ��ȯ�ϰ� �������� ������, ť �ڷᱸ���� empty �� ��� null �� ��ȯ�Ѵ�.

   - E poll()

     : ť�� head ��Ҹ� ��ȯ�ϰ� �����ϸ� ť �ڷᱸ���� empty �� ��� null �� ��ȯ�Ѵ�.

   - E remove()

     : ť�� head ��Ҹ� ��ȯ�ϰ� �����Ѵ�.

*/
import java.util.Queue;
import java.util.LinkedList;
public class Test152
{
	public static void main(String[] args)
	{
		//Queue �ڷᱸ�� ����
		//Queue myQue = new Queue();					//Queue�� �������̽��� �̷��� ���� �ȵ�
		Queue<Object> myQue = new LinkedList<Object>();

		//������ �غ�
		String str1 = "������";
		String str2 = "�����";
		String str3 = "�Ǽ���";
		String str4 = "��ҿ�";

		//myQue��� Queue�ڷᱸ���� ������ �߰�
		myQue.offer(str1);
		myQue.offer(str2);
		myQue.offer(str3);
		boolean test = myQue.offer(str4);

		System.out.println(myQue);
		//==>>[������, �����, �Ǽ���, ��ҿ�]				//�����͸� �����ִ� ������ �׾ȿ��� �������°��� �ƴ�!

		System.out.println(test);							//�ڷ�ȿ� ���� �ִ°��� boolean
		//==>true

		//Queue�ڷᱸ������ ��Ҹ� ���� �����ʰ�head��� ��ȯ
		System.out.println("��1 :" + (String)myQue.element());		//==>��1 :������ ���
		//��myQue��==> ť��� �ڷᱸ��
		//myQue.element()==> object

		System.out.println("��2 : "+ (String)myQue.element());		//��2 : ������ ���

		// +) String[] arr = {"ȫ","��","��"};		//{"ȫ","��","��"}=> ��Ʈ�� �迭/"ȫ"=> ��Ʈ��


		System.out.println();		//����

		String val;
		//��
		//peek()
		//ť�� head��� ��ȯ. ���� ����!!!!!!!!!!!!!!
		//ť�� empty�� ��� null��ȯ
	/*------------------------------------------------------------------------------------------------------------------------
		while (myQue.peek() != null)							//peek head=> �������� ��ȯ
																//poll()=> ��ȯ(���) �ϰ� ���� ����
																//empty�� �����ϸ� null
		{
			//poll()
			//ť�� head��� ��ȯ ������
			//ť�� empty �ϰ�� null ��ȯ
			val = (String)myQue.poll();
			System.out.println("��� : " + val);

		}

		System.out.println();

			��� : ������
			��� : ������
			��� : �Ǽ���
			��� : �����
		----------------------------------------------------------------------------------------------------------------------------*/
/*
		//�׽�Ʈ
		while (myQue.poll() != null)
		{
			val =(String)myQue.poll();
			System.out.println("��� : " +val);
		}
		System.out.println();
		//��� : �����
		//��� : ��ҿ�
*/


		// ��-------------------------------------------------------------------------------------------------------------
/*
		while (true)

		{
			val = (String)myQue.poll();
			if (val==null)
				break;
			else
				System.out.println("�� : " + val);
			
				//�� : ������
				//�� : �����
				//�� : �Ǽ���
				//�� : ��ҿ�
			

		}

*/
		
	

		// ��

		while (!myQue.isEmpty())
		{
			val = (String)myQue.poll();
			System.out.println("�� : " + val);
		}
		
				//�� : ������
				//�� : �����
				//�� : �Ǽ���
				//�� : ��ҿ�
	}//end main

}//end class


