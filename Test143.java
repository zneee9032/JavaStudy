/*=======================================
  ���� ���� ó��(Exception) ���� 2021-08-11

=======================================*/
/*
�� ���α׷����� �߻��ϴ� ������
	�� �߸��� ������ ����ϰų� ���� ���� �������� ���� ���¿��� ��������� ������ �ܰ迡�� �߻��ϴ� ������ ����

	�����α׷��� �����ϴ� �������� �߻��ϴ� ��Ÿ�� ���� �������ִ�
- �����ڰ� ���� �м��� �߸��ϰų� �Ǽ��� ���� ������ ����� �������� �Ǵ� ������ ����

-�ý��� �̻󿡼� �߻��Ǵ� �ý��� ����

-���α׷� ������ �߻��Ǵ� ���������� ��Ȳ�� �ǹ��ϴ� ���ܻ���(Exception)�� �ִ�
													 ===================
	���� ���
			-> ����� 0���� �����ų�
			-> �迭 ÷�ڸ� ����� ��Ȳ�̰ų�
			-> �������� ���� ������ �����Ͽ� �о���δٰų�

		==>> �����ڰ� �̷� ���� ������ �߻��� ��츦 �̸� �����Ͽ�
			 ������ ���� �ϱ� ���� ������ �����ϵ��� ������ ���� �� ������!
			��. ��. ó. ��

�������� ���� (-> Exception Ŭ����)
	- ���ܴ� ���α׷� ���� �߿� �߻��� �� �ִ� ��ɾ��� �������� �帧�� �����ϴ� �̺�Ʈ�� �ڹٿ��� ���ܴ� �ϳ��� ������Ʈ�̴�

	- ���α׷� ���� �߿� �޼ҵ� �ȿ��� ������ �߻��ϰ� �� ���, �޼ҵ�� �� ������ �ش��ϴ� ���� ������Ʈ�� �����
	  �װ��� �ڹ� ��Ÿ�� �ý��ۿ� �������ش�

	- �ڹٿ����� ��� ���ܴ�TrowableŬ������ TrowableŬ������ ���� Ŭ������ ��� �޾� ����Ѵ�
	
	- TrowableŬ������ ���ܸ� �����ϴ� �����̳� ���ܰ� �߻��� ���� ���α׷��� ���¿� ���� ������ ���� �ϰ� �ִ�

	- ThrowableŬ�������� �Ļ��� Ŭ����
		Exception Ŭ����
			: �Ϲ������� ���α׷��ӿ� ���� ������ �� �ִ� ���� ��Ȳ���� �żҵ尡 �����߿� ������ ���ܸ� ����Ų��

		ErrorŬ����
			: �ɰ��� ������ ���·� �����ڰ� ������ ������ ������ �����̴�

 - checked exception

     �޼ҵ� ������ ���ܰ� �߻��� ��� �޼ҵ带 ������ �� ��throws�� ���� �޼ҵ� ������ �߻��� �� �ִ�

     ���ܸ� ������ְų� �Ǵ� �� ���ܸ� ��try~catch�� �ؼ� ó�����־�߸� �ϴ� �����̴�.

     �����Ϸ��� ������ �ϴ� �������� ��checked exception�� �� ��throws�� �Ǵ°��� ���γ� Ȥ��

     ��try~catch���Ǵ� ���� ���θ� �Ǵ��ϸ� ���α׷����� ���ܸ� ó������ ������ ������ ��ü�� �Ұ����ϴ�.

   - unchecked exception

     ������ ó������ �ʾƵ� �����Ϸ��� üũ���� �ʴ� ��Ÿ�� �ÿ� �߻��ϴ� ����.

	  

�� java.lang.Throwable Ŭ������ �ֿ� �޼ҵ�

   - String toString()

     : Throwable ������ ���� ������ ���ڿ� ���·� ��ȯ�Ѵ�. (Object�� toString() �������̵�)

   - void printStackTrace(PrintStream s)

   - void printStackTrace(PrintWriter w)

     : ǥ�� ��� ��Ʈ���� ���� ȣ�� ����� ������ �޼ҵ���� ����Ѵ�.




�� �ֿ� ��Ÿ�� ���� Ŭ����

   - ArithmeticException

     : ��ġ ������ ���� (0���� ������ ��)

   - ArrayStoreException

     : �迭�� �߸��� ������ ���� �����Ϸ� ���� �� �߻��ϴ� ���

   - IndexOutOfBoundsException

     : �迭, ���ڿ�, ���� ��� �ε��� ������ ��� ��� �߻��ϴ� ����

   - ClassCastException

     : Ŭ���� ��ȯ�� �߸��� ��� �߻��ϴ� ����

   - NullPointerException

     : �� ��ü�� �����ϴ� ���(�ʱ�ȭ ���� ���� ���� ��� ��) �߻��ϴ� ����

   - SecurityException

     : �ڹ��� ���� ���� ������ �����Ͽ��� ��� �߻��ϴ� ����



�� Error �� Exception�� ������
�� Exeption = checked(������ �������� üũ�ؾ� �� �κ�) / unchecked(����������� Ȯ���ؾ���)
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test143

{											// �� ������ ������.

	public static void main(String[] args)	// throws IOException

	{

		// BufferedReader Ŭ���� �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));




		// �ֿ� ���� ����

		int a, b, c;


		/* ---��

		try	//-- try ���̹Ƿ� �ѱ��� ������ �Ѵ�~!!!

		{

			System.out.print("ù ��° ���� �Է� : ");
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է� : ");
			b = Integer.parseInt(br.readLine());
			c = a + b;
			System.out.println("��� : " + c);
		}

		catch (IOException e)

		{

			// IOException �� checked exception

			//-- �޼ҵ带 �����ϴ� �������� throws �� ����

			//   ��Ƴ��ų� ������ ���� ��� ������ ���� �߻�.

			
			//IOExeption -> checked exception
			//�޼ҵ带 ���� �ϴ� �������� throw�� ����
			//��Ƴ��ų� ������ ���� ��� ������ �����߻�
			System.out.println(e.toString());		//String toString()
													//: Throwable ������ ���� ������ ���ڿ� ���·� ��ȯ�Ѵ�. (Object�� toString() �������̵�)

		}	*/

		
		/*	
		//��

			try	//-- try ���̹Ƿ� �ѱ��� ������ �Ѵ�~!!!

		{

			System.out.print("ù ��° ���� �Է� : ");
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է� : ");
			b = Integer.parseInt(br.readLine());
			c = a + b;
			System.out.println("��� : " + c);
		}

		catch (IOException e1)

		{

			// IOException �� checked exception

			//-- �޼ҵ带 �����ϴ� �������� throws �� ����

			//   ��Ƴ��ų� ������ ���� ��� ������ ���� �߻�.

			
			//IOExeption -> checked exception
			//�޼ҵ带 ���� �ϴ� �������� throw�� ����
			//��Ƴ��ų� ������ ���� ��� ������ �����߻�
			System.out.println(e1.toString());		
													
		}
		catch (NumberFormatException e2)
		{
			System.out.println(e2.toString());
			System.out.println("���������� �����͸� �Է���~!!!");
			/*
				ù ��° ���� �Է� : ad
				java.lang.NumberFormatException: For input string: "ad"
				���������� �����͸� �Է���~!!!
				����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
			
		}
*/
			
/*
		// ---��

		try

		{

			System.out.print("ù ��° ���� �Է� : ");

			a = Integer.parseInt(br.readLine());

			System.out.print("�� ��° ���� �Է� : ");

			b = Integer.parseInt(br.readLine());

			c = a + b;

			System.out.println("��� : " + c);

		}

		catch (IOException e1)

		{

			System.out.println(e1.toString());

		}

		catch (NumberFormatException e2)	// e1�̵� e2�� �������. //NumberFormatException�� �������� �ʰ� �ҷ���. ���� : �⺻������ lang ��Ű���� �ִ°��̴�.

		{

			// NumberFormatException �� unchecked exception

			//-- ��Ÿ�� �� �߻��� �� �ִ� ���ܷ�

			//   �ݵ�� ���� �ʿ䵵, ��Ƴ� �ʿ䵵 ����.




			//System.out.println(e2.toString());

			System.out.println("���� ������ �����͸� �Է��ϼ���. ~!!");

		}

		*/

		

		// etc...

		try

		{
			System.out.print("ù ��° ���� �Է� : ");
			a = Integer.parseInt(br.readLine());

			System.out.print("�� ��° ���� �Է� : ");

			b = Integer.parseInt(br.readLine());

			c = a + b;

			System.out.println("��� : " + c);

		}

		catch (IOException e)

		{

			System.out.println(e.toString());

		}

		catch (NumberFormatException e)

		{

			System.out.println("���� ������ �����͸� �Է��ϼ���. ~!!");

		}

		finally //���ܰ� �߻��ϴ����� ����Ǵ� ����

		{

			System.out.println("��� �����̽��ϴ�. �����մϴ�.");

		}		

	/*
		ù ��° ���� �Է� : abc
		���� ������ �����͸� �Է��ϼ���. ~!!
		��� �����̽��ϴ�. �����մϴ�.
		����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
	*/
	


		}

}


