/*=======================================
  ���� ���� ó��(Exception) ����2021-08-11
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
			//BufferedReader�ν��Ͻ� ����
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			String str;
			int n = 0;

			System.out.print("�̸� �Է�(���� : Ctrl + z ) : ");
			
			while ((str = br.readLine()) != null)
			{
				data [n++] = str;
				System.out.print("�̸� �Է�(���� : Ctrl + z ) : ");
			}

			System.out.println("�Էµ� ����...");
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
�̸� �Է�(���� : Ctrl + z : )������
�̸� �Է�(���� : Ctrl + z : )������
�̸� �Է�(���� : Ctrl + z : )������
�̸� �Է�(���� : Ctrl + z : )���־�
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3

�̸� �Է�(���� : Ctrl + z : )^Z
�Էµ� ����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


==>> unchecked Exception

==>> String str;

BufferedReader readLine�� while������ ����!
Ctrl + z�� ������ null
*/
