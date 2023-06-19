package day06;

public class Boxing {
	public static void main(String[] args) {

		int n = 10;
		Integer intObject = n; // auto boxing
		System.out.println("intObject = " + intObject);
		int m = intObject + 10; // auto unboxing
		System.out.println("m = " + m);
		
		String s2 = " Java Programming ";
		System.out.println(s2.toLowerCase());
		System.out.println(s2.toUpperCase()+"test");
		System.out.println(s2.trim()+"test");
		System.out.println(s2.trim().toLowerCase());
	}

}
