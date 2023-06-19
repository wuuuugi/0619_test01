package chapter_test;

public class Prac04_2 {

	public static void main(String[] args) {
		int ndan ;
		int nhang;
		
		for(ndan=2; ndan<=9 ;ndan++){
			for( nhang=1; nhang<=9; nhang++){
				System.out.println(ndan+"X"+nhang+"="+ndan*nhang);
				if(ndan <= nhang)
				break;
			}
			
			System.out.println();		
		}
	}
}

