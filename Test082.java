/*========================
	����迭����
-�迭�� �迭(2���� �迭)
==========================*/
/*�迭�� �迭 (������ �迭)�� Ȱ���Ͽ�
������ ���� �����͸� ��ҷ� ���ϴ� �迭(5*5)�� �����ϰ�
�� ����� ����ϴ� ���α׷��� �����Ѵ�

���࿹
1 2 3 4 5
2 3 4 5 6 
3 4 5 6 7
4 5 6 7 8
5 6 7 8 9
����Ϸ��� �ƹ�Ű�� ��������..*/

public class Test082

{
	public static void main(String[] args)

	{
		//�迭 ���� + �޸� �Ҵ�

		int[][] arr = new int[5][5];		//(5*5)�� �迭
		int n;																					// i = 0 �� n�� 1���� ���� =>n=i+1
																								// i =1 �� n�� 2���� ���� =>n=i+2
		//���� �� ó��																			// i =2 �� n�� 3���� ���� =>n=i+3
																								// i =3 �� n�� 4���� ���� =>n=i+4
		for (int i=0; i<arr.length; i++)

		{
			n = i+1;
			for (int j=0; j<arr[i].length; j++)

			{
				arr[i][j] = n;
				n++;
			}
		}
		
		// ��� ���

		for (int i=0; i<arr.length; i++)

		{

			for (int j=0; j<arr[i].length; j++)

				System.out.printf("%3d", arr[i][j]);

			System.out.println();
		}
	}
}
/* 
  1  2  3  4  5
  2  3  4  5  6
  3  4  5  6  7
  4  5  6  7  8
  5  6  7  8  9
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .*/