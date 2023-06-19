package ch05_array;

public class Test08_array2 {
	public static void main(String[] args) {
		double ki[][]={
				{160.5, 175.5},
				{163.7, 178.8}
		};
		
		for(int i=0; i<ki.length; i++){
			for(int j=0; j<ki[i].length; j++){
				System.out.print(ki[i][j]+" ");
			}
		System.out.println();
		}
		
		
		
	}

}
