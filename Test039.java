/*============================================================
■■■실행 흐름의 컨트롤 (제어문, 조건문과 반복문)■■■
-반복문(for,while, do ~while 문) 실습
===========================================================*/

/*
반복문의 개요

주어진 『참』인 경우
일정 영역의 문장들을 반복 수행하다가
조건식이 거짓이 되는 순간이 오면,
반복 수행을 중단 하는 문장이다

이러한 반복문에는 『while』,『do~while』,『for』문 등이 있으며
반복문의 제어를 위해 『break』,『continue』문을
사용하는 경우가 있다

1)while문

조건식을 먼저 비교하여
조건식의 처리 결과가 참인 경우, 특정영역을 반복 수행하는 문장으로
반복 횟수가 정해져 있지 않은 경우나
반복 횟수가 많은 경우 주로 사용한다
while문은 조건이 맞지 않은 경우
반복은 커녕 단 한 번도 실행 되지 않을 수 있다

○while문의 형식 및 구조

while(조건식)
{
		//반복 실행문;
}
*/




public class Test039
{
	public static void main(String[] args)
	{
/*
		int n=0;
		while (n<=10)
		{
			System.out.println(" n = " + n);
			n++;
		}--------------------------------------------------->ⓐ0부터 10까지 출력
*/
		/*
		int n=0;
		while (n<=10)
		{
			n++;--------------------------------------------------->n이 0일때, 1을 증가 시켜 1부터 출력
			System.out.println(" n = " + n);
			
		}--------------------------------------------------->ⓑ1부터 11까지 출력
*/

		/*
		int n=0;
		while (n++<=10)--------------------------------------------------->n이 0일때, 1을 증가 시켜 1부터 출력
		{
			
			System.out.println(" n = " + n);
			
		}--------------------------------------------------->ⓒ1부터 11까지 출력
*/
		/*
		int n=0;
		while (n++<=10)--------------------------------------------------->n이 0일때, 1을 증가 시켜 1부터 출력
		{
			
			System.out.println(" n = " + ++n);--------------------------------------------------->n이 1로 출력 되고나서 또, 1을 증가 시켜 2부터 출력
			
		}---------------------------------------------------> ⓓ2부터 출력 →4 출력→6 출력→8 출력→10 출력→12 출력
*/



		//1부터 100 까지의 합을 계산하여
		//결과를 출력하는 프로그램을 작성한다
		//단, while 반복문을 사용한다

		//실행 예)
		//1부터 100까지의 합: 5050
		// 계속하려면 아무키나 누르세요

																	/*
																	문제 인식 및 분석
																	1. 출력 구문이 반복문의 영역 밖에 위치해야 한다
																	2. 1부터 1씩 증가 할 변수와 누적합을 담을 변수 두개의 변수가 필요하다
																	*/


		//1부터 차례로 담아 1씩 증가 하는 변수 선언 및 초기화
		int n=1;

		// 누적합을 계산하여 담아낼 변수 선언 및 초기화				★누적합일때는 0으로 초기화/누적 곱일때는 1로 초기화
		int sum = 0;

		//연산 및 처리 (반복문 구성)
		while (n<=100)
		{
			//sum을 n 만큼 증가 시켜라
			sum += n;

			//n이 1씩 증가해 나가는 연산필요=========================>끝마치는 식
			n++;
		}
		//결과 출력
		System.out.println("1부터 100까지의 합 = " + sum);

	}
}

/*
1부터 100까지의 합 = 5050
계속하려면 아무 키나 누르십시오 . . .
*/