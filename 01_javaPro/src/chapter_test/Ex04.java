package chapter_test;

public class Ex04 {

	public static void main(String[] args) {
		int fatherAge =45;
		int motherAge = 47;
		int num= 10;
		boolean isEven;
		
		char ch;
		ch = (fatherAge > motherAge)? 'T' : 'F';
		
		isEven = ((num%2)==0)? true : false;
		
		System.out.println(ch);
		System.out.println(isEven);

	}

}
