/*============================================================
������� �帧�� ��Ʈ�� (���, ���ǹ��� �ݺ���)����
-�ݺ���(while��) �ǽ�
===========================================================*/
/*
�� ����
����ڷκ��� ���ϴ� ��(������)�� �Է¹޾�
�ش��ϴ� �������� ����ϴ� ���α׷��� ���� �Ѵ�.
��, 1��~9�� ������ ���� �Է¹��� ��Ȳ�� �ƴ϶��
���α׷��� ������ ���� �� �ֵ��� ó���Ѵ�

���࿹)
���ϴ� ��(1��~9��) �Է� : 7
7 * 1 = 7
7 *2 =14
.
.
.
.
7 * 9 =63
//����Ϸ��� �ƹ�Ű�� ��������

���ϴ� ��(1��~9��) �Է� : 11
//1���� 9������ ������ �Է��� �����մϴ�.
//����Ϸ��� �ƹ�Ű�� ��������*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test049
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;    //�Է� ���� ����
		int i=1;    //���� ����
		System.out.print("���ϴ� ��(1��~9��) �Է� : ");
		n = Integer.parseInt(br.readLine());

		if (n>=1 && n<=9) //1 ~ 9������ �Է¹ޱ� ���� ���ǹ�
		{
			System.out.println("[" + n +"��]�� ����մϴ�.");

				while (i<=9) //1~9���� ���� ���� ���ǹ�
			{
					
				i++;	
				System.out.println(+ n +" * " + i + " = " + n*i);
					
			}

		}
		else
			System.out.println("1 ���� 9������ ������ �Է��� �����մϴ�.");
		


	}

}

