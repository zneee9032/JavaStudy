/*	=========================
	■■■■클래스와 인스턴스■■■■
	- 클래스와 인스턴스활용
	========================= */
/*
	1 ~ 3 사이의 난수를 발생시켜서 가위, 바위, 보 게임 프로그램을 구현한다.
	단, 클래스의 개념을 활용하여 처리 할 수 있도록한다.
	또한, 배열을 활용하여 처리 할 수 있도록 한다.
	최종적으로 RpsGame클래스를 완성 할 수 있도록 한다
   (기준 데이터 → 1:가위, 2:바위, 3:보)

실행 예)
1 : 가위 2:바위 3:보 중 입력(1~3) : 4
1 : 가위 2:바위 3:보 중 입력(1~3) : -2
1 : 가위 2:바위 3:보 중 입력(1~3) : 2

//유저 : 바위
//컴퓨터: 보

>> 승부 최종 결과 : 컴퓨터가 이겼습니다~!!
//계속하려면 아무키나 누르세요

*/


/*
import java.util.Scanner;
import java.util.Random;

class RpsGame
{
	private int user;
	private int com;
}

public class Test098
{
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		String[] game = {"가위", "바위", "보"};


		// Random 클래스 기반 인스턴스 생성 → 컴퓨터 가위 바위 보 무작위 생성
		Random rd = new Random();
		int com = rd.nextInt();	//-- 가위 바위 보
		int user;

		// 입력받기
		do
		{
			System.out.print("1:가위  2:바위  3:보  중 입력(1~3) : ");
			user = sc.nextInt();
		}
		while (user<1 || user>3);

		// 유저가 내기
		System.out.println("유  저 : " + game[user-1]);			// 사용자가 가위를 지정할때는 1이지만 배열 할때는 0으로 설정 해서 -1
		

		// 컴퓨터가 내기
		System.out.println("컴퓨터 : " + game[com-1]);			// 컴퓨터가 가위를 지정할때는 1이지만 배열 할때는 0으로 설정 해서 -1


		// 결과출력
		String result;
		result = "무승부~!!";

		if ((user==1 && com==2) || (user==2 && com==3) || (user==3 && com==1))
			result = "컴퓨터가 이겼습니다.";


		if ((user==2 && com==1) || (user==3 && com==2) || (user==1 && com==3))
			result = "당신이 이겼습니다.";

		System.out.println(">> 승부 최종결과 : " + result);

	}

}
*/
import java.util.Random;
import java.util.Scanner;

class RpsGame
{
	private int user;
	private int com;


	private void runcome()		//computer 가위바위보
	{
		Random re = new Random();
		com = re.nextInt(3) +1;			//-->> 0 1 2 --> 0+1 1+1 2+1
	}
	
	public void input()		//user의 가위바위보
	{
		runcome();
		
		Scanner sc = new Scanner(System.in);

	do
	{
		System.out.println("1:가위  2:바위  3:보  중 입력(1~3) : ");
		user = sc.nextInt();
	}
	while (user < 1 || user>3);
	}//end input()

	//중간 결과 출력
	public void middleCalc()
	{
		String[] str = {"가위", "바위", "보"};	
	
		System.out.println();
		System.out.println("유저 : " + str[user-1]);		//str[1] str[2] str[3] →str[0] str[1] str[2]
		System.out.println("컴퓨터 : " + str [com -1]);		//str[1] str[2] str[3] →str[0] str[1] str[2]
		
	}
	
	//승부에 대한 결과 연산
	public String reasultCalc()
	{
		String result = "무승부 상황입니다";

		//if ((유저가 가위 && 컴 보)||(유저가 바위 && 컴퓨터는 가위) || (유저가 보 && 컴퓨터 바위))		//사용자가 승리한 상황
		if (( user==1 && com == 3)||(user ==2 && com ==1 ) || (user==3 && com==2))		//사용자가 승리한 상황
		{
			result = "당신이 승리 했습니다";
		}
		
		//else if ((유저가 가위 && 컴 바위) || (유저가 바위 && 컴은 보) || (유저가 보 && 컴 가위))			//컴퓨터가 승리한 상황
		if ((user==1 && com==2) || (user==2 && com==3) || (user==3 && com==1))		//컴퓨터가 승리한 상황
		{	
			result = "컴퓨터가 승리 했습니다";
		}
		return result;
	}

		//최종 결과 출력

		public void print(String str)
		{
		System.out.printf ("\n>>승부 최종 결과 : %s\n " + str);	
		}
}

//main () 메소드를 포함하고 있는 외부의 다른 클래스
public class Test098
{
	public static void main (String [] args)
	{
		RpsGame ob = new RpsGame();
		
		ob.input();
		ob.middleCalc();
		String result = ob.reasultCalc();
		ob.print(result);
	}
}