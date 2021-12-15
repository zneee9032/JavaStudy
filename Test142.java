/*=======================================
  ■■■ 자바의 주요(중요) 클래스 ■■■ 2021-08-11
  - Random 클래스 / 로또 번호 생성기 (난수 발생 프로그램)
=======================================*/
/*
java.util.Random클래스는
여러 형태의 난수를 발생시켜 제고하는 클래스이다
Math클래스의 정적 메소드인 random() 메소드도 난수를 제공하는 메소드이지만
0.0~1.0사이의 실수 형태만 발생하게 되므로
필요한 여러 형태의 난수를 만들어내기 위해서는 추가적인 연산들을 수행해야힌디
그래서 자바는 여러형태의 난수를 발생시켜주는 전용 클래스인
Random클래스를 별도로 제공하고 있다

○로또 번호 생성기(난수 발생 프로그램)
프로그램이 실행되면 기본적으로 로또를 5게임 수행하는 프로그램 구현
(작은번호부터 큰 순서로 정렬)

○로또번호: 1~45사이 중복되지 않는 6개의 수
실행 예)
  2 10 12 15 23 36
  1  2  3  8 21 22
  9 16 23 28 34 41
  6  9 14 20 25 43
 11 21 33 36 38 41
*/
import java.util.Random;
public class Test142
{
	public static void main(String[] args)
	{
		// 인스턴스 생성
		Random rd = new Random();

		// 주요 변수 선언
		int temp[] = new int[6];	// 수를 담을 변수
		boolean t = true;

		// 배열생성
		for(int i=0; i<5; i++)	//개행을 위한 포문
		{
			// 난수 발생
			for (int j=0; j<6; j++)	//앞에서부터 비교
			{
				//temp[j] = (int)Math.round(Math.random()*45);
				temp[j] = rd.nextInt(45)+1;

				for (int k=0; k<6; k++)	//뒷번호들과 비교
				{
					if (j==k)
						break;

					else if (temp[j]==temp[k])
					{
						temp[j] = rd.nextInt(45)+1;
						k=0;
					}
				}			
			}

			
			// 선택정렬

			for (int a=0; a<temp.length-1; a++)
			{
				for (int b=a+1; b<temp.length; b++)
				{
					if (temp[a]>temp[b])

					{

						temp[a] = temp[a]^temp[b];
						temp[b] = temp[b]^temp[a];
						temp[a] = temp[a]^temp[b];
					}
				}

			}
			// 결과 출력

			for (int n : temp)
				System.out.printf("%3d", n);
			System.out.println();
		}
	}//end main()

}


