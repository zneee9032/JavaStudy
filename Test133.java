/*============================================================
			 ■■■ 자바의 주요(중요) 클래스 ■■■ 2021-08-09
-Strig클래스
○s.substring
===============================================================*/
public class Test133
{
	public static void main(String [] args)
	{
		String s = "seoul Korea";
		System.out.println(s); //seoul Korea


		//○문자열 추출
		System.out.println(s.substring(6,9)); //==substring  >seoul Korea 중에서 Kor (678)만 출력
											  //					                  ===
		// 『String.substring(s,e)』
		// String 문자열을 대상으로 
		// s번째에서 ...e-1번째 까지..
		//(단, 인덱스는 0부터 시작)

	System.out.println(s.substring(7));		//==>orea
	// lanf 패키지의 String클래스의 suvstring 메소드는 오버로딩되어 있음을 추측가능
	// 『String.substring(s)』
	//	String 문자열을 대상으로
	// s번쨰에서 끝까지 (즉, 문자열이 가진 길이만큼)

	//○ 문자열의 데이터 값 비교 : equals
		System.out.println(s.equals("seoul korea"));	//--==>> true
		System.out.println(s.equals("Seoul Korea"));	//--==>> false	//-- 대소문자 구분

	
		System.out.println(s.equalsIgnoreCase("Seoul Korea"));	//--==>> true	//-- 대소문자 구분 안함


		// ○ 찾고자 하는 대상 문자열(s)에
		//    『kor』문자열이 존재할까?
		//    존재한다면 그 위치는 어떻게 될까?--------------------------->s.indexOf메소드를 사용


		// "seoul korea"==============================> 앞에서 부터 찾는다!(0부터 시작!)

		System.out.println(s.indexOf("kor"));     //--==>> 6
		//System.out.println(s.indexOf("ea"));    //--==>> 9
		//System.out.println(s.indexOf("e"));     //--==>> 1		seoul 의 e / korea의 e 가 있는데 이때는 제일 앞서서 seoul의 e로 1이 출력
		//System.out.println(s.indexOf("tt"));     //--==>>-1	    찾고자 하는 문자가 없을때 음수형태!

		//-- 찾고자 하는 문자열이 대상 문자열에 존재할 경우
		//   그 문자열의 인덱스를 반환하지만
		//   존재하지 않을 경우 음수를 반환하게 된다. (-1)
		
		//===================================================================================================>2021-08-09



		// ○ 대상 문자열(s)이 『rea』로 끝나는지의 여부 확인	==>endsWith _ 어떤문자열로 끝나니? True false
		//    (true / false)
		System.out.println(s.endsWith("rea"));	//--==>> true
		System.out.println(s.endsWith("oul"));	//--==>> false




		// ○ 찾고자 하는 대상 문자열(s)에
		//    『e』문자열이 존재할까?
		//    존재한다면 그 위치는 어떻게 될까?		_indexOf
		//    (단, 뒤에서부터 검사)
		//    seoul korea

		System.out.println(s.indexOf("e"));		//--==>> 1			,seoul 의 'e'
		System.out.println(s.indexOf("o"));		//--==>> 2			,seoul 의 'o'
		System.out.println(s.lastIndexOf("e"));		//--==>> 9		,korea 의 'e'		찾는것만 뒤에서 부터 카운팅은 앞에서!
		System.out.println(s.lastIndexOf("o"));		//--==>> 7		,korea 의 'e'




		// ○ 대상 문자열(s) 중
		//    『6』번째 인덱스 위치의 문자는?		=> charAt
		//    seoul korea
		System.out.println(s.charAt(6));	//--==>> k
		System.out.println(s.charAt(0));	//==>> s
		System.out.println(s.charAt(1));	//==>> e
		System.out.println(s.charAt(10));	//==>> a
		//System.out.println(s.charAt(22));	//==>> 에러 발생 (런타임 에러) StringIndexOutOfBoundsException

		
		System.out.println();

		// ○ 대상 문자열(s)과 비교 문자열 『seoul corea』 중
		//    어떤 문자열이 더 큰가?							=>s.compareTo
		//    두 문자열이 다르다면 차이를 확인(사전식 배열)
	
		System.out.println(s.compareTo("seoul korea"));		//-32
		System.out.println(s.compareTo("seoul corea"));		//-24
		



		// ○ 대상 문자열(s) 중
		//    해당 문자를 찾아서 원하는 형태로 수정
		s = "우리나라 대한민국 대한독립 만세";
		s = s.replaceAll("대한", "자주");
		System.out.println(s);
		//--==>> 우리나라 자주민국 자주독립 만세




		// ○ 공백제거
		s = "     사       랑     ";
		System.out.println(s);
		System.out.println(":" + s + ":");
		//--==>> :     사       랑     :

		System.out.println(":"+s.trim()+":");
		//--==>> :사       랑:
		//-- 양쪽 가장자리 공백 제거 =================================>'trim'함수 _ 앞쪽 뒤쪽만  사라짐
		System.out.println(":"+s.replaceAll(" " , "") + ":");
		//-- 양쪽 가장자리 + 가운데 공백도 지울려면 ==================> 'replaceAll'
		//--==>> :사랑:



		//String temp = Integer.pasrseInt("30");
		s = Character.toString('b');
		System.out.println(s);
		//--==>>b
		
		s = Integer.toString(30);
		System.out.println(s);
		//===>30



		int n = 2345678;
		//System.out.printf("%d", n);
		System.out.format("%d", n);		//--==>> 30
		s = String.format("%d", n);		//--==>> 2345678
		System.out.println(s);



		s = String.format("%,d",n);				//print f 대신에 format 사용
		System.out.println(s);			//--==>> 2,345,678

		String.format("%.2f",3.1241592);
		System.out.println();
		//==> 3.14나오지만 컴파일 했을때 출력 x

		s = String.format("%.2f", 3.141592);	//"3.14"
		System.out.println("s 출력 : " + s);
		//s 출력 : 3.14


		String[] sArray = "기본,열정,배려".split(",");				//split =>문자열을 자를때 사용
		for(String str : sArray)						//향상된 for문 => 

		{
			System.out.print(str + " ");
		}

		System.out.println();
		//--==>> 기본 열정 배려		

		//★sArray=> 문자열 배열
	}

}


