package ch06_oop;
/* 메서드 : 매개 변수가 있는 메서드 실습 
   parameter= 매개변수 =인수=인자
 */
public class Test02_method {
	public void aa(int a){
		System.out.println("aa() called..");
		System.out.println("a:"+a);
	}
	public void bb(String name){
		System.out.println("bb() called...");
		System.out.println("name:"+name);
	}
	
	public static void main(String[] args) {
		Test02_method t2=new Test02_method();
		t2.aa(123);
		t2.bb("김태리");
	}

}
