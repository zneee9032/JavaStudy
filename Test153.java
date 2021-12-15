/*==================================================================
  ■■■ 컬렉션 프레임 워크 (Collection Framework) ■■■
★★★★★★★★★★★!!중요함!!★★★★★★★★★★★★★★2021-08-12

- 큐(Queue)
=====================================================================*/
import java.util.LinkedList;
import java.util.Queue;

public class Test153
{
	// 정적 문자열 배열 선언 및 초기화
	private static final String[] colors= {"검정","노랑","초록","파랑","파랑","연두"};

	public static void main(String[] args)
	{
		// Queue 자료구조 생성
		Queue<String> qu = new LinkedList<String>();
		//-- Queue 인터페이스 기반의 인스턴스를 생성하기 위해서는
		//   new 연산자를 이용하여 Queue 인터페이스를 implements 한
		//   하위 클래스의 생성자를 호출해야 한다

		
		//qu라는 Queue자료구조에 colors배열의 데이터 입력-> offer()

		for (String color: colors)			//★향상된 for문★
				qu.offer(color);
			
		//qu라는 Queue자료구조의 모든데이터 전체 출력
		while (qu.peek() != null)
				System.out.print(qu.poll() + " ");
			System.out.println();
		//peek()
		//	: 큐의 head요소를 반환하고 삭제하지 않으며 큐 자료구조가 비어 있는 상태가 되면 null 반환
	
		//poll()
		//	:큐의 head요소를 반환하고 삭제 하며 큐 자료구조가 비어 있는 상태가 되면 null값을 반환 

//===>>>>>>검정 노랑 초록 파랑 파랑 연두

	}
}


