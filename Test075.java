/*========================
	■■■배열■■■
-배열의 기본적 활용
==========================*/
/*임의의 정수들이 들어 있는 배열의 숫자 데이터들 중
짝수인 요소만 골라서 출력하고, 3의배수인 요소만 골라서 출력하는 프로그램을 구현한다

배열을 구성하는 임의의 정수 = 4 7 9 1 3 2 5 6 8 

실행예
배열 요소 전체 출력
4 7 9 1 3 2 5 6 8
짝수 선택적 출력
4 2 6 8 
3의 배수 선택적 출력
9 3 6
계속하려면 아무키나 누르세요*/
public class Test075

{

	public static void main(String[] args)

	{

		//배열 선언 및 초기화

		/*방법①

		int[] arr = new int[9];

		arr[0] = 4;

		arr[1] = 7;

		arr[2] = 9;

		arr[3] = 1;

		arr[4] = 3;

		arr[5] = 2;

		arr[6] = 5;

		arr[7] = 6;

		arr[8] = 8;

		*/

		//방법②

		int[] arr = {4, 7, 9, 1, 3, 2, 5, 6, 8};

		//String str = "4, 7, 9, 1, 3, 2, 5, 6, 8";




		//System.out.println(arr);	//--==>> [@6d06d69c

		//System.out.println(str);	//--==>> 4, 7, 9, 1, 3, 2, 5, 6, 8

		//※ 일반적인 변수에 담긴 내용을 출력하는 형식(방법)으로는

		//   배열에 담긴 데이터들을 출력할 수 없다.




		// 배열 요소 전체 출력

		System.out.println("배열 요소 전체 출력");

		for (int i=0; i<arr.length; i++)

			System.out.print(arr[i] + " ");


		System.out.println();

		//--==>>배열 요소 전체 출력
		//--==>> 4 7 9 1 3 2 5 6 8
			


		//방의 개수는 ?
		System.out.println("arr.length : " + arr.length);

		//--==>> arr.length : 9


		// ※ 배열 arr 의 길이 확인

		// : arr.length(속성을 통해 알 수 있다)


		System.out.println();




		System.out.println("짝수 선택적 출력");

		for (int i=0; i<arr.length; i++)

		{

			if (arr[i]%2==0)	//-- arr의 i번째의 해당 요소가 짝수라면...

			{

				System.out.print(arr[i] + " ");		//--==>> 4 2 6 8,, 짝수번째 방에 들어 있는 숫자

			}

		}

		System.out.println();
		/*짝수 선택적 출력
			4 2 6 8
		*/




		System.out.println("3의 배수 선택적 출력");

		for (int i=0; i<arr.length; i++)

		{

			if (arr[i]%3==0)

			{

				System.out.print(arr[i] + " ");

			}

		}

		System.out.println();
		/*3의 배수 선택적 출력
			9 3 6
		*/

	}

}


/*
배열 요소 전체 출력
4 7 9 1 3 2 5 6 8
짝수 선택적 출력
4 2 6 8
3의 배수 선택적 출력
9 3 6
계속하려면 아무 키나 누르십시오 . . .
*/

