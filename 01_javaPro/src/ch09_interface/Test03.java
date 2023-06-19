package ch09_interface;
//인터페이스
interface Animal{
	public void cry();
}
class Cat implements Animal{
	//오버라이딩
	public void cry(){
		System.out.println("애용애용 ");
	}
}
class Dog implements Animal{
	//오버라이딩
	public void cry(){
		System.out.println(" 껄룩 껄룩 ");
	}
}

public class Test03 {
	public static void main(String[] args) {
		Animal ani = new Cat(); //상위 클래스 변수로 하위 객체 처리 
		ani.cry();
		
		ani= new Dog();
		ani.cry();
	}

}
