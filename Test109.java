/*==============================================
	■■■ 클래스 고급■■■
-상속(Inheritance)
================================================*/

/*
다음과 같은 프로그램을 구현한다.
단,상속의 개념을 적용하여 작성할 수 있도록한다

실행 예
임의의 두 정수 입력(공백 구분): 20 15
연산자 입력(+ - * /)
>> 20 - 15 = 5.00
//계속하려면 아무 키나 누르세요
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//Super class
class Aclass
{
	protected int x,y;
	protected char op;


	void write(double result)
	{
		System.out.printf(">> &d %c %d =%.2f\n",x,op,y,result);
	}




// sub class → Aclass를 상속받는 클래스
class Bclass extends Aclass
	{
		/* 상속 받는 구문
		protected int x,y;
		protected char op;

		void write(double result)
		{
			System.out.printf(">> &d %c %d =%.2f\n",x,op,y,result);
		}
		*/


		/*상속 받는 구문
		Bclass ()
		{
			syper();
		} 
		*/
		
		//입력 받는 메소드
		boolean input()	throws IOException		//boolean: 임의의 두정수 입력 할때 하나,세개를 입력 했을때, 잘못됐다! 
		{
			BufferedReader br =new BufferedReader(new InputStream(System.in));	
			System.out.print("임의의 두 정수 입력(공백 구분) : ");	
			//int su1 =sc.nextInt();	
			//int su1 =sc.nextInt();				//임의의 정수 공백 구분 :Scanner
			String temp = br.readLine();			//"20 15" 20 띄고 15의 문자열 형태!
			String[] strArr = temp.split("\\s");	//구분자 -> 공백
			//Stirng[] strrArr = {"20","15"};
		
			//※문자열. spilt("구분자")	
			//==> ex) "10 20 30 40".split("\s");
			//						==>{"10","20","30","40"}반환 


			if (strArr.length != 2)			//두개의 배열의 형태가 아니면 false로 반환
			
				return false;				
			// false를 반환하며 input()메소드 종료
			// 이조건을 수행할 경우.. 이코드의 아래에 수행해야 할 
			// 코드가 남아 있더라도 결과값을 반환하며 메소드는 종료된다

			x = Integer.parsrInt(strArr[0]);
			y = Integer.parsrInt(strArr[1]);

			System.out.print("연산자 입력(+ - * /) : ");
			op = (char)System.in.read();
/*
			if (op != '+' && op != '-' && op != '*' && op != '/')	//더하기도 아니고 뺄셈도아니고 곱셈도아니고 나눗셈도 아니라면 뺄셈
			{
				return false
			}
				return true;
*/

			if (op== '+' || op== '-' || op== '*' || op== '/')
			{
				return true;
			}
				return false;
		}// end input
		
		
		double calc()
		{
			double result = 0;

			switch(op)
			{
				case '+' : result = x + y; break;
				case '-' : result = x - y; break;
				case '*' : result = x * y; break;
				case '/' : result = (double)x / y; break;
			}
		
				return result;
		}//end calc()



	}//end Bclass



// main() 메소드를 포함하는 외부의 다른 클래스
public class Test109
{
	public static void main(String [] args) throws IOException
	{
			//Bclass인스턴스 생성
			Bclass ob = new Bclass();

			if(ob.input)
			{
				System.out.println("Error");
				return;	//프로그램 종료
			}
		double result = ob.calc();

		ob.write(result);
	}//end main()

} //classTest109




