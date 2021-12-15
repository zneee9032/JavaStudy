/*
사용자로부터 이름,국어점수,영어점수, 수학점수를 입력받아
이름과 총점을 출력하는 프로그램을 구현한다

실행 예)
이름을 입력하새요: 김진희
국어 점수 입력 : 90
영어 점수 입력 : 80
수학 점수 입력 : 70

결과
이름 : 김진희
총점: 240
계속하려면 아무 키나 누르세요..
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// 지금껀 또 다른 에러~ ㅎㅎㅎ

public class Test013
{
									// 응 이건 처음에 실수하기 쉬운 부분~ ^^
	//public static void main(String[] args) throw IOException
	public static void main(String[] args) throws IOException
	{
		//ⓐ 주요 변수 선언
		// BufferedReader 인스턴스 생성
			//InputStreamReader isr = new InputStreamReader(System.in);
			//BufferedReader br = new BufferedReader(isr);
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
			
	// 대소문자 구분~ ^^
	//String strname;				//이름 변수
	String strName;
	int nKor, nEng, nMat;		//국어, 영어 ,수학 점수 변수
	int nTot;					//총점 변수

	//추가 변수 선언
	String strTemp;				//문자열 데이터 임시 저장 변수

	//연산 및 처리
	//-사용자에게 안내 메세지 출력(이름 입력 안내)
	System.out.print("이름을 입력하세요 : ");

	//사용자가 입력한 값(외부 데이터)을 변수 담아내기
	strName = br.readLine();

	//사용자에게 안내 메세지 출력(국어 점수 입력 안내)
	System.out.print("국어 점수 입력 : ");

	//사용자가 입력한 값(외부데이터)을 변수에 담아내기
	strTemp = br.readLine();							//"90"

	//담아낸 값을 필요한 변수에 옮겨 담기
	nKor = Integer.parseInt(strTemp);					//"90"
	//임시 저장 변수 strTemp애 담겨 있는 값을
	//형변환 후 국어점수 변수에 담아내기

	// 사용자에게 안내 메세지 출력(영어 점수 입력 안내)
	System.out.print("영어 점수 입력 : ");

	//사용자가 입력한 값 (외부 데이터)을 변수에 담아내기
	strTemp = br.readLine();							//"80"

	//담아낸 값을 필요한 변수에 옮겨 담기
	nEng = Integer.parseInt(strTemp);
	//임시 저장 변수 strTemp애 담겨 있는 값을
	//형변환 후 국어점수 변수에 담아내기

	System.out.print("수학 점수 입력 : ");
	strTemp = br.readLine();
	nMat = Integer.parseInt(strTemp);

	// 각 점수 변수에 담겨 있는 데이터 (입력 데이터)들을
	//종합하여 총점을 산출하고
	//그 결과를 총점 변수에 담아내기

	nTot = nKor + nEng +nMat;

	//결과 출력
	System.out.println("\n=== [결과]===");
	//System.out.out.printf("이름 ; %s\n", strName);
	// 당황해서 out 이 두 번 들어간 케이스~ ㅋㅋㅋ
	System.out.printf("이름 ; %s\n", strName);
	System.out.printf("총점 : %d\n",nTot);

	}
}