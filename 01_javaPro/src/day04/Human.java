package day04;

public class Human {
	private String name;
	private String local;
	private String number;
	private int age;

	Human(String name) {
		this.name = name;
		this.local = "�˼� ����";
		this.number = "�˼� ����";
		//this(name,"�˼� ����","�˼� ����",0);
	}

	Human(String name, String local) {
		this.name = name;
		this.local = local;
		this.number = "�˼� ����";
		//this(name,local,"�˼� ����",0);
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
		return "�̸��� " + name + ", �ּҴ� " + local + ", �ڵ�����ȣ�� "
				+ number + " �Դϴ�.";
	}
}
