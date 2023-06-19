package ch10_awt;
import java.awt.*; //Frame
import java.awt.event.*;
//inner class를 사용하여 창종료
public class Test04_img extends Frame{
	//변수
	Image img;
	//생성자
	public Test04_img(){
		img=Toolkit.getDefaultToolkit().getImage("c:\\image\\cat.jpg");
		
		setSize(500,500);
		setVisible(true);
		
		addWindowListener(new MyWin());
	}//cons end
	
	//inner class 
	class MyWin extends WindowAdapter{
		//오버라이딩
		public void windowClosing(WindowEvent w){
			System.exit(0);
		}
	}//inner class end 
	
	//메서드 paint (Graphics g)
	public void paint (Graphics g){
		g.drawImage(img, 30 ,50 , this ); //x=30 , y=50 
		g.drawImage(img, 30 ,50 ,300,300, this ); 
	}
	
	public static void main(String[] args) {
		new Test04_img();
		
	}//main end

}//class end













