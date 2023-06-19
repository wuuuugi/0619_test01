package ch10_awt;
import java.awt.*;
import java.awt.event.*;
//inner class ����Ͽ� â����
public class Test05_event extends Frame implements ActionListener{
	//����
	TextField tf1,tf2;
	TextArea ta;

	//������
	public Test05_event(){
		super("��ȭâ"); //ù�ٿ� ����, ����Ŭ���� ������ ȣ�� 

		tf1= new TextField();
		tf2= new TextField();
		ta = new TextArea();

		tf1.setBackground(Color.yellow);
		tf2.setBackground(Color.green);

		tf1.setFont(new Font("Dialog",Font.BOLD,20));
		tf2.setFont(new Font("Dialog",Font.BOLD,20));
		ta.setFont(new Font("Dialog",Font.BOLD,20));

		//Frame �����̳ʿ� ������Ʈ ���̱� 
		add(tf1,"North"); //���ʿ�
		add(tf2,"South"); //�Ʒ��ʿ�
		add(ta,"Center"); //��� 

		addWindowListener(new MyWin()); //�̺�Ʈ ���
		tf1.addActionListener(this);// �̺�Ʈ ���
		tf2.addActionListener(this);// �̺�Ʈ ��� 

		setSize(500,500);
		setVisible(true);
	}//cons end

	//inner class
	class MyWin extends WindowAdapter{
		//�������̵�
		public void windowClosing(WindowEvent w){
			System.exit(0);
		}
	}//inner class end 
	//�޼��� :���� ���̵�
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==tf1){
			String msg="ȫ�浿 �� >>"+tf1.getText();
			ta.append(msg+"\n");
			tf1.setText("");
			tf2.requestFocus();
		}
		else if (e.getSource()==tf2){
			String msg="�ӿ��� �� >>"+tf2.getText();
			ta.append(msg+"\n");
			tf2.setText("");
			tf1.requestFocus();
		}
	}

	public static void main(String[] args) {
		new Test05_event();
	}//main end

}// class end 

























