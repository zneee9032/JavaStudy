/*	===========================
	����ڹ� ����¡��					������ ���� �̤̤�
2021-08-17
	=========================== */
//reader�ǽ�
// Test 168 ��

import java.io.Reader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Test170
{
	public static void main(String[]args) throws IOException
	{
		int data;
		char ch;
		
		//System.in				: �ڹ� ǥ�� �Է� ��Ʈ��-> ����Ʈ ��� ��Ʈ��
		//InputStreamReader		: ����Ʈ ��� ��Ʈ���� -> ���� ��� ��Ʈ������ ��ȯ ���ִ� ���� ����
		
		//Reader				: ���� ��� ��Ʈ�� ��ü
		Reader re = new InputStreamReader(System.in);
		
		System.out.println("���ڿ� �Է� (���� : Ctrl + z)");

			while ((data = rd.read()) != -1)
		{
				ch = (char)data;
				System.out.write(ch);
		}
	}
}