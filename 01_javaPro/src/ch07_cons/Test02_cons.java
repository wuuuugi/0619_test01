package ch07_cons;
//생성자 오버로드
class SinSang{
	//전역변수
	String name;
	int age; 
	
	//디폴트 생성자
	public SinSang(){
		System.out.println("디폴트 생성자 호출");
	}
	
	//인자있는 생성자
	public SinSang(String name,int age){
		System.out.println("String name,ing age 생성자 호출");
		this.name=name;
		this.age=age;
	}
	//사용자 정의 메서드: 사용자 만들어 쓰는 메서드
	public void disp(){
		System.out.println("이름:"+name);
		System.out.println("나이:"+age+"\n");
	}
}

public class Test02_cons {
	public static void main(String[] args) {
		SinSang kim= new SinSang("홍길동",20);
		kim.disp();
		//
		SinSang lee= new SinSang("이순신",50);
		lee.disp();
		//
		SinSang doo= new SinSang("도하영",10);
		doo.disp();
	}
	
	

}
