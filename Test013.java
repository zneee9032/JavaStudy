/*
����ڷκ��� �̸�,��������,��������, ���������� �Է¹޾�
�̸��� ������ ����ϴ� ���α׷��� �����Ѵ�

���� ��)
�̸��� �Է��ϻ���: ������
���� ���� �Է� : 90
���� ���� �Է� : 80
���� ���� �Է� : 70

���
�̸� : ������
����: 240
����Ϸ��� �ƹ� Ű�� ��������..
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// ���ݲ� �� �ٸ� ����~ ������

public class Test013
{
									// �� �̰� ó���� �Ǽ��ϱ� ���� �κ�~ ^^
	//public static void main(String[] args) throw IOException
	public static void main(String[] args) throws IOException
	{
		//�� �ֿ� ���� ����
		// BufferedReader �ν��Ͻ� ����
			//InputStreamReader isr = new InputStreamReader(System.in);
			//BufferedReader br = new BufferedReader(isr);
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
			
	// ��ҹ��� ����~ ^^
	//String strname;				//�̸� ����
	String strName;
	int nKor, nEng, nMat;		//����, ���� ,���� ���� ����
	int nTot;					//���� ����

	//�߰� ���� ����
	String strTemp;				//���ڿ� ������ �ӽ� ���� ����

	//���� �� ó��
	//-����ڿ��� �ȳ� �޼��� ���(�̸� �Է� �ȳ�)
	System.out.print("�̸��� �Է��ϼ��� : ");

	//����ڰ� �Է��� ��(�ܺ� ������)�� ���� ��Ƴ���
	strName = br.readLine();

	//����ڿ��� �ȳ� �޼��� ���(���� ���� �Է� �ȳ�)
	System.out.print("���� ���� �Է� : ");

	//����ڰ� �Է��� ��(�ܺε�����)�� ������ ��Ƴ���
	strTemp = br.readLine();							//"90"

	//��Ƴ� ���� �ʿ��� ������ �Ű� ���
	nKor = Integer.parseInt(strTemp);					//"90"
	//�ӽ� ���� ���� strTemp�� ��� �ִ� ����
	//����ȯ �� �������� ������ ��Ƴ���

	// ����ڿ��� �ȳ� �޼��� ���(���� ���� �Է� �ȳ�)
	System.out.print("���� ���� �Է� : ");

	//����ڰ� �Է��� �� (�ܺ� ������)�� ������ ��Ƴ���
	strTemp = br.readLine();							//"80"

	//��Ƴ� ���� �ʿ��� ������ �Ű� ���
	nEng = Integer.parseInt(strTemp);
	//�ӽ� ���� ���� strTemp�� ��� �ִ� ����
	//����ȯ �� �������� ������ ��Ƴ���

	System.out.print("���� ���� �Է� : ");
	strTemp = br.readLine();
	nMat = Integer.parseInt(strTemp);

	// �� ���� ������ ��� �ִ� ������ (�Է� ������)����
	//�����Ͽ� ������ �����ϰ�
	//�� ����� ���� ������ ��Ƴ���

	nTot = nKor + nEng +nMat;

	//��� ���
	System.out.println("\n=== [���]===");
	//System.out.out.printf("�̸� ; %s\n", strName);
	// ��Ȳ�ؼ� out �� �� �� �� ���̽�~ ������
	System.out.printf("�̸� ; %s\n", strName);
	System.out.printf("���� : %d\n",nTot);

	}
}