/*==============================================
	���� ����(Sort) �˰����� ����
================================================*/
/*
����ڷκ��� ���� �л��� ���� �����͸� �Է¹޾�
������ ���� ������ ���� ������ ����� �ο��Ͽ�
����� ����ϴ� ���α׷��� �����Ѵ�
��, �迭�� ���� �˰������� Ȱ���Ͽ� �ۼ� �� �� �ֵ��� �Ѵ�.

//���� ��)
�ο� �� �Է�: 5
�̸� ���� �Է� (1): ������ 90
�̸� ���� �Է� (2): ������ 80
�̸� ���� �Է� (3): ������ 85
�̸� ���� �Է� (4): ����ȣ 75
�̸� ���� �Է� (5): ����ȭ 95

-----------------------
1��	����ȭ 95
2��	������ 90
3��	������ 85
4�� ������ 80
5��	����ȣ 75
-----------------------
����Ϸ��� �ƹ� Ű�� ��������..
*/
import java.util.Scanner;
import java.io.IOException;

public class Test106
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		int n;		// �л���
		int i=1;	// �л����� 1�� �ʱ�ȭ
		int j;
		
		// �ο� �� �Է¹ޱ�
		System.out.print("�ο� �� �Է� : ");
		n = sc.nextInt();


		// �ο� �� ��ŭ �迭�� �����
		String name[] = new String[n];	//-- �̸�
		int score[] = new int[n];		//-- ����
		int grade[] = new int[n];		//-- ����
		String temp;


		// �̸�, ���� �Է¹ޱ�
		do
		{
			System.out.print("�̸� ���� �Է�(" + i + ") : ");
			name[i-1] = sc.next();
			score[i-1] = sc.nextInt();
		}
		while (i++<n);


		// ���� ����
		for (i=0; i<n-1; i++)					//-- �� ���� ������  (-1 : �������� ���ص� �ż� ��)
		{
			for (j=1+i; j<n; j++)				//-- �� ���� ������  (������ ���ƾ��ؼ� -1 ����)
			{
				if (score[i] < score[j])		//���� ����
				{
					score[i] = score[i]^score[j];
					score[j] = score[j]^score[i];
					score[i] = score[i]^score[j];
				
					temp = name[i];
					name[i] = name[j];
					name[j] = temp;
					// temp ���� �ذ� ~!!!!!
				}
			}

		}


		// ���� Ȯ���ϱ�
		for (i=0; i<n; i++)
		{
			grade[i] = 1;					//-- �л��� 1���̶�� ����
			for (j=0; j<n; j++)		
			{
				if (score[i] < score[j])	// j�� i���� ������	
					grade[i] += 1;			// i�� ����� ��������
			}
		}

		// ��� ����ϱ�
		System.out.println("\n--------------");
		for (i=0; i<n; i++)
		{
			System.out.printf("%d�� %s %d\n", grade[i], name[i], score[i]);
		}
		System.out.println("--------------");		
	}
}

/*
�ο� �� �Է� : 3
�̸� ���� �Է�(1) : ������ 75
�̸� ���� �Է�(2) : ������ 87
�̸� ���� �Է�(3) : ������ 77

--------------
1�� ������ 87
2�� ������ 77
3�� ������ 75
--------------
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/