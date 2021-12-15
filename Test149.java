/*=======================================
  ■■■ 예외 처리(Exception) ■■■ 2021-08-11
- 예외 다시 던지기
=======================================*/
public class Test149
{
	public int getValue(int value) throws Exception				//(7) 예외 던지기 (파란 폭발물)
	{
		int a = 0;
		try
		{
			a= getData(-2);										//(3) 예외 발생 -> 빨간 폭발물
		}
		catch (Exception e)										//(4) 예외 잡아내기
		{
			//(5) 예외 처리 (빨간 폭발물)
			System.out.println("printStackTrace.............");
			e.printStackTrace();
		
			//throw e;
			throw new Exception("vlaue 가 음수입니다.");
			//(6) 예외 발생(파란 폭발물)
		}
		return a;
	}
	
	public int getData(int data) throws Exception				//(2) 예외 던지기 -> 빨간 폭발물
	{	
		if (data <0)
		
			throw new Exception("data가 0 보다 작습니다.");		// (1) 예외 발생
																// 빨간 폭발물
		
		return data +10;
	}
	public static void main(String [] args)
	{
		Test149 ob = new Test149();		//인스턴스 생성

		try
		{
			int a = ob.getValue(-1);							//(8) 예외 발생 _ 파란폭발물
		System.out.println("a : " + a);
		}
		catch (Exception e)										//(9) 예외 잡아내기_ 파란 폭발물
		{
			//(10) 예외 처리_ 파란 폭발물
			System.out.println("printStackTrace.............");
			e.printStackTrace();
		}
	}
}		

/*
printStackTrace.............
java.lang.Exception: data가 0 보다 작습니다.
        at Test149.getData(Test149.java:31)
        at Test149.getValue(Test149.java:12)
        at Test149.main(Test149.java:42)
printStackTrace.............
java.lang.Exception: vlaue 가 음수입니다.
        at Test149.getValue(Test149.java:21)
        at Test149.main(Test149.java:42)
계속하려면 아무 키나 누르십시오 . . .
*/