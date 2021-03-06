/*============================================================
■■■실행 흐름의 컨트롤 (제어문, 조건문과 반복문)■■■
-반복문(for문) 실습
- 다중 for문(반복문의 중첩)을 활용한 구구단 출력 실습
===========================================================*/
/*========================================================
 ■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
  - 반복문(for문) 실습
  - 별찍기 실습
=========================================================*/

// 과제
// 다음과 같은 내용이 출력될 수 있도록 반복문의 중첩 구문을 작성한다

// 실행 예)
/*
				공백	*
*********		 0		9
 *******		 1		7
  *****			 2		5
   ***			 3		3
    *			 4		1

*/

public class Test058
{
	public static void main(String[] args)
	{
		for (int i=1; i<=5; i++) // 총 5줄 출력
		{
			for (int a=1; a<i; a++)
				// n번째 줄의 공백 출력 반복횟수는 숫자 n보다 정수 1씩 작게 해주면 됨
			{
				System.out.print(" ");
			}

			for (int b=9; b>=(2*i-1); b--)
				// * 출력 반복횟수는 첫번째 줄(i=1)에서 9, 두번째 줄(i=2)에서 7, ... 2씩 감소함
			{
				System.out.print("*");
			}

			System.out.println(); // 한 줄씩 출력하고 줄바꿈
		}
		
	}
}

/*

*********
 *******
  *****
   ***
    *
계속하려면 아무 키나 누르십시오 . . .
*/
