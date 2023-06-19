package day04;

public class Human {
	private String name;
	private String local;
	private String number;
	private int age;

	Human(String name) {
		this.name = name;
		this.local = "알수 없음";
		this.number = "알수 없음";
		//this(name,"알수 없음","알수 없음",0);
	}

	Human(String name, String local) {
		this.name = name;
		this.local = local;
		this.number = "알수 없음";
		//this(name,local,"알수 없음",0);
	}

	Human(String name, String local, String number) {
		this.name = name;
		this.local = local;
		this.number = number;
		//this(name,local,number,0);
	}

	Human(String name, String local, String number, int age) {
		this.name = name;
		this.local = local;
		this.number = number;
		this.age = age;
		//this(name,local,number,age);
	}

	 public String toString() {
		return "이름은 " + name + ", 주소는 " + local + ", 핸드폰번호는 "
				+ number + " 입니다.";
	}
}
