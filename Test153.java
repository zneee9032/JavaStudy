/*==================================================================
  ���� �÷��� ������ ��ũ (Collection Framework) ����
�ڡڡڡڡڡڡڡڡڡڡ�!!�߿���!!�ڡڡڡڡڡڡڡڡڡڡڡڡڡ�2021-08-12

- ť(Queue)
=====================================================================*/
import java.util.LinkedList;
import java.util.Queue;

public class Test153
{
	// ���� ���ڿ� �迭 ���� �� �ʱ�ȭ
	private static final String[] colors= {"����","���","�ʷ�","�Ķ�","�Ķ�","����"};

	public static void main(String[] args)
	{
		// Queue �ڷᱸ�� ����
		Queue<String> qu = new LinkedList<String>();
		//-- Queue �������̽� ����� �ν��Ͻ��� �����ϱ� ���ؼ���
		//   new �����ڸ� �̿��Ͽ� Queue �������̽��� implements ��
		//   ���� Ŭ������ �����ڸ� ȣ���ؾ� �Ѵ�

		
		//qu��� Queue�ڷᱸ���� colors�迭�� ������ �Է�-> offer()

		for (String color: colors)			//������ for����
				qu.offer(color);
			
		//qu��� Queue�ڷᱸ���� ��絥���� ��ü ���
		while (qu.peek() != null)
				System.out.print(qu.poll() + " ");
			System.out.println();
		//peek()
		//	: ť�� head��Ҹ� ��ȯ�ϰ� �������� ������ ť �ڷᱸ���� ��� �ִ� ���°� �Ǹ� null ��ȯ
	
		//poll()
		//	:ť�� head��Ҹ� ��ȯ�ϰ� ���� �ϸ� ť �ڷᱸ���� ��� �ִ� ���°� �Ǹ� null���� ��ȯ 

//===>>>>>>���� ��� �ʷ� �Ķ� �Ķ� ����

	}
}


