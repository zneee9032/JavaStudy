/*	===========================
	■■자바 입출력■■
2021-08-17
	=========================== */

public class Test171
{
	public static void main(String [] args)
	{
		//System.out : 자바 기본 출력 스트림
		System.out.write(65);		//A
		System.out.write(66);		//B


		System.out.write(180);
		System.out.write(235);		//180+235 = '대'

		System.out.flush();			//AB대계속하려면 아무 키나 누르십시오 . . .
		//현재 구문에서 생략 불가!!
		
		//출력 버퍼가 채워지지 않으면 출력할 데이터(자료)를 출력 디바이스(장치)로 보내지 않기 때문에
		//flush()메소드를 통해 아직 다 채워지지 않은
		//출력 버의 내용을 출력장치로 밀어내어 보낼 수 있도록 처리~!!!
	}
}