/*	=========================
	■■배열■■
	- 배열의 배열(2차원 배열)
	========================= */

/*
실행 예)
 1  8  9 16 17		00 01 02 03 04
 2  7 10 15 18		10 11 12 13 14
 3  6 11 14 19		20 21 22 23 24
 4  5 12 13 20		30 31 32 33 34

*/

public class Test084{
	public static void main(String[] args){

		//배열의 선언 및 메모리 할당
		int[][] arr = new int[4][5];
		

		//값 채우기
		int n=1;
		for (int i=0; i<5; i++){
			if(i%2==0){								
				for (int j=0; j<4; j++){
					arr[j][i]=n;					//i가 짝수행(0 2 4)
					n++;													
				}
			}else if(i%2!=0){						
				for (int j=3; j>=0; j--){
					arr[j][i]=n;					//i가 홀수행(1 3)
					n++;					
				}
			}
		}

		//전체 요소 출력
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.printf("%2d ",arr[i][j]);
			}
			System.out.println();
		}

	}
}
/* 실행 결과
 1  8  9 16 17
 2  7 10 15 18
 3  6 11 14 19
 4  5 12 13 20
*/