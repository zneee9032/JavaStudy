/*	=========================
	���迭���
	- �迭�� �迭(2���� �迭)
	========================= */
/*
�迭�� �迭 (������ �迭)�� Ȱ���Ͽ�
������ ���� �����͸� ��ҷ� ���ϴ� �迭(5*5)�� �����ϰ�
�� ����� ����ϴ� ���α׷��� �����Ѵ�

���� ��)
 E J O T Y
 D I N S X
 C H M R W
 B G L Q V
 A F K P U 

����Ϸ��� �ƹ�Ű�� ��������
*/

public class Test085
{
	public static void main(String[] args)
	{
		//�迭�� ���� �� �޸� �Ҵ�
		char[][] arr = new char[5][5];
						
		//�� ä���

		char c ='A';
		for (int i=0; i<5; i++)			//��~ i=> 0 1 2 3 4	
		{
			for (int j=4; j>=0; j--)		//��~ j=> 4 3 2 1 0
			
				arr[j][i] = c++;									
			
		}
		//��ü ��� ���
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			
				System.out.printf("%3c", (char)arr[i][j]);
			
			System.out.println();
		}
		
	}
}
/*
 E J O T Y
 D I N S X
 C H M R W
 B G L Q V
 A F K P U
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/