/*============================================================
������� �帧�� ��Ʈ�� (���, ���ǹ��� �ݺ���)����
-�ݺ���(while��) �ǽ�
===========================================================*/

/*
����ڷκ��� ������ �� ������ �Է¹޾�
���� �� ���� ū�� ������ ���� ���Ͽ�
����� ����ϴ� ���α׷��� �����Ѵ�

���� ��)
ù��° �����Է� : 10
�ι�° ���� �Է� : 20
>> 10 ~ 20 ������ �� : XXX
����Ϸ��� �ƹ� Ű�� ��������

//ù��° ���� �Է� : 10
�ι� ° ���� �Է� : 2
>> 2~10 ������ �� :XXX
//����Ϸ��� �ƹ�Ű�� ��������
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test047
{
	public static void main(String[] args) throws IOException
	{
		int n1,n2; //����ڷκ��� �Է¹��� �������� ���� ����
		int sum = 0;  //�� ������ ���� ���� ����
		int i;  //������ų ����

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("ù ��° ���� �Է� : ");
		n1 = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		n2 = Integer.parseInt(br.readLine());

		if(n1>n2) 
		{
			n1=n1^n2;
			n2=n2^n1;
			n1=n1^n2;
		}

		i = n1; 
		while (i<=n2)
		{
			sum += i;
			i++;	
		}
			

		System.out.printf("%d ~ %d ������ �� : %d\n",n1,n2,sum);



	}
}
/*
ù ��° ���� �Է� : 4
�� ��° ���� �Է� : 1
>> 1 ~ 4 ������ �� : 10
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .*/
