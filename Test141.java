/*=======================================
  ■■■ 자바의 주요(중요) 클래스 ■■■ 2021-08-11
  - Math 클래스
=======================================*/
/*
java.lang.Math클래스는
수학(mathematics)과 관련된 유용한 속성과 함수들을 제공하는 클래스로
생성자가 있긴하지만 『private』으로 선언되어있기때문에 외부에서객체(인스턴스)를 생성할수없다.
단, 모든 메소드가 『static』으로 정의 되어 있으므로 객체를 생성하지 않고 바로 접근하여 사용하는 것이 가능하다

○java.lang.Math클래스의 주요상수 및 메소드
-public static final double E =2.71...;
	:자연 로그 함수

-public static final double PI = 3.141592//;
	:원주율 π
	
-public static double sin(double a)
-public static double cos(double a)
-public static double tan(double a)
:sin(a),cos(a),tan(a)값을 반환한다 (삼각함수)

- public static double asin(double a)
- public static double acos(double a)
- public static double atan(double a)
: asin(a), acos(a), atan(a) 값을 반환한다. (삼각함수의 역함수)

public static double toRadians(double angdeg)
: 각도를 라디안으로 바꾸어 반환한다

public static double toDegrees(double angrad)
:라디안을 각도로 바꾸어 반환한다

public static double exp(double a)
: e 의 a 승을 구하여 반환한다.

- public  static double log(double a)
: 로그(log) 값을 구하여 반환한다.

- public static double sqrt(double a)
: a 의 제곱근을 구하여 반환한다.

 - public static double ceil(double a)
 : a 보다 크거나 같은 정수를 반환한다. (올림의 개념)

- public static double floor(double a)
 : a 보다 작거나 같은 정수를 반환한다. (절삭의 개념)

 - public static double pow(double a, double b)
: a 의 b 승을 구하여 반환한다.

 - public static int round(float a)
 - public static long round(double a)
 : a 를 반올림하여 결과값을 반환한다.

 - public static double random()
 : 0.0 ~ 1.0 사이의 난수(임의의 실수)를 발생시켜 반환한다. 

생성자가 있긴하지만 『private』으로 선언되어있기때문에 외부에서객체(인스턴스)를 생성할수없다.
단, 모든 메소드가 『static』으로 정의 되어 있으므로 객체를 생성하지 않고 바로 접근하여 사용하는 것이 가능하다

인스턴스 불가
*/
public class Test141
{
	public static void main(String[]args)
	{
		System.out.println("원주율 : " + Math.PI );	
		//원주율 : 3.141592653589793

		System.out.println("2의 제곱근 : " + Math.sqrt(2));
		//2의 제곱근 : 1.4142135623730951

		System.out.println("파이에 대한 Degree  : " + Math.toDegrees(Math.PI));
		System.out.println("2파이에 대한 Degree : " + Math.toDegrees(2.0*Math.PI));

		//--==>> 파이에 대한 Degree  : 180.0
		//       2파이에 대한 Degree : 360.0


		double radian45 = Math.toRadians(45);	// 각도를 라디안으로 변환~!!!

		System.out.println("싸인   45 : " + Math.sin(radian45));
		System.out.println("코싸인 45 : " + Math.cos(radian45));
		System.out.println("탄젠트 45 : " + Math.tan(radian45));

		//--==>> 싸인   45 : 0.7071067811865475
		//       코싸인 45 : 0.7071067811865476
		//       탄젠트 45 : 0.9999999999999999



		System.out.println("로그 25 : " + Math.log(25));
		//--==>> 로그 25 : 3.2188758248682006



		System.out.println("2의 4승 : " + Math.pow(2,4));		
		//       2의 4승 : 16.0




		System.out.println("0.0 ~ 1.0 사이의 난수 : " + Math.random());
		//--==>> 0.0 ~ 1.0 사이의 난수 : 0.15300282625322648
		//		0.0 ~ 1.0 사이의 난수 : 0.7655136161758561
		//		0.0 ~ 1.0 사이의 난수 : 0.9899979549509641
	}

}


