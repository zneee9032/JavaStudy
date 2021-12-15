/*	===========================
	■■컬렉션 프레임워크■■
	=========================== */
/*
List (기반)->Vector,ArrayList....

=> 순서 있음
=> 배열과 유사
=> 중복을 허용

●ArrayList 클래스
-ArrayList와 Vector클래스는
List를 크기 변경이 가능한 배열로 구현한것으로
차이점은Vector클래스의 객체는 기본적으로 동기화 되지만,
ArrayList는 그렇지 않다

- 비동기화 컬렉션은 동기화된 컬렉션보다 더 나은 성능을 제공하여
스레드들이 컬렉션을 공유하지 않는 프로그램에서는
일반적으로 AraayList를 Vector보다 더선호하며,
ArrayList는 동기화를 고려하지 않은 Vector처럼 동작함으로 
스레드 동기화에 따르는 부담을 가지지 않아Vector보다 더 빠르게 실행

- null을 포함한 모든 요소를 허용하며
List인터페이스를 구현하는것 외에 리스트에 격납하기 위해
내부적으로 사용되는 배열의 사이즈를 조작하는 메소드를 제공한다!

=>
ArrayList 비동기화,Vector보다 성능이좋다
*/

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Test161
{
	public static void main (String[]args)
	{
		//ArrayList자료구조 인스턴스 생성
		//ArrayList<String> list = new ArrayList<String>();
		//Vector<String> list = new Vector<String>();
		//List<String> list = new Vector<String>();
		List<String>list1 = new ArrayList<String>();

		//list1 에 요소 추가 ->add()
		list1.add("나이브스아웃");
		list1.add("인셉션");
		list1.add("인터스텔라");
		
		//ArrayList 자료구조 인스턴스생성
		List<String> list2 = new ArrayList<String>(list1);		//list1에 list2를 추가
		
		//list2에 요소 추가
		list2.add("모가디슈");

		//ArrayList자료구조 인스턴스 생성
		List<String> list3 = new ArrayList<String>();
		
		//list3에 list2의 전체요소 추가 ->『addAll();』				//전체를 출력
		list3.addAll(list2);

		//"인셉션" 앞에 "크루엘라"추가
		//(1) 인셉션 찾기 -> indexOf()-> 위치값 인덱스 반환
		int n = list3.indexOf("인셉션");
		
		//System.out.println("인셉션 위치 : " +n );			//==>인셉션 위치 : 1

		//(2) "인셉션"찾은 인덱스 위치에 "크루엘라" 추가
		list3.add(n, "크루엘라");
		



		//출력-> 더미 데이터 확인
		System.out.println("==============================================================");
		System.out.println(list1);		//==>[나이브스아웃, 인셉션, 인터스텔라]

		System.out.println(list2);		//==>[나이브스아웃, 인셉션, 인터스텔라, 모가디슈]

		System.out.println(list3);		//==> [나이브스아웃, 인셉션, 인터스텔라, 모가디슈]
										//==>("크루엘라") 추가 후--> [나이브스아웃, 크루엘라, 인셉션, 인터스텔라, 모가디슈]

		System.out.println();
		// 출력 -> listIterator() 메소드를 활용하여 출력
		System.out.println("==============================================================");
		ListIterator<String> li = list3.listIterator();		//li==>List iterator을 뜻함!
		
		while (li.hasNext())
		{
			System.out.print(li.next() + " ");
		}
		System.out.println();
		//나이브스아웃 크루엘라 인셉션 인터스텔라 모가디슈

		//출력 -> 역순으로 출력
		System.out.println("==============================================================");
		while (li.hasPrevious())
		{
			System.out.print(li.previous() + " ");
		}
		System.out.println();
		//모가디슈 인터스텔라 인셉션 크루엘라 나이브스아웃



	}
}