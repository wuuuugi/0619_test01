package day06;

public class Pointmain {
	public static void main(String[] args) {
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(4, 1);
//		System.out.println(p.getClass().getName()); // Ŭ���� �̸�
//		System.out.println(p.hashCode()); // �ؽ� �ڵ� ��
//		System.out.println(p.toString()); // ��ü�� ���ڿ��� ����� ���
//		System.out.println(p); // ��ü ���
		
		System.out.println(p1 == p2);
		if(p1.equals(p2)){
			System.out.println(true);
		}
		if(p2.equals(p3)){
			System.out.println(true);
		}

	}

}
