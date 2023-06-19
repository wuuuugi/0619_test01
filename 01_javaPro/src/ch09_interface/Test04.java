package ch09_interface;
//인터페이스 

interface Animal2{
	public void cry();//추상메서드
}
interface Pet{
	public void play();//추상메서드 
}

//인터페이스 다중상속
class Cat2 implements Animal2,Pet{
	//오버라이딩
	public void cry(){
		System.out.println("애용애용애용");
	}
	//오버라이딩
	public void play(){
		System.out.println("쥐잡기 놀이 ");
	}
}//class end 

//인터페이스 다중 상속
class Dog2 implements Animal2,Pet{
	//오버라이딩
	public void cry(){
		System.out.println("껄룩껄룩껄룩");
	}
	public void play(){
		System.out.println("산책하기 ");
	}
	
}// interface end 


public class Test04 {
	public static void main(String[] args) {
		Cat2 c =new Cat2();//객체생성
		c.cry();
		c.play();
		System.out.println();
		
		Dog2 d= new Dog2();
		d.cry();
		d.play();
		
	}//main end

	
}//class end
