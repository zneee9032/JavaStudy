/*============================================================
������� �帧�� ��Ʈ�� (���, ���ǹ��� �ݺ���)����
-if ~ else �� �ǽ�
===========================================================*/

/*
����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
�ش� �������� ���� ó�� ����� ����ϴ� ���α׷��� �����Ѵ�
��,if ���ǹ��� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�,
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

public class Test032
{
	public static void main(String[] args) throws IOException
	{
		
		/* ��� ��
		//�ֿ� ��������
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b;				// ù ��°, �ι�° ����
		char op;				// ������
		
		
		//���� �� ó��	
		System.out.print("ù ��° ���� �Է�	: ");
		a = Integer.parseInt(br.readLine());

		
		System.out.print("�� ��° ���� �Է�	: ");
		b = Integer.parseInt(br.readLine());

		// Integer.pareInt()
		// "1234" ��Integer.pareInt()�� 1234
		// "abcd"��Integer.pareInt()�� (x)

		System.out.print("������ �Է�[+ - * /]  : ");

		//op = System.in.read();				�������� �϶�,System.in.read();
		op = (char) System.in.read();	  //---------> �ƽ�Ű�ڵ� ��� �Ҷ��� System.in.read();

		//Ȯ��(�׽�Ʈ)
			//System.out.println("op : " + op);


		if(op=='+')				//�ƽ�Ű �ڵ� 43==43
		{
			System.out.printf("\n>> %d + %d = %d\n",a,b, (a+b)); 
		} 
		else if (op=='-')		//45==45
		{
			 System.out.printf("\n>> %d - %d = %d\n",a,b,(a-b)); 
		} else if (op =='*')		//42==42
		{
			System.out.printf("\n>> %d * %d = %d\n",a,b,(a*b)); 	
		}else if (op=='/')		//47==47
		{
		   System.out.printf("\n>> %d / %d = %d\n",a,b,(a/b)); 		
		} else					
		{ 
			System.out.println("\n>> �Է� �������� ����");
		}																		*/

		/*
		//�����

		//�ֿ� ��������
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

		int a, b,op;				// ù ��°, �ι�° ����, ������
		
		
		//���� �� ó��	
		System.out.print("ù ��° ���� �Է�	: ");
		a = Integer.parseInt(br.readLine());

		
		System.out.print("�� ��° ���� �Է�	: ");
		b = Integer.parseInt(br.readLine());

		// Integer.pareInt()
		// "1234" ��Integer.pareInt()�� 1234
		// "abcd"��Integer.pareInt()�� (x)

		System.out.print("������ �Է�[+ - * /]  : ");

		//op = System.in.read();		�������� �϶�,System.in.read();
		op = Integer.parseInt(br.readLine());

		//Ȯ��(�׽�Ʈ)
		//System.out.println("op : " +op);


		if(op==43)				//�ƽ�Ű �ڵ� 43==43
		
			System.out.printf("\n>> %d + %d = %d\n",a,b, (a+b)); // -->������ ���� ��ȣ ���� ����
		 
		else if (op==45)		//45==45
		
			 System.out.printf("\n>> %d - %d = %d\n",a,b,(a-b)); 
		else if (op ==42)		//42==42
		
			System.out.printf("\n>> %d * %d = %d\n",a,b,(a*b)); 	
		else if (op==47)		//47==47
		
		   System.out.printf("\n>> %d / %d = %d\n",a,b,(a/b)); 		
		 else				//�̰͵� ���͵� �ƴ϶�� else
		 
			System.out.println("\n>> �Է� �������� ����");          */



		//�����
		//�ֿ� ��������
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

		int a, b, result=0;	//---------------->else : result ����
		char op;				
		
		
		//���� �� ó��	
		System.out.print("ù ��° ���� �Է�	: ");
		a = Integer.parseInt(br.readLine());

		
		System.out.print("�� ��° ���� �Է�	: ");
		b = Integer.parseInt(br.readLine());

		// Integer.pareInt()
		// "1234" ��Integer.pareInt()�� 1234
		// "abcd"��Integer.pareInt()�� (x)

		System.out.print("������ �Է�[+ - * /]  : ");

		//op = System.in.read();		�������� �϶�,System.in.read();
		op = (char)System.in.read();

		//Ȯ��(�׽�Ʈ)
		//System.out.println("op : " +op);


		if(op=='+')				//�ƽ�Ű �ڵ� 43==43
		
			result = a + b;
		 
		else if (op=='-')		//45==45
		
			result = a - b;
		else if (op =='*')		//42==42
		
			result = a * b;	
		else if (op=='/')		//47==47
		
		   result = a / b;	

	System.out.printf("\n >> %d %c %d = %d\n",a , op, b, result);	
		    

	}
}
/* 
ù ��° ���� �Է�       : 3
�� ��° ���� �Է�       : 2
������ �Է�[+ - * /]  : +

 >> 3 + 2 = 5
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

ù ��° ���� �Է�       : 3
�� ��° ���� �Է�       : 2
������ �Է�[+ - * /]  : ^

 >> 3 ^ 2 = 0
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

��result=0;	//---------------->else : result ������
*/