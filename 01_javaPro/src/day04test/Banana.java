package day04test;

class Banana extends Fruit {
	private int price;

	Banana(String name, String color, int price) {
		super(name, color);
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	void view() {
		System.out.print("원숭이가 좋아하는 바나나==>");
		super.view();
	}
}