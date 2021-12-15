/*=========================
  ���� Ŭ���� ��� ����
  - �������̽�(Interface)
=========================*/
/*
�� �ǽ� ����
���� ó�� ���α׷��� �����Ѵ�.
��, �������̽��� Ȱ���� �� �ֵ��� �Ѵ�.

���� ��)
�ο� �� �Է�(1~10): 2
1��° �л��� �й� �̸� �Է�(���� ����): 2108006 �Ǽ���
���� ���� ���� ���� �Է�   (���� ����): 90 100 85
2��° �л��� �й� �̸� �Է�(���� ����): 2108024 ��ҿ�
���� ���� ���� ���� �Է�   (���� ����): 85 70 65

2108006 �Ǽ���		90  100  85		275		91
					��   ��  ��
2108024 ��ҿ�		85   70  65		220		73
					��	 ��  ��

����Ϸ��� �ƹ� Ű�� �������� . . .
*/

import java.util.Scanner;
import java.io.IOException;


// �Ӽ��� �����ϴ� Ŭ���� �� �ڷ��� Ȱ��
class Record
{
	String hak, name;		//-- �й�, �̸�
	int kor, eng, mat;		//-- ����, ����, ����
	int tot, avg;			//-- ����, ���(���ǻ� ���� ó��)
}


// �������̽�
interface Sungjuk
{
	public void set();		//-- �ο� �� ����
	public void input();	//-- �� ������ �Է�
	public void print();	//-- ��� ���
}


// ���� �ذ� �������� �����ؾ� �� Ŭ���� �� Sungjuk �������̽��� �����ϴ� Ŭ����
class SungjukImpl implements Sungjuk 
{
	Record[] rec;
	int mem;

	@Override
	public void set()
	{
		do
		{
			System.out.print("�ο� �� �Է�(1~10): ");
			Scanner sc = new Scanner(System.in);
			mem = sc.nextInt();
		}
		while (mem<1 || mem>10);		
	}

	@Override
	public void input() 
	{
		Scanner sc = new Scanner(System.in);
		rec = new Record[mem];

		for (int i=0; i<rec.length; i++)
		{
			rec[i] = new Record();

			System.out.printf("%d��° �л��� �й� �̸� �Է�(���� ����): ", i+1);
			rec[i].hak  = sc.next();
			rec[i].name = sc.next();
			System.out.print("���� ���� ���� ���� �Է�   (���� ����): ");
			rec[i].kor = sc.nextInt();
			rec[i].eng = sc.nextInt();
			rec[i].mat = sc.nextInt();

			rec[i].tot = rec[i].kor + rec[i].eng + rec[i].mat;
			rec[i].avg = rec[i].tot / 3;
		}
	}

	String grade(int s)
	{
		String result;
		
		switch (s/10)
		{
			case 10 : result = "��"; break; //100
			case  9 : result = "��"; break; //90~99
			case  8 : result = "��"; break; //80~89
			case  7 : result = "��"; break;
			case  6 : result = "��"; break; 
			default : result = "��"; break;		
		}

		return result;
	}


	@Override
	public void print()
	{
		for (int i=0; i<rec.length; i++)
		{
			System.out.printf("%4s %4s %3d %3d %3d \t%3d %3d\n",
							rec[i].hak, rec[i].name, rec[i].kor, rec[i].eng, rec[i].mat,
							rec[i].tot, rec[i].avg);
			System.out.printf("\t\t%2s  %2s  %2s\n", 
							grade(rec[i].kor), grade(rec[i].eng), grade (rec[i].mat));
		}

		System.out.println();
	}
}


public class Test117
{
	public static void main(String[] args) throws IOException
	{
		Sungjuk ob = new SungjukImpl();

		// ���� �ذ� �������� �ۼ��ؾ� �� ob ����

		ob.set();
		ob.input();
		ob.print();
	}
}
