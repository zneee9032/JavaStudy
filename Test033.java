/*============================================================
������� �帧�� ��Ʈ�� (���, ���ǹ��� �ݺ���)����
-if ~ else �� �ǽ�
===========================================================*/
/*
����ڷκ��� ������ ���� ������ �Է� �޾�
���� ������ ū �� ������ ����ϴ� ���α׷��� �����Ѵ�.
���� ��)
ù ��° ���� �Է� : 5
�ι�° ���� �Է� : 15
����° ���� �Է� : 10

>> ���� ��� :5 10 15
����Ϸ��� �ƹ� Ű�� ��������...
*/

import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.io.IOException;


public class Test033

{

	public static void main(String[] args) throws IOException

	{
		//�ֿ� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n1, n2, n3;	//-- ����ڰ� �Է��ϴ� ������ ���� �� �� �� ���� ����
		int temp;		//-- �ӽ� ���� ����

		// ���� �� ó��
		System.out.print("ù ��° ���� �Է� : ");		//����ȯ
		n1 = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");		//����ȯ
		n2 = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");		//����ȯ
		n3 = Integer.parseInt(br.readLine());

		//��
		//���� ù ��° ���� (a)�� �ι�° ���� (b)���� ũ�ٸ� 
		//					a�� b �������� �ڸ��� �ٲ۴�

		//���� ù ���� ���� (a)�� ����° ���� (c)���� ũ�ٸ�
		//					a �� c �������� �ڸ��� �ٲ۴�

		//���� �ι�° ���� (b)�� ����° ���� (c)���� ũ�ٸ�
		//					b��c �������� �ڸ��� �ٲ۴�


		if (n1>n2)    //   ��ù ��° ������ �� ��° �������� Ŭ��

		{
												//�ι�° ���
			temp = n1;							//n1=n1^n2;
			n1 = n2;							//n2=n2^n1;
			n2 = temp;							//n1=n1^n2;
			//�׽�Ʈ
			System.out.println("�ڸ��ٲ� �߻�");			//����� �ڸ��ٲ޹߻��ϴ��� ���
		}

		if (n1>n3)    //   �� ù ��° ������ �� ��° �������� Ŭ��

		{

			temp = n1;							//n1=n1^n3;				
			n1 = n3;							//n3=n3^n1;
			n3 = temp;							//n1=n1^n3;
			//�׽�Ʈ
			System.out.println("�ڸ��ٲ� �߻�");

		}

		if (n2>n3)    //  �� �� ��° ������ �� ��° �������� Ŭ��

		{
			
			temp = n2;							//n2=n2^n3;
			 n2 = n3;							//n3=n3^n2;
			 n3 = temp;							//n2=n2^n3;
			//�׽�Ʈ
			System.out.println("�ڸ��ٲ� �߻�");

		}


		// ��� ���

		System.out.printf("���İ�� \n>> %d %d %d\n", n1, n2, n3);

	}

}


