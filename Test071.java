/*============================================================
����Ŭ������ �ν��Ͻ�	����
===========================================================*/
public class Test071

{

	int x;

	// �� �������� �̸��� �׻� ���ܾ��� Ŭ������ �̸��� �����ؾ� �ϸ�

	//    �ʿ��� ��� �μ��� �޾Ƶ��̴� �͵� �����ϰ�,

	//    ���� �̸��� �޼ҵ带 �����ϴ� �ߺ����ǰ� ����������

	//    ���ϰ�(��ȯ��)�� ���� �� ����.

	// �� �����ڴ� �ٸ� �Ϲ� �޼ҵ�ó�� ȣ��� �� ����

	//    ��new�������ڸ� �̿��Ͽ� ��ü�� �����ϱ� ���� ȣ��Ǹ�,

	//    �� Ŭ������ �ν��Ͻ��� ��ü�� ������ �Ŀ�

	//    ������ ��ü�� ����� �ʱ�ȭ��Ű�� �۾��� �����Ѵ�.


	Test071()

	{

		// �� ������ ���ο��� �ٸ� �����ڸ� ȣ���ϴ� ���� �����ϴ�.

		//    ��, ������ ���ο��� ���� ���� ����Ǿ�� �Ѵ�.

		this(200);

		x = 10;

		System.out.println("���ڰ� ���� ������");

		System.out.println("Test071 �� x : " + this.x);

	}



	Test071(int x)

	{

		this.x = x;

		System.out.println("���ڰ� �ϳ��� ������");

	}

	Test071(double x)

	{

		System.out.println("���ڰ� �ϳ��� ������d");

	}

	public static void main(String[] args)

	{

		// Test071 Ŭ���� ����� �ν��Ͻ� ����

		Test071 ob1 = new Test071();

		Test071 ob2 = new Test071(100);

		Test071 ob3 = new Test071(10.0);

		// �� �����ڴ� ��new�������ڸ� �̿��Ͽ�

		//    ��ü�� �����ϱ� ���� ȣ��Ǹ�,

		//    Ŭ���� ��ü�� ���� �ν��Ͻ��� �����Ǹ�

		//    �� ��ü�� ��μ� �޸𸮸� �Ҵ�ް� �ȴ�.


		System.out.println("main ���� ob1.x : " + ob1.x);

		System.out.println("main ���� ob2.x : " + ob2.x);

		//--==>> main ���� ob1.x : 10

		//       main ���� ob2.x : 100

	}

}
/*���ڰ� �ϳ��� ������
���ڰ� ���� ������
Test071 �� x : 10
���ڰ� �ϳ��� ������
���ڰ� �ϳ��� ������d
main ���� ob1.x : 10
main ���� ob2.x : 100
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .*/