/*=======================================
  ■■■ 예외 처리(Exception) ■■■ 2021-08-11
- Test146과 비교~!
=======================================*/
class Demo2
{
	private int value;
	
	public void setValue(int value) throws Exception //lang 패키지에 있는 Exception
	{
		if (value<=0)
		{
			//예외 생성(발생)
			throw new Exception("value는 0보다 작거나 같을 수 없습니다!");	//★⑴ throw _ 예외를 발생시킬 때!
		}
		this.value = value;
	}
	public int getValue()
	{
		return value;
	}
}


public class Test147
{
	public static void main(String [] args) //ⓐthrows Exception
	{
		//ⓐthrows Exception방법
		Demo2 ob = new Demo2();
		// 생성된 객체가 있어야지~~ ㅠㅠ

		/*
		ob.setValue(-3);			//-3 넣었는데 0이 나오는 이유는? value초기값이 0이라서
		int result = ob.getValue();
		System.out.println(result);
		*/

		try
		{
			ob.setValue(-3);
			int result = ob.getValue();
			System.out.println(result);
		}
		catch (Exception e)  // checked Exception
		{
			System.out.println(e.toString());
		}

	}
}
/*
java.lang.Exception: value는 0보다 작거나 같을 수 없습니다!
계속하려면 아무 키나 누르십시오 . . .
*/