package day04test;

public class TV {
	private int size;

	public TV(int size) {
		this.size = size;
	}

	protected int getSize() {
		return size;
	}
}

class ColorTV extends TV {
	private int color;

	ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}

	void printProperty() {
		System.out.println(getSize() + "인치" + color + "컬러");
	}
}

class IPTV extends ColorTV {
	private String ip;

	IPTV(String ip, int size, int color) {
		super(size, color);
		this.ip = ip;

	}

	void printProperty() {
		System.out.print("나의 IPTV는 " + ip + "주소의 ");
		super.printProperty();
	}

}