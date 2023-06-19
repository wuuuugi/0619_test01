package ch08_class;
//수퍼클래스
class PanMaeSuper{
	//전역변수
	protected String pum; //상품이름
	protected int su;	  //상품 수량
	protected int dan;	  // 상품 단가

	//디폴트 생성자
	public PanMaeSuper(){}

	//인자 있는 생성자  
	public PanMaeSuper(String pum, int su , int dan){
		this.pum = pum;
		this.su = su;
		this.dan = dan;
	}//cons end 

	//사용자 정의 메서드
	protected void disp(){
		System.out.println("품명 :"+pum);
		System.out.println("수량 :"+su);
		System.out.println("단가 :"+dan+"\n");
	}//disp end

}//class end

//파생클래스
class PanMaeSub extends PanMaeSuper{
	private double rate; //할인률

	//디폴트 생성자
	public PanMaeSub(){}
	//인자있는 생성자
	public PanMaeSub(String pum,int su , int dan, double rate){
		super(pum,su,dan); //상위클래스 생성자 호출
		this.rate =rate;
	}//cons end

	/* 오버라이딩 :상속받은 메서드 내용 재정의
	 * 리턴형, 메서드이름, 매개변수는 반드시 같아야 한다
	 * 단 접근 제한자는 상위와 같거나 더 넓은 것을 사용할 수 있다
	 *  상위 접근 제한자가  protected이면 public도 쓸 수 있다.   
	 */
	public void disp(){
		System.out.println("품명 :"+pum);
		System.out.println("수량 :"+su);
		System.out.println("단가 :"+dan);
		System.out.println("할인율:"+rate+"%");
		System.out.println("최종가격:"+(dan-(dan*0.2)));
		System.out.println();
	}
	

}//class end 

//주 클래스
public class Test06_extends {
	public static void main(String[] args) {
		//관계없는 클래스는 객체생성하여 사용한다 
		PanMaeSuper super2=new PanMaeSuper("수박",1,9000); //객체생성,생성자 호출 
		super2.disp();
		//상위클래스 변수로 하위 객체처리 :자동 형변환과 유사
		super2 = new PanMaeSub("참외",4,5000,0.2);
		super2.disp();

	}//main end

}//class end











