package ch07_cons;
//수퍼클래스 
class SuperTest{
	//전역변수
	String title;
	int num;
	
	//디폴트 생성자
	public SuperTest(){}
	
	//인자있는 생성자
	public SuperTest(String title, int num){
		this.title=title;
		this.num=num;
	}
	
	//사용자 정의 메서드
	public void disp(){
		System.out.println("title:"+title);
		System.out.println("num:"+num);
	}
	
}//class end

//하위클래스 =파생 클래스 
class SubTest extends SuperTest{
	//디폴트 생성자
	public SubTest(){
		super("연습",100); //상위 클래스 생성자 호출 
	}
	
}//class end

public class Test05_super {
	public static void main(String[] args) {
		SubTest sub = new SubTest();
		sub.disp();
		
	}//main end

}//class end
