package JavaStudy01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*==============================================
 * ■■■클래스와 인스턴스■■■
 *실습 문제 
 *원의 넓이와 둘레 구하기
 *
 *원의 넒이와 둘레를 구할 수 있는 클래스를 독립적으로(별도로) 생성한다
 *클래스 명 : CircleTest -> CircleTest.java
 *
 *원의 넓이 = 반지름 * 반지름 *3.141592
 *원의 둘레 = 반지름 *2 * 3.141592
 *
 *실행 예
 *반지름 : xxxx
 *반지름이 xxxx인원의
 *넓이 : xxx.xx
 *둘레 : xxx.xx
 ==============================================*/
public class CircleTest
{
	//전역변수 선언
	int r;
	final double PI = 3.141592;		//final(상수화)하면 변수명을 대문자로 구성함
	
	//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//BufferedReader인스턴스 전역으로 생성하게 되면.
	//CircleTest(class)만 부르고 싶을때에도
	//매번 메모리를 같이 할당 받기 때문에
	//특별한 경우가 아니라면 해당 메소드 아래에 생성한다
	
	//반지를 입력하는 메소드 정의
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("반지름 입력 : ");
		r = Integer.parseInt(br.readLine());
	}
	
	//원의 넓이 메소드 정의
	double calArea()
	{
		//return r * r * PI
		double result;			//실수형 결과가 반환될것이다.
		result = r * r * PI;	//결과는 반지름* 반지름 * PI
		return result;			//반환할것이다 결과를
	}
	//원의 둘레 메소드 정의
	double calLength()
	{
		//return r * 2 * PI;
		double result;
		result = r * 2 * PI;
		return result;
	}
	
	//출력 메소드 정의
	void print(double a, double l)
	{
		System.out.printf("반지름이 %d인 원의 " ,r);
		System.out.printf("넓이 : %.2f ",a);
		System.out.printf("둘레 : %.2f",l);
		
	}
	
}
