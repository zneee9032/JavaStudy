/*=====================================
�ڹ� �⺻ ���α׷���
-�ڹ��� �⺻ �����: java.util.Scanner
======================================*/
//��java.util.Scanner
//�ܶ� ���� ������ ����Ͽ� �Է��� ��ū�� ���� �����ϸ�
//����Ʈ(default)�� ���Ǵ� �ܶ����ڴ� �����̴�.
//�ۼ��� ���� ��ū�� ��next()��  �޼ҵ带 ���
//�ٸ� ����(�ڷ���)�� ������ ��ȯ �� �� �ִ�.
import java.util.Scanner;

public class Test016
{
	public static void main(String[] args)   //throw IOException
	{
		//���ֿ� ���� ����

		//Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in);

		String name;		//�̸�
		int kor, eng, mat;	//����, ���� ��������

		//�ٿ��� �� ó��
			System.out.print("�̸��� �Է��ϼ��� : ");
			//br.readLine();		//==>BufferedReader�϶�,
			name = sc.next();
			
			System.out.print("�������� �Է� : ");
			//kor = Integer.parseInt(br.readLine());
			//kor = Integer.parseInt(sc.next());
			kor = sc.nextInt();

			System.out.print("���� ���� �Է� : ");
			eng = sc.nextInt();

			System.out.print("���� ���� �Է� : ");
			mat = sc.nextInt();


		//�ٰ�� ���

		System.out.println();
		System.out.println(">> �̸� : " + name);
		System.out.println(">> ���� : " + (kor + eng +mat));
	}
}
/*
�̸��� �Է��ϼ��� : ������
�������� �Է� : 90
���� ���� �Է� : 80
���� ���� �Է� : 95

>> �̸� : ������
>> ���� : 265
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/