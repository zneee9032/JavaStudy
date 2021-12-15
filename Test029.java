/*============================================================
■■■실행 흐름의 컨트롤 (제어문, 조건문과 반복문)■■■
-if ~ else 문 실습
===========================================================*/
/*
사용자로 부터 이름, 국어점수, 영어점수, 수학점수를 입력받아
다음과 같은 형태로 출력하는 프로그램을 작성한다
등급은 평균 점수를 기준으로 산출하여 처리한다

90점 ~100점 : A
80점 ~ 89점 : B
70점 ~ 79점 : C
60점 ~ 69점 : D
60점 미만 :F

단, BufferedReader를 활용하여 데이터를 입력 받을 수 있도록 하며
printf()메소드를 통해 출력할 수 있도록 구현한다.

실행 예)
이름 입력 : 김진희
국어 점수 : 90
영어 점수 : 80
수학 점수 : 70

>>당신의 이름은 김진희 입니다.
>>국어 점수는 90,
>>영어 점수는 80,
>>수학 점수는 70,
>>총점은 240이고, 평균은 80입니다.
>>등급은 B입니다.
계속 하려면 아무키나 누르세요*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test029
{
	public static void main(String[] args) throws IOException
	{
		
		// 주요 변수 선언
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		String name;
		int Kor, Eng, Mat, Tot; 
		double Avr;
		char Grade;

		// 연산 및 처리
		System.out.print("이름 입력 : ");		//이름 입력
		name = br.readLine();
	
		System.out.print("국어 점수 : ");		//국어 점수 입력
		Kor = Integer.parseInt(br.readLine());

		System.out.print("영어 점수 : ");		//영어 점수 입력
		Eng = Integer.parseInt(br.readLine());

		System.out.print("수학 점수 : ");		//수어 점수 입력
		Mat = Integer.parseInt(br.readLine());
	
		Tot = (Kor + Eng + Mat) ;				// 총점 구하기
		Avr = Tot /3.0 ;						// 평균 구하기

		//등급 구분

		if (Avr >= 90)
		{	Grade = 'A';
		}	
			else if ( Avr >=80 ) 
		{	Grade = 'B';
		}
			else if ( Avr >=70 )
		{	Grade = 'C';
		}
			else if ( Avr >=60 )
		{	Grade = 'D';
		}
			 else
        {	Grade = 'F';	
		}									/*끝은 else 로 마치는게 당연 하지 않다. 
										지금 상황은 BufferedReader가 주는 애매모호 값을 받아 출력
										 출력만 하는 if else구문이라면 끝이 else if 가능	*/
		
		
		// 결과 출력
		System.out.printf("\n당신의 이름은 %s 입니다.\n" , name);
		System.out.printf("국어 점수는 %d\n" , Kor);
		System.out.printf("영어 점수는 %d\n" , Eng);
		System.out.printf("수학 점수는 %d\n" , Mat);
		System.out.printf("총점은 %d이고, 평균은 %.0f입니다.\n" , Tot, Avr);
		System.out.printf("등급은 %c 입니다.\n" , Grade); 


		}
}