package day04;

public class Point {
	private int x;
	private int y;
	
	Point(){	
	}
	
	Point (int x, int y){
		this.x = x;
		this.y = y;
	}

	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoint extends Point {
	
	private String color;

	ColorPoint (int x, int y, String color){
		super(x,y);
		this.color=color;
	}
	
	void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}
