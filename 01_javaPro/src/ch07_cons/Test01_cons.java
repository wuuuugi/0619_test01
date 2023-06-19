package ch07_cons;
/* 생성자 실습 
    디폴트 생성자는 생성자를 넣지 않을때 자동으로 만들어 진다
    인자 있는 생성자가 있으면 디폴트 생성자는 자동으로 안 만들어진다 
  인수를 갖으면 오버로드 가능하다 
 */
class Sungjuk{
	//전역변수
	String name;
	int kor; 
	
	//인자없는 디폴트 생성자
	public Sungjuk(){
		//this.name="";
		//this.kr=0;
		System.out.println("디폴트 생성자");
	}
	//인자있는 생성자
	public Sungjuk(String name){
		this.name=name;
		//this.kor =0; //전역변수 : 자동 초기화 되기 때문에
		System.out.println("String name 인자 있는 생성자");
		System.out.println("name:"+name);
	}
	
	//인자있는 생성자
	public Sungjuk(String name, int kor){
		this.name=name;
		this.kor=kor;
		System.out.println("String name, int kor 인자있는 생성자 ");
		System.out.println("이름:"+name);
		System.out.println("국어점수:"+kor);
	}
	
}//class end 
public class Test01_cons {
	public static void main(String[] args) {
		new Sungjuk(); //객체생성,생성자호출
		new Sungjuk("kim");
		new Sungjuk("kim",4);
	}//main end 
}//class end 
