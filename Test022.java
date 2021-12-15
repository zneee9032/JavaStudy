/*=============================
연산자(operator)

비트 단위 연산자 & | ^
==============================*/

public class Test022
{
	public static void main(String[]args)
	{
		// 주요 변수 선언
		int a =13, b  =7;
		int c, d, e;

		// 연산 및 처리
		c = a & b;		// ⓐ & : 둘 다 1일때 1							『and』=> 가족 구성원은 김진희 그리고 김진아
		d = a | b;		// ⓑ | : 둘 중 하나가 1이면 1					『or』 => 내가 좋아하는 가수는 오스틴이거나 lauv? 
		e = a ^ b;		// ⓒ ^ : 서로 다를때 1, 서로 같을 때 0		

		//결과 출력
		System.out.printf("a & b : %d\n", c);
		System.out.printf("a | b : %d\n", d);
		System.out.printf("a ^ b : %d\n", e);

	}
}
/* 처리결과
a & b : 5
a | b : 15
a ^ b : 10
계속하려면 아무 키나 누르십시오 . . .*/

/* 처리과정
ⓐ	13 →00001101
  &  7 →00000111
  ----------------
         00000101 →5

		 
ⓑ	13 →00001101
  |  7 →00000111
  ----------------
         00001111 →1+2+4+8 = 15

ⓒ
	13 →00001101
  ^  7 →00000111
  ----------------
         00001010 →2+8 =10
 
*/