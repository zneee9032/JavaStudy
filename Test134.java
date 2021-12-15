/*============================================================
			 ■■■ 자바의 주요(중요) 클래스 ■■■ 2021-08-10
○StringBuffer클래스
===============================================================*/
/*
※ StringBuffer 클래스는
	문자열을 처리하는 클래스로 String클래스와 차이점은
								String클래스는 내부 문자열 데이터의 수정이 불가능 하지만
								StringBuffer클래스는 문자열을 사용할때, 내부 문자열을 실행 단계(런타임 시점)에서 변경 가능

	즉,String Buffer객체는 가변적인 길이를 가지므로
		객체를 생성하는 시점에서 미리 그 크기나 값을 지정하거나 실행시점에 버퍼의 크기를 바꿀수 있는 기능을 제공』

	+	JDK 1.5이후부턴, 문자열을 처리하는 StringBuilder라는 클래스도 제공한다
							String Builder클래스의 기능은 StringBuffer클래스와 동일하지만
							가장 큰 차이점은 muli-thread unsafe라는 점이다
							즉, Syncronizaion이 없기 때문에
							String Buffer보다 빠르며 동시성(동기화) 문제가 없다면
							String Builder를 사용하는것이 성능을 향상시킬 수 있다.』		String Buffer 동시성(동기화) 기능 탑재 ->성능 저하
																											↓
																								String Builder

*/
public class  Test134

{

	public static void main(String[] args)

	{

		StringBuffer sb1 = new StringBuffer("korea");
		StringBuffer sb2 = new StringBuffer("korea");

		System.out.println(sb1 == sb2);			//--==>> false
		System.out.println(sb1.equals(sb2));	//--==>> false
//String Buffer는 서로 주소값도 다르고 크기도 다름?
		System.out.println(sb1);				//--==>>korea
//toString은 오버라이딩
		System.out.println(sb1.toString());		//--==>>korea


		System.out.println(sb1.hashCode());

		System.out.println(sb2.hashCode());



		

		System.out.println(sb1.toString().equals(sb2.toString()));	//--==>> true
									//   =======
									//	 String의 equals


		/*혼자연구 → 값은 같으나 주소값이 다름을 확인

		System.out.println(sb1.toString());		//--==>> korea

		System.out.println(sb1.hashCode());		//--==>> 1829164700

		System.out.println(sb2.toString());		//--==>> korea

		System.out.println(sb2.hashCode());		//--==>> 2018699554

		*/


		StringBuffer sb3 = new StringBuffer();

		//-- StringBuffer 기본 생성자 호출 시(인스턴스 생성 과정)
		//   기본적으로 생성되는 버퍼 크기는 『16』


		//capacity()
		System.out.println("버퍼 크기 : " + sb3.capacity());
		//==>>『버퍼 크기 : 16』으로 출력

		////////////////////////////////////////////////////////////////////////////////////////////////////

		System.out.println(sb3);		
		//--==>> (공백조차 없다)

		
		String name = "김진희";
		name += "김진아";
		name += "김지수";
		System.out.println(name);	//『김진희김진아김지수』출력
		

		sb3.append("seoul");	//append()는 붙여넣는것	// 『sb3 += "seoul"』
		System.out.println(sb3);
		//--==>> seoul
		sb3.append("korea");
		sb3.append("우리나라");
		sb3.append("대한민국");
		System.out.println(sb3);
		//--==>> seoulkorea우리나라대한민국




		System.out.println("버퍼 크기 : " + sb3.capacity());
		//--==>> 버퍼 크기 : 34 ---★
		// 34인 이유? 
		//    기본적으로 생성되는 버퍼 크기는 『16』 
		// 모자라다 싶으면 버퍼 크기를 늘림

		///////////////////////////////////////////////////////////////////////

		//toUpperCase() 소문자 -> 대문자 변환
		String temp1 = "java and oracle";
		System.out.println(temp1.toUpperCase());
		//--==>> JAVA AND ORACLE



		//toLowerCase() 대문자 -> 소문자 변환
		String temp2 = "JAVA AND ORACLE";
		System.out.println(temp2.toLowerCase());	//-- .toLowerCase()는 String클래스엔 정의되어 있다는걸 확인
		//--==>> java and oracle




		//System.out.println(sb3.toUpperCase());
		//System.out.println(sb3.toLowerCase());	//-- .toLowerCase()는 StringBuffer클래스엔 정의되어 있지 않다는걸 확인
		//--==>> 에러 발생




		String temp3 = sb3.toString();			//-- StringBuffer의
		System.out.println(temp3.toUpperCase());
		//--==>> SEOULKOREA우리나라대한민국

		//seoulkorea우리나라대한민국 sb3를 대문자 형태로 바꾸겠다는것이지 내용은 바꾸지 않는다!!!!!!!!
		
		System.out.println(sb3);
		//seoulkorea우리나라대한민국



		// ○ 대상 문자열(sb3) 중 seoul 문자열 앞에
		//    『한국』이라는 문자열 추가
		sb3.insert(0, "한국");				//-- .insert(들어갈 위치, 들어갈 문자열)
		System.out.println("seoul 앞에 『한국』 추가 : " + sb3.toString());
		//--==>> seoul 앞에 『한국』 추가 : 한국seoulkorea우리나라대한민국

		// 한국seoulkorea우리나라대한민국

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// ○ 대상 문자열(sb3) 중 korea 문자열 뒤에
		//    『사랑』이라는 문자열 추가
		//    단, 대상 문자열의 인덱스를 확인하지 말고..

		// 테스트 ⓐ
		System.out.println(sb3.toString());
		//한국seoulkorea우리나라대한민국

		//테스트 ⓑ 
		sb3.insert(12, "사랑");
		System.out.println("korea 뒤에 『사랑』 추가 : " + sb3.toString());
		//--==>> korea 뒤에 『사랑』 추가 : 한국seoulkorea사랑우리나라대한민국
	

		// 테스트 ⓒ
		//sb3.inexof("korea")
		System.out.println(sb3.indexOf("korea"));	//--==>> 7
		//koreark 7번째에서 나온다

		//테스트 ⓓ
		System.out.println(sb3.insert(sb3.indexOf("korea"),"사랑!"));
		//한국seoul사랑!korea사랑우리나라대한민국

		//테스트 ⓔ
		//sb3.insert("korea" 문자열인덱스 + "korea" 문자열길이, "사랑");
		sb3.insert(sb3.indexOf("korea")+"korea".length(), "사랑");
		//				=============		============
		//					7					5		
		System.out.println(sb3);
		//--==>> 한국seoulkorea사랑우리나라대한민국

		/////////////////////////////////////////////////////////////////////////////////////////////////////


		// ○ 『우리나라』 문자열 삭제

		//테스트 ⓐ
		//sb3.delete(14, 18);		//14부터 18까지 삭제
		//--==>> 한국seoulkorea사랑대한민국


		//테스트 ⓑ
		sb3.delete(sb3.indexOf("우리나라"), sb3.indexOf("우리나라")+"우리나라".length());
		System.out.println(sb3);
		//--==>> 한국seoulkorea사랑대한민국




		// ○ 대상 문자열(sb3) 에서
		//    『korea』 이후 문자열 삭제 (korea 포함)
		// 즉, 처리결과 『한국seoul』만 남도록..!

		sb3.delete(sb3.indexOf("korea"), sb3.length());
				//			   ========   ============
				//					7        18
		System.out.println(sb3);
		//--==>> 한국seoul


		///////////////////////////////////////////////////////////////////////////


		// 버퍼 크기 확인
		System.out.println("버퍼 크기 : " + sb3.capacity());
		//--==>> 버퍼 크기 : 34 ---★




		// 문자열(sb3)의 길이 확인 
		System.out.println("문자열의 길이 " + sb3.length());
		//--==> 문자열의 길이 7


		// 버퍼 크기 조절 → 현재 문자열을 담아둘 수 있는 버퍼의 크기로...
		sb3.trimToSize();




		// 버퍼 크기 조절 이후 버퍼 크기 확인
		System.out.println("버퍼 크기 : " + sb3.capacity());
		//--==>> 버퍼 크기 : 7

	}

}


