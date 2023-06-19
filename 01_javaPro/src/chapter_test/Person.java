package chapter_test;

public class Person {
	int age;
	String name;
	boolean married;
	int child;
	
	public static void main(String[] args) {
		Person jperson  = new Person();
		jperson.age=40;
		jperson.name="James";
		jperson.married=true;
		jperson.child=3;
		
		System.out.println("나이가 "+jperson.age+", 이름이 "+jperson.name);
		System.out.println("이 남자는 결혼을 "+jperson.married);
		System.out.println("자식이 "+jperson.child+"명 있습니다");
	}
	
	
}

