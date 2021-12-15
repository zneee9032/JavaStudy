/*===================
자바 기본 프로그래밍
-퀴즈
삼각형의 밑변의 길이와 높이를 사용자로부터 입력받아
이 삼각형의 넓이를 구하는 프로그램을 구현한다
=====================*/

//실행 예)
//삼각형의 넓이 구하기
// 삼각형의 밑변 입력 : 3
// 삼각형의 높이 입력 : 5
//>> 밑변이 3 높이가 5인 삼각형의 넓이 : xxx
//계속하려면 아무 키나 누르세요..

// * 삼각형의 넓이 = 밑변 * 높이 /2
// 
//사용자로부터 데이터를 입력받아 처리 할때 →BufferedReader 활용


import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.lang.*;
import java.io.IOException;

public class Test012
{
	//주요 변수 선언
	public static void main(String[] args) throws IOException
	{
		//BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		int bottomLength, height;		//밑변과 높이
		double area;					//넓이

	
	// 연산 및 처리
	//① 사용자에게 안내 메세지 출력
	System.out.println("삼각형의 넓이 구하기");
	System.out.print("삼각형의 밑변 입력 : ");

	//② 사용자가 입력한 데이터를 정수형태로 변환한 후
	// 변수 bottomLength 에 담아내기
	bottomLength = Integer. parseInt(br.readLine());

	//③ 다시 사용자에게 안내 메세지 출력
	System.out.print("삼각형의 높이 입력 : ");

	//④사용자가 입력한 데이터를 정수 형태로 변환한 후
	// 변수 height 에 담아내기
	height = Integer.parseInt(br.readLine());

	//⑤ 값이 채워진 (담겨진)변수들을 활용하여 
	// 삼각형의 넓이를 구하는 연산 수행
	// 삼각형의 넓이 = 밑변 * 높이 /2

	//area = bottomLength  * height /2;
	//     정수형           정수형 / 정수형 →정수기반연산
	area = bottomLength * height /2.0;							//check!!
	//      정수형         정수형   실수형  →실수기반연산

	// ★실수 자료형이 결과값으로 산출되는 과정에서
	//   실수 기반의 연산이 필요
	// 정수형 2가아닌 실수형 2.0 으로 나눗셈 연산으로 출력하기!!



	// 결과 출력
	System.out.println();   //----> 매개변수 없음--->개행
	//System.out.print();		//매개변수없음--->에러 발생
	
	System.out.printf(">> 밑변이 %d,높이가 %d인 삼각형의 넓이 :%.2f\n"
		,bottomLength, height, area);
		
	}
}

/*
삼각형의 넓이 구하기
_삼각형의 밑변 입력 : 3
- 삼각형의 높이 입력5

>> 밑변이 3,높이가 5인 삼각형의 넓이 :7.50
계속하려면 아무 키나 누르십시오 . . .
*/



//실행 예)
//삼각형의 넓이 구하기
// 삼각형의 밑변 입력 : 3
// 삼각형의 높이 입력 : 5
//>> 밑변이 3 높이가 5인 삼각형의 넓이 : xxx
//계속하려면 아무 키나 누르세요..

// * 삼각형의 넓이 = 밑변 * 높이 /2
// 
//사용자로부터 데이터를 입력받아 처리 할때 →BufferedReader 활용

