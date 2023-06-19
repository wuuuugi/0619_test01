package ch10_awt;
import java.awt.*; //frame  *=����  awt*= awtŬ���� ����
import java.awt.event.*; //�̺�Ʈ ó�� �������̽�, Ŭ����
/* �������̽��� ����Ͽ� â����
      �������̽��� �޼���� ��ΰ� �߻��̴�. �ݵ�� ��� �������̵� �ؾ��Ѵ�
      �������̽� = windowListener
       Ŭ����      = windowAdapter
 */
public class Test01_window extends Frame implements WindowListener {
	//����=�ʵ�
	//������
	public Test01_window(){
		setBackground(Color.yellow); //â����
		addWindowListener(this); //â�� �̺�Ʈ ���
		setSize(500,500); //âũ��
		setVisible(true); //âǥ�� 
	}//cons end
	
	//�߻� �޼��� �������̵�
	public void windowOpened(WindowEvent e){}
	public void windowClosing(WindowEvent e) {
		//dispose();//���ҽ� ��ȯ
		System.exit(0); //���α׷� ����
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
