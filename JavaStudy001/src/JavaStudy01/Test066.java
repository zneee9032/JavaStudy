package JavaStudy01;

import java.io.IOException;

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
public class Test066
{
	public static void main(String[] args) throws IOException	//ob.inpyt();을 썼기 떄문에 예외의 경우가 생기면 던짐
	{
		/*
		 * //CircleTest인스턴스 생성 CircleTest ob = new CircleTest(); ob.input();
		 * 
		 * double area = ob.calArea(); double length= ob.calLength();
		 * 
		 * ob.print(area,length);
		 */
		
		//CircleTest2인스턴스 생성
		CircleTest2 ob = new CircleTest2();
		ob.input();
	}
}

/*
 * 반지름 입력 : 10
 * 반지름이 10인 원의 넓이 : 314.16 둘레 : 62.83
 */
