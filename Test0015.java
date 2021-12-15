/*===================
변수와 자료형
퀴즈
사전에 부여된 반지름 정보를 통해
원의 넓이와 둘레를 구하는 프로그램을 구현한다
->반지름 :10
=====================*/

//실행 예)
//넓이:xxx
//둘레:xxx
//계속하려면 아무 키나 누르세요

//원의 넓이 = 반지름 * 반지름 *3.141592
//원의 둘레 = 반지름 *2 *3.141592


public class Test0015
{
public static void main(String[] args)
	{
		//주요 변수 선언;
		int r =10;				// 원의 반지름 선언
		double PI= 3.141592;	// 원의 원주율 선언
		double area,length;		// 원의 넓이,둘레 선언
		

		//연산 및 처리
		area = r * r * PI;
		length = 2 * r * PI;
		
		//결과 처리
		System.out.println("넓이는" + area);
		System.out.println("둘레는" + length);

	}
}

/*
<김진희가 출력 결과>

*/