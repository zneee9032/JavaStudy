package JavaStudy01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CircleTest2
{
	//전역 변수 선언
	int r;
	final double PI =3.141592;
	double area;
	double length;
	
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("반지름 입력 : ");
		r = Integer.parseInt(br.readLine());
		
		calArea();
		calLength();
		print(area,length);
		
	}
	
	void calArea()
	{
		area = r * r * PI;
	}
	
	void calLength()
	{
		length = r * 2 * PI;
	}
	
	void print(double a,double l)
	{
		System.out.printf("반지름이 %d인 원의 ",r);
		System.out.printf("원의 넓이 : %.2f",a);
		System.out.printf("원의 둘레 : %.2f",l);
	}
}
