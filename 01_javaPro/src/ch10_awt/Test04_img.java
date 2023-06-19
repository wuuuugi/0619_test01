package ch10_awt;
import java.awt.*; //Frame
import java.awt.event.*;
//inner class�� ����Ͽ� â����
public class Test04_img extends Frame{
	//����
	Image img;
	//������
	public Test04_img(){
		img=Toolkit.getDefaultToolkit().getImage("c:\\image\\cat.jpg");
		
		setSize(500,500);
		setVisible(true);
		
		addWindowListener(new MyWin());
	}//cons end
	
	//inner class 
	class MyWin extends WindowAdapter{
		//�������̵�
		public void windowClosing(WindowEvent w){
			System.exit(0);
		}
	}//inner class end 
	
	//�޼��� paint (Graphics g)
	public void paint (Graphics g){
		g.drawImage(img, 30 ,50 , this ); //x=30 , y=50 
		g.drawImage(img, 30 ,50 ,300,300, this ); 
	}
	
	public static void main(String[] args) {
		new Test04_img();
		
	}//main end

}//class end













