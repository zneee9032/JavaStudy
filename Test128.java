/*============================================================
			 ■■■ 자바의 주요(중요) 클래스 ■■■2021-08-09
_ Wrapper 클래스 
-java.math.BigInteger
===============================================================*/
import java.math.BigInteger;
public class Test128
{
	public static void main(String [] args)
	{
		//int a1 =123456789123456789; 
		//System.out.println(a1);===>> int 타입 범위 초과

		//long b1 =123456789123456789123456789L;
		//System.out.println(b1);===> long 타입 범위 초과

		//리턴값이 너무 클때 ! BigInteger 문자열 형태로 넘겨 받게했다
		BigInteger a = new BigInteger("123456789123456789");
		BigInteger b = new BigInteger("123456789123456789");
	
		//BigInteger c = a + b;
		//System.out.println(c);
		//컴파일 오류

		//더하기
		BigInteger c = a.add(b);		
		System.out.println("덧셈 결과 : " + c);
		//덧셈 결과 : 246913578246913578

		//빼기
		BigInteger d = a.subtract(b);
		System.out.println("뺼셈 결과 : " + d);
		//뺼셈 결과 : 0

	
		// 곱하기
		BigInteger e = a.multiply(b);
		System.out.println("곱셈결과 : " + e);
		//--==>> 곱셈결과 : 15241578780673678515622620750190521


		// 나누기
		BigInteger f = a.divide(b);
		System.out.println("나눗셈결과 : " + f);
		//--==>> 나눗셈결과 : 1




		// 지수승
		BigInteger g = new BigInteger("2");
		System.out.println("2의 3승 : " + g.pow(3));		//g.pow
		//--==>> 2의 3승 : 8
		//-- 사용빈도가 높지는 않다.
		
	}
}