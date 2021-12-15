/*============================================================
■■■클래스와 인스턴스	■■■
===========================================================*/
/*
Test066파일과 세트
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CircleTest	// class 원의 설계도작성
{

	//주요 변수 선언(반지름, 원주율)

	int r; //원의 반지름
	final double PI=3.141592; //원주율

	
	//기능(동작, 행위) → 메소드
	//반지름 입력
	void input() throws IOException //메소드 영역에서 return문이 없으니까 void
	{
	
	//메소드에다가 BufferedReader 인스턴스 생성
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.print("반지름 입력 : ");
	r=Integer.parseInt(br.readLine());
	}									//BufferedReader는 반지름값만 입력 하면 되므로 readLine은 반지름 구문에서만 ~!!!!』input 메소드는 할당 일 끝!


	//둘레 연산기능
	double cirLength() //둘레를 반환해야하기때문에 (속성에 둘레를 담을 곳을 선언하지 않았고)
	{
		
		double result=0;		//결과값으로 반환하게 될 변수 선언 및 초기화
		
		result = r * r * PI;	//선언한 변수에 값 채워넣기
		
		return result;			//최종 결과값 반환
	}

	//넓이 연산기능
	double cirArea() // 넓이 계산(). 매개변수 넘겨주지 않아도돼서 비워둬도 됨
	{
		double result=0;		//결과값으로 반환하게 될 변수 선언 및 초기화		☆result를 0으로 초기화 하는 이유는 구문에 대한 오류 방지하는 습관
		//double result;
		// 이렇게 사용해도 됨!
		result = r * 2 * PI;	//선언한 변수에 값 채워넣기

		return result;			//최종 결과값 반환
		
	}
	void print(double a, double l)//결과출력() 가지고 있지 않은 a,l에 대해서는 매개 변수가 필요해 (넓이,둘레)
	{	
		System.out.printf("반지름이 %d인 원의 \n",r);
		System.out.printf("넓이: %.2f\n " ,a);
		System.out.printf("둘레: %.2f\n" ,l);
	}
}
