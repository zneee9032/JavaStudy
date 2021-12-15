/*============================================================
			 ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ���� 2021-08-10
��StringTokenizer
===============================================================*/
/*
StringTokenizer Ŭ������
���ڿ� �Ľ�(parshing)�� ���� ������ �����ϴ� Ŭ������ �Ľ�(parshing) �ϰ��� �ϴ� ���ڿ��� ���ڷ� �޾� �����ϴµ�

���⿡�� �Ľ�(parshing)�̶�!
�ϳ��� ���ڿ��� �������ڿ��� ������ �۾��� �ǹ��ϰ� �Ǹ�, �̋� ������ ������ �Ǵ� ���ڿ��� ��ū�̶�� �Ѵ�

StringTokenizerŬ������ ����ϱ����ؼ��� 
java.util��Ű���� StringTokenizer�� import�ؾ��Ѵ�

StringTokenizer Ŭ������ ��--- ȣȯ���� �����ϴ� �������� ���� �����ǰ� ������ (������ ���� ���̴� �˾Ƶ��ڴ� �ǹ�)---��
���ڿ��� �Ľ� �ϱ� ���ؼ���
 StringŬ������ split()�޼ҵ峪 java.util.regex��Ű���� 
����Ұ��� �����Ѵ�

�ۻ����� 
	- ����
	StringTokenizer(Strig str)
	StringTokenizer(Strig str, String delim,)
	StringTokenizer(Strig str, String delim,boolean returnDelims)
	�� �־��� ���ڿ� str�� �ܾ�� �и��ϴ� ��ü�� �����ϸ�
	���� (����) ���ڴ� delim�� ���Ե� ���ڷ� ó���ϰԵȴ�
	���� returnDelims �� true��� ���й��ڵ� �и��� �����ͷ� ó���ϰ� �ȴ�
	
*/
import java.util.StringTokenizer;		//--->collection framework ������ ó�� ����� StringTokenizer������
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test136

{
	public static void main(String[] arg) throws IOException
	{

		String strTemp;
		String[] strArr;
		int n;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		//���ڿ��� split���� �ڸ�


		System.out.print("�Ľ��� ���ڿ� �Է�(�ĸ�����) : ");	//"����ڰ� ���,����,�ٳ���,�丶��"
		strTemp = br.readLine();


		// StringTokenizer Ŭ���� �ν��Ͻ� ����
		StringTokenizer st = new StringTokenizer(strTemp, ",");
		//-- strTemp �� ��� ���ڿ���...
		//   ��,���� �����ڷ�...


		strArr = new String[st.countTokens()];		//st.countTokens() -> 4�� ��ȯ
		//-- int countTokens()
		//   : �Ľ̵� ���ڿ��� ������ ����(��ȯ)�Ѵ�.


		n=0;
		while (st.hasMoreTokens())

		{
			strArr[n++] = st.nextToken();
		}

		// ��st.hasMoreTokens()�� 
		//                      : ����Ҽ� �ִ� ��ū�� ���� �ִ� ��� true
		//						  ���̻� ����� ��ū�� ���� ���� ���� ��� flse�� ��Ⱥ
		//						  Ȯ�� ����� ��ȯ �� ��.. ���� ������ �о� ���̴� ���(��)�� �̵���Ű�� �ʴ´�


		// ��st.nextToken()�� : 
								//������ū�� ���´�
								//���� ��ū�� ������ ���(��)�� �̵���Ű�� �Ѵ�
								// �����ڸ� �ٲپ��� ��� ����ȣ�⿡��
								//�ٲ� �����ڸ� �̿��Ͽ� ��ū�� �и��Ѵ�
	

		System.out.print("�Ľ̵� ��ū(���ڿ�) : ");
		for (String str : strArr)
			System.out.print(str + " ");
		System.out.println();

	}

}

/*
�Ľ��� ���ڿ� �Է�(�ĸ�����) : ���,����,�ٳ���,�丶��
�Ľ̵� ��ū(���ڿ�) : ��� ���� �ٳ��� �丶��
*/

/*
st"���,����,�ٳ���,�丶��"
st.countTokens(); -> 4

��hasMoreTokens(): �ִ��� ������ �Ǻ� �ϴ� ��
  nextToken(): ���� ������ ��
=======================================
"���, ����,�ٳ���, �丶��"
=======================================
����� ������ true
����� ������ false

*/