/*==================================================================
  ■■■ 컬렉션 프레임 워크 (Collection Framework) ■■■
★★★★★★★★★★★!!중요함!!★★★★★★★★★★★★★★2021-08-12
-Vetor접근 방식
=====================================================================*/
//검색 및 삭제
import java.util.Vector;
public class Test157
{
	
	// 정적 문자열 배열 선언 및 초기화
	private static final String[] colors = {"검정","노랑","초록","파랑","빨강","연두"};

	public static void main(String [] args)
	{
		//벡터 자료구조 v생성
		Vector<String> v = new Vector<String>();
		//벡터 자료구조에 v에 color 데이터를 요소로 추가
		for(String color : colors)
		v.add(color);

		//벡터 자료구조 v의 전체요소 출력
		System.out.print("전체 요소 출력 : " );
		for(String str : v)
			System.out.print(str + " " );
		System.out.println();
		//전체 요소 출력 : 검정 노랑 초록 파랑 빨강 연두

		//indexOf()
		int i  =v.indexOf(s1);
		System.out.println(s1 + "-->index 위치 : " + i);
		System.out.println(); 

		String s2 ="노랑";
		//『v.contains(s)』
		//벡터 자료구조 v에 찾고자 하는 s가 포함되어 있다면..
		if(v.indexOf(s2))
		{
			//벡터 자료구조 v에서 s2의 인덱스 위치 확인
			System.out.println(s2 + "--->index 위치 : " +i);
			//우선 위의 코드를 통해 제거하고 하는 대상의 위치를 찾고 찾았으면 삭제~!!
			v.remove(i);
		}
		
	}
}