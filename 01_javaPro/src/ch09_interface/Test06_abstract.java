package ch09_interface;
//추상클래스 실습
abstract class AbsTest{
	abstract public void aa(); //추상메서드
	
	public void bb(){ //일반 메서드
		System.out.println("bb() 일반 메서드");
	}
	
}//class end

class Demo extends AbsTest{
	
	//추상메서드 오버라이딩
	public void aa(){
		System.out.println("aa() 추상메서드 오버라이딩");
	}
}//class end

public class Test06_abstract {
	public static void main(String[] args) {
		Demo d= new Demo(); //객체생성 , 생성자 호출
		d.aa();
		d.bb();
		
	}//main end 

}//class end
