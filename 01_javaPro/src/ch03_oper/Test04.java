package ch03_oper;
/*
	일반논리 연산자 : && || !
	관계연산자는 논리연산 보다 먼저 연산된다 
	관계연산자가 우선순위가 높다, 논리연산보다 

 */
public class Test04 {

	public static void main(String[] args) {
		int a =7, b=5;
		System.out.println(a>b && a>3);
		System.out.println(a>b && a>10);
		
		System.out.println(a>b || a>10);
		System.out.println(a<b || a>10);
		System.out.println(a<b || a<10);
		
		boolean c = false;
		System.out.println(!c);
		System.out.println(!!c);
		
				
		
	}

}
