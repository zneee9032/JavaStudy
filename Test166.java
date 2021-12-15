/*	===========================
	■■컬렉션 프레임워크■■
	=========================== */
/*
★	Map-> Hashtable, HashMap
	java.util.Map 인터페이스는 
	키(key)를 값(value)에 매핑(mapping)하며,
	각 키는 한개의 값만을 매핑해야 한다.				=> 즉, 하나의 키 값에 대응하는 하나의 값을 갖는 자료구조이다

★Hashtable<K, V>클래스
- 해시 테이블 구조를 객체 모델링한 클래스로 검색이 용이하기 때문에 사용 빈도가 높은 편에 속한다.
- 해시테이블이란 키(key)와 그에 상응하는 데이터 (value)로 구분된 데이터 구조이다
- 데이터를 저장하고, 검색하기 위해서 키(key)로 접근하며 이구조에서는 키 값을 부여 하면 해당 데이터가 변환 된다
- 또한 Hashtable클래스는 key 또는 value의 값으로 null을 허용되지 않는다===========================================> 현실에서 많이 쓰는 구조



★- 또한 Hashtable클래스는 key 또는 value의 값으로 null을 허용되지 않는다
*/
import java.util.Hashtable;
public class Test166
{
	private static final String[] names
	={"서승균", "김진희","최현정","손범석","최수지", "이찬호"};
	private static final String[] tels
	={"010-3733-7202","010-7389-9032","010-8805-8143","010-4550-7043","010-3288-6988","010-3370-5057"};
	public static void main(String[] args)
	{
		Hashtable<String,String> ht = new Hashtable<String,String>();
		
		//ht라고 명명한 Hashtable자료구조에
		//배열 name, tels)에 담겨있는 데이터를 요소로 담아내기
		//-> put(k.v)
		for (int i=0; i<names.length; i++)
		{
			ht.put(names[i], tels[i]);
		}

		//ht 라는 Hashtable의 값을..key를 이용하여 검색
		//-> get(k)
		String findName1 = "최현정";
		String str = ht.get(findName1);
			if (str != null )
			{
				System.out.println(findName1 + "전화 번호 : " + str);
			}
			System.out.println();		//최현정전화 번호 : 010-8805-8143

			//ht.라는 Hashtable 자료구조에...key가 존재하는지의 여부확인
			//--> containsKey()
			String findName2 = "윤유동";
			if (ht.containsKey(findName2))
			{
				System.out.println(findName2 + "데이터가 존재합니다.");
			}
			else	
				System.out.println(findName2 + "데이터가 존재하지 않습니다");
			System.out.println();		//윤유동데이터가 존재하지 않습니다

			String findName3 = "이찬호";
			if (ht.containsKey(findName2))
			{
				System.out.println(findName3 + "데이터가 존재합니다.");
			}
			else	
				System.out.println(findName3 + "데이터가 존재하지 않습니다");
			System.out.println();		//이찬호데이터가 존재하지 않습니다

			//ht라는 Hashtable 자료구조에...value가 존재하는지의 여부 확인
			//->contains()
			String findTel1 =" 010-3733-7202 ";
			if (ht.contains(findTel1))
			{
				System.out.println(findTel1 + "데이터가 존재합니다");
			}
			else
				System.out.println(findTel1 + "데이터가 존재하지 않습니다.");
			System.out.println();				// 010-3733-7202 데이터가 존재하지 않습니다.
		
			//ht라는 HashTable자료구조에서..『김진희』 데이터 삭제
			//--> remove()
			ht.remove("김진희");
			//『remove()』메소드는 인자값으로 key를 넘겨받지만
			// 이때, key만 삭제되는 것이 아니다.
			//해당 key 와 연결(해당) 되어 있는 value도 함께 remove()된다

			//삭제(remove())이후 key 가 존재하는지 확인
			if (ht.containsKey("김진희"))
			{
				System.out.println("진희가 존재 합니다!");
			}
			else
				System.out.println("진희 어디갔어~!!!!!");
			System.out.println();				//진희 어디갔어~!!!!!
			

			//삭제(remove())이후 key가 존재하는지 확인
			if(ht.contains("010-7389-9032"))
				System.out.println("010-7389-9032 데이터가 존재합니다.");
			else
			


			//중복된 key 입력
			ht.put("손범석","010-1234-1234");
				System.out.println(ht.get("손범석"));
				System.out.println();			//010-1234-1234
			//기존 "010-4550-7043"에서 "010-1234-1234"로 변경되었음(덮어쓰기 개념)
			//--------------------------------------------------------------------------------

			//중복 된 value 입력
			ht.put("권순모", "010-8805-8143");

			System.out.println(ht.get("최현정"));
			System.out.println(ht.get("권순모"));
			System.out.println();				//010-8805-8143
												//010-8805-8143 => value는 중복된 값이 입력되어도 기존 데이터에 아무런 영향이 없음
		
			
	}
}