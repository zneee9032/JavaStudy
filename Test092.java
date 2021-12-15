/*	=========================
	■■배열■■
	- 배열 복사
	========================= */
/*
※배열 변수의 복사에는 데이터 복사,주소값 복사 두가지 형태가 존재한다
ⓐ주소값 복사는 (얉은 복사_ 원본을 수정하면 복사본에 영향을 미치게 되는복사 방법)
						_ (배열 뿐만아니라 모든 참조형 데이터에 해다아는 복사 방법)

ⓑ데이터 복사는 (깊은 복사_실제 요소로 들어있는 값에 대한 복사로
							원본을 수정해도 복사본에 영향을 미치지 않은 복사)


//Test091.java  파일과 비교!!!!!!!!!!!!!!!!!!!!!! 데이터 복사 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
													++>>int형 배열에 대한 깊은 의미의 복사를 처리하는
													   메소드를 정의하는 형태로 실습을 진행한다
*/
public class Test092
{
	public static void main(String [] args)
	{
		int[] nums ={10,20,30,40,50};		//배열 원본
		int[] copys1 = nums;				//얕은 의미의 배열 복사 수행(주소값 복사)
			
		int[] copys =copyArray(nums);		//깊은의미의 배열 복사 수헹(사용자 정의 메소드 호출)


		//원본 배열 요소의 수정 발생~!!
		nums[1] = 2;			// 20의 자리에 2넣을것이다
		
		//결과 확인
		for (int i=0;i<nums.length ;i++ )
		
			System.out.print(nums[i] + " ");
		System.out.println();
			//==>> 10 2 30 40 50
		
		
		for (int i=0;i<copys1.length ;i++ )
		
			System.out.print(copys1[i] + " ");
		System.out.println();
		//==>> 10 2 30 40 50
		

		

	}
	//매개 변수로 int 배열 타입을 넘겨 받아 이를 복사한후
	//복사한 배열을 반환하는 기능을 가지 메소드 정의
	public static int[] copyArray(int [] os)		//int 배열의 타입으로 int의 os매개변수를 호출! 메소드 이름은 copyArray 
	{
			//매개변수로 넘겨 받은 배열(os)
			//즉, 원본 배열 만큼의 배열방(메모리 공간)을 확보한
			//복사할 배열방 생성
			int[] temp = new int[os.length];		//22번째 줄에 의해 os.length= 5
													//==>> int [] temp = new int[5]

			//원본 배열 (os)에 담겨 있는 각각의 요소들을
			//복사 배열 (temp)에 담아내기
			for (int i=0;i<os.length ;i++ )			//for (int i=0;i<5;i++) i=>  0 1 2 3 4
			{
				temp[i] = os[i];					//temp[0]=os[0]	//temp[1] = os[1] ....temp에 있는것을 os (★ 주소값 배열의 차이점: 배열안에 요소를 옮겨 담기)
			}


			//복사한 배열 (temps)반환
		return temp;

	}
}