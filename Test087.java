/*	=========================
	■■배열■■
	- 배열의 배열(2차원 배열)
	========================= */
/*
과제

배열의 배열 (다차원 배열)을 활용하여
다음과 같은 데이터를 요소로 취하는 배열(5*5)을 구성하고
그 결과를 출력하는 프로그램을 구현한다

실행 예)
A B C D E 
F G H I J 
K L M N O
P Q R S T
U V W X Z

계속하려면 아무키나 누르세요

*/
public class Test087
{
	public static void main(String[] args)
	{
		int arr[][] = new int[5][5];	

		int a = 65;			//대문자 a는 아스키 코드 65

		for (int i=0; i<5; i++)
		{
			for (int j=0; j<5; j++)
			{
			arr[i][j]= a++;
			}
		}


		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			
				System.out.printf("%2c", arr[i][j]);
			
			System.out.println();
		}
	}
}
/*
실행 결과
 A B C D E
 F G H I J
 K L M N O
 P Q R S T
 U V W X Y
계속하려면 아무 키나 누르십시오 . . .
*/