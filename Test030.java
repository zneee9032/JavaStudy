/*============================================================
������� �帧�� ��Ʈ�� (���, ���ǹ��� �ݺ���)����
-if ~ else �� �ǽ�
===========================================================*/

/*
����ڷκ��� ������ ������ �Է¹޾�
�Է� ���� ������... ¦������, Ȧ�� ����, ������
����� �Ǻ��Ͽ� ����ϴ� ���α׷��� �����Ѵ�

���� ��)
������ ���� �Է� :14
14 ��¦��
����Ϸ��� �ƹ� Ű��...

������ ���� �Է� :3
3 ��Ȧ��
����Ϸ��� �ƹ� Ű��...
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test030
{
	public static void main(String[] args) throws IOException
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//��������
		int num;
		String res;
		
		//�Է� �� ó��
		System.out.print("������ ���� �Է� : ");
		num = Integer.parseInt(br.readLine());

		if (num == 0)
		res = "��";

		else if (num % 2 == 1)
		res = "Ȧ��";

		else 
		res = "¦��";

		//��� ó��
		System.out.printf("%d �� %s \n", num, res);

	}

}

/*
������ ���� �Է� : 3
3 �� Ȧ��
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

