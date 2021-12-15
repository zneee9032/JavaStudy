/*	===========================
	■■컬렉션 프레임워크■■
	=========================== */
/*
○Enumeration과 Interator인터페이스

Collection과 Framework에는
Enumeration과 Interator라는 인터페이스가 있다
사전적인 의미로는 반복, 순환이라는 의미를 가지고 있으며
어떤 객체들의 모임이 있을때.
이 객체들을 어떤수선서에 의해 하나씩접근하여 사용하기 위한것을 인터페이스라고 할 수 있다.

- java.util.Enumeration<E>인터페이스
: 이 인터페이스는 단지 두개의 메소드만을 제공하며 『hasMoreElements()』메소드를 통해 
인터페이스 안에 다음요소가 있는지에 대한 질의를 한다 
만약 true가 반환 되었다면 다음 인덱으에 요소가 존재한다는 의미 이며
『nextElement()』메소드로 다음요소를 꺼내어 사용하면 된다

ex)	v라는 벡터 자료구조에 저장된 모든 요소 접근 및 출력
	for(Enumeration e = v.elements(); e.hasMoreElements();)

	{
		System.out.println(e.nextElement());
	}

-java.util.Interator<E>인터페이스
	: Enumeration과의 차이점은 단지 『remove()』메소드가 추가된 것 뿐!
		Iterator 가 가지고 있는 『hasNext()』와 『next()』메소드는
이름만 약간 다를 뿐 Enumeration인터페이스가 가지고 있는
『hasMoreElements()』와 『nextElement()』와
정확히 일치하는 기능을 수행한다
Enumeration대신 Iterator를 JDK1.2부터 추가하여 사용하게 된 이유는
Enumeration 인터페이스는 집합내에서 요소를 제거 할 방법이 없기떄문에 
이를 보완하기 위한 나온것이 Iterator 인터페이스이다


*/
import java.util.Vector;
import java.util.Enumeration;
import java.util.Iterator;

public class Test160
{
	public static void main(String[] args)
	{	
	//벡터자료구조 인스턴스
	Vector<String> v = new Vector<String>();

	//벡터 자료구조 v 요소추가
		v.add("Java");
		v.add("Oracle");
		v.add("Jsp");
		v.add("Servlet");
		v.add("Spring");
	
		//(1) Enumeration
		//    hasMoreElements()	//-s 요소들!
		//    nextElement()		//넘겨주는 값인가?

		Enumeration<String> e = v.elements();	//자바 오라클 제이에스피 ....
		while (e.hasMoreElements())	//-----====>true,false 반환!=====>자바를 먼저 보게됨 ->nextElement:그 다음값 오라클을 보게 됨
		{
			System.out.println(e.nextElement());
		}
		
		System.out.println();
		/*
			Java
			Oracle
			Jsp
			Servlet
			Spring
		*/

		System.out.println("===============================================================");	//(1)번과 동일하게 기능
		//(2)	Iterator
		//		hasNext()
		//		next()

		Iterator<String> it = v.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
			System.out.println();
		/*
			Java
			Oracle
			Jsp
			Servlet
			Spring
		*/
	}
}