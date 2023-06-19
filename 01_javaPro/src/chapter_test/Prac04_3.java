package chapter_test;

public class Prac04_3 {

	public static void main(String[] args) {
		int line = 4 ;
		int start = 1;
		int space = line/2 +1;
		
		for (int i=0; i< line; i++){
			for (int j = 0; j<space ; j++){
				System.out.print(" ");	
			}
			for (int j = 0; j<start ; j++){
				System.out.print("*");	
			}
			for (int j = 0; j<space ; j++){
				System.out.print(" ");	
			}
			space-=1;
			start +=2;
			System.out.println();
			
		}

	}

}
