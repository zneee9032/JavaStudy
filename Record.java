/*	=========================
	■■■■클래스와 인스턴스■■■■
	- 클래스와 인스턴스활용
	========================= */
/*학생 별로 국어점수, 영어점수, 수학점수를 입력받아
총점,평균을 게산하는 프로그램을 구현한다.
단,클래스의 개념을 활용하여 작성할 수 있도록 한다
또한, 이과제에서 배열을 적극적으로 활용할 수 있도록 한다

/*Record 클래스
-속성만 존재*/

class Record

{
	//학생 1명을 표현할 수 있는 속성들로 구성			check~!!!!
	String name;				//이름
	//int kor,eng,mat;			//각 과목의 점수(국어, 영어 , 수학)
	int[] score = new int[3];	//score[0] =국어, score[1] = 영어, score[2] =수학
	int tot;					//총점
	double avg;					//평균
	int rank;					//석차(등수)

//=========================================================================================================클래스 성적으로 넘어가셈~!


	public void setName(String name)
	{
		this.name = name;

	}

	public String getName()

	{
		return name;
	}

	public void setScore(int a, int b, int c)	//국어 영어 수학 점수를 받을것이다
	{
		score[0]=a;
		score[1]=b;
		score[2]=c;
	}

	public int[] getScore()
	{
		return score;

	}

}

