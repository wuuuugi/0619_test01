package ch03_oper;

public class Test06 {

	public static void main(String[] args) {
		int a = 7 ;
 		int c = a<<2;
 		// 00000111
 		// 00011100
 		System.out.println(c);
 		
 		a = 7; 
 		int d = a >> 2 ;
 		// 00000111
 		// 00000001
 		System.out.println(d);
 		
 		boolean bb= true;
 		bb=!bb;
 		System.out.println(bb);

	}

}
