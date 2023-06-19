package ch08_class;
//상위 클래스
class PersonSuper{
	//변수
	protected String name;
	//생성자
	public PersonSuper(){}

	//인자 있는 생성자
	public PersonSuper(String name){
		this.name=name;
	}
	//사용자 정의 매서드
	public void disp(){
		System.out.println(name);
	}
}//class end

//파생클래스
class PersonSub extends PersonSuper{
	//전역변수
	private double left_eye;
	private double right_eye;

	//디폴트 생성자
	public PersonSub(){}

	//인자있는 생성자 
	public PersonSub(String name , double left_eye , double right_eye){
		super(name); //상위 클래스 생성자 호출 
		this.left_eye=left_eye;
		this.right_eye=right_eye;
	}
	//메서드 오버라이딩
	public void disp(){
		System.out.println("이름: "+name);
		System.out.println("왼쪽시력: "+left_eye);
		System.out.println("오른쪽시력: "+right_eye);
		System.out.println();
	}//disp end

}//class end

//파생클래스
class PersonSinsang extends PersonSuper{
	//전역변수
	private String addr;
	private String tel;

	//디폴트생성자
	public PersonSinsang(){}

	//인자있는 생성자
	public PersonSinsang(String name,String addr, String tel){
		super(name); //상위클래스 생성자 호출 
		this.addr=addr;
		this.tel=tel; 
	}//cons end 

	//메서드:오버라이딩
	public void disp(){
		System.out.println("이름: "+name);
		System.out.println("주소: "+addr);
		System.out.println("전화: "+tel);
		System.out.println();
	}//disp end
}//class end

public class Test09_extends {

	public static void main(String[] args) {
		PersonSuper s= new PersonSuper("임영웅");
		s.disp();
		//상위 클래스 변수 하위 객체 처리
		s=new PersonSub("윌리엄",1.2,1.5); //객체생성, 생성자 호출
		s.disp();
		//상위 클래스 변수 하위 객체 처리
		s= new PersonSinsang("벤틀리","서울 은평구", "010-2323-8989");
		s.disp();


	}//main end

}//class end
