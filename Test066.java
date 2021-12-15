/*============================================================
■■■클래스와 인스턴스	■■■
===========================================================*/
/*
CircleTest.java파일과 세트
원의 넓이와 둘레 구하기
원의 넓이와 둘레를 구할 수 있는 클래스를 설꼐 한다
(클래스명 : CircleTest)→ CircleTest.java
// Test065.java파일을 참조하되
위와 같이 두개의 파일로 나누어 작업을 수행한다
또한,BufferedReader를 활용한다

원의 넓이 = 반지름* 반지름 * 3.141592
원의 둘레 = 반지름 * 2 *3.141592

실행예
반지름 입력 :13

반지름이 13인원의
넓이 : xxx.xx
둘레 : xxx.xx
계속하려면 아무 키나 누르세요
*/

import java.io.IOException;//------------------------->밑에서 throw IOException을 사용하기 때문에 사용,Bufferedreader랑 InputStreamReader은 사용안해도 됨
public class Test066
{
	public static void main(String[] args)throws IOException//---------------------------->집(=main)밖으로 던지기> 방(input)
	{
		// CircleTest 클래스 인스턴스 생성
		CircleTest ob =new CircleTest();

		//생성된 인스턴스 ob를 활용하여 반지름 입력 메소드 호출
		ob.input();

		//생성된 인스턴스 ob를 활용하여 넓이 연산 메소드 호출
		//→메소드 호출로 얻어낸 값을 담아낼 준비 
		double a = ob.cirArea();

		//생성된 인스턴스 ct를 활용하여 넓이 연산 메소드 호출
		//→메소드 호출로 얻어낸 값을 담아낼 준비 
		double l = ob.cirLength();

		//생성된 인스턴스 ct를 활용하여 넓이 연산 메소드 호출
		//→메소드 호출로 얻어낸 값을 담아낼 준비
		ob.print(a, l);
		
	}
}
/*
반지름 입력 : 13
반지름이 13인 원의
넓이: 81.68
 둘레: 530.93
계속하려면 아무 키나 누르십시오 . . .*/