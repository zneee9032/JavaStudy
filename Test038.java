/*============================================================
������� �帧�� ��Ʈ�� (���, ���ǹ��� �ݺ���)����
-switch �� �ǽ�
===========================================================*/
/*
����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
�ش� �������� ���� ó�� ����� ����ϴ� ���α׷��� �����Ѵ�
��, switch ���ǹ��� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�,
���� ����� ���ǻ� ���������� ó�� �� �� �ֵ��� �Ѵ�

���࿹)
ù ��° ���� �Է�		:20
�� ��° ���� �Է�		:14
������ �Է� [+ = * /]	: +

>> 20 + 14 = 34
>> ����Ϸ��� �ƹ� Ű�� ��������
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test038
{
	public static void main(String[] args) throws IOException
	{
		
		// ���ֿ� ���� ����		==========================================================> char op;
			
		/*BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int a, b, result=0;
		char op;

		//�Է� �� ó��
		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("������ �Է�[+ - * /] : ");
		op = (char)System.in.read();	

		switch (op)
		{
		case '+': result = a + b; break;
		case '-': result = a - b; break;
		case '*': result = a * b; break;
		case '/': result = a / b; break;
		default : return;
		}
		System.out.printf("\n>> %d %c %d = %d\n",a,op,b,result);
*/



		//���ֿ� ���� ����		==========================================================> String op;
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int a, b, result=0;
		String op;				//check~!!!!!!!!!!!!!

		//�Է� �� ó��
		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("������ �Է�[+ - * /] : ");
		op = br.readLine();		//check~!!!!!!!!!!!!!

		switch (op)				//check~!!!!!!!!!!!!!
		{
		case "+": result = a + b; break;
		case "-": result = a - b; break;
		case "*": result = a * b; break;
		case "/": result = a / b; break;
		default : return;
		}
		System.out.printf("\n>> %d %s %d = %d\n", a,op,b,result);

	}
}
/*��
ù ��° ���� �Է� : 3
�� ��° ���� �Է� : 4
������ �Է�[+ - * /] : *

>> 3 * 4 = 12
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


��
ù ��° ���� �Է� : 4
�� ��° ���� �Է� : 4
������ �Է�[+ - * /] : *

>> 4 * 4 = 16
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


*/