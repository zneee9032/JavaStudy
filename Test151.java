/*==================================================================
  ���� �÷��� ������ ��ũ (Collection Framework) ����
�ڡڡڡڡڡڡڡڡڡڡ�!!�߿���!!�ڡڡڡڡڡڡڡڡڡڡڡڡڡ�2021-08-11

-���� _ ���Լ���
=====================================================================*/

import java.util.Stack;

public class Test151
{
	// ���� ���ڿ� �迭 ���� �� �ʱ�ȭ
	private static final String[] colors = {"����","���","�ʷ�","�Ķ�","�Ķ�","����"};
	public Test151()
	{
		// st ��� Stack �ڷᱸ�� ����
		// ���׸��� Ȱ���Ͽ� �ڷᱸ���� ���� ������ ǥ�� �� ��<String>��
		Stack<String> st = new Stack<String>();	//String�� ��ڴٰ� �߱� ������ �ٸ� Ÿ���� �ȵ����°��� ��ǻ� ������ �־���.

		// st ��� Stack �ڷᱸ���� ������ ���
		// colors ��� ���ڿ� �迭 ��Ҹ� ��� ��Ƴ���
		for(String color : colors)
			st.push(color);

		// ������ �߰�---------------------------------------------------------------------> �߰�!
		st.push("�ϴ�");
		// ������ �߰�
		//st.push(10.0);
		//--==>> �����߻� (�����Ͽ���)
		//       ���׸� ǥ������ ���� �����ϰ� �ִ�
		//       String �� �ƴ� �ٸ� �ڷ���(double)�� ���ÿ� push()�Ϸ��� �߱� ����...

		// ��� �޼ҵ� ȣ��
		popStack(st);
	}


	// ��� �޼ҵ�
	private void popStack(Stack<String> st)
	{
		System.out.print("pop : ");
		while (!st.empty())
			System.out.print(st.pop() + " ");
		System.out.println();
	}

	public static void main(String[] args)
	{
		Test151 ob = new Test151();
	}
}


/*
pop : ���� �Ķ� �Ķ� �ʷ� ��� ����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

<������ �߰�>
pop : �ϴ� ���� �Ķ� �Ķ� �ʷ� ��� ����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/