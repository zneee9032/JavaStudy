import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException; 


public class Test01200 // 클래스는 띄어쓰기,소문자,쉼표 즉 특수문자 사용불가 
						// class 는 맨앞글자가 대문자여야하고 만약 클래스명이 길면 ex) TestTest 앞 뒤 단어 맨 앞글자는 대문자여야한다.
						//TestTest 낙타문자를 쓴다
						//될 수 있으면 파일명 = pakege 소문자여야해 왜냐면 패키지랑 클래스랑 달라야하는데 패키지가 대문자면  
{
	public static void main(String [] agrs)throws IOException
	{
		//BufferedReader 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//주요 변수 선언
		int a, b;			//a는 밑변 b는 높이 라고 선언
		double area;		// area는 면적이라고 선언

		//연산 및 처리
		// 사용자에게 받을 입력 출력
		System.out.println("삼각형의 넓이 구하기 : ");
		System.out.println("삼각형의 밑변 입력 : ");
		a= Integer.parseUnt(br.readLine()); 
		//사용자가 입력한 값을 받아와 변수선언
		System.out.println("삼각형의 높이 입력 : ");
		b = Integer.parseInt(br.readLin());

		//삼각형의 넓이 구하기
		area = bottomLength * height /2.0; //area는 실수 형태 이니까 2로 나눌떄에는 2.0으로 나눠야지 실수형태가 된다	

		//결과 출력
		System.out.println();

		System.out.printf("높이는 : %d, 밑변은 : %d, 넓이는 %2.f %n",a,b,area);

		
		
		
		}
}