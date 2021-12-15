/*=======================================
  ���� ���� ó��(Exception) ���� 2021-08-11
=======================================*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test145
{

			private String[] data = new String[3];

			public void proc() //throws IOException
		{
			//BufferedReader�ν��Ͻ� ����
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			String str;
			int n = 0;


			try
			{
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

			}//end try
	

			catch (IOException e)	//14�������� IOException �� ���ֹ���
			{
				System.out.println(e.toString());
			}
			
		// �迭 ����
		catch (ArrayIndexOutOfBoundsException e)

		{
			System.out.println("�߻�~!!!");
			System.out.println("getMessage : " + e.getMessage());
			System.out.println("toString   : " + e.toString());
			System.out.println("printStackTrace......");
			e.printStackTrace();

		}



			
		}// end public void proc() 

	public static void main(String[] args) //throws IOException
	{	
			Test145 ob = new Test145();
			ob.proc();
	}
}
/*
�̸� �Է�(���� : Ctrl + z ) : ������
�̸� �Է�(���� : Ctrl + z ) : ������
�̸� �Է�(���� : Ctrl + z ) : ������
�̸� �Է�(���� : Ctrl + z ) : ���־�
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
        at Test145.proc(Test145.java:29)
        at Test145.main(Test145.java:53)
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .






// �迭 ����---> 48����
�̸� �Է�(���� : Ctrl + z ) : ��
�̸� �Է�(���� : Ctrl + z ) : ��
�̸� �Է�(���� : Ctrl + z ) : ��
�̸� �Է�(���� : Ctrl + z ) : ��
�߻�~!!!
getMessage : 3
toString   : java.lang.ArrayIndexOutOfBoundsException: 3
printStackTrace......
java.lang.ArrayIndexOutOfBoundsException: 3
        at Test145.proc(Test145.java:29)
        at Test145.main(Test145.java:73)
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
