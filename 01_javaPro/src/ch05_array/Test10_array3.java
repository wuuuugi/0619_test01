package ch05_array;
/* int a [] : 1차원 배열
 * int a [][]: 2차원 배열 
 * int a [][][] : 3차원 배열 
  		 면  행 렬 
  3차원 배열
 */


public class Test10_array3 {
	public static void main(String[] args) {
		char ch[][][]={
				{{'a','b','c'},{'d','e','f'}},
				{{'g','h','i'},{'j','k','l'}}
		};
		for (int i=0; i<2; i++){
			for(int j=0 ; j<2; j++){
				for(int k=0; k<3; k++){
					System.out.print(ch[i][j][k]);
				}//inner for
				System.out.println();
			}// middle for
			System.out.println();
		}//out for
		
		
	}//main_end

}//clas_end
