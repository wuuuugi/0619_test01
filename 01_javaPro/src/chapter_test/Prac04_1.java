package chapter_test;

public class Prac04_1 {

	public static void main(String[] args) {
		int ndan ;
		int nhang;
		
		for(ndan=2; ndan<=9 ;ndan++){
			for( nhang=1; nhang<=9; nhang++){
				if(ndan%2==1)
					continue;
					System.out.println(ndan+"X"+nhang+"="+ndan*nhang);			
			}
			System.out.println();		
		}
	}
}
