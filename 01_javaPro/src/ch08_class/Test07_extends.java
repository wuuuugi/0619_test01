package ch08_class;
import java.awt.*; //Frame

//���� Ŭ���� ������ ���� ��ü ó�� 
public class Test07_extends extends Frame {
	//����
	
	//������
	public Test07_extends(){
		super("��� ����");
		setBackground(Color.cyan);
	}//cons end
	//�ż��� 
	
	public static void main(String[] args) {
		//���� Ŭ���� ������ ���� ��üó�� 
		Frame f =new Test07_extends(); //��ü����,������ȣ��
		f.setSize(500,500);	//âũ�� , �ȼ�����
		f.setVisible(true); //âǥ�� 
	
	}//main end
}//class end
