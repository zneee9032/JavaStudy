import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException; 


public class Test01200 // Ŭ������ ����,�ҹ���,��ǥ �� Ư������ ���Ұ� 
						// class �� �Ǿձ��ڰ� �빮�ڿ����ϰ� ���� Ŭ�������� ��� ex) TestTest �� �� �ܾ� �� �ձ��ڴ� �빮�ڿ����Ѵ�.
						//TestTest ��Ÿ���ڸ� ����
						//�� �� ������ ���ϸ� = pakege �ҹ��ڿ����� �ֳĸ� ��Ű���� Ŭ������ �޶���ϴµ� ��Ű���� �빮�ڸ�  
{
	public static void main(String [] agrs)throws IOException
	{
		//BufferedReader ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//�ֿ� ���� ����
		int a, b;			//a�� �غ� b�� ���� ��� ����
		double area;		// area�� �����̶�� ����

		//���� �� ó��
		// ����ڿ��� ���� �Է� ���
		System.out.println("�ﰢ���� ���� ���ϱ� : ");
		System.out.println("�ﰢ���� �غ� �Է� : ");
		a= Integer.parseUnt(br.readLine()); 
		//����ڰ� �Է��� ���� �޾ƿ� ��������
		System.out.println("�ﰢ���� ���� �Է� : ");
		b = Integer.parseInt(br.readLin());

		//�ﰢ���� ���� ���ϱ�
		area = bottomLength * height /2.0; //area�� �Ǽ� ���� �̴ϱ� 2�� ���������� 2.0���� �������� �Ǽ����°� �ȴ�	

		//��� ���
		System.out.println();

		System.out.printf("���̴� : %d, �غ��� : %d, ���̴� %2.f %n",a,b,area);

		
		
		
		}
}