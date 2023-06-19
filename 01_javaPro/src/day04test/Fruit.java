package day04test;

public class Fruit {
	private String name;
	private String color;

	Fruit(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	void view() {
		System.out.println("����: " + name + ", ���� : " + color);
	}
}

class Orange extends Fruit {
	private int price;

	Orange(String name, String color, int price) {
		super(name, color);
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	void view() {
		// super.view();
		System.out.print("����: " + getName() + ", ���� : " + getColor());
		System.out.println(", ���� : " + price);
	}
}

class Apple extends Fruit {
	private int price;

	Apple(String name, String color, int price) {
		super(name, color);
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
}
