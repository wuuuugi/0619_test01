package ch08_class;
//수퍼클래스
class SuperTest2{
	protected int roomNo;  //룸번호
	protected int capacity; //정원
}//class end

//파생클래스
class SubTest2 extends SuperTest2{
	String owner; //집주인
	
	//사용자 정의 메서드 
	public void disp(){
		System.out.println("룸번호 : "+roomNo);
		System.out.println("정원 : "+capacity);
		System.out.println("집주인 : "+ owner);
	}//disp end
	
}//class end

//주클래스 

public class Test05_extends {
	public static void main(String[] args) {
		//관계없는 클래스는 객체 생성하여 사용하면 된다
		SubTest2 sub2 = new SubTest2();
		sub2.roomNo=3;
		sub2.capacity=50;
		sub2.owner="이효리";
		
		sub2.disp();
		
	}//main end

}//class end
