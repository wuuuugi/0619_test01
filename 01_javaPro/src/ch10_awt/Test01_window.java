package ch10_awt;
import java.awt.*; //frame  *=모든것  awt*= awt클래스 모든것
import java.awt.event.*; //이벤트 처리 인터페이스, 클래스
/* 인터페이스를 사용하여 창종료
      인터페이스의 메서드는 모두가 추상이다. 반드시 모두 오버라이딩 해야한다
      인터페이스 = windowListener
       클래스      = windowAdapter
 */
public class Test01_window extends Frame implements WindowListener {
	//변수=필드
	//생성자
	public Test01_window(){
		setBackground(Color.yellow); //창배경색
		addWindowListener(this); //창에 이벤트 등록
		setSize(500,500); //창크기
		setVisible(true); //창표시 
	}//cons end
	
	//추상 메서드 오버라이딩
	public void windowOpened(WindowEvent e){}
	public void windowClosing(WindowEvent e) {
		//dispose();//리소스 반환
		System.exit(0); //프로그램 종료
	}
	public void windowClosed(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowActivated(WindowEvent e) {}
	public void windowDeactivated(WindowEvent e) {}
	
	public static void main(String[] args) {
		new Test01_window();
	}

}//class end 
