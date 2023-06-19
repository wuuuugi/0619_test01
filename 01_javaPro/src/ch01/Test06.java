package ch01;

public class Test06 {
	public static void main(String args[]){
		Demo d1= new Demo(); //객체 생성 
		d1.aa(); //객체.메서드()호출
		
		Demo2 d2= new Demo2(); //객체 생성 
		d2.bb();
	}
}

class Demo{
	public void aa(){
		System.out.println("aa()메서드");
	}
}
class Demo2{
	public void bb(){
		System.out.println("bb()메서드");
	}
}