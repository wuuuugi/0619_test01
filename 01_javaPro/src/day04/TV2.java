package day04;

public class TV2 {
	private int size;
	TV2(){
		System.out.println("TV2 �⺻ ������");
	}
	TV2(int size){
		System.out.println("TV2 �Ķ���� ������");
	}

	void setSize(int size) {
		this.size = size;
	}

	int getSize() {
		return size;
	}
}

class ColorTV extends TV2 {
	private int color;
	
	ColorTV(){
		System.out.println("ColorTV �⺻ ������");
	}
	ColorTV(int size,int color){
		super(size);
		this.color=color;
		System.out.println("ColorTV �Ķ���� ������");
	}

	void setColor(int color) {
		this.color = color;
	}

	void printProperty() {
		System.out.println(getSize() + "��ġ " + color + " �÷�");
	}

}
