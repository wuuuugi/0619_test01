package day06;

public class Pointmain {
	public static void main(String[] args) {
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(4, 1);
//		System.out.println(p.getClass().getName()); // 클래스 이름
//		System.out.println(p.hashCode()); // 해시 코드 값
//		System.out.println(p.toString()); // 객체를 문자열로 만들어 출력
//		System.out.println(p); // 객체 출력
		
		System.out.println(p1 == p2);
		if(p1.equals(p2)){
			System.out.println(true);
		}
		if(p2.equals(p3)){
			System.out.println(true);
		}

	}

}
