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
		
		System.out.println("���̰� "+jperson.age+", �̸��� "+jperson.name);
		System.out.println("�� ���ڴ� ��ȥ�� "+jperson.married);
		System.out.println("�ڽ��� "+jperson.child+"�� �ֽ��ϴ�");
	}
	
	
}

