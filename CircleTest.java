/*============================================================
����Ŭ������ �ν��Ͻ�	����
===========================================================*/
/*
Test066���ϰ� ��Ʈ
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CircleTest	// class ���� ���赵�ۼ�
{

	//�ֿ� ���� ����(������, ������)

	int r; //���� ������
	final double PI=3.141592; //������

	
	//���(����, ����) �� �޼ҵ�
	//������ �Է�
	void input() throws IOException //�޼ҵ� �������� return���� �����ϱ� void
	{
	
	//�޼ҵ忡�ٰ� BufferedReader �ν��Ͻ� ����
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.print("������ �Է� : ");
	r=Integer.parseInt(br.readLine());
	}									//BufferedReader�� ���������� �Է� �ϸ� �ǹǷ� readLine�� ������ ���������� ~!!!!��input �޼ҵ�� �Ҵ� �� ��!


	//�ѷ� ������
	double cirLength() //�ѷ��� ��ȯ�ؾ��ϱ⶧���� (�Ӽ��� �ѷ��� ���� ���� �������� �ʾҰ�)
	{
		
		double result=0;		//��������� ��ȯ�ϰ� �� ���� ���� �� �ʱ�ȭ
		
		result = r * r * PI;	//������ ������ �� ä���ֱ�
		
		return result;			//���� ����� ��ȯ
	}

	//���� ������
	double cirArea() // ���� ���(). �Ű����� �Ѱ����� �ʾƵ��ż� ����ֵ� ��
	{
		double result=0;		//��������� ��ȯ�ϰ� �� ���� ���� �� �ʱ�ȭ		��result�� 0���� �ʱ�ȭ �ϴ� ������ ������ ���� ���� �����ϴ� ����
		//double result;
		// �̷��� ����ص� ��!
		result = r * 2 * PI;	//������ ������ �� ä���ֱ�

		return result;			//���� ����� ��ȯ
		
	}
	void print(double a, double l)//������() ������ ���� ���� a,l�� ���ؼ��� �Ű� ������ �ʿ��� (����,�ѷ�)
	{	
		System.out.printf("�������� %d�� ���� \n",r);
		System.out.printf("����: %.2f\n " ,a);
		System.out.printf("�ѷ�: %.2f\n" ,l);
	}
}
