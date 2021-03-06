/*	===========================
	■■자바 입출력■■	
2021-08-17	
	=========================== */
//Reader Write 실습

import java.io.InputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.OutputStream;
import java.io.Writer;
import java.io.OutputStreamWriter;

public class Test172
{
	public void process(InputStream is)
	{
		int data;

		System.out.println("문자열 입력 (종료 : Ctrl + z)");
		
		try
		{
			// 매개변수 is 라는 바이트 기반 객체 (InputStream)를
			//	문자 스트림으로 변환하여
			//	(->InputStreamReader 가 수행)
			//Reader 타입의 rd에서 참조할 수 있도록 처리
			Reader rd =new InputStreamReader(is);
			

			// 바이트 기반 스트림의 자바 기본 입출력 (System.out)을
			//문자 스트림으로 변환 하여
			//(-> OutputStramWrite가 수행)
			//Writer 타입의 wt 에서 참조할 수 있도록 처리
			Writer wt = new OutputStreamWriter(System.out);

			while ((data = rd.read()) != -1)
			{
				wt.write(data);		//스트림 물줄기에 기록
				wt.flush();			//기록한 스트림을 밀어내어 보냄
			}
		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}
	}
	
	public static void main(String []args)
	{
		Test172 ob = new Test172();
		ob.process(System.in);
	}
}
/*
문자열 입력 (종료 : Ctrl + z)
1234
1234
가나다라
가나다라
abcd
abcd
*
*
!!!
!!!
==> 모든 문자 출력 가능
*/