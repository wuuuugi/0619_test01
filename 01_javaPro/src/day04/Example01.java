package day04;

public class Example01 {
	static String a;
	static int b = 0;
	static int c = 0;

	public Example01(String d, int e, int f) {
		a = d;
		b = e;
		c = f;
	}

	public void show() {
		System.out.println(a + "���� ���� " + b + "���� " + c + "��ġ TV");
	}

	public static void main(String[] args) {
		Example01 myTV = new Example01("LG", 2017, 32); // LG���� ���� 2017�� 32��ġ
		myTV.show();
		TV myTV1 = new TV("LG", 2017, 32); // LG���� ���� 2017�� 32��ġ
		myTV1.show();
	}

}
