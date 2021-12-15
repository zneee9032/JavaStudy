/*==============================================
	■■■ 정렬(Sort) 알고리즘 ■■■
================================================*/
/*
사용자로부터 여러 학생의 성적 데이터를 입력받아
점수가 높은 순에서 낮은 순으로 등수를 부여하여
결과를 출력하는 프로그램을 구현한다
단, 배열과 정렬 알고리즘을 활용하여 작성 할 수 있도록 한다.

//실행 예)
인원 수 입력: 5
이름 점수 입력 (1): 김진령 90
이름 점수 입력 (2): 장진하 80
이름 점수 입력 (3): 이윤서 85
이름 점수 입력 (4): 이찬호 75
이름 점수 입력 (5): 정미화 95

-----------------------
1등	정미화 95
2등	김진령 90
3등	이윤서 85
4등 장진하 80
5등	이찬호 75
-----------------------
계속하려면 아무 키나 누르세요..
*/
import java.util.Scanner;
import java.io.IOException;

public class Test106
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		int n;		// 학생수
		int i=1;	// 학생수를 1로 초기화
		int j;
		
		// 인원 수 입력받기
		System.out.print("인원 수 입력 : ");
		n = sc.nextInt();


		// 인원 수 만큼 배열방 만들기
		String name[] = new String[n];	//-- 이름
		int score[] = new int[n];		//-- 점수
		int grade[] = new int[n];		//-- 석차
		String temp;


		// 이름, 점수 입력받기
		do
		{
			System.out.print("이름 점수 입력(" + i + ") : ");
			name[i-1] = sc.next();
			score[i-1] = sc.nextInt();
		}
		while (i++<n);


		// 선택 정렬
		for (i=0; i<n-1; i++)					//-- 비교 기준 데이터  (-1 : 마지막은 안해도 돼서 뺌)
		{
			for (j=1+i; j<n; j++)				//-- 비교 기준 데이터  (끝까지 돌아야해서 -1 안함)
			{
				if (score[i] < score[j])		//내림 차순
				{
					score[i] = score[i]^score[j];
					score[j] = score[j]^score[i];
					score[i] = score[i]^score[j];
				
					temp = name[i];
					name[i] = name[j];
					name[j] = temp;
					// temp 구문 해결 ~!!!!!
				}
			}

		}


		// 석차 확인하기
		for (i=0; i<n; i++)
		{
			grade[i] = 1;					//-- 학생이 1등이라는 가정
			for (j=0; j<n; j++)		
			{
				if (score[i] < score[j])	// j가 i보다 높을때	
					grade[i] += 1;			// i의 등수가 높아진다
			}
		}

		// 결과 출력하기
		System.out.println("\n--------------");
		for (i=0; i<n; i++)
		{
			System.out.printf("%d등 %s %d\n", grade[i], name[i], score[i]);
		}
		System.out.println("--------------");		
	}
}

/*
인원 수 입력 : 3
이름 점수 입력(1) : 김진희 75
이름 점수 입력(2) : 김진아 87
이름 점수 입력(3) : 김지수 77

--------------
1등 김진아 87
2등 김지수 77
3등 김진희 75
--------------
계속하려면 아무 키나 누르십시오 . . .
*/