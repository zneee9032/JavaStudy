/*	===========================
	����ڹ� ����¡��
2021-08-17
	=========================== */

//Output Stream�ǽ�

import java.io.OutputStream;
import java.io.IOException;
public class Test169
{
	public static void main(String [] args)	 throws IOException
	{

		//System.in		 :�ڹ��� ǥ�� �Է� ��Ʈ��
		//System.out	 : �ڹ��� ǥ�� ��� ��Ʈ��
		
		OutputStream out = System.out;	//����Ʈ ����� ��Ʈ��======================> ���������� ����

		byte[] ch = new byte[3];

		ch[0] = 65;	//A
		ch[1] = 97; //a
		ch[2] = 122; //z

		out.write(ch); // ������ ������ ������ (����)�� ��Ʈ���� ��� (���ٱ⿡ ���� �踦 ����)

		out.flush();    //��ϵ� ��Ʈ���� ��������(�о��) ����� ����
						//������ Buffer�� Ȱ������ �ʰ� �ִ� ��Ȳ�̱⶧����
						//������ ������ �ڵ�
						//(Bufferd �Ǿ� �ִ� ��Ʈ��(stream)�ϰ�� ���� �Ұ�)
		

		out.close();	// ��� ��Ʈ��(���ٱ�)�� ���� ���ҽ� �ݳ�
						//(out tmxmfladmf (����������)�ᰡ���� ��Ȳ)


		System.out.println("�������� �ŷڸ� ���� �ִ� ����...?");	//�ڡ�out.close();�� ���� ��Ź��ȱ⶧���� �ۼ� ���� ����� �ȵ�
																	// ��µǴ� ��Ʈ��(���ٱ�)�� �ݾұ⋚��!


	}
}