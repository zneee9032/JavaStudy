/*==================================================================
  ■■■ 컬렉션 프레임 워크 (Collection Framework) ■■■
★★★★★★★★★★★!!중요함!!★★★★★★★★★★★★★★2021-08-12
- Vector
=====================================================================*/
// Vector v = new Vector();
//비어 있는 Vector자료구조 생성

//Vector v = new Vector(8);
//8개의 초기element를 가진Vector자료구조 생성
// 8개가 모두 채워지게 되면 (모자라게 되면) 자동으로 확장된다

//Vector v = new Vector(3, 5);
//3개의 초기 element를 가진 Vector자료구조 생성
//3개가 모두 채워지게 되면(모자라게 되면) 자동으로 5개 증가된다

//벡터는 데이터 요소로서 정수형/실수형/문자열 등을 담아내는 것이 가능하다 -> 데이터 안전성 확보

import java.util.Vector;
import java.util.Iterator;

class MyVector extends Vector<Object>	// <Object>형태로 상속받을때 <Object>를 붙인다.
{
	// 생성자
	MyVector()
	{
		//--Vector(1,1) : 부모 생성자에 두 개의 매개변수를 넣음 (슈퍼 클래스)
		super(1,1);
		//-- 첫 번째 인자 : 주어진 용량
		//   두 번째 인자 : 증가량
	}
	void addInt(int i)
	{
		addElement(new Integer(i));
	}
	void addFloat(float f)
	{
		addElement(new Float(f));
	}
	void addString(String s)
	{
		addElement(s);
	}

	void addCharArray(char[] a)
	{
		addElement(a);
	}


	void write()
	{
		Object o;
		int length = size();
		System.out.println("벡터의 크기 : " + length);

		for (int i=0; i<length; i++)
		{
			o = elementAt(i);
			// 『instanceof』 연산자

			//-- 처리해야 하는 대상의 객체 타입 확인
			if (o instanceof char[])
			{
				// System.out.println("문자배열 : " + o.toString());
				System.out.println("문자배열 : " + String.copyValueOf((char[])o));

			}
			else if (o instanceof String)	//-- o가 String타입인지 확인하는 연산자
			{
				System.out.println("문자배열 : " + o.toString());
			}

			else if (o instanceof Integer)

			{
				System.out.println("정수형 : " + o);
			}

			else if (o instanceof Float)

			{
				System.out.println("실수형 : " + o);
			}

			else

			{
				System.out.println("타입 확인 불가~!!!");
			}

		}
		//--==>> 벡터의 크기 : 4
		//       정수형 : 5
		//       실수형 : 3.14
		//       문자배열 : 안녕하세요
		//       문자배열 : study

		//-------------------------------------------------------------------------
		System.out.println();


		Iterator<Object> it = this.iterator();	//<Object> 확인
		while (it.hasNext())

		{

			System.out.println(it.next());
		}

		//--==>> 5
		//       3.14
		//       안녕하세요
		//       [C@6d06d69c
	}

}
public class Test155

{
	public static void main(String[] args)

	{

		// MyVector 클래스 인스턴스 생성
		MyVector v = new MyVector();

		// 주요 변수 선언 및 초기화
		int digit = 5;
		float real = 3.14f;
		String s = new String("안녕하세요");
		char[] letters = {'s','t','u','d','y'};


		v.addInt(digit);			//-- 벡터 자료구조에 정수 저장
		v.addFloat(real);			//-- 벡터 자료구조에 실수 저장
		v.addString(s);				//-- 벡터 자료구조에 문자열 저장
		v.addCharArray(letters);	//-- 벡터 자료구조에 배열주소(배열을객체로취급했다) 저장

		//--==> 5
		//      3.14
		//      안녕하세요
		//      [C@6d06d69c

		v.write();

	}
 
}


