/*=============================================================
	���� ���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���) ����
	- switch�� �ǽ�
===============================================================*/

/* 1���� 3������ ���� �� �ϳ��� ����ڷκ��� �Է¹޾�
�Է¹��� ������ŭ�� �����ڰ� ��µǴ� ���α׷��� �ۼ��Ѵ�.
��, �ΰ��� ������� ������ �� �ֵ��� �Ѵ�.

�� switch ���� �Ϲ� ���� ����Ͽ� �ذ��Ѵ�.
�� switch ���� �⺻ ���� ����ϵ�,
	��break;���� �� �� ���� ����� �� �ֵ��� ����

//���� ��)
������ ���� �Է�(1~3) : 3
�ڡڡ�

������ ���� �Է�(1~3) : 7
�Է¿���


														*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io. IOException;

public class Test037
{
	public static void main(String[] args) throws IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	System.out.print("������ ���� �Է�(1~3) : ");
	int n = Integer.parseInt(br.readLine());

//�Ϲݸ�
/*
	switch(n)
		{
		case 1 : System.out.println("��"); break;
		case 2 : System.out.println("�ڡ�"); break;
		case 3 : System.out.println("�ڡڡ�"); break;
		default : System.out.println("�Է¿���");
		}
*/

//�⺻��
		switch(n)
		{
		case 3 : System.out.print("��"); 
		case 2 : System.out.print("��"); 
		case 1 : System.out.println("��"); break;
		default : System.out.println("�Է¿���");
		}

	}

}

//�������
/*
������ ���� �Է�(1~3) : 1
��
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է�(1~3) : 5
�Է¿���
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
 