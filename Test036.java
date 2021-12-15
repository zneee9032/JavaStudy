 /*============================================================
������� �帧�� ��Ʈ�� (���, ���ǹ��� �ݺ���)����
-switch �� �ǽ�
===========================================================*/

/*
�۴��� ���ù��̶� �ϸ�,switch �� ������ ���� ���� ����
���� ������ ���� �������� �б� �� �� ����ϴ� �����̴�.
�� ���ı���
switch(����)
{
	case ���1 : ����1; [break;]
	case ���2 : ����2; [break;]

	[default :���� n+1 ;[break;]]
}

switch���� �����ġ��� case�� ���������
byte,short,int,long�̾���Ѵ�.

case�� �ڿ� ��break;���� ���� ������ ���
���� case���� ������ ����ؼ� (�̾) �����ϰ� �ȴ� => �⺻��	*/

//����� �̸��� �������Դϴ�.
//������ xx,����� xx�Դϴ�
//����� A�Դϴ�

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test036
{
	public static void main(String[]args) throws IOException
	{
		//BufferedReader�ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//�ֿ亯�� ����
		String name;
		int Kor,Mat,Eng,Tot;
		int Avg;
		char Grade;
		
		//�Է� �� ���
		System.out.print("�� ���� ����? : ");
		name = br.readLine();	

		System.out.print("����� �� ��? : ");
		Kor = Integer.parseInt(br.readLine());

		System.out.print("������ �� ��? : ");
		Mat = Integer.parseInt(br.readLine());

		System.out.print("����� �� ��? : ");
		Eng = Integer.parseInt(br.readLine());

		 Tot = Kor + Eng + Mat;
		 Avg = Tot/3;
		System.out.printf("������ : %d\n",Tot); 
		System.out.printf("����� : %d\n",Avg); 
		/*
			�� ���� ����? : ������
			����� �� ��? : 99
			������ �� ��? : 88
			����� �� ��? : 77
			������ : 264
			����� : 88.00
			����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
		*/

		switch (Avg / 10)
		{
			case 10 : case 9 :		//==>Check~!!!
				Grade = 'A';
				break;
			case 8 :
				Grade = 'B';
				break;
			case 7 :
				Grade = 'C';
				break;
			case 6 :
				Grade = 'D';
				break;
			default :
				Grade = 'F';
		}
		System.out.printf("����� %c �Դϴ�.\n", Grade);
	}
}
/*
�� ���� ����? : ������
����� �� ��? : 90
������ �� ��? : 99
����� �� ��? : 100
������ : 289
����� : 96
����� A �Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

�� ���� ����? : ������
����� �� ��? : 77
������ �� ��? : 66
����� �� ��? : 55
������ : 198
����� : 66
����� D �Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/