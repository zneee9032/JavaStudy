/*========================
	����迭����
-�迭 ����� �ʱ�ȭ  
-�迭�� �⺻�� Ȱ��
==========================*/
/*
�۰���
 ����ڷκ��� ������ ������ ������ ������ŭ �Է¹޾Ƽ� �Է¹��� ���� �߿��� ���� ū ���� ����ϴ� ���α׷��� �ۼ��Ѵ�.

 ��, �迭�� Ȱ���Ͽ� ������ �� �ֵ��� �Ѵ�.

���� ��)
�Է��� �������� ���� : 10
������ �Է�(���� ����) : 45 73 4 57 34 6 2 8 5 1
���� ū �� �� 73
����Ϸ��� �ƹ� Ű�� ��������

*/
import java.util.Scanner;

public class Test078

{
	public static void main(String[] args)

	{
		// �ֿ� ���� ����

		Scanner sc = new Scanner(System.in);

		int n, temp=0;	//-- �Է¹��� ����, �ӽ����庯��


		// �Է¹ޱ�

		do

		{

			System.out.print("�Է��� �������� ����  : ");

			n = sc.nextInt();

		}

		while (n<0 || n>10);


		// �迭 ũ�� ����

		int arr[] = new int[n];	//-- �Է¹��� ������ �� ��ŭ ���� �����.


		// ������ �Է¹ޱ�

		System.out.print("������ �Է�(���鱸��) : ");

		for (int i=0; i<n; i++)

		{

			arr[i] = sc.nextInt();

		}
		

		// ���� ū �� arr[0]���� �ű��

		for (int i=n-1; i>0; i--)

		{

			if (arr[i-1]<arr[i])

			{

				temp = arr[i];

				arr[i] = arr[i-1];

				arr[i-1] = temp;

			}

		}

		// ��� ���

		System.out.println("���� ū �� �� " + arr[0]);

	}

}
/*�Է��� �������� ����  : 5
������ �Է�(���鱸��) : 4 5 6 4 3
���� ū �� �� 6
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/