/*=========================================================
�ڹ� �⺻ ���α׷���
-�ڹ��� �⺻ �����: java.util.Scanner(�޸� ����)

��sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");��
==========================================================*/
//��java.util.Scanner
//�ܶ� ���� ������ ����Ͽ� �Է��� ��ū�� ���� �����ϸ�
//����Ʈ(default)�� ���Ǵ� �ܶ����ڴ� �����̴�.
//�ۼ��� ���� ��ū�� ��next()��  �޼ҵ带 ���
//�ٸ� ����(�ڷ���)�� ������ ��ȯ �� �� �ִ�.

// ������,90,80,70

import java.util.Scanner;

public class Test018
{
	public static void main(String[] args)
	{
		//�� �ֿ� ���� ����
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, mat, tot;

		//�� ���� �� ó��
		System.out.print("�̸�,��������,��������,�������� �Է�(��,������) : ");

		//sc = new Scanner(sc.next()).useDelimiter("\\s*,\\*");	// s ������ ��
		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
	
		//				-----------
		//				������,90,80,70

		name = sc.next();			//������
		kor = sc.nextInt();			//90
		eng = sc.nextInt();			//80
		mat = sc.nextInt();			//70

		tot = kor + eng + mat;

		//�� ��� ���
		System.out.println("\n>>�̸� :"+ name);
		System.out.println("���� :"+ tot);
	}
}
/*
�̸�,��������,��������,�������� �Է�(��,������) : ������,90,80,70			====> ��ǥ �����ؾ� ����

>>�̸� :������
���� :240
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/