/*	===========================
	■■컬렉션 프레임워크■■
	=========================== */
/*
★	Map-> Hashtable, HashMap
	java.util.Map 인터페이스는 
	키(key)를 값(value)에 매핑(mapping)하며,
	각 키는 한개의 값만을 매핑해야 한다.				=> 즉, 하나의 키 값에 대응하는 하나의 값을 갖는 자료구조이다

★HashMap<K, V>클래스
- Hashtable 클래스와 마찬가지로 Map인터페이스에서 상속받은
	HashMap클래스의 기능은 Hashtable과 동일하지만
	Synchronozation이 없기 떄문에 동시성 문제가 없다면
	(즉, 멀리 스레드 프로그램이 아닌 경우라면)
	HashMap을 사용하는것이 성능을 향상!!!!!!

또한, HashMap은 Hashtable클래스와 달리 null을 허용
*/
import java.util.HashMap;
import java.util.Map;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test167 
{
	public static void main(String[] args)	throws IOException
	{
		// HashMap자료구조 인스턴스 생성
		//HashMap<String,String> map = new HashMap<String,String>();
		Map<String,String> map = new HashMap<String,String>();
		
		//Map이라는 해시맵 자료구조에 요소 추가
		//-> put()			//키,값의 구조
		map.put("드라마", "빈센조");	
		map.put("영화", "그래비티");	
		map.put("만화", "도라에몽");	
		
		//더미 확인
		System.out.println(map);			//{드라마=빈센조, 영화=그래비티, 만화=도라에몽}


		System.out.println("====================");

		//null입력시도
		map.put(null,null);
		map.put("소설",null);
		map.put(null,"생각하는사람");		// null 실행 됨
		// 위의 데이터 입력 유형에 따라 모든 종류의 데이터 입력이 가능하지만
		//마지막 null 을 key로 매핑 된 "생각하는 사람"이
		//최초 null을 key로 매핑하는 null을 덮어쓰는 상황이 발생하게 된다.
		//즉!HashMap은 null을 하나의 고유한 key 값으로 간주한다(인식한다)

		//더미 확인
		System.out.println(map);			//{null=생각하는사람, 소설=null, 드라마=빈센조, 영화=그래비티, 만화=도 라에몽}


		System.out.println("====================");

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("카테고리,타이틀 입력(컴마구분): ");		//"그림, 모나리자"
		String[]  temp;
		
			for (String str; ((str=br.readLine()) != null); )
			{
				temp = str.split(",")	;		//"그림, 모나리자"
				if (temp.length<2)
				{
					System.out.print("카테고리,타이틀 입력(컴마구분): ");
					continue;
				}
				map.put(temp[0].trim(),temp[1].trim());
				System.out.println(map);

				//카테고리,타이틀 입력(컴마구분): 그림, 모나리자
				//{null=생각하는사람, 소설=null, 그림=모나리자, 드라마=빈센조, 영화=그 래비티, 만화=도라에몽}
			}
		
	}
}
/*
{드라마=빈센조, 영화=그래비티, 만화=도라에몽}
====================
{null=생각하는사람, 소설=null, 드라마=빈센조, 영화=그래비티, 만화=도 라에몽}
====================
카테고리,타이틀 입력(컴마구분): 그림,모나리자
{null=생각하는사람, 소설=null, 그림=모나리자, 드라마=빈센조, 영화=그 래비티, 만화=도라에몽}

*/