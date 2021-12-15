/*============================================================
			 ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ���� 2021-08-10

��CalendarŬ����
===============================================================*/

/*
�� CalendarŬ������ �߻�Ŭ�����̴�! => ��ü���� x
	(�߻� Ŭ���� : �̿ϼ� �� Ŭ����)

	Claendar ob =  new Calendar();
	-> �̿� ���� ������ ���� �ν��Ͻ� ���� �Ұ�

��Calender��ü(�ν��Ͻ�) �� ������ ���

1. Calendar ob 1 = Calendar.getInstance();			=>�����޼ҵ�, StaticŬ����

2. Calendar ob2 = new GregorianCalendar();			=> Calendar�� ���� Ŭ����? ��ĳ����~!

3. GregorianCalendar ob3 = new GregorianCalendar();
	(GregorianCalendar : CalendarŬ������ ���� Ŭ����)

*/

// ������ ��, ��,��, ������ Calendar ��ü�� Ȱ���Ͽ� ���

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test138
{
	public static void main(String[] args)
	{
		//Calendar Ŭ���� �ν��Ͻ� ����
		//Calendar rightNow = new Calendar();			�ȵȴ�!
		Calendar rightNow = Calendar.getInstance();


		//������ �޷� (Claendar)�ν��Ͻ��� ����
		//��¥ ���� ������ �� �� �ִ� �޼ҵ� -> ��get��

		int y = rightNow.get(Calendar.YEAR);			//YEAR�� static�� final�� ���� ���ȭ�� �������� ����  (class����)	
		System.out.println(y);//==> 2021

				
		int m = rightNow.get(Calendar.MONTH)+1;		   //MONTH�� �迭�� ���·� ó���ǰ� �ִ�. ��+1���� ������� �ش� ���� ���´� Check~!!
		System.out.println(m);//==>> 8



		int d = rightNow.get(Calendar.DATE);
		System.out.println(d);//==>>10


		int w = rightNow.get(Calendar.DAY_OF_WEEK);	//�迭�� ���� ������ �ִ�
		System.out.println(w);//==>> 3				ȭ���� = 3... 

		System.out.println(y + "-" + m + "- " + d + " " + w);
		//2021-8- 10 3

			// �׽�Ʈ

		System.out.println(Calendar.SUNDAY);	//--==> 1 �� ��

		System.out.println(Calendar.MONDAY);	//--==> 2 �� ��

		System.out.println(Calendar.TUESDAY);	//--==> 3 �� ȭ

		System.out.println(Calendar.WEDNESDAY);	//--==> 4 �� ��

		System.out.println(Calendar.THURSDAY);	//--==> 5 �� ��

		System.out.println(Calendar.FRIDAY);    //--==> 6 �� ��

		System.out.println(Calendar.SATURDAY);	//--==> 7 �� ��

		System.out.println();	//����

		String week = "";
		switch (w)
		{
			case Calendar.SUNDAY: week="�Ͽ���"; break;

			case Calendar.MONDAY: week="������"; break;

			case Calendar.TUESDAY: week="ȭ����"; break;

			case Calendar.WEDNESDAY: week="������"; break;

			case Calendar.THURSDAY: week="�����"; break;

			case Calendar.FRIDAY: week="�ݿ���"; break;

			case Calendar.SATURDAY: week="�����"; break;
		
		}
		//Ȯ��
		System.out.println(y + "�� " + m + "��" + d + "��" + week);
		//==>>2021�� 8��10��ȭ����

		//////////////////////////////////////////////////////////////

		//Calandar Ŭ���� �ν��Ͻ� ����
		Calendar rightNow2 = new GregorianCalendar();
		
		String[] week2 = {"�Ͽ���", "������", "ȭ����", "������", "�����", "�ݿ���", "�����"};




		// �޷��� ��¥ ���� �� ��set();���޼ҵ� Ȱ��

		rightNow2.set(2021, 7, 10);	//2021-8-10 (���� �迭�̶� -1)

		System.out.println(rightNow2.get(Calendar.DAY_OF_WEEK));

		//--==> 3 �� ȭ����




		System.out.println(week2[rightNow2.get(Calendar.DAY_OF_WEEK)-1]);

		//--==> ȭ����




		rightNow2.set(1997, 9, 19);	//

		System.out.println(week2[rightNow2.get(Calendar.DAY_OF_WEEK)-1]);

		//--==> �Ͽ���



		rightNow2.set(1999, 3, 20);	//

		System.out.println(week2[rightNow2.get(Calendar.DAY_OF_WEEK)-1]);

		//--==> ȭ����

	}

}


