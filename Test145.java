/*=======================================
  ■■■ 예외 처리(Exception) ■■■ 2021-08-11
=======================================*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test145
{

			private String[] data = new String[3];

			public void proc() //throws IOException
		{
			//BufferedReader인스턴스 생성
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			String str;
			int n = 0;


			try
			{
					System.out.print("이름 입력(종료 : Ctrl + z ) : ");
				
				while ((str = br.readLine()) != null)
				{
					data [n++] = str;
					System.out.print("이름 입력(종료 : Ctrl + z ) : ");
				}

				System.out.println("입력된 내용...");
				for (String s: data )

				{   if (s != null)
					System.out.println(s);
				}

			}//end try
	

			catch (IOException e)	//14구문에서 IOException 을 없애버림
			{
				System.out.println(e.toString());
			}
			
		// 배열 예외
		catch (ArrayIndexOutOfBoundsException e)

		{
			System.out.println("발생~!!!");
			System.out.println("getMessage : " + e.getMessage());
			System.out.println("toString   : " + e.toString());
			System.out.println("printStackTrace......");
			e.printStackTrace();

		}



			
		}// end public void proc() 

	public static void main(String[] args) //throws IOException
	{	
			Test145 ob = new Test145();
			ob.proc();
	}
}
/*
이름 입력(종료 : Ctrl + z ) : 김진희
이름 입력(종료 : Ctrl + z ) : 김진아
이름 입력(종료 : Ctrl + z ) : 김지수
이름 입력(종료 : Ctrl + z ) : 이주안
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
        at Test145.proc(Test145.java:29)
        at Test145.main(Test145.java:53)
계속하려면 아무 키나 누르십시오 . . .






// 배열 예외---> 48구문
이름 입력(종료 : Ctrl + z ) : ㅁ
이름 입력(종료 : Ctrl + z ) : ㄴ
이름 입력(종료 : Ctrl + z ) : ㅇ
이름 입력(종료 : Ctrl + z ) : ㄹ
발생~!!!
getMessage : 3
toString   : java.lang.ArrayIndexOutOfBoundsException: 3
printStackTrace......
java.lang.ArrayIndexOutOfBoundsException: 3
        at Test145.proc(Test145.java:29)
        at Test145.main(Test145.java:73)
계속하려면 아무 키나 누르십시오 . . .
*/
