//→ 블럭 단위 주석문 처리
//자바 프로그램의 클래스 이름은 첫글자를 대문자로 시작
//자바 프로그램 시작할때 클래스(class)와 main()함수를 기본적으로 입력
//소스 저장시 클래스 이름과 동일한 파일 이름으로 저장
//단, 이 때 확장자는 JAVA


public class Test001
{
			// main() 이라는 이름을 가진 함수(메소드)
			//-- 자바 인터프리터가 처음 찾는 메소드
	public static void main(String[] args)
	{
		System.out.println("김진희");
		/*
		이것은 내이름이야
		성은 김
		이름은 진희
		*/
		System.out.println("내 나이는 23살");

		//
		// 앞으로 당분간 우리가 코딩해야 하는 영역
		//
		
		//이름() → 함수 (메소드)호출
		// * 자바에서의 함수는 독립적으로 존재 할 수 없고,
		// 클래스에 정의되는 형태로 만들어져야한다.

		//println() 호출
		System.out.println(1 + 1);
		System.out.println(30);
		System.out.println(20-5);

		//ex:구급상자.외용약.마데카솔();
		//System 도구상자 안의 out 상자 안의 
		//print()이라는 도구 즉,메소드 (함수)
	}
}

//실행결과
/*
김진희
2
30
15
계속하려면 아무 키나 누르십시오...
*/