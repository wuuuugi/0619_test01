package ch08_class;
/* 클 extends 클
 * 인 extends 인
 * 클 implements 인  
 */
class SuperTest{
	//상속 관계에 있더라도 private선언된 멤버들은 접근 못함 
	//private static int roomNo = 3; //전역변수
	protected static int roomNo = 3; //전역변수 
}//class end

public class Test04_extends extends SuperTest{
	public static void main(String[] args) {
		//static 메서드는 static으로 선언된 변수 , 메서드만 사용할 수 있다.
		System.out.println("roomNo: "+roomNo);
	}//main end

}//class end
