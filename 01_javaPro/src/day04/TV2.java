package day04;

public class TV2 {
	private int size;
	TV2(){
		System.out.println("TV2 기본 생성자");
	}
	TV2(int size){
		System.out.println("TV2 파라미터 생성자");
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
		System.out.println("ColorTV 기본 생성자");
	}
	ColorTV(int size,int color){
		super(size);
		this.color=color;
		System.out.println("ColorTV 파라미터 생성자");
	}

	void setColor(int color) {
		this.color = color;
	}

	void printProperty() {
		System.out.println(getSize() + "인치 " + color + " 컬러");
	}

}
