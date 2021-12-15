/*==============================================
	���� Ŭ���� ��ޡ���
-�߻� Ŭ����(abstract):�޸� ���� ���� �̸� ȣ�� ��ȹ�� �����α� ���� �����//�߻����� ���赵
================================================*/

/*
�� �߻� Ŭ����(abstract)
 ���� �ְ� ���ǰ� ���� �ϳ� �̻��� �޼ҵ�(�߻� �޼ҵ�)�� ���� Ŭ������ 
���� Ŭ�������� �������̵�(Overriding)�� ������ ����Ǵ� �޼ҵ忡 ���� 
�޸� ���� ���� �̸� ȣ�� ��ȹ�� �����α� ���� �����.

�� ���� �� ����
   [��������������] abstract class Ŭ������
   {
        [��������������] abstract �ڷ��� �޼ҵ��([�Ű�����], ...);
   }

�� Ư¡
 Ŭ������ ��� �ϳ� �̻��� �߻� �޼ҵ带 ������ �� 
 �� Ŭ������ Ŭ���� �տ� ��abstract�� Ű���带 �ٿ�
 �߻�Ŭ������ ����ؾ� �ϸ�,
 �߻� Ŭ������ ������ ��쿡�� �ҿ����� ������ Ŭ�����̹Ƿ� ��ü�� ������ �� ����.
 �߻� �޼ҵ尡 �������� �ʴ� �߻� Ŭ���������� ��ü�� ������ �� ���� ���̴�. 

��, �߻� Ŭ������ ���������� ������ �� ���� ������ 
����� ���ؼ��� �����ϸ� 
�߻� Ŭ�������� ��ӹ��� ���� Ŭ���������� 
�ݵ�� �߻� �޼ҵ带 �������̵�(Overrding)�ؾ� �Ѵ�.


�� 
��abstract�� Ű�����
 Ŭ������ �޼ҵ忡���� ����� �� ������ ��� ������ ���� ���������� ��� �Ұ��ϴ�.
�� �߻� �޼ҵ尡 �ϳ��� ������ �߻� Ŭ������ �ȴ�.
�� class �տ� abstract �� ������ �߻� Ŭ������ �ȴ�.

*/
//�߻� Ŭ����
abstract class SortInt
{
	private int[] value;
	protected void sort(int[] value)
	{
		this.value = value;
		sorting();
	}

	// �߻� �޼ҵ�
	protected abstract void sorting();
	protected int dataLength()
	{
		return value.length;
	}

	// compare() �޼ҵ�� ũ�� �� �޼ҵ�
	// ��final�� Ű����� ���� �� Ŭ����(SortInt)�� ��ӹ޴� Ŭ��������
	// �� �޼ҵ带 �������� �� ����.
	protected final int compare(int i, int j)
	{
		int x = value[i];
		int y = value[j];
		if (x==y)
			return 0;
		else if(x>y)
			return 1;
		else
			return -1;
	}

	// swap() �޼ҵ�� �ڸ� �ٲ� �޼ҵ�
	// ��final�� Ű����� ���� SortInt Ŭ������ ��ӹ޾� ����ϴ� Ŭ��������
	// ��� �� �޼ҵ常ŭ�� Overriding �ؼ� ������� ����~~!!!
	// ��� �ǹ� ����
	protected final void swap(int i, int j)
	{
		int temp = value[i];
		value[i] = value[j];
		value[j] = temp;
	}

}

// SortInt(�߻�Ŭ����)�� ��ӹ��� Ŭ���� �� �ϴ� �߻�Ŭ����
//-> �߻�޼ҵ� ��sorthing()���� Override -> �Ϲ� ���� Ŭ����
//public abstract class Test111 extends SortInt
public class Test111 extends SortInt
{
	int i, j;
	static int[] data = {7, 10, 3, 8, 7};

	@Override
	//protected abstract void sorting();
	protected void sorting()			//�� ���� �ϱ�
	{

		//���� -> �ϼ�
	
		// Selection Sort
		for (i=0; i<dataLength()-1; i++)
		{
			for (j=i+1; j<dataLength(); j++)
			{
				if (compare(i, j)>0)	// ũ�� �� (���� ����) 
					swap(i, j);			// �ڸ� �ٲٱ� compare�� 1�̸� swap�� �Ͼ�� =(�ڸ� �ٲ�)
			}

			// �߰�
			System.out.print((i+1) + " Round Data : ");
			for (int n: data)
				System.out.print(n + " ");
			System.out.println();
		}

	}//end Sorting 

	public static void main(String[] args)
	{
		//SortInt111 ob = new SortInt111();
		//Test111 ob = new Yest111();
		System.out.print("Source Data : ");
		for(int n : data)
			System.out.print(n + " ");
		System.out.println();
		
		Test111 ob = new Test111();

		ob.sort(data);


		System.out.print("Sorted Data : ");
		for(int n : data)
			System.out.print(n + " ");
		System.out.println();

	}

}

/*
Source Data : 7 10 3 8 7
Sorted Data : 3 7 7 8 10
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
<�߰�>
1 Round Data : 3 10 7 8 7
2 Round Data : 3 7 10 8 7
3 Round Data : 3 7 7 10 8
4 Round Data : 3 7 7 8 10
*/