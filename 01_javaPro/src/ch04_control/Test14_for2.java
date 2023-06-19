package ch04_control;

public class Test14_for2 {

	public static void main(String[] args) {
		// 
		for (int i =1; i<=4 ; i++){
			for(int j =1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();

			
		}
		System.out.println();
		for (int i =1; i<6 ; i++){
			for(int j =1; j<=5-i; j++){
				System.out.print(" ");
			}
			for(int j =1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();

			
		}
	}

}
