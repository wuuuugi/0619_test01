package day06;

public class Point {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "Point(" + x + "," + y + ")";
	}

	public boolean equals(Object p) { // x�� y������ ������ true ����
		Point obj = (Point) p;
		if (x + y == obj.x + obj.y) {
			return true;
		} else
			return false;

	}
	
}
