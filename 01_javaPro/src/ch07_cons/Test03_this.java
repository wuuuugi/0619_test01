package ch07_cons;
/* this() : 자신의 클래스 내의 생성자 호출
   this(인수) : 자신의 클래스 내의 생성자 호출
 */
class Cons{
	//전역변수
	String title;
	int num;
	//디폴트 생성자
	public Cons(){}
	
	//인자있는 생성자 
	public Cons(String title){
		this(title,200);// 자신의 클래스 내의생성자 호출
	}
	
	//인자있는 생성자
	public Cons(String title, int num){
		this.title=title;
		this.num= num;
		
		System.out.println("title:"+title);
		//System.out.println("title:"+this.title);
		System.out.println("num:"+num);
	}
}
public class Test03_this {
	public static void main(String[] args) {
		Cons cons=new Cons("연습");//객체생성후 생성자 호출
	}//main end

}//class end
