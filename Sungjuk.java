/*	=========================
	■■■■클래스와 인스턴스■■■■
	- 클래스와 인스턴스활용
	========================= */
/*학생 별로 국어점수, 영어점수, 수학점수를 입력받아
총점,평균을 게산하는 프로그램을 구현한다.
단,클래스의 개념을 활용하여 작성할 수 있도록 한다
또한, 이과제에서 배열을 적극적으로 활용할 수 있도록 한다*/

/*
2. Sungjuk 클래스
-인원 수를 입력 받아,입력받은 인원 수 만큼
이름, 국어점수,영어점수, 수학점수를 입력받고
총점과 평균을 산출하는 클래스로 설계 할것
		-속성 : 인원수,Record 형태의 배열
		-기능 : 인원 수 입력 ,상세 데이터 입력, 총점 및 평균 연산, 결과 출력
*/


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.IOException;
import java.util.Scanner;

class Sungjuk

{	

	//주요 속성 구성(주요 변수 선언)

	int inwon;			//-- 인원 수
	Record[] rec;		//-- Record 배열(학생 1명 당 Record배열의 방 1개 활용)
						//Record를 기반으로 생성된 객체만 담아 낼 수 있는 배열

//==================================================================================================

	//인원 수 입력 ,상세 데이터 입력, 총점 및 평균 연산, 결과 출력

	String[] title = {"국어 점수 : ", "영어 점수 : ", "수학 점수 : "};

	//주요 메소드 정의(기능 구성)

	// ① 인원 수 입력

	public void set()					//public void set(int inwon)

	{
		//Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		do			//do while 문? 왜 사용?_________>한번 입력하고나서 다시 사용할거여서!

		{

			System.out.print("인원 수 입력(1~100) : ");
			inwon = sc.nextInt();

		}

		while (inwon<1 || inwon>100);			//인원수가 1보다 작거나 인원수가 100보다 많을때 


		// ★★★★★★★Check~!!★★★★★★★
		// Record 클래스를 기반으로 생성된 객체(인스턴스)를 담을 수 있는 배열방을
		// inwon 만큼 생성
	
		rec = new Record[inwon]; //-------------> rec이라는 그릇안에 빈공간
		
		//Record배열방을 inwon만큼 생성한것이지
		//Record 클래스의 인스턴스를 생성한 것은 아니다.


	}//end set()


	// 주요 메소드 정의 (기능구성)
	// ② 상세 데이터 입력 + 총점/평균 산출

	public void input()					//void 입력받은 값을 배열방에 넣을것이기 때문이다 return 자료는 void

	{
		//Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		
		//인원수만큼 반복 → 인원수애 기반하여 만들어진 배열의 길이 만큼 반복
		for (int i=0; i<inwon; i++)	//for (int 1=0 ; i <rec.length; i++)

		{
			/*
			system.out.print("이름 입력 : ");
			rec배열의 i번째방의 이름 = sc.next();

			System.out.print("국어점수 입력 : ");
			rec배열의 i번째방의 국어 = sc.next();

			System.out.print("영어점수 입력 : ");
			rec배열의 i번째방의 영어 = sc.next();

			System.out.print("수학점수 입력 : ");
			rec배열의 i번째방의 수학 점수 = sc.next();

			rec[i] = ob;
			rec[i] = name;
			rec[i] = tot;
			*/


			// Check~!!!
			// Record 클래스 기반의 인스턴스 생성

			rec[i] = new Record();		//-- ★ Record ob1 = new Record() rec[i] =ob;

			

			System.out.printf("%d번째 학생의 이름 입력 : ", (i+1));			//87번 구문~!
			rec[i].name = sc.next();

			



			for (int j=0; j<title.length; j++)	//국,영,수 과목수 만큼 반복~!!! 
			{

				// 안내 메세지 출력
				System.out.print(title[j]);


				// 사용자가 입력한 데이터를 스코어(score) 배열에 담아내기
				rec[i].score[j] = sc.nextInt();			//i번째 학생의 score[0] -> 국어점수
														//i번째 학생의 score[1] -> 영어점수
														//i번째 학생의 score[2] -> 수학점수


				// 국어, 영어, 수학 점수 데이터를 반복적으로 입력받는 동안
				// 총점 누적하기

				rec[i].tot += rec[i].score[j];

			}


			// 평균 산출하기

			rec[i].avg =  rec[i].tot / 3.0;

		}

	}// end input()



	// 주요 메소드 정의(기능구성)
	// ③ 결과 출력

	
	public void print()			//매개변수 없어도 됌

	{
				// 개행
		System.out.println();

		// 석차 산출 메소드 호출구문 추가~!!
		ranking();

		// 학생 1인 당 반복 출력 구문
		for (int i=0; i<inwon; i++)
		{

			// 이름 출력
			System.out.printf("%5s", rec[i].name);


			// 성적(국어, 영어, 수학) 반복 출력
			for (int j=0; j<3; j++)
				System.out.printf("%4d", rec[i].score[j]);



			// 총점, 평균 출력
			System.out.printf("%5d", rec[i].tot);
			System.out.printf("%8.2f", rec[i].avg);


			// 석차 출력구문 추가~!!(구문 추가)
			System.out.printf("%5d", rec[i].rank);

			// 개행
			System.out.println();



		}

	}//end print()




	// ④ 석차 산출 메소드 추가~!!!
	// - Racord 배열의 rank 속성을 초기화 기능 → 반환자료형 void
	// - 클래스 내부적으로 활용할 메소드 정의 → 접근제어지시자 private → 외부에서 호출 불가!

	private void ranking()			//반복문 중첩!


	{
		int i, j;					//루프변수 선언

		// 모든 학생들의 등수(석차, rank)를 1로 초기화		
		for (i=0; i<inwon; i++)		

			rec[i].rank = 1;		


		// 등수 산출... ex)4人

		for (i=0; i<inwon-1; i++)		//비교 기준이 될 데이터 ==>   0    1     2

		{														//   ㅣ   ㅣ    ㅣ

			for (j=i+1; j<inwon; j++)	//비교 대상이 될 데이터 ==>  123   23    3

			{

				//비교기준의 평균이 비교대상의 평균보다 크다면
				if (rec[i].avg > rec[j].avg) 
				{

					//비교데이터의 rank 를 1만큼 증가
					rec[j].rank++;
				}
				
				//비교대상의 평균이 비교기준의 평균보다 크다면
				else if (rec[j].avg > rec[i].avg) 
				{
					//기준데이터의 rank 를 1만큼 증가
					rec[i].rank++;

				}

			}

		}

	}//end ranking()

}
