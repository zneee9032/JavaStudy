/*========================
	■■■배열■■■
-배열 선언과 초기화  
-배열의 기본적 활용
==========================*/
/*
○과제
 사용자로부터 임의의 정수를 임의의 갯수만큼 입력받아서 입력받은 정수 중에서 가장 큰 수를 출력하는 프로그램을 작성한다.

 단, 배열을 활용하여 구현할 수 있도록 한다.

실행 예)
입력할 데이터의 갯수 : 10
데이터 입력(공백 구분) : 45 73 4 57 34 6 2 8 5 1
가장 큰 수 → 73
계속하려면 아무 키나 누르세요

*/
import java.util.Scanner;

public class Test078

{
	public static void main(String[] args)

	{
		// 주요 변수 선언

		Scanner sc = new Scanner(System.in);

		int n, temp=0;	//-- 입력받을 정수, 임시저장변수


		// 입력받기

		do

		{

			System.out.print("입력할 데이터의 갯수  : ");

			n = sc.nextInt();

		}

		while (n<0 || n>10);


		// 배열 크기 설정

		int arr[] = new int[n];	//-- 입력받은 데이터 수 만큼 방을 만든다.


		// 데이터 입력받기

		System.out.print("데이터 입력(공백구분) : ");

		for (int i=0; i<n; i++)

		{

			arr[i] = sc.nextInt();

		}
		

		// 제일 큰 수 arr[0]으로 옮기기

		for (int i=n-1; i>0; i--)

		{

			if (arr[i-1]<arr[i])

			{

				temp = arr[i];

				arr[i] = arr[i-1];

				arr[i-1] = temp;

			}

		}

		// 결과 출력

		System.out.println("가장 큰 수 → " + arr[0]);

	}

}
/*입력할 데이터의 갯수  : 5
데이터 입력(공백구분) : 4 5 6 4 3
가장 큰 수 → 6
계속하려면 아무 키나 누르십시오 . . .
*/
