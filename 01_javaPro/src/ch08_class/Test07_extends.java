package ch08_class;
import java.awt.*; //Frame

//상위 클래스 변수로 하위 객체 처리 
public class Test07_extends extends Frame {
	//변수
	
	//생성자
	public Test07_extends(){
		super("상속 연습");
		setBackground(Color.cyan);
	}//cons end
	//매서드 
	
	public static void main(String[] args) {
		//상위 클래스 변수로 하위 객체처리 
		Frame f =new Test07_extends(); //객체생성,생성자호출
		f.setSize(500,500);	//창크기 , 픽셀단위
		f.setVisible(true); //창표시 
	
	}//main end
}//class end
