/*=========================
  ■■■ 클래스 고급 ■■■
  - 인터페이스(Interface)
=========================*/
/*
○ 실습 문제
성적 처리 프로그램을 구현한다.
단, 인터페이스를 활용할 수 있도록 한다.

실행 예)
인원 수 입력(1~10): 2
1번째 학생의 학번 이름 입력(공백 구분): 2108006 권순모
국어 영어 수학 점수 입력   (공백 구분): 90 100 85
2번째 학생의 학번 이름 입력(공백 구분): 2108024 김소연
국어 영어 수학 점수 입력   (공백 구분): 85 70 65

2108006 권순모		90  100  85		275		91
					수   수  우
2108024 김소연		85   70  65		220		73
					우	 미  양

계속하려면 아무 키나 누르세요 . . .
*/

import java.util.Scanner;
import java.io.IOException;


// 속성만 존재하는 클래스 → 자료형 활용
class Record
{
	String hak, name;		//-- 학번, 이름
	int kor, eng, mat;		//-- 국어, 영어, 수학
	int tot, avg;			//-- 총점, 평균(편의상 정수 처리)
}


// 인터페이스
interface Sungjuk
{
	public void set();		//-- 인원 수 구성
	public void input();	//-- 상세 데이터 입력
	public void print();	//-- 결과 출력
}


// 문제 해결 과정에서 설계해야 할 클래스 → Sungjuk 인터페이스를 구현하는 클래스
class SungjukImpl implements Sungjuk 
{
	Record[] rec;
	int mem;

	@Override
	public void set()
	{
		do
		{
			System.out.print("인원 수 입력(1~10): ");
			Scanner sc = new Scanner(System.in);
			mem = sc.nextInt();
		}
		while (mem<1 || mem>10);		
	}

	@Override
	public void input() 
	{
		Scanner sc = new Scanner(System.in);
		rec = new Record[mem];

		for (int i=0; i<rec.length; i++)
		{
			rec[i] = new Record();

			System.out.printf("%d번째 학생의 학번 이름 입력(공백 구분): ", i+1);
			rec[i].hak  = sc.next();
			rec[i].name = sc.next();
			System.out.print("국어 영어 수학 점수 입력   (공백 구분): ");
			rec[i].kor = sc.nextInt();
			rec[i].eng = sc.nextInt();
			rec[i].mat = sc.nextInt();

			rec[i].tot = rec[i].kor + rec[i].eng + rec[i].mat;
			rec[i].avg = rec[i].tot / 3;
		}
	}

	String grade(int s)
	{
		String result;
		
		switch (s/10)
		{
			case 10 : result = "수"; break; //100
			case  9 : result = "수"; break; //90~99
			case  8 : result = "우"; break; //80~89
			case  7 : result = "미"; break;
			case  6 : result = "양"; break; 
			default : result = "가"; break;		
		}

		return result;
	}


	@Override
	public void print()
	{
		for (int i=0; i<rec.length; i++)
		{
			System.out.printf("%4s %4s %3d %3d %3d \t%3d %3d\n",
							rec[i].hak, rec[i].name, rec[i].kor, rec[i].eng, rec[i].mat,
							rec[i].tot, rec[i].avg);
			System.out.printf("\t\t%2s  %2s  %2s\n", 
							grade(rec[i].kor), grade(rec[i].eng), grade (rec[i].mat));
		}

		System.out.println();
	}
}


public class Test117
{
	public static void main(String[] args) throws IOException
	{
		Sungjuk ob = new SungjukImpl();

		// 문제 해결 과정에서 작성해야 할 ob 구성

		ob.set();
		ob.input();
		ob.print();
	}
}
