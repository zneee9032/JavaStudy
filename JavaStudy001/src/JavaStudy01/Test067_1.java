package JavaStudy01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*==================================
■■■ 클래스와 인스턴스 ■■■
- 클래스 설계 실습
===================================*/

//○ 실습 문제
//사용자로부터 임의의 정수를 입력받아
//1부터 입력받은 수 까지의 합을 연산하여
//결과값을 출력하는 프로그램을 구현한다.

//단, 클래스와 인스턴스의 개념을 활용하여 처리할 수 있도록 한다.
//또한, 입력 처리 과정에서 BufferedReader 의 readLine() 을 사용하며,
//입력 데이터가 1보다 작거나 1000보다 큰 경우
//다시 입력받을 수 있는 처리를 포함하여 프로그램을 구성할 수 있도록 한다.

//실행 예)
//임의의 정수 입력(1~1000) : 1002
//임의의 정수 입력(1~1000) : -20
//임의의 정수 입력(1~1000) : 100
//>> 1 ~ 100 까지의 합 : 5050
//계속하려면 아무 키나 누르세요...
class Hap
{
	//전역 변수 선언(사용자의 입력값을 담아둘 변수)
	int num;
	int sum=0;
	
	//입력 메소드 정의
	void input() throws IOException
	{
		//BufferedReader인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do
		{
			System.out.print("임의의 정수 입력 (1~1000) : ");
			num = Integer.parseInt(br.readLine());
		} 
		while (num>1 || num<1000); //cf.유효성 검하는 메소드 정의 할 수 도 있음
	}
	
	//연산 메소드 정의
	int calculate()
	{
		int result=0;
		for (int i=1; i<=num; i++)
			result +=i;
		return result;
	}
	//결과 출력 메소드 정의
	//>> 1~100까지지의 합
	void print(int sum)
	{
		System.out.printf(">>1~%d까지의 합 : %d",num,sum);
	}
}

//main()메소드를 포함하고 있는 외부 클래스
public class Test067_1
{
	public static void main(String[] args) throws IOException
	{
		//Hap 클래스 인스턴스 생성
		Hap ob = new Hap();
		
		//생성한 인스턴스를 통해 입력 메소드 호출 
		ob.input();
		
		//생성한 인스턴스를 통해 연산 메소드 호출->int형 결과값 반환 -> 받아낼 수 있도록 처리
		int s = ob.calculate();
		
		//생성한 인스턴스를 통해 출력 메소드 호출-> 매개변수 전달
		ob.print(s);
	
	}
}
