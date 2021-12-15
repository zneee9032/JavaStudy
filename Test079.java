/*========================
	■■■배열■■■
-배열의 기본적 활용
==========================*/
/*
○과제
사용자로부터 학생 수를 입력 받고
그만큼의 점수(정수 형태)를 입력받아
전체 학생 점수합, 평균,편차를 구하여 결과를 출력하는 프로그램을 구현한다
단, 배열을 활용하여 처리할 수 있도록 한다

실행 예)
학생 수 입력 : 5
1번 학생의 점수 입력 : 90
2번 학생의 점수 입력 : 82
3번 학생의 점수 입력 : 64
4번 학생의 점수 입력 : 36
5번 학생의 점수 입력 : 98

>>합 :370
>>평균 :74.0
>>편차
90 : 16.0
82 : 8.0
64 : -10
36 : -38
98 : 24
계속하려면 아무키나 누르세요*/

import java.util.Scanner;

public class Test079

{

	public static void main(String[] args)

	{

		// 주요 변수 선언

		Scanner sc = new Scanner(System.in);

		int n; // 입력받을 정수

		int sum=0; // 합을 담을 변수

		double avr; // 평균을 담을 변수




		// 입력 받기

		System.out.print("학생 수 입력 : ");

		n = sc.nextInt();




		// 배열 크기 선언

		int arr[] = new int[n];




		// 입력받고 연산 및 처리

		for (int i=0; i<n; i++)

		{

			System.out.print((i+1)+"번 학생의 점수 입력 : ");

			arr[i] = sc.nextInt();

			sum += arr[i];

		}

		avr= sum/n;




		// 결과 출력

		System.out.printf("\n>> 합 : %3d\n", sum);

		System.out.printf(">> 평균 : %3.1f\n", avr);

		System.out.printf(">> 편차 : \n");




		// 편차 연산 및 출력

		for (int i=0; i<n; i++)

			System.out.printf("%d : %.1f\n", arr[i], avr - arr [i]);

	}

}
/*실행 결과
학생 수 입력 : 4
1번 학생의 점수 입력 : 90
2번 학생의 점수 입력 : 89
3번 학생의 점수 입력 : 78
4번 학생의 점수 입력 : 68

>> 합 : 325
>> 평균 : 81.0
>> 편차 :
90 : -9.0
89 : -8.0
78 : 3.0
68 : 13.0
계속하려면 아무 키나 누르십시오 . . .*/