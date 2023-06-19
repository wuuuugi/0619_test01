package ch09_interface;
//인터페이스
interface Aaaa{
	public void aa(int a);
}
interface Bbbb extends Aaaa{
	public void bb();
}
interface Cccc extends Bbbb{
	public void cc();
}
class Dddd implements Cccc{
	//오버라이딩  : 상속 받은 메서드 내용 재정의 
	public void aa(int a){
		System.out.println("aa() called"+a);
	}
	public void bb(){
		System.out.println("bb() called");
	}
	public void cc(){
		System.out.println("cc() called");
	}
}
public class Test02 {
	public static void main(String[] args) {
		Dddd d=new Dddd();
		d.aa(4);
		d.bb();
		d.cc();
		
	}//main end

}//class end 
