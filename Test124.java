/*============================================================
			 ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����2021-08-09
  - Object Ŭ����
===============================================================*/
class Test		//extends Object
{
	/*
		public boolean equals (Object obj)
		{
			...;
		}
	*/
	private int a=10;
	public void write()

	{
		System.out.println("a : " + a);
	}

}


public class Test124
{
	public static void main(String[] args)
	{
		Test ob1 = new Test();
		Test ob2 = new Test();

		System.out.println("10==9 : " + (10 == 9));

		//--==>> 10 == 9 : false
		//��==�� �񱳿����ڴ� �ǿ������� ũ�⸦ ������ Ȯ�� (����)



		int a=10, b=10;

		System.out.println("a==b : " + (a==b));

		//--==>> a==b : true
		//-- ��==���� �����ڴ� �ǿ������� ũ�⸦ ������ Ȯ�� (����)



		System.out.println("ob1==ob2 : " + (ob1 == ob2));

		//--==>> ob1 == ob2 : false			
		//-- ��ü(Test ��, Object)���� ���ϴ� �������� ����ϴ� ��==�������ڴ�
		//   ũ�⸦ ���ϴ� ���� �ƴ϶� ��ü�� �ּҰ��� ��.
		//check~!!!!!


		System.out.println("ob1.equals() : " + ob1.equals(ob2));
		System.out.println("ob2.equals() : " + ob2.equals(ob1));
		//--==>> ob1.equals() : false
		//--==>>ob2.equals() : false
		//-- ��==�������ڿ� Object Ŭ������ ��equals()���޼ҵ��
		//   ������ �������� ��ü�� �ּҰ��� ��.




		//------------------------------------------------------------------------------

		System.out.println("\n--------------------------------------------\n");

		
		System.out.println("ob1            : " + ob1);
		System.out.println("ob1.toString() : " + ob1.toString());
		//--==>> ob1            : Test@6d06d69c
		//       ob1.toString() : Test@6d06d69c
		System.out.println("ob2            : " + ob2);
		System.out.println("ob2.toString() : " + ob2.toString());
		//--==>>      ob2            : Test@7852e922
		//       ob2.toString() : Test@7852e922




		// ��Ŭ������ @ �ؽ��ڵ塻


		// �� �ؽ��ڵ�(hashcode)
		//    : �ڹ� ���������� ��ü�� �����ϱ� ���� ����ϴ� ��.
		//      �޸��� �ּҰ����� �����ϸ� ����� �ȵȴ�.


		// �� ��ü�� ������ hashcode(�ؽ��ڵ�)�� ������
		//     hashcode(�ؽ��ڵ�)�� ���ٰ� ���� ��ü�� �ƴϴ�.

	}

}


