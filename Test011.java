/*===================
�ڹ� �⺻ ���α׷���
-������ �ڷ���
-�ڹ��� �⺻ ����� : BuffereadReader Ŭ����
=====================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test011 
{
	public static void main(String[] args) throws IOException	// �����ݷж����� ����
	{
		//BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		//�ֿ� ��������
		int r;							//������
		final double PI = 3.141592;		//������
		double a, b;					//����,�ѷ�

		//���� �� ó��
		//�� ����ڿ��� �ȳ� �޼��� ���
		System.out.print("���� ������ �Է� : ");
		// �׸���, ����ڷκ��� �����͸� �Է¹��� ����
		// println() ����... print() �޼ҵ� ���~!!!


		//�� ����ڰ� �Է��� ���� �޾ƿ� ������ ���� r�� ��Ƴ���
		//r= br.readLine();
		//r= "20";

		//Integer.parseInt() ��Ű� ������ �Ѱ� ���� ���ڿ� �����͸� ���������� ��ȯ
		r = Integer.parseInt(br.readLine());
		// r =Integer.parseInt("20");
		// r =20;
		//-- ����ڰ� �Է��� ���� BufferedReader(br) �� readLine()
		//�޼ҵ带 Ȱ���Ͽ� ���ڿ� ���·� �о���� ��
		//�� ���� Integer.parseInt()�� ���� ������ (������)���� ��ȯ�� ��
		//���� ������ ������ ���� r�� ��Ƴ���

		//���� �� �ѷ� ����
		a = r * r * PI;
		b = r * 2 * PI;

		//��� ���
		//System.out.println(">>���� :" + a);
		//System.out.println(">>�ѷ� :" + b);

		// printf() ����Ѱ� ��𰬴�? �Ф�
		System.out.printf(">> ���� : %.2f\n", a);
		System.out.printf(">> �ѷ� : %.2f\n", b);

	}
}

// ���� ���
/*
���� ������ �Է� : 25
>> ���� : 1963.50
>> �ѷ� : 157.08
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/