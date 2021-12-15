/*==============================================
	■■■ 정렬(Sort) 알고리즘 ■■■
-버블 정렬(Bubble Sort): 인접한것 끼리 비교
================================================*/
/*
○정렬
	: 데이터를 특정한 규칙(기준)에 맞게 순서대로 나열 (오름차순,내림차순)
	
○정렬의 목적
  : 데이터 처리 과정의 편의성이나 가독성을 높이기 위함
	=> 보기 좋게...! 검색하기 위함

○정렬의 종류
	: 선택 정렬/버블 정렬/ 삽입 정렬/ 힙 정렬/ 퀵 정렬/ 쉘 정렬

//실행 예)
//Source Data : 52 42 12 62 60
//Sorted Data : 12 42 52 60 62
//계속하려면 아무 키나 누르세요..


*/
public class Test104
{
	public static void main(String[] args)

	{

                /*

			52 42 12 62 60		0	1				기준 0 1 2 3
			== --

			42 52 12 62 60		1	2

			   == --

			42 12 52 62 60		2	3

			      == --

			42 12 52 62 60		3	4

			         == --
			------------------------ 1 cycle (4번) 

			42 12 52 60 62		0	1				기준 0 1 2

			== --
			12 42 52 60 62		1	2

			   == --

			12 42 52 60 62		2	3

			      == --
			----------------------- 2 cycle (3번)

			12 42 52 60 62		0	1				기준 0 1

			== --

			12 42 52 60 62		1	2

			   == --
			------------------------ 3 cycle (2번)
													기준 0
			12 42 52 60 62		0	1

			== --
			------------------------ 4 cycle (1번)
		*/
	
		int[] a = {52, 42, 12, 62, 60};
		int i, j, temp;

		System.out.print("Source Data : ");
		for (int n : a)	// a 배열 [0]부터 끝까지 n에 순차적용
			System.out.print(n + " ");
		System.out.println();

		// Bubble Sort 구현
		for (i=1; i<a.length; i++)	// 1 2 3 4 → 뒤에서 비교 대상을 하나씩 줄여주는 역할
		{
			for (j=0; j<a.length-i; j++)	// (0~3) (0~2) (0~1)
			{
				if (a[j] > a[j+1])
				{

					// 자리 바꾸기

					a[j] = a[j]^a[j+1];

					a[j+1] = a[j+1]^a[j];

					a[j] = a[j]^a[j+1];

				}

			}

		}

		System.out.print("Sorted Data : ");
		for (int n : a)	// a 배열 [0]부터 끝까지 n에 순차적용
			System.out.print(n + " ");
		System.out.println();

	}

}
/*
Source Data : 52 42 12 62 60
Sorted Data : 12 42 52 60 62
계속하려면 아무 키나 누르십시오 . . .
*/