/*	================================================================================
	■■객체 직렬화 (Object Serialization)■■ <-> object synchronization: 동기화
2021-08-17
	================================================================================ */
/*
○객체 직력화 (Object Serialization)

메모리에 생성된 클래스 객체의 멤버 변수의 현재 상태를 그대로 보존해서 파일에 저장하거나
네트워크를 통해 전달 할 수 있는 기능으로
멤버변수의 갑을 보존한다거나
다른 네트워크에 있는 호스트에 값을 보낼 경우 사용하게 된다

즉, 객체 직렬화는 내용물(=데이터)을 바이트단위로 변환하여 
파일 또는 네트워크를 통해 송수신(스트림)이 가능하게 만들어주는 것으로
이때 객체란 멤버 변수의 메모리만으로 구성된것이다

따라서 메소드와 생성자는 객체 직렬화의 대상에서 제외==> check~!

○객체 직렬화 장점
객체 자체의 내용을 입출력 형식에 구애받지 않고 객체를 파일에 저장함으로서 영속성(영구적으로 보존)을 제공할 수 있으며 
객체 자체를 네트워크를 통해 손쉽게 교환 할수 있다

객체 직렬화는 자바 1.1 이후에 도입되 었는데 이유는 RMI와 Bean때문이다
RMI는 원래 객체 통신을 지원하기 떄문에 객체가 그대로 이동할 수 있어야한다
따라서 이를 지원하기 위해서는 객체 직렬화가 필수

또한 Bean은 설계시 상태에 대한 정보를 저장할때 이객체 직렬화를 사용하면 편하게 객체 상태를 저장 할 수 있다.

○RMI(Remote Method Invocation)
서로 다른 가상 기계장치에 존재하는 함수를 호출하고 실행하는 기능을 담당한다.
서로 다른 통신 구조에 위치한 각각의 원격 객체들 간의
통신 구조를 지원하는개념으로 이해해야한다.

○Bean(빈)
C/S(Client 와 Server)구조적 모델에서 서버측 구조에 해당하며
재사용 가능한 소프트웨어 개체를 만들수 있게 하는 컴포넌트 기술
작성된 개체의 공유가 가능하며 프로젝트에 쉽게 포함시킬수 있도록 한다
클라이언트에게 빈이라는 프로그램 컴포넌트를 분배하는 방식으로 처리

○Serializable인터페이스
객체 직렬화를 하기 위해서 먼저 객체 직렬화가 가능하도록
java.io.Serializable인터페이스를 구현해 주어야한다.
이 인터페이스는 객체 직렬화가 제공되어야 한다는 사실을 JVM에게 알려주는 역할
또한, Serializable인터페이스는 다른 인터페이스와 달리 구현해야할 메소드가 없어 단지 선언만 해주면 된다

형식)
public class 클래스 명 implements Serializable
{
	//..
}

Serializable인텊페이스를 구현한 후
ObjecInputStream클래스와 ObjectOutputStream클래스르 이용하여 객체 단위로 입출력을 수행하게 된다
* 메버 변수가 static으로 선언된 경우(즉, 클래스 변수 일 경우) 객체 직렬화의 대상에서 제외된다


○Object Stream
java.io.ObjectInputStram
ObjectInputStream클래스는 ObjectOutputStream클래스에 의해 파일에 저장되어 있는 객체나 네트워크를 통해 전달된 객체의 직렬화를 해제하는 기능을 제공
단,java,io.Enternaluzable인터페이스를 지원해주는 객체에 대해서만 사용이 가능

즉, Serializable인터페이스와 Enternalizable인터페이스를 구현한 객체에서만 사용이 가능하다
이때, readObject()메소드를 이용하여 스트림으로부터 직렬화된 객체를 읽을수 있으며 
이렇게 읽은객체는 배열,문자열 또는 각 객체등원래의 형(Type)으로 캐스팅 해 줘야한다

*/
import java.io.File;
import java.util.Hashtable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Enumeration;

public class Test173
{
	public static void main(String []args) throws Exception
	{
		 String appDir = System.getProperty("user.dir");

		//테스트
		//System.out.println(appDir);
		//==>C:\JavaStudy

		//파일객체 생성
		File f0 = new File(appDir, "\\data\\test.ser");
		//--appDir->c:\JavaStudy
		//--appDir 위치 (경로)를 중심으로 "\\data\\test.ser"를
		//구성하겠다는 의미
		//결과적으로 『C:\JavaStudy\data\\test.ser』구성

		//테스트
		//ⓐ
		//System.out.println(f0.getParentFile().exists());
		//==>>false		
		

		//테스트
		//ⓑ『C:\JavaStudy』경로에 『data』디렉토리 생성후 확인
		//System.out.println(f0.getParentFile().exists());
		//==>>true	

		//디렉터리 구성이 존재하지 않는 상황이라면
		if (!f0.getParentFile().exists())
		{
			//디렉터리를 만들겠다
			f0.getParentFile().mkdirs();
		}	
		// data디렉터리 삭제하고 나서 if문을 사용해서 디렉터리를 만들겠다 하더니 data폴더가 또 생김---> 이제 자바안에서 폴더 생성 가능

		//Hashtable 자료구조 인스턴스 생성
		Hashtable<String,String> h1 = new Hashtable<String,String>();

		//생성한 h1 이라는 Hashtable 자료구조에 요소 추가
		h1.put("3","손범석");
		h1.put("4","채지윤");
		h1.put("2","김진령");
		h1.put("5","권순모");
		h1.put("1","장민지");
		
		//테스트
		//System.out.println(h1.get("1"));
		//==>>장민지

		//파일 전용 출력 스트림 생성(수도꼭지 열기)
		FileOutputStream fos = new FileOutputStream(f0);
		//파일 전용 출력 스트림(물줄기)에
		//f0라는 파일 객체를 띄우겠다 (흘려 내보낼수 있도록...)
		//InputStreamReader isr = new InputStreamReader(System.in);

		//객체 전용츌력 스트림 생성
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//객체 전용 출력 스트림(물줄기)으로
		//fos라는 파일 전용 출력 스트림을 감싸겠다
		//BufferedReader br =new BufferedREader(isr);



		//위의 구문과 동일한 구문 
		//ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f0));
		
		//위의 개념과 비교할 구조적으로 동일한 구문
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in))

		//* ObjectOutputStream클래스는
		//객체들을 출력하는 기능을 제공하는 클래스로 출력 스트림에 출력하기전에 내부적으로 객체 직렬화를 수행하게 된다
		//자바객체들을 차일에 저장하거나 네트워크를 통해 전달하기 위해
		//전달할 객체를 직렬화하는 기능을 제공하는것이다
		
		//생성된 스트림에 내보낼 객체를 기록
		oos.writeObject(h1);

	
		oos.close();	
		//ObjectOutputStream 리소스 반납

		fos.close();
		//FileOutputStream 리소스 반납

		//내보내기 끝!
		//=============================================================================================직렬화
		//Java.Study 안에 데이터 폴더 지우고 컴파일 실행하면
		// 다시 data파일 생성하고 『test.ser』 직렬화 파일 내보내진다


		
		//읽어들이기 시작!!!
		if (f0.exists())	//f0 파일객체가존재할경우에만 읽기
		{
			FileInputStream fis = new FileInputStream(f0);
			ObjectInputStream ois = new ObjectInputStream(fis);

			//ois(ObjectInputStram)로 부터 읽어들인 객체 (Object)를  (-> readObject 를 통해 처리)
			//원래의 형 (Hashtable)으로 캐스팅하여
			//h2 라는 Hashtable 자료구조에 담아내기			
			Hashtable h2 = (Hashtable)ois.readObject();		//업캐스팅,,,?  안됌! 고로 다운 캐스팅으로 원래 형변환 해주기
			//object obj = ois.readObject();
			//Hashtable h2 = (Hashtable)obj;

			ois.close();
				// ois리소스 반납 -> ObjectInputStream리소스 반납
			fis.close();
			// fis리소스 반납 -> FileInputStream리소스 반납


		//------------------------------------------------------------------------------> 끝

		//읽어들이는 객체
			String key;
			String value;
	
		//Iterator 사용할 수 없음
		Enumeration e = h2.keys();
			while (e.hasMoreElements())
			{
				key= (String)e. nextElement();
				//key 값을 읽어들이는 과정
			//확인
			//System.out.println(key);
			/*
				5
				4
				3
				2
				1
				계속하려면 아무 키나 누르십시오 . . .
			*/

			value = (String)h2.get(key);
			//key를 활용하여 vlaue 얻는 과정
			System.out.println(key + "-> " + value);
/*
5-> 권순모
4-> 채지윤
3-> 손범석
2-> 김진령
1-> 장민지
계속하려면 아무 키나 누르십시오 . . .

*/
			}
		}

	}
}
