/*	=========================================================
	�����޼ҵ� �ߺ� ���� (Method overloading)�����
	-Method Overloding�� ������ ���¿� �Ұ����� ����
	======================================================= */
/*

*/
public class Test100
{
	public static void main(String[] args)

	{


		print('A');

		double result = print(3.14);		
		print(4.75);						
	}




	public static void print(){}
	public static void print(int i){}
	//public static void print(int j){}		//--(x) �ֳ��ϸ� �ڹٴ� �ٷ� ���ٰ� ���кҰ�
	public static void print(char c){}		//-- �� �ڵ� �� ��ȯ ��Ģ check~!!!
	public static void print(int i, int j){}		//���������� �Ű����� ������ �޶� ����
	public static void print(double d) {}
	//public static double print(double d){return 10.0; }		//(X)
	//public static void print(double e){}	//-- (x) ���� �Ұ�

}

