package ch06_oop;
/*전역변수: 클래스안에,메서드 밖에 선언. 자동초기화 O
 */
class Sinsang{
	String name;
	int age;
	
	public void SetData(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void disp(){
		System.out.println("이름:"+name);
		System.out.println("나이:"+age);
	}
}

public class Test09_var {
	public static void main(String[] args) {
		Sinsang ss=new Sinsang();		//객체생성,heap영역에 메모리 할당
		ss.SetData("박은빈", 30);
		ss.disp();
		
		ss.SetData("박문수", 45);
		ss.disp();
		
	}//main end

}//class end
