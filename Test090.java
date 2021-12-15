/*	=========================
	■■배열■■
	- 배열과 난수 처리
	========================= */
/*
※ Random 클래스 활용
사용자로부터 임의의 정수를 입력받아
그정수만큼의 난수 (1~100)를 발생시켜 배열에 담고
배열에 담겨읶는 데이터들 중
가장 큰 값과 가장 작은 값을 선택하여
결과를 출력하는 프로그램을 구현한다

실행 예)
발생시킬 난수의 갯수 입력 : 6
(12 46 73 5 3 → 무작위로 발생한 정수들)
(int[] arr {12 46 73 5 3} → 배열에 담아내기 (배열구성))
가장 큰 값: 73, 가장 작은 값 : 3
계속하려면 아무 키나 누르세요
*/
import java.util.Scanner;
import java.util.Random;

public class Test090

{
	public static void main(String[] args)

	{
		// Scanner 클래스 기반 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		// 안내메세지 출력
		System.out.print("발생시킬 난수의 갯수 입력 : ");
		int size = sc.nextInt();


		// size 변수에 담아낸 수 만큼의 배열방 만들기
		// (배열 선언 및 메모리 할당)
		int[] arr = new int[size];


		// 무작위 숫자(난수)를 발생시키기 위해서는
		// 난수 발생 전용 객체가 필요하다.
		// → 『java.util.Random』=========>Scanner처럼 같은 클래스

		Random rd = new Random();			//random객체 생성

		// Random클래스의『rd.nextInt()』
		//0~ 매개변수로 넘겨받은 정수 n~1까지의 수 중
		//무작위 정수(난수) 1개를 발생시킨다


		// 테스트
		//System.out.println("발생한 난수 : " + rd.nextInt(10)); // 매번 실행 시킬 때 마다 달라진다 
		// 0~9 까지의 무작위 정수 한개 발생~!!!!! 
		//System.out.println("발생한 난수 : " + rd.nextInt(5));
		//0~4 까지의 무작위 정수 한개 발생 ~!!!!

		//1~ 100 까지의 무작위 정수 한개
		//System.out.println(rd.nextInt(100)+1);

		//배열 구성
		for (int i=0; i<size; i++)		//Size = 6 → 0 1 2 3 4 5
			arr[i] = rd.nextInt(100)+1; // 1~100 사이의 난수 중 1개 발생~!!!
			//rd.nextInt(100)		는 0~99까지의 무작위 정수 한개 발생
			//rd.nextInt(100) + 1	는 1~99까지의 무작위 정수 한개 발생

		//테스트 → 구성된 배열의 전체 요소 출력
		for (int i=0; i<arr.length ;i++)
			System.out.print(arr[i] + " ");
		System.out.println();

		

		//가장 큰 값, 가장 작은 값 확인

		int max, min;		//-- 최대값, 최소값

		max=min=arr[0];		
		for (int i=1; i<arr.length; i++)

		{

			if (max<arr[i])		// 1

				max=arr[i];
	
			if (min>arr[i])		// 2

				min=arr[i];

			//동시에 max <arr, min > arr 가능 하여 if

		}

		System.out.printf("가장 큰 값 : %d, 가장 작은 값 : %d\n", max, min);


	}

}
/*
발생시킬 난수의 갯수 입력 : 4
22 58 62 28
가장 큰 값 : 62, 가장 작은 값 : 22
계속하려면 아무 키나 누르십시오 . . .

*/
