/*============================================================
			 ■■■ 자바의 주요(중요) 클래스 ■■■ 2021-08-09
-_ Wrapper 클래스 
-java.math.BigDecimal(실수 형태)
===============================================================*/

import java.math.BigDecimal;

public class Test129
{
	public static void main(String [] args)
	{
		BigDecimal a = new BigDecimal("123456789.123456789"); 

		//movePointLeft: 소수점을 왼쪽으로 이동
		BigDecimal b = a.movePointLeft(3);
		System.out.println(b);
		//==>123456.789123456789

		//나눗셈 : divide()->대체 속성확인,반올림 하지 않는다-> 절삭
		BigDecimal c = a.divide(b,BigDecimal.ROUND_DOWN);	//BigDecimal.ROUND_DOWN _ static final
		System.out.println(c);
		//1000.000000000
		System.out.println(BigDecimal.ROUND_DOWN);	
		//1

		//toBigInter()-> BigInteger객체로 변환
		System.out.println(a.toBigInteger());	//실수가 정수로 변환
		//123456789 
	}
}