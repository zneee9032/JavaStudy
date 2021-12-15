/*=====================================
자바 기본 프로그래밍
-자바의 기본 입출력: System.in.read()
======================================*/

//실행 예)
// 한문자를 입력해라 : A
//한자리 정수 입력 : 7

//>> 입력한 문자 :A
//>>입력한 정수 : 7
//계속하려면 아무키나

/*
System.in.read()--> 메소드는 한 문자만 가져온다
단,하나의 문자를 입력받아 입력받은 문자의
ASCII Code값을 반환한다.
*/

import java.io.IOException;

public class Test014
{
	public static void main(String [] args) throws IOException

	{
		// 주요변수선언
		char ch;			//--입력 받은 문자를 담을 변수
		int n;				//--입력 받은 정수를 담을 변수

		//연산 및 처리
		//- 사용자에게 안내 메세지 출력 및 입력값얻어오기
		System.out.print("한 문자 입력 :");				// A → 65 →A //Enter=> A + (\r + \n : enter) 
		ch = (char)System.in.read();

		// ※ 입력 대기열에 남아있는 (\r , \n)을 스킵 (건너뛰기)
		System.in.skip(2);												
		//--매개변수(2)에 의해 두 글자를 읽지 않고 건너 뛴다.(버린다)
			
		//- 사용자에게 안내 메세지 출력 및 입렵값 얻어오기
		System.out.print("한 자리 정수 입력 :");
		n = System.in.read();
		
		//<아스키 코드 호출됨>
		//1→49
		//2→50
		//3→51
		//...
		// 입력한 값을 나타내고 싶으면 n 을 48 만큼 감소시켜라
		//n -= 48;
		

		//결과 출력
		System.out.println();
		System.out.println(">> 입력한 문자 : " + ch);
		System.out.println(">> 입력한 문자 : " + n);

	}
}

/*실행결과
한 문자 입력 :A
한 자리 정수 입력 :7

>> 입력한 문자 : A
>> 입력한 문자 : 55
계속하려면 아무 키나 누르십시오 . . .

*/