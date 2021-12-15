/*=======================================
  ■■■ 예외 처리(Exception) ■■■2021-08-11
-
=======================================*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test144
{

			private String[] data = new String[3];

			public void proc() throws IOException
		{
			//BufferedReader인스턴스 생성
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			String str;
			int n = 0;

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


		}

	public static void main(String[] args) throws IOException
	{	
			Test144 ob = new Test144();
			ob.proc();
	}
}
/*
이름 입력(종료 : Ctrl + z : )김진희
이름 입력(종료 : Ctrl + z : )김진아
이름 입력(종료 : Ctrl + z : )김지수
이름 입력(종료 : Ctrl + z : )이주안
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3

이름 입력(종료 : Ctrl + z : )^Z
입력된 내용
계속하려면 아무 키나 누르십시오 . . .


==>> unchecked Exception

==>> String str;

BufferedReader readLine을 while문에서 수행!
Ctrl + z를 담으면 null
*/
