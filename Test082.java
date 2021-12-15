/*========================
	■■■배열■■■
-배열의 배열(2차원 배열)
==========================*/
/*배열의 배열 (다차원 배열)을 활용하여
다음과 같은 데이터를 요소로 취하는 배열(5*5)을 구성하고
그 결과를 출력하는 프로그램을 구현한다

실행예
1 2 3 4 5
2 3 4 5 6 
3 4 5 6 7
4 5 6 7 8
5 6 7 8 9
계속하려면 아무키나 누르세요..*/

public class Test082

{
	public static void main(String[] args)

	{
		//배열 선언 + 메모리 할당

		int[][] arr = new int[5][5];		//(5*5)의 배열
		int n;																					// i = 0 → n이 1부터 시작 =>n=i+1
																								// i =1 → n이 2부터 시작 =>n=i+2
		//연산 및 처리																			// i =2 → n이 3부터 시작 =>n=i+3
																								// i =3 → n이 4부터 시작 =>n=i+4
		for (int i=0; i<arr.length; i++)

		{
			n = i+1;
			for (int j=0; j<arr[i].length; j++)

			{
				arr[i][j] = n;
				n++;
			}
		}
		
		// 결과 출력

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
계속하려면 아무 키나 누르십시오 . . .*/