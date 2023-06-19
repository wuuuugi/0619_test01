package day04test;

public class Shape_m {

	static void paint(Shape p) {
		p.draw(); // p�� ����Ű�� ��ü ���� �������̵��� draw() ȣ��.
		// ���� ���ε�
	}

	public static void main(String[] args) {
		Line line = new Line();
//		paint(line);
//		paint(new Shape());
//		paint(new Line());
//		paint(new Rect());
//		paint(new Circle());

		Shape start, last, obj;
		// ��ũ�� ����Ʈ�� ���� �����Ͽ� ����
		start = new Line(); // Line ��ü ����
		last = start;
		
		obj = new Rect();
		last.next = obj; // Rect ��ü ����
		last = obj;
		
		obj = new Line(); // Line ��ü ����
		last.next = obj;
		last = obj;
		
		obj = new Circle(); // Circle ��ü ����
		last.next = obj;
		// ��� ���� ���
		Shape p = start;
		while (p != null) {
			p.draw();
			p = p.next;

		}
	}
}
