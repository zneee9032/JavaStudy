/*==============================================
	���� Ŭ���� ��ޡ���
-���(Inheritance)
================================================*/

/*
�� �޼ҵ� �������̵�(mathod Overriding)�� Ư¡
   �� �޼ҵ� �̸�, ����Ÿ��, �Ķ���� ���� Ÿ���� ������ ��ġ�ؾ� �Ѵ�.              //+ �������������� ����~!!!!!!!

   �� �ݵ�� ��� ���谡 �־�� �Ѵ�.

   �� �����ǵ� ���� Ŭ������ �޼ҵ� �������������ڴ� ���� Ŭ������ �޼ҵ� �������������ں��� ������ ũ�ų� ���ƾ� �Ѵ�.
				-----------------------------------------------------------------------------------------------------------!
		�ڡڡڡڡ�privite < defulf < protected < public(ũ�� ����)�ڡڡڡڡ�
																			
     ���� ��� ���� Ŭ���� �޼ҵ��� �������������ڰ� ��protected�� �� ���
     ���� Ŭ������ �� �޼ҵ带 �������̵�(Overriding)�ϴ� ���
     �������������ڴ� ��protected�� �Ǵ� ��public�� �̾�� �Ѵ�.

   �� ��static_ (�޸𸮸� ����!)��, ��final_ ������ ���ȭ(�޼ҵ忡�� ���� �� �ִ�: �������� ����)��, ��private_(��ӿ��� ����..?)�� �޼ҵ�� �������̵�(Overriding)�� �� ����.

   �� Exception �� �߰��� �Ұ����ϴ�.
     ��, ���� Ŭ������ �޼ҵ尡 ������ �ִ� ���� ���� ���׿� ���ο� Exception �� �߰��ϴ� ���� �Ұ����ϴٴ� ���̴�.

�� �ڽ��� �θ� ������ �ƴµ� �θ�� �ڽ��� ������ �𸥴�.
   �ڽ� : ���� Ŭ����
   �θ� : ���� Ŭ����

// ���� Ŭ����, �θ� Ŭ����, Super class

*/
//�θ� Ŭ���� (����Ŭ����,super class)
class SuperTest110
{
	private int a =5;
	protected int b = 10;
	public int c =20;

	public void write()
	{
		System.out.println("Super ...write() : " + a + " : " + b + " : " + c);
	}
}
//�ڽ� Ŭ����(���� Ŭ����,sub class)
class SubTest110 extends SuperTest110
{
	/*
	// �ռ� private�� ��� �Ұ�
	protected int b = 10;
	public int c =20;

	public void write()
	{
		System.out.println("Super ...write() : " + a + " : " + b + " : " + c);
	}
	*/

	protected int b = 100;	//���� b =100 ,�θ��� b =10
	
	public void print()
	{
		//System.out.println("Sub...print() : " + a + " : " + b + " : " + c);
		// System.out.println("Sub...print() : " + a + " : " + b + " : " + c);
		//==> ���� Ŭ���� ���� ����� ���� a���� �����Ҽ� ����(private)

		System.out.println("Sub...print() : " + b + " : " + c);
		//System.out.println("Sub...print() : " + b );//==>Sub...print() : 100
		//System.out.println("Sub...print() : " + this.b );//==>Sub...print() : 100
		//System.out.println("Sub...print() : " + super.b );//==>Sub...print() : 10
		
		//���� b�� ���� ����� ���� �ٸ� b�� ���� �� ����� �̷�����
		//���� Ŭ�������� ����� b,���� Ŭ�������� ����� b

		//System.out.println("Sub...print() : " + c);//Sub...print() : 20
		//System.out.println("Sub...print() : " + this.c);//Sub...print() : 20
		//System.out.println("Sub...print() : " + super.c);//Sub...print() : 20
		
		//���� c�� �����ϴµ� �ƹ��� ����� ������ ����.
		//���� Ŭ�������� ����� c
		
	}
	@Override
	public void write()
	{
		//System.out.println("Sub ...write() : " + a + " : " + b + " : " + c);
		// System.out.println("Sub ...write() : " + a + " : " + b + " : " + c); (������ ���� ����Ŭ�������� ����� ���� a�� �Ұ�: private)
		System.out.println("Sub...write() : " + b + " : " + c);
		//Sub...write() : 100 : 20
	}
}

//main() �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test110
{
	public static void main(String[] args)
	{
		//���� Ŭ����(SubTest110) �ν��Ͻ� ����
		SubTest110 ob = new SubTest110();
		
		ob.print();
		//Sub...print() : 100 : 20

		ob.write();									//�θ��� write
		//Super ...write() : 5 : 10 : 20

		System.out.println("=========================================���м�");

		System.out.println(ob.b);
		//====> 100

		System.out.println(((SuperTest110)ob).b);
		//==>> 10
		// ���� �θ� ~!!!(�ڡڡڡڡ�����ȯ�ڡڡڡڡ�: �߿�)

		((SuperTest110)ob).write();
		//Sub...write() : 100 : 20���� ����� ���� (�θ��� write�� ȣ�� �ƴ�)

		//�� �޼ҵ�� ������ ��~!! �����Ͽ� ����~!!!

	}
}
/*
Sub...print() : 100 : 20
Sub...write() : 100 : 20
=========================================���м�
100
10
Sub...write() : 100 : 20
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/