/*=======================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ���� 2021-08-11
  - Calendar Ŭ����
  - GregorianClaender()
  - ��¥���ϱ� ���α׷�
=======================================*/
/*
�ǽ�����
������ �������� �Է¹޴� ��¥��ŭ ���� 
��,��,��,������ Ȯ���Ͽ�
����� ����ϴ� ���α׷��� �����Ѵ�

���� ��)
���� ��¥ : 2021-8-11 ������ (���)
���� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ� : 200

//////////////[Ȯ�� ���]==================
200�� �� : xxxx-xx-xx x����
===========================================

���� ���ڸ� �������� �� ���� ���ϴ� ���� �޼ҵ�
����ü.add(Calendar.DATE, �� ��);��
����Ϸ��� �ƹ� Ű�� ��������*/

import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Test139

{
	public static void main(String[] args)

	{

		// �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);
		Calendar ob = new GregorianCalendar();

		
		// �ֿ� ���� ����
		int y, m, d, w, days;
		String[] week = {"�Ͽ���", "������", "ȭ����", "������", "�����", "�ݿ���", "�����"};


		// ���� ��¥ Ȯ���ϱ�

		y = ob.get(Calendar.YEAR);
		m = ob.get(Calendar.MONTH)+1;	
		d = ob.get(Calendar.DATE);
		w = ob.get(Calendar.DAY_OF_WEEK)-1;


		// ���糯¥ ���
		System.out.printf("���� ��¥ : %d-%d-%d %s\n", y, m, d, week[w]);


		// �Է¹ޱ�
		do

		{

			System.out.print("�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : ");
			days = sc.nextInt();

		}

		while (days<1);


		// ���� �� ���
		//ob.add(Calendar.DATE, days);	//-- �Է¹��� ��¥�� �����ش�.
		// �ʱ�ȭ ���� �ٷ� ó���ϴ� ��
		ob.add(Calendar.DATE, days);


		// �ٽ� �ʱ�ȭ�ϱ�
		y = ob.get(Calendar.YEAR);
		m = ob.get(Calendar.MONTH)+1;	
		d = ob.get(Calendar.DATE);
		w = ob.get(Calendar.DAY_OF_WEEK)-1;


		// Ȯ�ΰ�� ���

		System.out.println("\n===========[Ȯ�ΰ��]===========");
		System.out.printf("%d�� �� : %d-%d-%d %s\n", days, y, m, d, week[w]);
		System.out.println("================================");


		// �ʱ�ȭ ���� �ٷ� ó���ϴ� ��
		System.out.println("\n===========[Ȯ�ΰ��]===========");
		System.out.printf("%d�� �� :%tF %tA\n", days, ob, ob);	
		System.out.println("================================");

		//-- ����Ÿ���� ����Ÿ������ ����ѰŰ� �̰� ��¥�� �ҷ����°Ŷ�
		//   %tF %tA �� ��¥, ���� �ҷ����� ����

	}

}


/*
���� ��¥ : 2021-8-11 ������
���� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ� :200

===========[Ȯ�ΰ��]===========
200�� �� : 2022-2-27 �Ͽ���
================================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/