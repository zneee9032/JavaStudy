/*============================================================
������� �帧�� ��Ʈ�� (���, ���ǹ��� �ݺ���)����
-if ~ else �� �ǽ�
===========================================================*/
/*
����ڷ� ���� �̸�, ��������, ��������, ���������� �Է¹޾�
������ ���� ���·� ����ϴ� ���α׷��� �ۼ��Ѵ�
����� ��� ������ �������� �����Ͽ� ó���Ѵ�

90�� ~100�� : A
80�� ~ 89�� : B
70�� ~ 79�� : C
60�� ~ 69�� : D
60�� �̸� :F

��, BufferedReader�� Ȱ���Ͽ� �����͸� �Է� ���� �� �ֵ��� �ϸ�
printf()�޼ҵ带 ���� ����� �� �ֵ��� �����Ѵ�.

���� ��)
�̸� �Է� : ������
���� ���� : 90
���� ���� : 80
���� ���� : 70

>>����� �̸��� ������ �Դϴ�.
>>���� ������ 90,
>>���� ������ 80,
>>���� ������ 70,
>>������ 240�̰�, ����� 80�Դϴ�.
>>����� B�Դϴ�.
��� �Ϸ��� �ƹ�Ű�� ��������*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test029
{
	public static void main(String[] args) throws IOException
	{
		
		// �ֿ� ���� ����
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		String name;
		int Kor, Eng, Mat, Tot; 
		double Avr;
		char Grade;

		// ���� �� ó��
		System.out.print("�̸� �Է� : ");		//�̸� �Է�
		name = br.readLine();
	
		System.out.print("���� ���� : ");		//���� ���� �Է�
		Kor = Integer.parseInt(br.readLine());

		System.out.print("���� ���� : ");		//���� ���� �Է�
		Eng = Integer.parseInt(br.readLine());

		System.out.print("���� ���� : ");		//���� ���� �Է�
		Mat = Integer.parseInt(br.readLine());
	
		Tot = (Kor + Eng + Mat) ;				// ���� ���ϱ�
		Avr = Tot /3.0 ;						// ��� ���ϱ�

		//��� ����

		if (Avr >= 90)
		{	Grade = 'A';
		}	
			else if ( Avr >=80 ) 
		{	Grade = 'B';
		}
			else if ( Avr >=70 )
		{	Grade = 'C';
		}
			else if ( Avr >=60 )
		{	Grade = 'D';
		}
			 else
        {	Grade = 'F';	
		}									/*���� else �� ��ġ�°� �翬 ���� �ʴ�. 
										���� ��Ȳ�� BufferedReader�� �ִ� �ָŸ�ȣ ���� �޾� ���
										 ��¸� �ϴ� if else�����̶�� ���� else if ����	*/
		
		
		// ��� ���
		System.out.printf("\n����� �̸��� %s �Դϴ�.\n" , name);
		System.out.printf("���� ������ %d\n" , Kor);
		System.out.printf("���� ������ %d\n" , Eng);
		System.out.printf("���� ������ %d\n" , Mat);
		System.out.printf("������ %d�̰�, ����� %.0f�Դϴ�.\n" , Tot, Avr);
		System.out.printf("����� %c �Դϴ�.\n" , Grade); 


		}
}