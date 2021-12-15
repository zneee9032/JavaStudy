/*==================================================================
  ■■■ 컬렉션 프레임 워크 (Collection Framework) ■■■
★★★★★★★★★★★!!중요함!!★★★★★★★★★★★★★★2021-08-11

-스택 _ 후입선출
=====================================================================*/

import java.util.Stack;

public class Test151
{
	// 정적 문자열 배열 선언 및 초기화
	private static final String[] colors = {"검정","노랑","초록","파랑","파랑","연두"};
	public Test151()
	{
		// st 라는 Stack 자료구조 생성
		// 제네릭을 활용하여 자료구조에 담기는 데이터 표현 → 『<String>』
		Stack<String> st = new Stack<String>();	//String만 담겠다고 했기 때문에 다른 타입이 안들어오는거지 사실상 담을수 있었다.

		// st 라는 Stack 자료구조에 데이터 담기
		// colors 라는 문자열 배열 요소를 모두 담아내기
		for(String color : colors)
			st.push(color);

		// 데이터 추가---------------------------------------------------------------------> 추가!
		st.push("하늘");
		// 데이터 추가
		//st.push(10.0);
		//--==>> 에러발생 (컴파일에러)
		//       제네릭 표현식을 통해 선언하고 있는
		//       String 이 아닌 다른 자료형(double)을 스택에 push()하려고 했기 때문...

		// 출력 메소드 호출
		popStack(st);
	}


	// 출력 메소드
	private void popStack(Stack<String> st)
	{
		System.out.print("pop : ");
		while (!st.empty())
			System.out.print(st.pop() + " ");
		System.out.println();
	}

	public static void main(String[] args)
	{
		Test151 ob = new Test151();
	}
}


/*
pop : 연두 파랑 파랑 초록 노랑 검정
계속하려면 아무 키나 누르십시오 . . .

<데이터 추가>
pop : 하늘 연두 파랑 파랑 초록 노랑 검정
계속하려면 아무 키나 누르십시오 . . .
*/