package ch05_array;

public class Test09_array2 {
	public static void main(String[] args) {
		String name[]={"ÀÓ¿µ¿õ","±èÅÂ¸®","¹ÚÀººó"};
		int score[][]={
				{70,80,90},
				{80,90,100},
				{77,88,99}
		};
		int sum=0;
		
		for(int i=0; i<score.length; i++){
			System.out.print(name[i]+" ");
			for(int j=0;j<score[i].length; j++){
				System.out.print(score[i][j]+" ");
				sum+=score[i][j];
			}
			System.out.println("="+sum);
			sum=0;
		}
		
	}

}
