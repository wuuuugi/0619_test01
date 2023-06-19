package ch03_oper;

public class Test02 {

	public static void main(String[] args) {
		int a =5; 
		int b =5;
		int x =5;
		System.out.println(a++);
		System.out.println(++b);

		x= ++a + b--;
		System.out.println(x);
		//========================
		a=5;
		int y= ++a + ++a;
		System.out.println(y);
		//========================
		for(int i=1; i<=10 ; i++){
			System.out.println("i : "+i);
		}
		for (char ch ='A'; ch<='Z'; ch++){
			System.out.print(ch);
		}
		System.out.println( );
		for (a =65 ; a<=90; a++){
			System.out.print((char)a);
		}
	}
}
