package ch08_class;
//클래스 캐스팅= 강제 형변환 = casting

//수퍼클래스 
class Super22{
	//사용자 정의 메서드 
	protected void disp(){
		System.out.println("Super22.disp() called");
	}
}//class end

//파생클래스
class Sub22 extends Super22{
	//오버라이딩 
	public void disp(){
		System.out.println("Sub22.dip() called");
	}//disp end
	
	//사용자정의 메서드 
	public void kk(){
		System.out.println("Sub22.kk() called ");
	}
}//class end


public class Test08_extends {
	public static void main(String[] args) {
		Super22 super22 = new Super22(); //객체생성, 생성자 호출 
		super22.disp(); 
		
		super22=new Sub22(); //상위클래스 변수로 하위 객체처리 
		super22.disp();
		
		//super22.kk();  //error
		((Sub22)super22).kk();
		int a = (int)77.8; //참고 
		
	}//main end

}//class end
