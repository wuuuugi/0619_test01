package ch06_oop;
/* 오버로드: 하나의 클래스안에 이름이 같은 메서드가 여러개 있는경우 
 * 오버로드 메서드는 매개변수 자료형이 다르거나 매개변수갯수가 달라야한다 
 */
public class Test05_method {
	public int sum(int a, int b){
		int s = a+b;
		return s;
	}
	public int sum(int a, int b,int c){
		int s = a+b+c;
		return s;
	}
	public double sum(double a, double b){
		double s= a+b;
		return s; 
	}
	public static void main(String[] args) {
		Test05_method t=new Test05_method();
		int a1 = t.sum(10, 20);
		int a2 =t.sum(100, 200, 300);
		double a3=t.sum(178.8, 167.7);
		
		System.out.println("a1:"+a1);
		System.out.println("a2:"+a2);
		System.out.println("a3:"+a3);
		
		//Math 클래스 오버로드 
		//static 메서드  객체 생성 않고도 호출가능 
		//클래스 이름.메서드();
		System.out.println(Math.max(12.5, 77.7));
		System.out.println(Math.max(3.5f, 5.7f));
		System.out.println(Math.max(10, 20));
		System.out.println(Math.max(30L, 40L));
		
		
		
		
		
	}

}
