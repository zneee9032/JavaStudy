/*=====================================
자바 기본 프로그래밍
-자바의 기본 입출력: System.in.read()
======================================*/

public class Test015

{
	public static void main (String[] args)
	{
		System.out.print("AAA");
		System.out.print("BBB");
		//System.out.print("CCC"\n);    //===>>컴파일 에러
		System.out.print("CCC\n");
		//==>AAABBBCCC

		System.out.println();			//--개행
		//System.out.print();			//==>에러발생

		System.out.printf("12345678901234567890");
		System.out.printf("12345678901234567890\n");		// \n 개행
		System.out.printf("12345678901234567890%n");		// %n 개행

		//System.out.printf();			//-->에러발생(컴파일 에러)

		System.out.printf("%d + %d =%d%n" , 10,20,30);		//결과 10 + 20 =30

		System.out.printf("%d\n",100);
		System.out.printf("%10d\n",100);// 우측 정렬 100을 포함 해서 10자리 
		System.out.printf("%8d\n",100);//우측 정렬 100을 포함 해서 8자리 
		System.out.printf("%7d\n",100);//우측 정렬 100을 포함 해서 7자리

/*
AAABBBCCC

1234567890123456789012345678901234567890
12345678901234567890
10 + 20 =30
100
       100
     100
    100
계속하려면 아무 키나 누르십시오 . . .*/

		System.out.printf("%+d\n",365);
		System.out.printf("+%d\n",365);
		/*
		+365
		+365 두번째 방법 추천*/

		System.out.printf("%d\n", +365);
		//365

		//SYstem.out.printf("%-d\n",365);
		//==>> 컴파일 에러(런타임)
		System.out.printf("-%d\n",365);
		//==>>-365
		System.out.printf("%d\n",-365);
		//==>> -365

		System.out.printf("%(d\n",-365);
		System.out.printf("%(d\n",365);
		// 결과
		//(365)-->음수 일때
		//365--> 양수 일때

		//System.out.printf("%d\n",'A');
		//-->에러 발생(런타임에러)
		System.out.printf("%c\n",'A');
		//--->>문자에는 %c사용==>A

		System.out.printf("%s\n","ABCD");
		//문자열에는 %S ==>ABCD

		System.out.printf("%h\n",365);
		//16d,10진수
		System.out.printf("%o\n",24);
		//30 ,8진수
		System.out.printf("%b\n",true);				//true(boolean) vs ."true"()
		//==> true

		System.out.printf("%f\n",123.12);			//123.120000
		System.out.printf("%.2f\n",123.12);			//123.12
		System.out.printf("%.2f\n",123.126);		//123.13(반올림)

		//System.out.printf("%10d\n",123);			//공간확보
		System.out.printf("%8.2f\n", 123.236);		//공간확보 8자리,=>__123.24

		System.out.printf("%2.2f\n", 123.236);		//공간확보 2 무시,=>123.24
		


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
계속하려면 아무 키나 누르십시오 . . .

*/
