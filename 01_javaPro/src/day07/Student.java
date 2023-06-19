package day07;

public class Student extends Person {
	private int stuNum;

	void study() {
		System.out.println("공부하기");
	}

	@Override
	void eat() {
		System.out.println("학식을먹는다 ");
	}

}
