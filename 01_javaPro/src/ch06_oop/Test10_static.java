package ch06_oop;
/* static 메서드는 static으로 선언된 변수,메서드만 (호출)사용 가능하다 
   static 변수 , 메서드는  객체생성 않고도 사용가능하다 
   ex) 클래스 이름.메서드() >> Math.max(6,7)
   ex) 클래스 이름.변수         >> Math.PI
 */
public class Test10_static {
	static int a=10; //전역변수, static  변수 
	
	public static void aa(){  // static 메서드 
		System.out.println("aa() called");
	}
	public void bb(){         // 일반 메서드
		System.out.println("bb() called");
	}
	public static void main(String[] args) {
		System.out.println("a:"+a); //static변수
		aa(); //static 메서드 호출
		Test10_static tb = new Test10_static();
		tb.bb(); //일반메서드 , 객체생성하여 호출하면 된다 
	}//main end 
	
}//class end
