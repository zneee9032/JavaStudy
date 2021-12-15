/*	===========================
	����÷��� �����ӿ�ũ���
	=========================== */
/*
String[]-> List : Array.asList()
List -> Strint[] : List.roArray()
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Test163
{
	public static void main (String[] args)
	{
		List<String> mList = new ArrayList<String>();	
		
		mList.add("1");
		mList.add("2");
		mList.add("3");

		//List-> String[]	==> check~!!!!
		String[] sArrays = mList.toArray(new String[mList.size()]);

		for(String s : sArrays)
			{
				System.out.print(s + " ");
			}
		System.out.println();		//===>1 2 3

		//String[] -> List
		List<String> mNewList = Arrays.asList(sArrays);			//import java.util.Arrays;
		//* ��Arrays.asList()��:�� ��ȯ �ڷ����� List
		for(String s : mNewList)	
		{
				System.out.print(s + " ");
		}
		System.out.println();		//==>1 2 3

	}
}