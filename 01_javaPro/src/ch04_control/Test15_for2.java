package ch04_control;

public class Test15_for2 {
	public static void main(String[] args) {
		for(int i=1;i<5;i++){
			for(int j=1;j<6-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<i*2;k++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		int ndan ;
		int nhang;
		
		for(ndan=2; ndan<=9 ;ndan++){
			for( nhang=1; nhang<=9; nhang++){
				System.out.println(ndan+"X"+nhang+"="+ndan*nhang);
			
			}
			
			System.out.println();		
		}
	}

}
