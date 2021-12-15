/*	=========================================================
	■■■■메소드 중복 정의 (Method overloading)■■■■
	-Method Overloding이 가능한 형태와 불가능한 형태
	======================================================= */
/*

*/
public class Test100
{
	public static void main(String[] args)

	{


		print('A');

		double result = print(3.14);		
		print(4.75);						
	}




	public static void print(){}
	public static void print(int i){}
	//public static void print(int j){}		//--(x) 왜냐하면 자바는 바로 윗줄과 구분불가
	public static void print(char c){}		//-- ※ 자동 형 변환 규칙 check~!!!
	public static void print(int i, int j){}		//정수형태의 매개변수 갯수가 달라서 가능
	public static void print(double d) {}
	//public static double print(double d){return 10.0; }		//(X)
	//public static void print(double e){}	//-- (x) 정의 불가

}

