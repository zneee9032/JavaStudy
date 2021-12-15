/*========================
	■■■배열■■■
-배열 선언과 초기화  
==========================*/
/*※ 실습 문제

   『char』자료형의 배열을 만들어 알파벳 대문자를 채우고 채워진 배열의 전체 요소를 출력하는 프로그램을 구현한다.
	단, 채우는 구문과 출력하는 구문을 따로 분리하여 처리한다

	실행 예)
	A B C D F G ... W X Y Z
	계속하시려면 아무키나 누르세요

	*/

public class Test076

{

	public static void main(String[] args)

	{
		// 영문 알파벳 대문자 배열 구성
		char[] arr = new char[26];

		
		for (int i=0, ch=65; i<arr.length; i++, ch++)	
		

			arr[i] = (char)ch;		//(char)65; (char)66; (char)67....(char)90;			



		//배열 요소 전체 출력

		for (int i=0; i<arr.length; i++)

		{

			System.out.printf("%2c" , arr[i]);

		}

		System.out.println();

	}

}
/*
 A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
계속하려면 아무 키나 누르십시오 . . .
*/