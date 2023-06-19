package ch10_awt;
import java.awt.*;
import java.awt.event.*;
//inner class 사용하여 창종료
public class Test05_event extends Frame implements ActionListener{
	//변수
	TextField tf1,tf2;
	TextArea ta;

	//생성자
	public Test05_event(){
		super("대화창"); //첫줄에 기재, 상위클래스 생성자 호출 

		tf1= new TextField();
		tf2= new TextField();
		ta = new TextArea();

		tf1.setBackground(Color.yellow);
		tf2.setBackground(Color.green);

		tf1.setFont(new Font("Dialog",Font.BOLD,20));
		tf2.setFont(new Font("Dialog",Font.BOLD,20));
		ta.setFont(new Font("Dialog",Font.BOLD,20));

		//Frame 컨테이너에 컴포넌트 붙이기 
		add(tf1,"North"); //위쪽에
		add(tf2,"South"); //아래쪽에
		add(ta,"Center"); //가운데 

		addWindowListener(new MyWin()); //이벤트 등록
		tf1.addActionListener(this);// 이벤트 등록
		tf2.addActionListener(this);// 이벤트 등록 

		setSize(500,500);
		setVisible(true);
	}//cons end

	//inner class
	class MyWin extends WindowAdapter{
		//오버라이딩
		public void windowClosing(WindowEvent w){
			System.exit(0);
		}
	}//inner class end 
	//메서드 :오버 라이딩
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==tf1){
			String msg="홍길동 말 >>"+tf1.getText();
			ta.append(msg+"\n");
			tf1.setText("");
			tf2.requestFocus();
		}
		else if (e.getSource()==tf2){
			String msg="임영웅 말 >>"+tf2.getText();
			ta.append(msg+"\n");
			tf2.setText("");
			tf1.requestFocus();
		}
	}

	public static void main(String[] args) {
		new Test05_event();
	}//main end

}// class end 

























