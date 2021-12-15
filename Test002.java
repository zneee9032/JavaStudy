/*=========================
자바 컴파일 및 실행
===========================*/
public class Test002
{
	public static void main(String[] args)
	{
		//ⓐ
		//System.out.println("Welcome to Java");
		//System.out.println("First Java Program");
		
		//ⓑ
		//System.out.print("첫번째 프로그램");
		//System.out.print("두번째 프로그램");

		//ⓒ
		//System.out.print(첫번째 프로그램);
		//System.out.print(두번째 프로그램);
		//→→→→에러 발생

		//ⓓ
		System.out.print("첫번째\n 프로그램\n");
		System.out.print("두번째 프로그램\n");
		//* println() 과 print() 메소드의 차이는
		//라인 스킵 (줄바꿈,개행) 유무
		// '\n' 을 문자열에 포함하면 라인 스킵 가능
		// \(역슬래시를 하나만 넣으면 호출이 안됌)

	}
}
//실행결과
/* ⓐ
Welcome to Java
First Java Program
계속하려면 아무 키나 누르십시오...

/*ⓑ
첫번째 프로그램두번째 프로그램 계속하려면 아무 키나 누르십시오...
*/

//ⓒ
//"" 표가 없음! 에러 발생(컴파일 에러)

//ⓓ
/*첫번째
프로그램
두번쨰 프로그램
*/
