/*==================================================================
  ■■■ 컬렉션 프레임 워크 (Collection Framework) ■■■
★★★★★★★★★★★!!중요함!!★★★★★★★★★★★★★★2021-08-11

- 큐(Queue)
=====================================================================*/
/*
※ 큐(Queue)

   : 큐(Queue)는 FIFO(First Input First Output): 선입선출 구조로
												===============

    먼저 입력된 자료를 먼저 출력하며 Queue 인터페이스를 구현한 클래스는
    큐와 관련된 다양한 기능을 제공한다.



※ Queue 인터페이스 인스턴스를 생성하기 위해서는 new 연산자를 이용하여
   Queue 인터페이스를 구현한(implements) 클래스의 생성자를 호출한다.
   ex) Queue ob = new LinkedList();



※ 주요 메소드

   - E element()

     : 큐의 head 요소를 반환하며 삭제하지 않는다.

   - boolean offer(E o)

     : 지정된 요소를 큐에 삽입한다.

   - E peek()

     : 큐의 head 요소를 반환하고 삭제하지 않으며, 큐 자료구조가 empty 인 경우 null 을 반환한다.

   - E poll()

     : 큐의 head 요소를 반환하고 삭제하며 큐 자료구조가 empty 인 경우 null 을 반환한다.

   - E remove()

     : 큐의 head 요소를 반환하고 삭제한다.

*/
import java.util.Queue;
import java.util.LinkedList;
public class Test152
{
	public static void main(String[] args)
	{
		//Queue 자료구조 생성
		//Queue myQue = new Queue();					//Queue는 인터페이스라서 이렇게 생성 안됨
		Queue<Object> myQue = new LinkedList<Object>();

		//데이터 준비
		String str1 = "이지영";
		String str2 = "장민지";
		String str3 = "권순모";
		String str4 = "김소연";

		//myQue라는 Queue자료구조에 데이터 추가
		myQue.offer(str1);
		myQue.offer(str2);
		myQue.offer(str3);
		boolean test = myQue.offer(str4);

		System.out.println(myQue);
		//==>>[이지영, 장민지, 권순모, 김소연]				//데이터만 보여주는 것이지 그안에서 꺼내지는것은 아님!

		System.out.println(test);							//자료안에 값이 있는것은 boolean
		//==>true

		//Queue자료구조에서 요소를 제거 하지않고head요소 반환
		System.out.println("값1 :" + (String)myQue.element());		//==>값1 :이지영 출력
		//『myQue』==> 큐라는 자료구조
		//myQue.element()==> object

		System.out.println("값2 : "+ (String)myQue.element());		//값2 : 이지영 출력

		// +) String[] arr = {"홍","길","동"};		//{"홍","길","동"}=> 스트링 배열/"홍"=> 스트링


		System.out.println();		//개행

		String val;
		//①
		//peek()
		//큐의 head요소 반환. 제거 안함!!!!!!!!!!!!!!
		//큐가 empty일 경우 null반환
	/*------------------------------------------------------------------------------------------------------------------------
		while (myQue.peek() != null)							//peek head=> 지영부터 반환
																//poll()=> 반환(출력) 하고 나서 제거
																//empty가 존재하면 null
		{
			//poll()
			//큐의 head요소 반환 제거함
			//큐가 empty 일경우 null 반환
			val = (String)myQue.poll();
			System.out.println("요소 : " + val);

		}

		System.out.println();

			요소 : 이지영
			요소 : 김진희
			요소 : 권순모
			요소 : 장민지
		----------------------------------------------------------------------------------------------------------------------------*/
/*
		//테스트
		while (myQue.poll() != null)
		{
			val =(String)myQue.poll();
			System.out.println("요소 : " +val);
		}
		System.out.println();
		//요소 : 장민지
		//요소 : 김소연
*/


		// ②-------------------------------------------------------------------------------------------------------------
/*
		while (true)

		{
			val = (String)myQue.poll();
			if (val==null)
				break;
			else
				System.out.println("값 : " + val);
			
				//값 : 이지영
				//값 : 장민지
				//값 : 권순모
				//값 : 김소연
			

		}

*/
		
	

		// ③

		while (!myQue.isEmpty())
		{
			val = (String)myQue.poll();
			System.out.println("값 : " + val);
		}
		
				//값 : 이지영
				//값 : 장민지
				//값 : 권순모
				//값 : 김소연
	}//end main

}//end class


