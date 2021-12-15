/*===================
자바 기본 프로그래밍
-변수와 자료형
-자바의 기본 입출력 : BuffereadReader 클래스
=====================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test011 
{
	public static void main(String[] args) throws IOException	// 세미콜론때문에 오류
	{
		//BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		//주요 변수선언
		int r;							//반지름
		final double PI = 3.141592;		//원주율
		double a, b;					//넓이,둘레

		//연산 및 처리
		//① 사용자에게 안내 메세지 출력
		System.out.print("원의 반지름 입력 : ");
		// 그리고, 사용자로부터 데이터를 입력받을 때는
		// println() 보다... print() 메소드 사용~!!!


		//② 사용자가 입력한 값을 받아와 반지름 변수 r에 담아내기
		//r= br.readLine();
		//r= "20";

		//Integer.parseInt() →매개 변수로 넘겨 받은 문자열 데이터를 정수형으로 변환
		r = Integer.parseInt(br.readLine());
		// r =Integer.parseInt("20");
		// r =20;
		//-- 사용자가 입력한 값을 BufferedReader(br) 의 readLine()
		//메소드를 활용하여 문자열 형태로 읽어들인 후
		//그 값을 Integer.parseInt()를 통해 숫자형 (정수형)으로 변환한 후
		//정수 형태의 반지름 변수 r에 담아내기

		//넓이 및 둘레 연산
		a = r * r * PI;
		b = r * 2 * PI;

		//결과 출력
		//System.out.println(">>넓이 :" + a);
		//System.out.println(">>둘레 :" + b);

		// printf() 사용한거 어디갔누? ㅠㅠ
		System.out.printf(">> 넓이 : %.2f\n", a);
		System.out.printf(">> 둘레 : %.2f\n", b);

	}
}

// 실행 결과
/*
원의 반지름 입력 : 25
>> 넓이 : 1963.50
>> 둘레 : 157.08
계속하려면 아무 키나 누르십시오 . . .
*/