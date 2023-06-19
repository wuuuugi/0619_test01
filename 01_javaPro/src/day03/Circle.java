package day03;

public class Circle {
	int radius;
	String name;

	Circle(){
		System.out.println("기본 생성자 호출");
	}
	Circle(int radius){
		this.radius = radius;
	}
	Circle(int a, String n){
		System.out.println("매개 변수 생성자 호출");
		radius =a;
		name = n;
	}
	int getRadius(){
		return radius;
	}
	
}
