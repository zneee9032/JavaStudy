/*=============================
연산자(operator)
-삼항 연산자 == 조건 연산자
==============================*/

// 사용자로 부터 임의의 정수를 입력 받아
//입력 받은 정수가 양수인지,음수인지, 0인지 구분하여
//이 결과를 출력하는 프로그램을 구현하여라
//단, 입력 데이터는 BuffereddReader의 readLine()을 통해 넘겨 받을 수 있도록 한다.
// 또한, 조건 연산자(삼항 연산자)를 활용하여 기능을 구현 할 수 있도록 한다.

//실행 예)
//임의의 정수 입력 :-12
//-12 → 음수
//계속하려면 아무 키나 누르세요

//임의의 정수 입력 :257
//257 → 양수
//계속하려면 아무 키나 누르세요

//임의의 정수 입력 :0
//0 → 영
//계속하려면 아무 키나 누르세요

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*import java.io.*;		==>> java.io.*는 총 백과사전(BufferedReader,InputStreamReader
													,IOException포함)*/

//import java.lang.*;

public class Test027
{
	public static void main(String[] args) throws IOException
	
	{
		//주요 변수 선언
		int n;					//사용자로부터 입력 받은 데이터를 담아 둘 변수
		String strResult;		//양수인지 음수인지에 대한 판별 결과를 담아둘 변수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//연산 및 처리
		System.out.print("임의의 정수 입력 :");
		n = Integer.parseInt(br.readLine());

		/*
		n이 0보다 크다 → true → n은 양수
						→ false → n이 0보다 작다 →n은 음수/n은 영 */


		//○strResult = (n==0) ? "영" : (n>0) ? "양수":"음수";
		strResult = (n>0) ? ("양수") : ((n<0)) ? ("음수") : ("영");
			
			
			//10라면,
		//	strResult = (10>0) ? ("양수") : ((n<0)) ? ("음수") : ("영");
		//	strResult = (10>0) ? ("true") :  ((n<0)) ? ("음수") : ("영");
		//  strResult = "양수"

		// -4라면,
		//	strResult = (-4>0) ? ("양수") : ((n<0)) ? ("음수") : ("영");
		//	strResult = (false) ? ("양수") : ((n<0)) ? ("음수") : ("영");
		//  strResult = (-4<0) ? ("음수") : ("영");
		//  strResult = (true) ? ("음수") : ("영");
		//  strResult = :("음수"); 
		//  strResult = "음수"

			//0라면,
		//	strResult = (0>0) ? ("양수") : ((n<0)) ? ("음수") : ("영");
		//	strResult = (false) ? ("양수") : ((n<0)) ? ("음수") : ("영");
		//  strResult = (0<0)  ? ("음수") : ("영");
		//  strResult = (false)  ? ("음수") : ("영");
		//  strResult = :("영"); 
		//  strResult = "영"
		
		
		
		
		// 결과 출력
		System.out.println("\n==[판별 결과]==");
		System.out.printf("%d → %s\n", n, strResult);
							// ("정수 → 문자열" ,정수 ,최종 식);
		System.out.println("=================");
	
	}
}
/*
실행 결과
임의의 정수 입력 :-12

==[판별 결과]==
-12 → 음수
=================
계속하려면 아무 키나 누르십시오 . . .


임의의 정수 입력 :12

==[판별 결과]==
12 → 양수
=================
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 :0

==[판별 결과]==
0 → 영
=================
계속하려면 아무 키나 누르십시오 . . .*/