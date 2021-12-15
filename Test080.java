/*========================
	■■■배열■■■
-배열의 배열(2차원 배열)
==========================*/
public class Test080

{

	public static void main(String[] args)

	{

		// 방법 ①

		// int[] arr1 = new int[3];

		int[][] arr1 = new int[3][3];

		//arr1[0] = 1;

		arr1[0][0] = 1;

		arr1[0][1] = 2;

		arr1[0][2] = 3;

		arr1[1][0] = 4;

		arr1[1][1] = 5;

		arr1[1][2] = 6;

		arr1[2][0] = 7;

		arr1[2][1] = 8;

		arr1[2][2] = 9;




		// 방법 ②

		int[][] arr2 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}};



		// 방법 ③

		int[][] arr3 = new int[3][3];

		int n=1;

		for (int i=0; i<arr3.length; i++)	//웅 ~~~ 0 1 2			==> 층

		{

			for (int j=0; j<arr3[i].length; j++)	//쑝쑝쑝 012 012 012		==> 층안에 안있는 사무실

			{
				//테스트	
				//System.out.println("i :" +i + ",j : " +j);
					/*
					i :0,j : 0
					i :0,j : 1
					i :0,j : 2
					i :1,j : 0
					i :1,j : 1
					i :1,j : 2
					i :2,j : 0
					i :2,j : 1
					i :2,j : 2
					계속하려면 아무 키나 누르십시오 . . .*/

				arr3[i][j] = n;
				n++;

			}

		}


		// 배열의 배열 요소 전체 출력 //arr1 == arr2 == arr3

		for (int i=0; i<arr3.length; i++)

		{

			for (int j=0; j<arr3[i].length; j++)

			{

				System.out.printf("%2d", arr3[i][j]);

			}

			System.out.println();

		}

		System.out.println(); 
/* 
	1 2 3
	4 5 6
	7 8 9

계속하려면 아무 키나 누르십시오 . . .*/

	}

}
