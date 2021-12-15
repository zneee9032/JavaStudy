/*=======================================
  ■■■ 자바의 주요(중요) 클래스 ■■■ 2021-08-11
  - Calendar 클래스
  - GregorianClaender()
  - 날짜더하기 프로그램
=======================================*/
/*
실습문제
오늘을 기준으로 입력받는 날짜만큼 후의 
년,월,일,요일을 확인하여
결과를 출력하는 프로그램을 구현한다

실행 예)
오늘 날짜 : 2021-8-11 수요일 (출력)
몇일 후의 날짜를 확인하고자 하십니까 : 200

//////////////[확인 결과]==================
200일 후 : xxxx-xx-xx x요일
===========================================

현재 날자를 기준으로 날 수를 더하는 연산 메소드
『객체.add(Calendar.DATE, 날 수);』
계속하려면 아무 키나 누르세요*/

import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Test139

{
	public static void main(String[] args)

	{

		// 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		Calendar ob = new GregorianCalendar();

		
		// 주요 변수 선언
		int y, m, d, w, days;
		String[] week = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};


		// 현재 날짜 확인하기

		y = ob.get(Calendar.YEAR);
		m = ob.get(Calendar.MONTH)+1;	
		d = ob.get(Calendar.DATE);
		w = ob.get(Calendar.DAY_OF_WEEK)-1;


		// 현재날짜 출력
		System.out.printf("오늘 날짜 : %d-%d-%d %s\n", y, m, d, week[w]);


		// 입력받기
		do

		{

			System.out.print("몇 일 후의 날짜를 확인하고자 하십니까? : ");
			days = sc.nextInt();

		}

		while (days<1);


		// 연산 및 출력
		//ob.add(Calendar.DATE, days);	//-- 입력받은 날짜를 더해준다.
		// 초기화 없이 바로 처리하는 법
		ob.add(Calendar.DATE, days);


		// 다시 초기화하기
		y = ob.get(Calendar.YEAR);
		m = ob.get(Calendar.MONTH)+1;	
		d = ob.get(Calendar.DATE);
		w = ob.get(Calendar.DAY_OF_WEEK)-1;


		// 확인결과 출력

		System.out.println("\n===========[확인결과]===========");
		System.out.printf("%d일 후 : %d-%d-%d %s\n", days, y, m, d, week[w]);
		System.out.println("================================");


		// 초기화 없이 바로 처리하는 법
		System.out.println("\n===========[확인결과]===========");
		System.out.printf("%d일 후 :%tF %tA\n", days, ob, ob);	
		System.out.println("================================");

		//-- 만년타입은 숫자타입으로 계산한거고 이건 날짜를 불러오는거라
		//   %tF %tA 는 날짜, 요일 불러오는 거임

	}

}


/*
오늘 날짜 : 2021-8-11 수요일
몇일 후의 날짜를 확인하고자 하십니까 :200

===========[확인결과]===========
200일 후 : 2022-2-27 일요일
================================
계속하려면 아무 키나 누르십시오 . . .

*/