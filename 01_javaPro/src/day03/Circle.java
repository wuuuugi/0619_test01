package day03;

public class Circle {
	int radius;
	String name;

	Circle(){
		System.out.println("�⺻ ������ ȣ��");
	}
	Circle(int radius){
		this.radius = radius;
	}
	Circle(int a, String n){
		System.out.println("�Ű� ���� ������ ȣ��");
		radius =a;
		name = n;
	}
	int getRadius(){
		return radius;
	}
	
}
