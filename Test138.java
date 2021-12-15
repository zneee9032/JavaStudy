/*============================================================
			 ■■■ 자바의 주요(중요) 클래스 ■■■ 2021-08-10

○Calendar클래스
===============================================================*/

/*
★ Calendar클래스는 추상클래스이다! => 객체생성 x
	(추상 클래스 : 미완성 된 클래스)

	Claendar ob =  new Calendar();
	-> 이와 같은 구문을 통해 인스턴스 생성 불가

★Calender객체(인스턴스) 를 생성할 방법

1. Calendar ob 1 = Calendar.getInstance();			=>정적메소드, Static클래스

2. Calendar ob2 = new GregorianCalendar();			=> Calendar의 하위 클래스? 업캐스팅~!

3. GregorianCalendar ob3 = new GregorianCalendar();
	(GregorianCalendar : Calendar클래스의 하위 클래스)

*/

// 현재의 년, 월,일, 요일을 Calendar 객체를 활용하여 출력

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test138
{
	public static void main(String[] args)
	{
		//Calendar 클래스 인스턴스 생성
		//Calendar rightNow = new Calendar();			안된다!
		Calendar rightNow = Calendar.getInstance();


		//생성된 달력 (Claendar)인스턴스를 통해
		//날짜 관련 정보를 얻어낼 수 있는 메소드 -> 『get』

		int y = rightNow.get(Calendar.YEAR);			//YEAR는 static과 final이 붙은 상수화된 변수임을 짐작  (class변수)	
		System.out.println(y);//==> 2021

				
		int m = rightNow.get(Calendar.MONTH)+1;		   //MONTH는 배열의 형태로 처리되고 있다. 『+1』을 해줘야지 해당 월이 나온다 Check~!!
		System.out.println(m);//==>> 8



		int d = rightNow.get(Calendar.DATE);
		System.out.println(d);//==>>10


		int w = rightNow.get(Calendar.DAY_OF_WEEK);	//배열의 값을 가지고 있다
		System.out.println(w);//==>> 3				화요일 = 3... 

		System.out.println(y + "-" + m + "- " + d + " " + w);
		//2021-8- 10 3

			// 테스트

		System.out.println(Calendar.SUNDAY);	//--==> 1 → 일

		System.out.println(Calendar.MONDAY);	//--==> 2 → 월

		System.out.println(Calendar.TUESDAY);	//--==> 3 → 화

		System.out.println(Calendar.WEDNESDAY);	//--==> 4 → 수

		System.out.println(Calendar.THURSDAY);	//--==> 5 → 목

		System.out.println(Calendar.FRIDAY);    //--==> 6 → 금

		System.out.println(Calendar.SATURDAY);	//--==> 7 → 토

		System.out.println();	//개행

		String week = "";
		switch (w)
		{
			case Calendar.SUNDAY: week="일요일"; break;

			case Calendar.MONDAY: week="월요일"; break;

			case Calendar.TUESDAY: week="화요일"; break;

			case Calendar.WEDNESDAY: week="수요일"; break;

			case Calendar.THURSDAY: week="목요일"; break;

			case Calendar.FRIDAY: week="금요일"; break;

			case Calendar.SATURDAY: week="토요일"; break;
		
		}
		//확인
		System.out.println(y + "년 " + m + "월" + d + "일" + week);
		//==>>2021년 8월10일화요일

		//////////////////////////////////////////////////////////////

		//Calandar 클래스 인스턴스 생성
		Calendar rightNow2 = new GregorianCalendar();
		
		String[] week2 = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};




		// 달력의 날짜 세팅 → 『set();』메소드 활용

		rightNow2.set(2021, 7, 10);	//2021-8-10 (월은 배열이라 -1)

		System.out.println(rightNow2.get(Calendar.DAY_OF_WEEK));

		//--==> 3 → 화요일




		System.out.println(week2[rightNow2.get(Calendar.DAY_OF_WEEK)-1]);

		//--==> 화요일




		rightNow2.set(1997, 9, 19);	//

		System.out.println(week2[rightNow2.get(Calendar.DAY_OF_WEEK)-1]);

		//--==> 일요일



		rightNow2.set(1999, 3, 20);	//

		System.out.println(week2[rightNow2.get(Calendar.DAY_OF_WEEK)-1]);

		//--==> 화요일

	}

}


