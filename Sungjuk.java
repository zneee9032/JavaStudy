/*	=========================
	�����Ŭ������ �ν��Ͻ������
	- Ŭ������ �ν��Ͻ�Ȱ��
	========================= */
/*�л� ���� ��������, ��������, ���������� �Է¹޾�
����,����� �Ի��ϴ� ���α׷��� �����Ѵ�.
��,Ŭ������ ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�
����, �̰������� �迭�� ���������� Ȱ���� �� �ֵ��� �Ѵ�*/

/*
2. Sungjuk Ŭ����
-�ο� ���� �Է� �޾�,�Է¹��� �ο� �� ��ŭ
�̸�, ��������,��������, ���������� �Է¹ް�
������ ����� �����ϴ� Ŭ������ ���� �Ұ�
		-�Ӽ� : �ο���,Record ������ �迭
		-��� : �ο� �� �Է� ,�� ������ �Է�, ���� �� ��� ����, ��� ���
*/


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.IOException;
import java.util.Scanner;

class Sungjuk

{	

	//�ֿ� �Ӽ� ����(�ֿ� ���� ����)

	int inwon;			//-- �ο� ��
	Record[] rec;		//-- Record �迭(�л� 1�� �� Record�迭�� �� 1�� Ȱ��)
						//Record�� ������� ������ ��ü�� ��� �� �� �ִ� �迭

//==================================================================================================

	//�ο� �� �Է� ,�� ������ �Է�, ���� �� ��� ����, ��� ���

	String[] title = {"���� ���� : ", "���� ���� : ", "���� ���� : "};

	//�ֿ� �޼ҵ� ����(��� ����)

	// �� �ο� �� �Է�

	public void set()					//public void set(int inwon)

	{
		//Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		do			//do while ��? �� ���?_________>�ѹ� �Է��ϰ��� �ٽ� ����Ұſ���!

		{

			System.out.print("�ο� �� �Է�(1~100) : ");
			inwon = sc.nextInt();

		}

		while (inwon<1 || inwon>100);			//�ο����� 1���� �۰ų� �ο����� 100���� ������ 


		// �ڡڡڡڡڡڡ�Check~!!�ڡڡڡڡڡڡ�
		// Record Ŭ������ ������� ������ ��ü(�ν��Ͻ�)�� ���� �� �ִ� �迭����
		// inwon ��ŭ ����
	
		rec = new Record[inwon]; //-------------> rec�̶�� �׸��ȿ� �����
		
		//Record�迭���� inwon��ŭ �����Ѱ�����
		//Record Ŭ������ �ν��Ͻ��� ������ ���� �ƴϴ�.


	}//end set()


	// �ֿ� �޼ҵ� ���� (��ɱ���)
	// �� �� ������ �Է� + ����/��� ����

	public void input()					//void �Է¹��� ���� �迭�濡 �������̱� �����̴� return �ڷ�� void

	{
		//Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		
		//�ο�����ŭ �ݺ� �� �ο����� ����Ͽ� ������� �迭�� ���� ��ŭ �ݺ�
		for (int i=0; i<inwon; i++)	//for (int 1=0 ; i <rec.length; i++)

		{
			/*
			system.out.print("�̸� �Է� : ");
			rec�迭�� i��°���� �̸� = sc.next();

			System.out.print("�������� �Է� : ");
			rec�迭�� i��°���� ���� = sc.next();

			System.out.print("�������� �Է� : ");
			rec�迭�� i��°���� ���� = sc.next();

			System.out.print("�������� �Է� : ");
			rec�迭�� i��°���� ���� ���� = sc.next();

			rec[i] = ob;
			rec[i] = name;
			rec[i] = tot;
			*/


			// Check~!!!
			// Record Ŭ���� ����� �ν��Ͻ� ����

			rec[i] = new Record();		//-- �� Record ob1 = new Record() rec[i] =ob;

			

			System.out.printf("%d��° �л��� �̸� �Է� : ", (i+1));			//87�� ����~!
			rec[i].name = sc.next();

			



			for (int j=0; j<title.length; j++)	//��,��,�� ����� ��ŭ �ݺ�~!!! 
			{

				// �ȳ� �޼��� ���
				System.out.print(title[j]);


				// ����ڰ� �Է��� �����͸� ���ھ�(score) �迭�� ��Ƴ���
				rec[i].score[j] = sc.nextInt();			//i��° �л��� score[0] -> ��������
														//i��° �л��� score[1] -> ��������
														//i��° �л��� score[2] -> ��������


				// ����, ����, ���� ���� �����͸� �ݺ������� �Է¹޴� ����
				// ���� �����ϱ�

				rec[i].tot += rec[i].score[j];

			}


			// ��� �����ϱ�

			rec[i].avg =  rec[i].tot / 3.0;

		}

	}// end input()



	// �ֿ� �޼ҵ� ����(��ɱ���)
	// �� ��� ���

	
	public void print()			//�Ű����� ��� ��

	{
				// ����
		System.out.println();

		// ���� ���� �޼ҵ� ȣ�ⱸ�� �߰�~!!
		ranking();

		// �л� 1�� �� �ݺ� ��� ����
		for (int i=0; i<inwon; i++)
		{

			// �̸� ���
			System.out.printf("%5s", rec[i].name);


			// ����(����, ����, ����) �ݺ� ���
			for (int j=0; j<3; j++)
				System.out.printf("%4d", rec[i].score[j]);



			// ����, ��� ���
			System.out.printf("%5d", rec[i].tot);
			System.out.printf("%8.2f", rec[i].avg);


			// ���� ��±��� �߰�~!!(���� �߰�)
			System.out.printf("%5d", rec[i].rank);

			// ����
			System.out.println();



		}

	}//end print()




	// �� ���� ���� �޼ҵ� �߰�~!!!
	// - Racord �迭�� rank �Ӽ��� �ʱ�ȭ ��� �� ��ȯ�ڷ��� void
	// - Ŭ���� ���������� Ȱ���� �޼ҵ� ���� �� �������������� private �� �ܺο��� ȣ�� �Ұ�!

	private void ranking()			//�ݺ��� ��ø!


	{
		int i, j;					//�������� ����

		// ��� �л����� ���(����, rank)�� 1�� �ʱ�ȭ		
		for (i=0; i<inwon; i++)		

			rec[i].rank = 1;		


		// ��� ����... ex)4��

		for (i=0; i<inwon-1; i++)		//�� ������ �� ������ ==>   0    1     2

		{														//   ��   ��    ��

			for (j=i+1; j<inwon; j++)	//�� ����� �� ������ ==>  123   23    3

			{

				//�񱳱����� ����� �񱳴���� ��պ��� ũ�ٸ�
				if (rec[i].avg > rec[j].avg) 
				{

					//�񱳵������� rank �� 1��ŭ ����
					rec[j].rank++;
				}
				
				//�񱳴���� ����� �񱳱����� ��պ��� ũ�ٸ�
				else if (rec[j].avg > rec[i].avg) 
				{
					//���ص������� rank �� 1��ŭ ����
					rec[i].rank++;

				}

			}

		}

	}//end ranking()

}
