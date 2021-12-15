public class InfRecul
{
	public static void main(String [] args)
	{
		showHi(5);			//매개변수 5
		
	}
	public static void showHi (int cnt)		// 5
	{
		System.out.println("Hi~");
		if(cnt==1)		
			return;
		showHi(--cnt);			
	}
}