/*=======================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ���� 2021-08-11
  - Random Ŭ���� / �ζ� ��ȣ ������ (���� �߻� ���α׷�)
=======================================*/
/*
java.util.RandomŬ������
���� ������ ������ �߻����� �����ϴ� Ŭ�����̴�
MathŬ������ ���� �޼ҵ��� random() �޼ҵ嵵 ������ �����ϴ� �޼ҵ�������
0.0~1.0������ �Ǽ� ���¸� �߻��ϰ� �ǹǷ�
�ʿ��� ���� ������ ������ ������ ���ؼ��� �߰����� ������� �����ؾ�����
�׷��� �ڹٴ� ���������� ������ �߻������ִ� ���� Ŭ������
RandomŬ������ ������ �����ϰ� �ִ�

�۷ζ� ��ȣ ������(���� �߻� ���α׷�)
���α׷��� ����Ǹ� �⺻������ �ζǸ� 5���� �����ϴ� ���α׷� ����
(������ȣ���� ū ������ ����)

�۷ζǹ�ȣ: 1~45���� �ߺ����� �ʴ� 6���� ��
���� ��)
  2 10 12 15 23 36
  1  2  3  8 21 22
  9 16 23 28 34 41
  6  9 14 20 25 43
 11 21 33 36 38 41
*/
import java.util.Random;
public class Test142
{
	public static void main(String[] args)
	{
		// �ν��Ͻ� ����
		Random rd = new Random();

		// �ֿ� ���� ����
		int temp[] = new int[6];	// ���� ���� ����
		boolean t = true;

		// �迭����
		for(int i=0; i<5; i++)	//������ ���� ����
		{
			// ���� �߻�
			for (int j=0; j<6; j++)	//�տ������� ��
			{
				//temp[j] = (int)Math.round(Math.random()*45);
				temp[j] = rd.nextInt(45)+1;

				for (int k=0; k<6; k++)	//�޹�ȣ��� ��
				{
					if (j==k)
						break;

					else if (temp[j]==temp[k])
					{
						temp[j] = rd.nextInt(45)+1;
						k=0;
					}
				}			
			}

			
			// ��������

			for (int a=0; a<temp.length-1; a++)
			{
				for (int b=a+1; b<temp.length; b++)
				{
					if (temp[a]>temp[b])

					{

						temp[a] = temp[a]^temp[b];
						temp[b] = temp[b]^temp[a];
						temp[a] = temp[a]^temp[b];
					}
				}

			}
			// ��� ���

			for (int n : temp)
				System.out.printf("%3d", n);
			System.out.println();
		}
	}//end main()

}


