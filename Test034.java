 /*============================================================
■■■실행 흐름의 컨트롤 (제어문, 조건문과 반복문)■■■
-if ~ else 문 실습
===========================================================*/
/*과제
사용자로부터 알파벳 한 문자를 입력받아
이를 판별하여 입력받은 알파벳이 모음일 경우만
결과를 출력하는 프로그램을 구현한다.
단, 대소문자를 모두 적용할 수 있도록 처리한다
또한, 알파벳 이외의 문자가 입력되었을 때
입력 오류에 대한 내용을 사용자에게 안내 하도록한다.

실행 예)
// 알파벳 한문자 입력 : A
// >>모음 OK!
// 계속하려면 아무키나 누르세요

// 알파벳 한문자 입력 : E
// >>모음 OK!
// 계속하려면 아무키나 누르세요

// 알파벳 한문자 입력 : B
// >>모음 OK!
// 계속하려면 아무키나 누르세요

// 알파벳 한문자 입력 : T
// >>입력 오류
// 계속하려면 아무키나 누르세요

// 알파벳 한문자 입력 : 1
// >>입력 오류
// 계속하려면 아무키나 누르세요 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test034
{
	public static void main(String[] args) throws IOException
	{
		
		//주요 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char a;		// 알파벳 받을 변수 선언

		//입력 및 처리
		System.out.print("알파벳 한 문자 입력 : ");
		a = (char)System.in.read();	//read()메소드는 입력 받은 문자의 아스키코드 값을 받아옴

		//반복문 및 출력
		//A(65),E(69),I(73),O(79),U(85)     ----------> 대문자 아스키 코드
		// a(97),e(101),i(105),o(111),u(117)----------> 소문자 아스키 코드


			// 모음 아스키코드값
			if (a==65 || a==69 || a==73 || a==79 || a==85
				|| a==97 || a==101 || a==105 || a==111 || a==117)	//(대문자 소문자)모음의 아스키코드
			
				System.out.println(">> 모음 OK~!!!");
			
		
			else
			System.out.println(">> 입력 오류~!!!");
			
		
		}
	}



	/*
알파벳 한 문자 입력 : a
>> 모음 OK~!!!
계속하려면 아무 키나 누르십시오 . . .

알파벳 한 문자 입력 : q
>> 입력 오류~!!!
계속하려면 아무 키나 누르십시오 . . .
*/