package ch06_oop;
/*매서드 단위로 처리가 된다 
   함수를 자바에서는 매서드라고 한다 
   매서드는 처리의 기본 단위 이다 (메서드 단위로 처리된다)
  매서드는 클래스 안에서만 쓸수있다 
  로직처리는 메서드 안에만 넣을 수있다.  
  
  main() : JVM에 의해 최초로 호출된다 
 */
public class Test01_method {
	
	public void aa(){
		System.out.println("오늘은 금요일");
	}
	public void bb(){
		System.out.println("내일은 토요일");
	}
	
	public static void main(String[] args) {
		Test01_method test01=new Test01_method();//객체생성
		test01.aa();
		test01.bb();
		
	}//main_end

}//class_end
