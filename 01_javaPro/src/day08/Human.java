package day08;

public class Human {
	private String name;
	private int age;
	private String addr;
	private int javaScore;

	Human(String name, int age, String addr) {
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getAddr() {
		return addr;
	}
	public void setJavaScore(int javaScore) {
		this.javaScore = javaScore;
	}
	

}
