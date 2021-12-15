/*	===========================
	■■컬렉션 프레임워크■■
	=========================== */		// 다시!!!!!!!!!!!!!!!!!!!!뭔지 모르겠음 ㅜㅜㅜ!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

/*
● Set 자료구조 ->HashSet/ TreeSet
- 순서 없음
-중복을 허용하지 않는 구조(기본)


☆ TreeSet<E>클래스

	java.util.TreeSet<E>클래스는
	Set인터페이스를 상속한SortedSet 인터페이스를 구현한 클래스로
	데이터를 추가하면 데이터들이 자동으로 오름차순 정렬이 수행된다.			==>> 자동정렬 기능 ==> 리소스 소비 ↑, 성능이 떨어짐

*/
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Comparator;

public class Test165
{
	public static void main(String[]args)
	{
		//TreeSet자료구조 인스턴스 생성
		TreeSet<String> set = new TreeSet<String>();

		//TreeSet 자료구조 set에 요소 추가 -> add();
		set.add("하울의 움직이는 성");
		set.add("이웃집토토로");
		set.add("아기공룡둘리");
		set.add("귀멸의칼날");
		set.add("겨울왕국");
		set.add("짱구는못말려");
		set.add("인사이드아웃");
		set.add("명탐정코난");
		set.add("원령공주");

		//Iterator를 활용한 set요소 전체 출력
		Iterator<String> it = set.iterator();	
		while (it.hasNext())
		{
			System.out.print(it.next()+ " ");
		}
		System.out.println();
		//겨울왕국 귀멸의칼날 명탐정코난 아기공룡둘리 원령공주 이웃집토토로 인사이드아웃 짱구는못말려 하울의 움직이는 성
		//===> 가나다라 순서..?

		//TreeSet자료구조 인스턴스 생성
		//TreeSet<String> set2 = new TreeSet<String>();
		//TreeSet<GradeVO> set2 = new TreeSet<GradeVO>();
		TreeSet<GradeVO> set2 = new TreeSet<GradeVO>(new MyComparator<GradeVO>());

		//GradeVO ob = new GradeVO();

		set2.add(new GradeVO("18102146","김진희",90,80,70));
		set2.add(new GradeVO("16101596","이주안",99,88,77));
		set2.add(new GradeVO("18101395","한혜리",66,55,44));
		set2.add(new GradeVO("18101334","이유진",33,22,11));
		set2.add(new GradeVO("18102122","최현아",45,55,65));

		//Iterator를 활용한 set2 요소 전체 출력												====>★기준(비교)이 있어야 정렬이 됌

		/*
		Iterator<GradeVo> it2 = set2.iterator();
		while (it2.hasNext())
			System.out.print(it2.next() + " ");
		System.out.println();	//==>에러 발생
		*/
		
		/*
		// my comparactor클래스 설계, TreeSet생성 구문 변경후 다시 실행
		Iterator<GradeVo> it2 = set2.iterator();
		while (it2.hasNext())
			System.out.print(it2.next() + " ");
		System.out.println();

		//==> 해시코드가 나와하는 결과 출력								//출력해서 확인 하세요 ㅠㅠ
		================================================================================================> */

		Iterator<GradeVO> it2 = set2.iterator();
		while (it2.hasNext())
		{
			GradeVO vo = its.next();
			System.out.printf("%7s %7s %4d %4d %6d\n ", vo.getHak(),vo.getName(),vo.getKor(),vo.getEng(),vo.getMat(),vo.getTot());
		}
		System.out.println();
	}
}


	// VO	-> Value Object==================================================값이 담아짐
	// DTO	-> Data Trasfer Object===========================================데이터 전송
	// DAO	-> Data Access Object

	class GradeVO
	{
		//주요속성 구성
		private String hak;
		private String name;
		private int kor, eng, mat;
		
		//생성자 정의-> 5개의 매개변수 를 가진 생성자
		GradeVO(String hak, String name, int kor, int eng, int mat)
		{
			this.hak = hak;
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.mat = mat;
		}
			
		//생성자 (사용자 정의 생성자-> 매개변수 없는 생성자)
		// 매개변수가 존재하는 생성자를 사용자 정의 생성자로 구성하여
		// default 생성자가 자동으로 삽입되지 않을 것을 우려하여 추가로 정의한 생성자
	
		//get,set
		GradeVO()
		{	
			//학번
			String getHak()
			{
				return hak;
			}
			void setHak(String hak)
			{
				this.hak = hak;
			}
			//이름
			String getName()
			{
				return name;
			}
			void setName (String name)
			{
				this.name = name;
			}
			//국어
			int getKor()
			{
				return kor;
			}
			void setKor(int kor)
			{
				this.kor = kor;
			}

			//영어
			int getEng()
			{
				return eng;
			}
			void setEng(int eng)
			{
				this.eng = eng;
			}
			
			//수학
			int getMat()
			{
				return mat;
			}
			void setMat(int mat)
			{
				this.mat = mat;
			}
		}
		// 추가 메소드 정의 (총점 산출)
		int getTot()
		{
			return kor+eng+mat;
		}
	}//end class GradeVO

class MyComparator<T>implements Comparator<T>
{
	@Override	//재정의
	public int compare(T o1,T o2)	//요소를 비교 후 결과를 반환! 
	{
		GradeVO s1 = (GradeVo)o1;
		GradeVO s2 = (GradeVo)o2;

		//학번 기준(오름차순)
		return Integer.parseInt(s1.getHak()) - Integer.parseInt(s2.getHak());
		//             "18102146"					"16101596"
		// return Integer.parseInt( "18102146") - Integer.parseInt("16101596");
		// return "18102146"- "16101596";
		// return -1

		// 학번 기준 (내림 차순)
		//return Integer.parseInt(s2.getHak()) - Integer.parseInt(s1.getHak());

		//총점 기준(오름차순)
		//return s1.getTot() - s2.getTot();		//출력해서 확인하세요ㅜㅜ
	
		//총점 기준(내림차순)
		//return s2.getTot() - s1.getTot();		//출력해서 확인하세요ㅜㅜ

		/*
		//이름을 기준(오름차순)
		//return 정수형;
		System.out.println(s1.getName().compareTo(s2.getName()));	
		return	s1.getName().compareTo(s2.getName());	
		*/


		//이름을 기준(내림차순)
		return	s2.getName().compareTo(s1.getName());
	}
}