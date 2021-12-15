/*============================================================
■■■실행 흐름의 컨트롤 (제어문, 조건문과 반복문)■■■
-if ~ else 문 실습
===========================================================*/

/*
사용자로부터 임의의 정수를 입력받아
입력 받은 정수가... 짝수인지, 홀수 인지, 영인지
결과를 판별하여 출력하는 프로그램을 구현한다

실행 예)
임의의 정수 입력 :14
14 →짝수
계속하려면 아무 키나...

임의의 정수 입력 :3
3 →홀수
계속하려면 아무 키나...
*/
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test030
{
	public static void main(String[] args) throws IOException
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//변수선언
		int num;
		String res;
		
		//입력 및 처리
		System.out.print("임의의 정수 입력 : ");
		num = Integer.parseInt(br.readLine());

		if (num == 0)
		res = "영";

		else if (num % 2 == 1)
		res = "홀수";

		else 
		res = "짝수";

		//결과 처리
		System.out.printf("%d → %s \n", num, res);

	}

}

/*
임의의 정수 입력 : 3
3 → 홀수
계속하려면 아무 키나 누르십시오 . . .
*/

