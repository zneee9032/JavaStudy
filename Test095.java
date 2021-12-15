/*==============================
  ■■■ 클래스와 인스턴스■■■
  - 클래스 설계
  - 배열 활용
  - 정보 은닉과 접근제어지시자
==============================*/

/*
사용자로부터 년, 월, 일을 입력 받아
해당 날짜의 요일을 출력하는 프로그램을 구현한다.
단, 달력 클래스(claendar)는 사용하지 않는다.
또한, 클래스의 개념을 활용하여 작성할 수 있도록 한다. (→ WeekDay 클래스 설계)
그리고, 배열의 개념도 적용시켜 작성할 수 있도록 한다.
접근제어지시자의 개념도 확인하여 작성할 수 있도록 한다.
최종적으로...
WeekDay 클래스 설계를 통해
Test095 클래스의 main() 메소드가 정상적으로 프로그램 실행될 수 있도록 한다.

실행 예)
년 월 일 입력(공백 구분):

1999년 3월 20일 → x요일
계속하려면 아무 키나 누르세요...

※ 1년 1월 1일 → 월요일
※ 1년은 365일이 아닐 때도 있다.
	→ 윤년 : 4로 나누어 떨어지지만, 100으로 나누어 떨어지지 않는데, 400으로 나누어 떨어지면 
*/

import java.util.Scanner;
import java.io.IOException;

class WeekDay
{
	private int year, month, day;

	// 날짜를 입력
	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("년 월 일 입력(공백 구분): ");
	
		this.year = sc.nextInt();
		this.month = sc.nextInt();
		this.day = sc.nextInt();
	}

	// 요일을 계산
	String week()
	{		
//	[나의 풀이]
/*		int[] months = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] weekNames = {"일", "월", "화", "수", "목", "금", "토"};
		String week = " ";
		int yunYear = 0;
		int date = 0;


		// 제시된 년도까지 윤년이 몇 번 있었는지 확인
	//	for (int i=0; i<this.year-1; i++)
	//	{
	//		if (i%4==0 && i%100!=0 || i%400==0)
	//			yunYear++;
	//	}

		// 제시된 년도의 윤년 여부 후 2월 채우기
		if (this.year%4==0 && this.year%100!=0 || this.year%400==0)
			months[1] = 29;
		else 
			months[1] = 28;


		// 날짜 수 계산
		// 1. 작년까지 날짜 수
		date += (this.year-1) * 365 + yunYear;		
		
		// 2. 저번 달까지 날짜 수
		for (int i=0; i<this.month-1; i++)	
			date += months[i];

		// 3. 이번 달까지 날짜 수
		date += this.day;

		// 요일 계산
		week = weekNames[date%7];

		// 값 반환
		return week;
*/
//	[함께 풀이]
		int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] weekNames = {"일", "월", "화", "수", "목", "금", "토"};
		int nalsu;

		// 윤년에 따른 2월의 날 수 계산
		// 입력년도가 윤년이라면... 2월의 마지막 날짜를 29일로 설정
		// 입력년도가 평년이라면... 2월의 마지막 날짜를 28일로 설정
		if (this.year%4==0 && this.year%100!=0 || this.year%400==0)
			months[1] = 29;
		else 
			months[1] = 28;


		// 1. 1년 1월 1일 부터 입력받은 년도의 이전 년도 12월 31일 까지의 날 수 계산
		//					   -------------------------
		//								year-1
		//  ex) 2021.7.30 → 1.1.1 ~ 2020.12.31
		nalsu = (year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400;

		// 테스트
		//System.out.println("날수: " + nalsu);
		//--==>>년 월 일 입력(공백 구분): 2021 7 30
		//		날수: 737790


		// 2. 입력받은 월의 이전 월 까지의 날 수 계산 후
		//    이 계산 결과를 1번 결과에 더하는 연산
		for (int i=0; i<this.month-1; i++)			//-- i<(m-1) check~!!!
			nalsu += months[i];

		// 3. 입력받은 일의 날짜만큼 날 수 계산 후
		//    2번 결과에 더하는 연산
		nalsu += day;

		//-------------------------------------- 여기까지 수행하면 날 수 연산 끝~!!

		int w = nalsu % 7;		// 전체날수 % 7 == 0 → 월요일
		
		return weekNames[w];
	}
	

	void print(String w)
	{
		System.out.printf("※ %d년 %d월 %d일 → %s요일\n", this.year, this.month, this.day, w);
	}
}


public class Test095
{
	public static void main(String[] args) throws IOException
	{
		WeekDay ob = new WeekDay();
		ob.input();

		String result = ob.week();
		ob.print(result);
	}
}

/*
년 월 일 입력(공백 구분): 1996 8 16
※ 1996년 8월 16일 → 금요일
계속하려면 아무 키나 누르십시오 . . .

년 월 일 입력(공백 구분): 2021 7 14
※ 2021년 7월 14일 → 수요일
계속하려면 아무 키나 누르십시오 . . .

년 월 일 입력(공백 구분): 2021 12 24
※ 2021년 12월 24일 → 금요일
계속하려면 아무 키나 누르십시오 . . .
*/