/*============================================================
����Ŭ������ �ν��Ͻ�	����
-������(Constructor)�� �ʱ�ȭ ��(Initialized Bolock)
===========================================================*/
public class Test073

{

	int n;

	int m;




	// ������(Constructor)

	Test073()

	{

		n = 100;

		m = 200;

		System.out.println("������ ����...");

	}




	// �ʱ�ȭ��(Initialized Block)

	{

		n = 10;

		m = 20;

		System.out.println("�ʱ�ȭ �� ����...");

	}




	// ������(Constructor)

	Test073(int n, int m)

	{

		this.n = n;

		this.m = m;

	}




	// ��� �޼ҵ� ����

	void write()

	{

		System.out.println("n : " + n + ", m : " + m);

	}




	public static void main(String[] args)

	{

		Test073 ob1 = new Test073();

		ob1.write();

		//--==>> n : 100, m : 200




		Test073 ob2 = new Test073(1234, 4567);

		ob2.write();

		//--==>> n : 1234, m : 4567

	}

}

/*
�ʱ�ȭ �� ����...
������ ����...
n : 100, m : 200
�ʱ�ȭ �� ����...
n : 1234, m : 4567
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

=> Ŭ���� �ȿ��� ������ �Ұ���
=> */