/*========================
	����迭����
-�迭 ����� �ʱ�ȭ  
==========================*/
/*�� �ǽ� ����

   ��char���ڷ����� �迭�� ����� ���ĺ� �빮�ڸ� ä��� ä���� �迭�� ��ü ��Ҹ� ����ϴ� ���α׷��� �����Ѵ�.
	��, ä��� ������ ����ϴ� ������ ���� �и��Ͽ� ó���Ѵ�

	���� ��)
	A B C D F G ... W X Y Z
	����Ͻ÷��� �ƹ�Ű�� ��������

	*/

public class Test076

{

	public static void main(String[] args)

	{
		// ���� ���ĺ� �빮�� �迭 ����
		char[] arr = new char[26];

		
		for (int i=0, ch=65; i<arr.length; i++, ch++)	
		

			arr[i] = (char)ch;		//(char)65; (char)66; (char)67....(char)90;			



		//�迭 ��� ��ü ���

		for (int i=0; i<arr.length; i++)

		{

			System.out.printf("%2c" , arr[i]);

		}

		System.out.println();

	}

}
/*
 A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/