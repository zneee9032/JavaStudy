/*============================================================
����Ŭ������ �ν��Ͻ�	����
===========================================================*/
/* ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾� 
��Ģ������ �����ϴ� ���α׷��� �����Ѵ�.
��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

���� ��)
������ �� ���� �Է� (���� ����) : 10 5
������ ������ �Է�(+ - * /)     : +
>> 10 +5 = 15
����Ϸ��� �ƹ�Ű�� ��������

*/


import java.util.Scanner;
import java.io.IOException;

class Calculate
{	
	//�ֿ亯�� ����
	int a, b;	//����ڷκ��� �Է¹��� �� ������ ��Ƶ� ����
	char c;
	// �޼ҵ� ����(��� : �Է�
	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �� ���� �Է�(���� ����)    : ");
		a = sc.nextInt();
		b = sc.nextInt();

		System.out.print("������ ������ �Է�(+ - * /)	  : ");
		c = (char)System.in.read();
	}
	// �޼ҵ� ����(��� : ����)
	double cal()
	{
		double result = 0;

		if (c == '+')
			result = a+b;

		else if (c == '-')
			result = a-b;

		else if (c == '*')
			result = a*b;

		else if (c == '/')
			result = a/b;

		return result;
	}

	// �޼ҵ� ����(��� : ���)
	void print(double s)
	{
		System.out.printf(">> %d %c %d = %.2f\n", a, c, b, s);
	}	

}

public class Test068
{
	public static void main(String[] args) throws IOException
	{
		Calculate ob = new Calculate();	// Calculate Ŭ���� ����� �ν��Ͻ� ����	
		ob.input();					// ������ �ν��Ͻ��� ���� �Է� �޼ҵ� ȣ��

		double s = ob.cal();		   // ������ �ν��Ͻ��� ���� ���� �޼ҵ� ȣ��

		ob.print(s);					// ������ �ν��Ͻ��� ���� ��� �޼ҵ� ȣ��
		

	}
}