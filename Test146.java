/*=======================================
  ■■■ 예외 처리(Exception) ■■■ 2021-08-11
-Test147.java 파일과 비교~!!!
=======================================*/
/*
setter => 0보다 작으면 종료
getter => ?

*/

class Demo
{
	private int value;
	
	public void setValue(int value)
	{
		if (value<=0)
		return;		//종료 -> 메소드 종료
		
		this.value = value;
	}
	public int getValue()
	{
		return value;
	}
}


public class Test146
{
	public static void main(String [] args)
	{
		Demo ob = new Demo();
		ob.setValue(-3);			//-3 넣었는데 0이 나오는 이유는? value초기값이 0이라서
		int result = ob.getValue();
		System.out.println(result);
	}
}