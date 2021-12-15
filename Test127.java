/*============================================================
			 ■■■ 자바의 주요(중요) 클래스 ■■■2021-08-09
  - Wrapper 클래스
-Integer.parseInt(a, b);	
===============================================================*/
public class Test127
{
	public static void main (String [] args)
	{
		/*
		boolean bi = true;					//기본형 자료
		Boolean wrapBi = new Boolean(bi);	//boolean 인스턴스 생성
		Boolean wBi = bi;					//기본형자료를 대입 연산 『오토 박싱』

		int ni =300;
		Integer wrapNi = new Integer(ni);
		int ni2 = wrapNi;					//『오토 언박싱』

		float fi = 300.3f;
		Float wrapFi = new Float(fi);

		System.out.println(wrapBi.toString());		//object 형식
		System.out.println(wrapNi.toString());		//object 형식
		System.out.println(wrapFi.toString());		//object 형식
		//==> true
		//==> 300
		//==> 300.3

		System.out.println(wrapBi);
		System.out.println(wrapNi);
		System.out.println(wrapFi);
		//==> true
		//==> 300
		//==> 300.3
		*/

		//Integer 클래스

		String sn = "12";
		int ni = Integer.parseInt(sn);			// 원래 사용 parseInt
		System.out.printf ("ni : %3d\n ", ni);
		//ni :  12

		ni = Integer.parseInt("0101",2);		//매개변수 2개 받는 parseInt도 있다===> 오버로딩, 0101 2진법전환
		System.out.printf("ni : %3d\n", ni);
		// ni :   5

		ni = Integer.parseInt("12",8);		//매개변수 2개 받는 parseInt도 있다===> 오버로딩, 8진법전환
		System.out.printf("ni : %3d\n", ni);
		//ni :  10

		ni = Integer.parseInt("A",16);		//매개변수 2개 받는 parseInt도 있다===> 오버로딩, 16진법전환
		System.out.printf("ni : %3d\n", ni);
		//ni :  10

		sn = Integer.toBinaryString(20);		//12를 2진수
		System.out.printf("sn : %s\n", sn);
		//sn : 10100

		sn = Integer.toHexString(31);			//12를 8진수
		System.out.printf("sn : %s\n", sn);
		//sn : 1f

		sn = Integer.toOctalString(31);			//12를 16진수
		System.out.printf("sn : %s\n", sn);
		//sn : 37


		Integer num = new Integer(50);
		System.out.println(num.toString());
		//50

		int n3 = 345;
		Integer n4 =Integer.valueOf(n3);
		System.out.println(n4);
		//345

		










	}
}