/*	===========================
	■■자바 입출력■■					컴파일 에러 ㅜㅜㅜ
2021-08-17
	=========================== */
//reader실습
// Test 168 비교

import java.io.Reader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Test170
{
	public static void main(String[]args) throws IOException
	{
		int data;
		char ch;
		
		//System.in				: 자바 표준 입력 스트림-> 바이트 기반 스트림
		//InputStreamReader		: 바이트 기반 스트림을 -> 문자 기반 스트림으로 변환 해주는 역할 수행
		
		//Reader				: 문자 기반 스트림 객체
		Reader re = new InputStreamReader(System.in);
		
		System.out.println("문자열 입력 (종료 : Ctrl + z)");

			while ((data = rd.read()) != -1)
		{
				ch = (char)data;
				System.out.write(ch);
		}
	}
}