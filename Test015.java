/*=====================================
�ڹ� �⺻ ���α׷���
-�ڹ��� �⺻ �����: System.in.read()
======================================*/

public class Test015

{
	public static void main (String[] args)
	{
		System.out.print("AAA");
		System.out.print("BBB");
		//System.out.print("CCC"\n);    //===>>������ ����
		System.out.print("CCC\n");
		//==>AAABBBCCC

		System.out.println();			//--����
		//System.out.print();			//==>�����߻�

		System.out.printf("12345678901234567890");
		System.out.printf("12345678901234567890\n");		// \n ����
		System.out.printf("12345678901234567890%n");		// %n ����

		//System.out.printf();			//-->�����߻�(������ ����)

		System.out.printf("%d + %d =%d%n" , 10,20,30);		//��� 10 + 20 =30

		System.out.printf("%d\n",100);
		System.out.printf("%10d\n",100);// ���� ���� 100�� ���� �ؼ� 10�ڸ� 
		System.out.printf("%8d\n",100);//���� ���� 100�� ���� �ؼ� 8�ڸ� 
		System.out.printf("%7d\n",100);//���� ���� 100�� ���� �ؼ� 7�ڸ�

/*
AAABBBCCC

1234567890123456789012345678901234567890
12345678901234567890
10 + 20 =30
100
       100
     100
    100
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .*/

		System.out.printf("%+d\n",365);
		System.out.printf("+%d\n",365);
		/*
		+365
		+365 �ι�° ��� ��õ*/

		System.out.printf("%d\n", +365);
		//365

		//SYstem.out.printf("%-d\n",365);
		//==>> ������ ����(��Ÿ��)
		System.out.printf("-%d\n",365);
		//==>>-365
		System.out.printf("%d\n",-365);
		//==>> -365

		System.out.printf("%(d\n",-365);
		System.out.printf("%(d\n",365);
		// ���
		//(365)-->���� �϶�
		//365--> ��� �϶�

		//System.out.printf("%d\n",'A');
		//-->���� �߻�(��Ÿ�ӿ���)
		System.out.printf("%c\n",'A');
		//--->>���ڿ��� %c���==>A

		System.out.printf("%s\n","ABCD");
		//���ڿ����� %S ==>ABCD

		System.out.printf("%h\n",365);
		//16d,10����
		System.out.printf("%o\n",24);
		//30 ,8����
		System.out.printf("%b\n",true);				//true(boolean) vs ."true"()
		//==> true

		System.out.printf("%f\n",123.12);			//123.120000
		System.out.printf("%.2f\n",123.12);			//123.12
		System.out.printf("%.2f\n",123.126);		//123.13(�ݿø�)

		//System.out.printf("%10d\n",123);			//����Ȯ��
		System.out.printf("%8.2f\n", 123.236);		//����Ȯ�� 8�ڸ�,=>__123.24

		System.out.printf("%2.2f\n", 123.236);		//����Ȯ�� 2 ����,=>123.24
		


	}
}

/*
AAABBBCCC

1234567890123456789012345678901234567890
12345678901234567890
10 + 20 =30
100
       100
     100
    100
+365
+365
365
-365
-365
(365)
365
A
ABCD
16d
30
true
123.120000
123.12
123.13
  123.24
123.24
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/
