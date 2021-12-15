/*==============================================
	���� Ŭ���� ��ޡ���
-���(Inheritance)
================================================*/

/*
������ ���� ���α׷��� �����Ѵ�.
��,����� ������ �����Ͽ� �ۼ��� �� �ֵ����Ѵ�

���� ��
������ �� ���� �Է�(���� ����): 20 15
������ �Է�(+ - * /)
>> 20 - 15 = 5.00
//����Ϸ��� �ƹ� Ű�� ��������
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//Super class
class Aclass
{
	protected int x,y;
	protected char op;


	void write(double result)
	{
		System.out.printf(">> &d %c %d =%.2f\n",x,op,y,result);
	}




// sub class �� Aclass�� ��ӹ޴� Ŭ����
class Bclass extends Aclass
	{
		/* ��� �޴� ����
		protected int x,y;
		protected char op;

		void write(double result)
		{
			System.out.printf(">> &d %c %d =%.2f\n",x,op,y,result);
		}
		*/


		/*��� �޴� ����
		Bclass ()
		{
			syper();
		} 
		*/
		
		//�Է� �޴� �޼ҵ�
		boolean input()	throws IOException		//boolean: ������ ������ �Է� �Ҷ� �ϳ�,������ �Է� ������, �߸��ƴ�! 
		{
			BufferedReader br =new BufferedReader(new InputStream(System.in));	
			System.out.print("������ �� ���� �Է�(���� ����) : ");	
			//int su1 =sc.nextInt();	
			//int su1 =sc.nextInt();				//������ ���� ���� ���� :Scanner
			String temp = br.readLine();			//"20 15" 20 ��� 15�� ���ڿ� ����!
			String[] strArr = temp.split("\\s");	//������ -> ����
			//Stirng[] strrArr = {"20","15"};
		
			//�ع��ڿ�. spilt("������")	
			//==> ex) "10 20 30 40".split("\s");
			//						==>{"10","20","30","40"}��ȯ 


			if (strArr.length != 2)			//�ΰ��� �迭�� ���°� �ƴϸ� false�� ��ȯ
			
				return false;				
			// false�� ��ȯ�ϸ� input()�޼ҵ� ����
			// �������� ������ ���.. ���ڵ��� �Ʒ��� �����ؾ� �� 
			// �ڵ尡 ���� �ִ��� ������� ��ȯ�ϸ� �޼ҵ�� ����ȴ�

			x = Integer.parsrInt(strArr[0]);
			y = Integer.parsrInt(strArr[1]);

			System.out.print("������ �Է�(+ - * /) : ");
			op = (char)System.in.read();
/*
			if (op != '+' && op != '-' && op != '*' && op != '/')	//���ϱ⵵ �ƴϰ� �������ƴϰ� �������ƴϰ� �������� �ƴ϶�� ����
			{
				return false
			}
				return true;
*/

			if (op== '+' || op== '-' || op== '*' || op== '/')
			{
				return true;
			}
				return false;
		}// end input
		
		
		double calc()
		{
			double result = 0;

			switch(op)
			{
				case '+' : result = x + y; break;
				case '-' : result = x - y; break;
				case '*' : result = x * y; break;
				case '/' : result = (double)x / y; break;
			}
		
				return result;
		}//end calc()



	}//end Bclass



// main() �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test109
{
	public static void main(String [] args) throws IOException
	{
			//Bclass�ν��Ͻ� ����
			Bclass ob = new Bclass();

			if(ob.input)
			{
				System.out.println("Error");
				return;	//���α׷� ����
			}
		double result = ob.calc();

		ob.write(result);
	}//end main()

} //classTest109




