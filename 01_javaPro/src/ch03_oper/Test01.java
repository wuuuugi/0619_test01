package ch03_oper;

public class Test01 {

	public static void main(String[] args) {
		int a =10,b=7;
		
		int s1 = a+b;
		int s2 = a-b;
		int s3 = a*b;
		int s4 = a/b;
		int s5 = a%b;
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
		double pageCount=37.0;
		System.out.println((int)pageCount/10);
		System.out.println(pageCount%10);
		System.out.println("페이지수:"+(((int)pageCount/10) + ((pageCount%10==0)? 0:1)));
		//자동형변환
		double x =37;
		System.out.println(x/10);
		System.out.println(x);
	}

}
