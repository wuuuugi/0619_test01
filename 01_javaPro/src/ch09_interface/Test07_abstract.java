package ch09_interface;
//추상클래스 
abstract class Abs{
	String name;
	
	public Abs(){} // 디폴트 생성자 
	
	public Abs(String name){ //인자있는 생성자
		this.name=name;
	}
	//일반 메서드 
	public void kk(){
		System.out.println("kk() 일반 메서드 ");
	}
	//추상 메서드 
	public abstract void disp();
	
	
}//class end 
public class Test07_abstract extends Abs{
	//생성자 
	public Test07_abstract(String name){
		super(name); //상위클래스 생성자호출 
	}
	//오버라이딩
	public void disp(){
		System.out.println("추상 메서드 오버라이딩 ");
		System.out.println("name:"+name);
	}
	
	public static void main(String[] args) {
		Abs a =new Test07_abstract("때껄룩");//객체생성,생성자 호출
		a.kk();
		a.disp();
		
		
	}// main end 

}//class end
