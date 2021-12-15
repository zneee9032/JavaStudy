/*============================================================
			 ■■■ 자바의 주요(중요) 클래스 ■■■ 2021-08-10
○StringTokenizer
===============================================================*/
/*
StringTokenizer 클래스는
문자열 파싱(parshing)을 위한 정보를 제공하는 클래스로 파싱(parshing) 하고자 하는 문자열을 인자로 받아 생성하는데

여기에서 파싱(parshing)이란!
하나의 문자열을 여러문자열로 나누는 작업을 의미하게 되며, 이떄 나누는 단위가 되는 문자열을 토큰이라고 한다

StringTokenizer클래스를 사용하기위해서는 
java.util패키지의 StringTokenizer를 import해야한다

StringTokenizer 클래스는 ★--- 호환성을 유지하는 목적으로 보관 유지되고 있으며 (기존에 많이 쓰이니 알아두자는 의미)---★
문자열을 파싱 하기 위해서는
 String클래스의 split()메소드나 java.util.regex패키지를 
사용할것을 권장한다

○생성자 
	- 원형
	StringTokenizer(Strig str)
	StringTokenizer(Strig str, String delim,)
	StringTokenizer(Strig str, String delim,boolean returnDelims)
	→ 주어진 문자열 str을 단어로 분리하는 객체를 생성하며
	공백 (구분) 문자는 delim에 포함된 문자로 처리하게된다
	만약 returnDelims 가 true라면 구분문자도 분리된 데이터로 처리하게 된다
	
*/
import java.util.StringTokenizer;		//--->collection framework 데이터 처리 방식이 StringTokenizer유사방식
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test136

{
	public static void main(String[] arg) throws IOException
	{

		String strTemp;
		String[] strArr;
		int n;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		//문자열을 split으로 자름


		System.out.print("파싱할 문자열 입력(컴마구분) : ");	//"사용자가 사과,딸기,바나나,토마토"
		strTemp = br.readLine();


		// StringTokenizer 클래스 인스턴스 생성
		StringTokenizer st = new StringTokenizer(strTemp, ",");
		//-- strTemp 를 대상 문자열로...
		//   『,』를 구분자로...


		strArr = new String[st.countTokens()];		//st.countTokens() -> 4를 반환
		//-- int countTokens()
		//   : 파싱된 문자열의 갯수를 리턴(반환)한다.


		n=0;
		while (st.hasMoreTokens())

		{
			strArr[n++] = st.nextToken();
		}

		// 『st.hasMoreTokens()』 
		//                      : 사용할수 있는 토큰이 남아 있는 경우 true
		//						  더이상 사용할 토큰이 남아 있지 않은 경우 flse를 반횐
		//						  확인 결과만 반환 할 뿐.. 실제 내용을 읽어 들이는 헤드(▼)를 이동시키지 않는다


		// 『st.nextToken()』 : 
								//다음토큰을 얻어온다
								//다음 토큰을 얻어오며 헤드(▼)를 이동시키게 한다
								// 구분자를 바꾸었을 경우 다음호출에도
								//바뀐 구분자를 이용하여 토큰을 분리한다
	

		System.out.print("파싱된 토큰(문자열) : ");
		for (String str : strArr)
			System.out.print(str + " ");
		System.out.println();

	}

}

/*
파싱할 문자열 입력(컴마구분) : 사과,딸기,바나나,토마토
파싱된 토큰(문자열) : 사과 딸기 바나나 토마토
*/

/*
st"사과,딸기,바나나,토마토"
st.countTokens(); -> 4

▼hasMoreTokens(): 있는지 없는지 판별 하는 애
  nextToken(): 값을 가지고 옴
=======================================
"사과, 딸기,바나나, 토마토"
=======================================
사과가 있으면 true
사과가 없으면 false

*/