/*============================================================
			 ■■■ 자바의 주요(중요) 클래스 ■■■ 2021-08-09
- Wrapper 클래스 

Integer.MAX_VALUE / Integer.MIN_VALUE / Double.isInfinite
===============================================================*/
public class Test131
{
	public static void main(String[] args)
	{

		System.out.println(Integer.MAX_VALUE);	//--==>>  2147483647
		System.out.println(Integer.MIN_VALUE);	//--==>> -2147483648

		System.out.println(Long.MAX_VALUE);		//--==>>  9223372036854775807
		System.out.println(Long.MIN_VALUE);		//--==>> -9223372036854775808



		System.out.println(Double.MAX_VALUE);	//--==>> 1.7976931348623157E308
		System.out.println(Double.MIN_VALUE);	//--==>> 4.9E-324


		System.out.println();


		System.out.println("1 : " + 3.0/0);				//--==>> 1 : Infinity
		System.out.println("2 : " + -3.0/0);				//--==>> 2 : -Infinity


		System.out.println("3 : " + (3.0/0 == 3.0/0));		//--==>> 3 : true
		System.out.println("4 : " + (3.0/0 == -3.0/0));		//--==>> 4 : false

 
		// 『Double.isInfinite()』

		System.out.println("5 : " + Double.isInfinite(3.0/0));	//--==>> 5 : true
		System.out.println("6 : " + Double.isInfinite(-3.0/0));	//--==>> 6 : true




		System.out.println();




		System.out.println("7 : " + (3.0/0 + -3.0/0));	//--==>> 7 : NaN (NaN : Not a Number 어떤 형태로도 규정할 수 있는 숫자가 아님)
		System.out.println("8 : " + 0.0/0);			//--==>> 8 : NaN
		System.out.println("9 : " + (0.0/0 == 0.0/0));	//--==>> 9 : false (NaN은 비교자체가 불가능)---★ 
		System.out.println("10: " + (0.0/0 != 0.0/0));	//--==>> 10: true

		// ※ NaN(Not a Number) 값과 임의의 수를 
		//    『==』 연산자를 통해 비교연산을 수행하게 되면
		//    결과는 언제나 『false』를 반환한다.

		//『Double.isNaN()』
		//	: 
		System.out.println("11: " + Double.isNaN(0.0/0));		//--==>> 11: true

	}

}


