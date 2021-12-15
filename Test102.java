/*==============================================
	�����ֹε�Ϲ�ȣ ��ȿ�� �˻����
================================================*/
/*
���ֹε�Ϲ�ȣ ���� ����
�͸����� �ڸ��� ������ ���ڸ� ���� ��Ģ�� �°� ���Ѵ�
	ex) 123456-1234567(�ֹι�ȣ)
		****** ****** ----------------------
		234567 892345 (�� �ڸ��� ������ ��)

�� ��Ģ�� �°� ���� ������ ������ ����� ��� ���Ѵ�
ex) 7 5 0 6 1 5 - 1 8 6 2 1 3 3 
    * * * * * *   * * * * * * *
	2 3 4 5 6 7   8 9 2 3 4 5 
---------------------------------------
�� 14+15+0+30+6+35+8+72+12+6+4+15
	== 217
�� ������ ������� 11�� ������ ������������ ���Ѵ�
	  19
	------
  11|217
	 11
-------------
	107
	 99	
--------------
	  8 �� ������

��11���� ������(��8)�� �� ������� ���Ѵ�
	11 - 8 = 3

	�ب��� ó�� �������� �������� 0�ΰ�� ��11��1
								  1�ΰ�� ��10��0
	�̸� �ٽ� 10���� ������ �������� ���Ѵ�.

�� ���С��� ���� ����� �ֹι�ȣ�� �����ϴ� ������ ���ڿ�
		��ġ�ϴ����� ���θ� Ȯ���Ѵ�
	
	��ġ   �� ��ȿ�� �ֹι�ȣ
	����ġ �� �߸��� �ֹι�ȣ
*/

//���� ��) 
// �ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 123456-12345678 �� �Է� ���� �ʰ�
// >>�Է� ����
//����Ϸ��� �ƹ�Ű�� ��������..

// �ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 123456-123456 �� �Է� ���� �̴�
// >>�Է� ����
//����Ϸ��� �ƹ�Ű�� ��������..

// �ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 990320-2254415 �� ��ȿ�� �ֹι�ȣ
// >>��Ȯ�� �ֹι�ȣ~!!

// �ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 990320-2254417 �� ��ȿ���� ���� �ֹι�ȣ
// >>�߸��� �ֹι�ȣ~!!
//����Ϸ��� �ƹ� Ű�� ��������

//���߰� �� ~!!!
//�迭.length		�� �迭�� ����(�迭���� ����) ��ȯ
//���ڿ�.length()	�� ���ڿ��� ���� ��ȯ
//String str = "abcdefg";
//str.length();		�� 7
//"abcdefg".length(); ��7
//���ڿ�.substring() �湮�ڿ� ����

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test102
{
	public static void main(String [] args)throws IOException
	{
		
/*
		//�׽�Ʈ
		String strTemp = "������";
		System.out.println(strTemp.length());
		//==> 3
		
		strTemp = "���ع��� ��λ���";
		System.out.println(strTemp.length());
		// ==> 9

		strTemp = "study-hard";
		System.out.println(strTemp.length());
		//==>10

		strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(3,5));
		//==>DE
		//ABC DE FGHIJKLMNOPQRSTUVWXYZ
		//012 34 56789...

		strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(13,17));
		// ABCDEFGHIJKLM NOPQ RSTUVWXYZ==> 13���� 16����
		//	==>>	NOPQ
		
		//strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		//System.out.println(strTemp.substring(13,85));
		// ABCDEFGHIJKLMNOPQRSTUVWXYZ==> 13���� 84����
		//���� �߻� (�����Ͽ���)
		// StringIndexOutOfBoundsException:

		strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(5));
		//	==>>	FGHIJKLMNOPQRSTUVWXYZ

		System.out.println(strTemp.substring(5,strTemp.length()));
											// ---------------(strTemp�� ��ü ����)
		//==>>	FGHIJKLMNOPQRSTUVWXYZ
		
*/
		//BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//�Է� ���� �ֹι�ȣ
		String str;
	
		//�ֹι�ȣ�� �� �ڸ����� �������� �� �迭 ����
		int[] gop = {2,3,4,5,6,7,0,8,9,2,3,4,5};
		//           * * * * * * * * * * * * * 
		//			 9 9 0 3 2 0 - 2 2 5 4 4 1  5

		//���� ���� �� ������(��, �� ������ ����� ���� ������ �ֵ��� ó��~)
		int tot =0;

		//����ڿ��� �ȳ� �޼��� ��� �� �ֹι�ȣ �Է� �ޱ�
		System.out.print("�ֹι�ȣ �Է� (xxxxxx-xxxxxxx) : ");
		str = br.readLine();	//Integer�� �ȉ�
		
		if (str.length() !=14)
		{
			System.out.println(">>�Է� ����~!!");
			return;			//�޼ҵ� ���� -> main() �޼ҵ� ���� -> ���α׷� ����
		}
		//�׽�Ʈ
		//System.out.println("�ڸ��� ����");
		/*
		�ֹι�ȣ �Է� (xxxxxx-xxxxxxx) : 990320-2254415
		�ڸ��� ����*/
		// ex) "990320-2254416"
		
		for (int i=0;i<13 ;i++ )
		{
			// System.out.println(i+ " ");	//0 ~ 12


			if (i==6)
			{
				continue;		//�޺κ� �����ϰ� ����ض�
			}

																						//�޺κ�
			tot += gop[i] * Integer.parseInt(str.substring(i,(i+1)));
			//		0��2									0 1 ��"9" ==> tot += 2*9
			//		1��3									1 2 ��"9" ==> tot += 3*9

			//     12��5								  12 13 ��"1" ==> tot += 5*1
		}

		//---------------------------------------���� ���� �����ϸ� ��Ģ�� �°� ���� ������ ������ ����� ��� ���Ѵٱ���~!!
																// ���� tot�� ��� �ִ� ��Ȳ�� �ȴ�.

		int su = 11 - tot % 11;
		//�׽�Ʈ
		//System.out.println(su);
		/*
		�ֹι�ȣ �Է� (xxxxxx-xxxxxxx) : 990320-2254415
		5--------------------------------------------------->> �ֹ� ��ȣ ���ڸ��� 5
		su�� ���� �������� ���ڸ��� ���� ��� �ֹι�ȣ ������ �ڸ����� �� �� �� ���� ��Ȳ
		*/
		su = su % 10;
		
		//������� �����ϸ� ��11���� �������� �� ������� �ֹι�ȣ�� �����ϴ� ������ ���ڿ� ���ڿ� ��ġ �ϴ��� ���Ѵ١����� ���� ����� ���� su �� ��� �ִ� ��Ȳ�� �ȴ�.
	
		//���� ��� ���
		//if (su= �ֹε�� ������ ���ڸ� ����)
		if (su==Integer.parseInt(str.substring(13)))
		
			System.out.println(">>��Ȯ�� �ֹι�ȣ~!!");
		else
			System.out.println(">>�߸��� �ֹι�ȣ~!!");
		
	} 
}
/*
�ֹι�ȣ �Է� (xxxxxx-xxxxxxx) : 990320-2254415
>>��Ȯ�� �ֹι�ȣ~!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

�ֹι�ȣ �Է� (xxxxxx-xxxxxxx) : 990320-2254417
>>�߸��� �ֹι�ȣ~!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

<�ڸ��� �̴�>
�ֹι�ȣ �Է� (xxxxxx-xxxxxxx) : 990320225441
>>�Է� ����~!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

<�ڸ��� �ʰ�>
�ֹι�ȣ �Է� (xxxxxx-xxxxxxx) : 99032022544156
>>�߸��� �ֹι�ȣ~!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/