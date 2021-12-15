/*	===========================
	■■■■만년 달력■■■■
	
	===========================*/
/*
실행 예)
『연도』를 입력하세요: 2021
 『월』을 입력하세요 : 8

  [2020년 8월]

일 월 화 수 목 금 토
=====================
 1  2  3  4  5  6  7
 8  9 10 11 12 13 14
15 16 17 18 19 20 21
22 23 24 25 26 27 28
29 30 31
===================== 
*/

/*문제 분석 및 접근
- 서기 1년 1월 1일 : 월요일
- 연도가 4의 배수이면서 100의 배수가 아니거나.400의 배수이면 2월은 29일 (윤년)
		나머지 2월 28일(평년)
- 만약 2021년 8월 달력을 그린다고 가정하면
	1.1.1 ~ 2021.7.31 까지의 날 수를 구한다.
	그 날 수에 『+1』 연산을 수행하면 (1.1.1 ~ 2021.8.1) 날 수 확인
	이 날 수를 통해 2021년 8월 1일의 요일 확인

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Test101
{
	public static void main(String[] args) throws IOException
	{
	// BufferedReader 인스턴스 생성
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	//배열 선언 및 초기화
	//각 달이 담고 있는 마지막 날짜에 (매월의 최대 날짜)
	int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
	//확인
	//System.out.println(days.length);
	//===> 12

	//변수 선언
	int nalsu,y,m,w;
	

	do
	{
		System.out.print("『연도』를 입력하세요: ");
		y = Integer.parseInt(br.readLine());
	}
	while (y<1);

	do
	{	System.out.print("『월』를 입력하세요: ");
		m = Integer.parseInt(br.readLine());
	}
	while (m<1 || m>12);

	//=======================================>여기 까지 수행하면 유효한 년도,월 입력한 상태
	
	if (y%4==0 && y%100!=0 || y%400==0)
	{
		days[1] =29;
	}
	//else구문은
	//현재 days[1]가 28로 입력 되어있는 상태이기 떄문에 생략 가능

	//1년 1월 1일~ 입력받은 년도 이전년도의 12월31일까지의 날수 계산
	nalsu = (y-1) * 365 + (y-1)/4 - (y-1)/100 + (y-1)/400;

	//입력 받은 년도(해당년도) 1월 1일 ~입력한 월의 이전월까지의 날수 누적 연산

	for (int i =0 ;i<(m-1) ;i ++ )
	{
			nalsu +=days[i];
	}
		//입력 받은월의 1일
		nalsu +=1;			//++nalsu
		//확인
		//System.out.println(nalsu);
		//『연도』를 입력하세요: 2021
		//『월』를 입력하세요: 8
		//738003
//---------------------------------------------------> 여러가지 수행하면 모든 날 수에 대한 종합완료~!

		//요일 산출
		//: 입력받은 월의 1일이 무슨 요일인지 확인 하기 위한연산
		w = nalsu % 7;
		System.out.println(w);
		//『연도』를 입력하세요: 2021
		//『월』를 입력하세요: 8
		//0 --------------------->2021년 8월 1일은 일요일~!!!

		//출력 달력그리기
		System.out.println();
		System.out.printf("/t %y %m",y,m);
		System.out.println();
		System.out.println();
		System.out.println(" 일 월 화 수 목 금 토");
		System.out.println("=========================");
		//특정 요일 부터 1일이 출발 할 수 있도록 공백 발생 (지정)
		for (int i=1; i<=w; i++ )
		{
			System.out.print("    ");	//네칸 공백
		}

		
		//해당 월 (입력한 월)의 날짜만 출력 될 수 있도록 반복문 구성
		for (int i=1; i<=days[m-1]; i++ )
		{
			System.out.printf("%4d",i);	//1 2 3 4 5 6...31
			w++;
		
		//날짜를 하나씩 처리할 때 요일도 하나씩 증가 
		if (w%7==0)//일요일
			{
				System.out.println();		//개행
			}
		
		}
		//달의 마지막 날짜가 출력 형식을 모두 채웠을 경우
		//이미 일요일 개행이 이루어졌기 때문에 추가 개행을 하지 않도록 처리
		if (w%7!=0)
			
			System.out.println();
			System.out.println("=====================");


	}
}






