/*=============================
  ���� Ŭ���� �ν��Ͻ� ����
  - Ŭ���� ����
  - �迭 Ȱ��
  - ���� ���а� ��������������
===============================*/

// ����ڷκ��� ��, ��, ���� �Է¹޾�
// �ش� ��¥�� ������ ����ϴ� ���α׷��� �����Ѵ�.
// ��, �޷� Ŭ����(Calender)�� ������� �ʴ´�.
// ����, Ŭ������ ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.(�� WeekDay Ŭ���� ����)
// �׸���, �迭�� ���䵵 ������� �ۼ��� �� �ֵ��� �Ѵ�.
// �������� �������� ���䵵 Ȯ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.
// ����������...
// WeekDay Ŭ������ ���踦 ����
// Test095 Ŭ���� main() �޼ҵ尡 ���������� ���α׷� ����� �� �ֵ��� �Ѵ�.

// ���� ��)
// �� �� �� �Է�(���� ����) : 1996 8 16

// 1996�� 8�� 16�� �� x����
// ����Ϸ��� �ƹ� Ű�� ��������...

// �� 1�� 1�� 1�� �� ������
// �� 1�� 365���� �ƴ� ���� �ִ�.

import java.util.Scanner;

class WeekDay
{
	// �ֿ� ���� ����
	private int y,m,d;		// ����ڰ� �Է��� ��, ��,���� ���� ����

	// �޼ҵ� ���� �� �Է¹ޱ�(input)
	public void input()
	{	
		Scanner sc = new Scanner(System.in);
	
		System.out.print("�� �� �� �Է�(���� ����) : ");	// 2021 7 30
		y = sc.nextInt();		//�⵵
		m = sc.nextInt();		//��
		d = sc.nextInt();		//��¥
	}
		
		// �޼ҵ� ���� �� ���� �����ϱ�(week)
		//public void week
		public String week()		//�ؿ� String result = ob.week(); �̰Ŷ����� String �տ��ٿ��ߵ�
		{
			// �� ���� ������ ��¥(�� ���� �ִ밪)�� �迭 ���·� ����
			int[] months = {31, 0, 31, 30, 31, 31, 30, 31, 30, 31, 30, 31};

			//�׽�Ʈ
			//System.out.println(months.length);
			//--==>> 12

			//���� �̸��� ���� �迭 ����
			String[] weekNames = {"��", "��", "ȭ", "��", "��", "��", "��"};

			// �� ���� ������ ����
			int nalsu;	//����
			
			//���⿡ ���� 2���� �� �� ���
			//�Է� �⵵�� �����̶��...2���� ������ ��¥�� 29�Ϸ�  ����
			//�Է� �⵵�� ����̶��...2���� ������ ��¥�� 28�Ϸ� ����
			//���� ���ϴ� ��(year%4==0 && year%100!=0 || year%400==0)
			if (y%4==0 && y%100!=0 || y%400==0)	//�����̶��
			{
				//2���� ������ ���ڸ� 29�Ϸ� ���� �� ����
				months[1]=29;
			}
			else											//�����̾ƴ϶��....(����̶��...)
			{
				//2���� ������ ��¥�� 28�Ϸ� ���� �� ���
				months[1]=28;
			}
			//�� 1�� 1�� 1�� ���� �Է¹��� �⵵�� ���� �⵵ 12�� 31�� ������ �� �� ���
			//					  -------------------------
			//								y-1
			//
			// 2021.7.30 �� 1.1.1 ~ 2020.12.31
			nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;

			//�׽�Ʈ
			//Sytem.out.println("�� �� : " + nalsu);
			//--==>> �� �� �� �Է�(���� ����) : 2021 7 30
			//		 �� �� : 737790(1.1.1 ~ 2020.12.31 �� �� �� ��)

			//1996.1.1~1996.7.31
			for (int i=0; i<(m-1); i++)			//---------------------i<(m-1) �߿�~!!!!check~!
				nalsu += months[i];
			//�׽�Ʈ
			//System.out.println("���� :" + nalsu);
			//--==>> �� �� �� �Է� (���� ����) : 2021 7 30
			//		 �� �� : 737971 (1.1.1 ~ 2021.6.30 ��  �� �� ��)

			// �� �Է¹��� ���ǳ�¥��ŭ �� �� ��� ��
			//	  2�� ����� ���ϴ� ����
			//1996.8.1~1996.8.16 �׳� ����
			nalsu += d;

			//�׽�Ʈ
			System.out.println("�� �� : " + nalsu);
			//--==>> �� �� �� �Է�(���� ����) : 2021 7 30
			//		 �� �� : 738001 (1.1.1 ~ 2021.7.30 �� �� �� ��)

			//--------------------------������� �����ϸ� �� �� ���� ��~!!!

			// ���� �������� Ȯ���ϱ� ���� ����			
			
			int w = nalsu % 7;		//��ü ���� % 7 == 0 �� �Ͽ���
									//��ü ���� % 7 == 1 �� ������
									//				:

			//�׽�Ʈ
			//System.out.println("w : " + w);
			//--==>> �� �� �� �Է�(���� ����) : 2021 7 30
			//		 w : 5 �� �ݿ���

			return weekNames[w];
  
						
		}
		

		// �޼ҵ� ���� �� ��� ����ϱ�(print)
		public void print(String day)
		{
			System.out.printf("\n%d�� %d�� %d�� �� %s����\n", y, m, d, day);
		}
		//
			
}


public class Test095
{

	public static void main(String[] args)
	{
		WeekDay ob = new WeekDay();		// WeekDay�� ���� �ν��Ͻ� ����

		ob.input();						// �Է� �޼ҵ� ȣ��
										// �� �� �� �Է�(���� ����) : 1996 8 16
		//ob.week();
		String result = ob.week();		// ���� ���� �޼ҵ� ȣ�� �� ��� Ȯ��(����)

		//�׽�Ʈ
		//System.out.println(result);

		ob.print(result);				// ��� �޼ҵ� ȣ��
										// 1996�� 8�� 16�� �� x����
	}
}