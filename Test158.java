/*==================================================================
  ■■■ 컬렉션 프레임 워크 (Collection Framework) ■■■
★★★★★★★★★★★!!중요함!!★★★★★★★★★★★★★★2021-08-12
-Vetor접근 방식
=====================================================================*/
/*
벡터 자료구조 객체 선언 및 생성 시
사용자 정으 클래스 활용 -> 자료형
*/
//사용자 정의 클래스 설계 -> 자료형 처럼 활용
import java.util.Vector;
class MyData
{
	//주요 속성 구성-> 주요 변수 선언(멤버 변수)
	private String name;		
	private int age;
		
	//getXxx() ->getter
	//setXxx() ->setter
	
	//getter/ setter구성
	//public String gerName()	// 이거 이름 뭐야~~ ㅠㅠ
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}

	//생성자(매개변수 2개인 생성자) -> 사용자 정의 생성자
	public MyData(String name,int age)
	{
			this.name = name;
			this.age = age;
	}
	// 생성자(매개 변수 없는 생성자)-> 사용자 정의 생성자
	public MyData()
	{
			name = "";
			age = 0;
	}
}


public class Test158
{
	public static void main(String[] args)
	{
		//벡터 자료구조 인스턴스 생성
		Vector<MyData> v = new Vector<MyData>();

		//벡터 자료구조 v 에
		//채지윤13세 / 김진령 7세 / 장진하 50세
		//담아내기

		// ⑴방법
		/*
		MyData st1 = new MyData();
		st1.setName("채지윤");
		st1.setAge(13);
		v.add(st1);

		MyData st2 = new MyData();
		st2.setName("김진령");
		st2.setAge(7);
		v.add(st2);

		MyData st3 = new MyData();
		st3.setName("장진하");
		st3.setAge(50);
		v.add(st3);
		--------------------------------------------------------------------------------> 중요!*/

		//(2)방법
		/*
		MyData st1 = new MyData("채지윤",13);
		v.add(st1);
		MyData st2 = new MyData("김진령", 7);
		v.add(st2);
		MyData st3 = new MyData("장진하", 50);
		v.add(st3);
-------------------------------------------------------------------------------------------> 중요*/

		//(3)방법
		v.add(new MyData("채지윤",13));
		v.add(new MyData("김진령",7));
		v.add(new MyData("장진하",50));

		//벡터 자료구조 v에 담긴내용(요소) 전체 출력하기
		//실행 예)
		//이름: 채지윤, 나이 13세
		//이름: 김진령, 나이 7세
		//이름: 장진하, 나이 50세
		
		//(1)
		for(MyData obj : v)		
			System.out.printf("이름 : %s , 나이 : %d세\n", obj.getName(), obj.getAge());
		System.out.println();
		/*
			이름 : 채지윤 , 나이 : 13세
			이름 : 김진령 , 나이 : 7세
			이름 : 장진하 , 나이 : 50세
		*/


		//(2)
		//for (int i=0;v.size();i++)	//-- 수식2 에 조건이 없네... ㅠㅠ
		for (int i=0; i<v.size(); i++)	
			System.out.printf("이름 : %s, 나이 %d세\n",v.elementAt(i).getName(), v.elementAt(i).getAge());
		System.out.println();

		/*
			이름 : 채지윤 , 나이 : 13세
			이름 : 김진령 , 나이 : 7세
			이름 : 장진하 , 나이 : 50세
		*/


		//(3)
		for(Object temp : v)
			System.out.printf("이름 : %s, 나이 : %d세\n",((MyData)temp).getName(), ((MyData)temp).getAge());
		System.out.println();
		/*
			이름 : 채지윤 , 나이 : 13세
			이름 : 김진령 , 나이 : 7세
			이름 : 장진하 , 나이 : 50세
		*/

	}
}