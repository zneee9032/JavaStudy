/*============================================================
������� �帧�� ��Ʈ�� (���, ���ǹ��� �ݺ���)����
-return��

===========================================================*/
/*
��return�� Ű���尡 ���ϴ� �ΰ��� �ǹ�
		1. ���� ��ȯ 
		2.�޼ҵ� ����
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test062
{
	public static void main(String[] args) throws IOException
	{
		//BufferedReader�ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;		//����ڷκ��� �Է¹��� ��
		int s;		//������ ����


		System.out.print("������ ���� �Է�(10 �̻�) : ");
		n = Integer.parseInt(br.readLine());

		if (n<10)

		{

			System.out.println("10 �̻��� ������ �Է��ؾ� �մϴ�.");
			
			return; //-- �� ���� ��ȯ
			        //-- �� main �޼ҵ� ����
		}
		s=0;
		for (int i=1; i<=n; i++)
			s+=i;
		System.out.println("��� : " +s);

	}

}

/*
������ ���� �Է�(10 �̻�) : 45
��� : 1035
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/