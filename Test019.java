/*=============================
�ڹ� ���α׷���
-��� ������
-BufferedReader
-printf()
==============================*/

// ����ڷκ��� ������ ������ �ι� �Է¹޾�
//��Ģ���� �� ������ ������ �����Ͽ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.
//��, �Է¹��� ������BufferdReader�� Ȱ���� �� �ֵ����ϰ�,
//����ϴ� ������ printf() �޼ҵ带 Ȱ�� �� �� �ֵ��� �Ѵ�.
// ����, ������ ������ ���ǻ� ���� ������� ó���Ѵ�

// ���� ��)
//ù ��° ���� �Է� : 10
//�ι�° ���� �Է� : 2

//====[���]====
//10 + 2 =12
//10 - 2 = 8
//10 *2 = 20
//10 /2 =5
//10 % 2 =0
//==============
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test019
{
	public static void main(String[] args) throws IOException
		{

			
			//���ֿ� ���� ����
			// BufferedReader �ν��Ͻ� ����
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int num1, num2;						// ����� �Է� ���� ���� ����
			int res1, res2,res3,res4,res5;		 // �� ���꿡 ���Ѱ���� ���� ����

			//�ٿ��� �� ó��
			//- ����ڿ��� �ȳ� �޼��� ��� �� �Է°�������
			System.out.print("ù��° ���� �Է� :");	
			num1 = Integer.parseInt(br.readLine());

			System.out.print("�ι�° ���� �Է� :");	
			num2 = Integer.parseInt(br.readLine());

			res1 = num1 + num2;
			res2 = num1 - num2;
			res3 = num1 * num2;
			res4 = num1 / num2;
			res5 = num1 % num2;
			//�ٰ�� ���
			System.out.printf("\n=====[���]=====\n");

			System.out.printf("%d + %d = %d\n",num1,num2,res1);	
			System.out.printf("%d - %d = %d\n",num1,num2,res2);
			System.out.printf("%d * %d = %d\n",num1,num2,res3);
			System.out.printf("%d / %d = %d\n",num1,num2,res4);
			System.out.printf("%d %% %d = %d\n",num1,num2,res5);
		
			System.out.printf("\n================\n");
			
		}
}

/*
ù��° ���� �Է� :20
�ι�° ���� �Է� :4

=====[���]=====
20 + 4 = 24
20 - 4 = 16
20 * 4 = 80
20 / 4 = 5
20 % 4 = 0

================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .*/