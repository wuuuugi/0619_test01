package ch02_data_type;

public class Test05 {
	public static void main(String[] args) {
	
		int a=15;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toOctalString(a));
		System.out.println(Integer.toHexString(a));
		
		int b=015;
		System.out.println(b);
		
		int c=0x0a;
		System.out.println(c);
	}
}
