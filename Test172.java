/*	===========================
	����ڹ� ����¡��	
2021-08-17	
	=========================== */
//Reader Write �ǽ�

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

		System.out.println("���ڿ� �Է� (���� : Ctrl + z)");
		
		try
		{
			// �Ű����� is ��� ����Ʈ ��� ��ü (InputStream)��
			//	���� ��Ʈ������ ��ȯ�Ͽ�
			//	(->InputStreamReader �� ����)
			//Reader Ÿ���� rd���� ������ �� �ֵ��� ó��
			Reader rd =new InputStreamReader(is);
			

			// ����Ʈ ��� ��Ʈ���� �ڹ� �⺻ ����� (System.out)��
			//���� ��Ʈ������ ��ȯ �Ͽ�
			//(-> OutputStramWrite�� ����)
			//Writer Ÿ���� wt ���� ������ �� �ֵ��� ó��
			Writer wt = new OutputStreamWriter(System.out);

			while ((data = rd.read()) != -1)
			{
				wt.write(data);		//��Ʈ�� ���ٱ⿡ ���
				wt.flush();			//����� ��Ʈ���� �о�� ����
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
���ڿ� �Է� (���� : Ctrl + z)
1234
1234
�����ٶ�
�����ٶ�
abcd
abcd
*
*
!!!
!!!
==> ��� ���� ��� ����
*/