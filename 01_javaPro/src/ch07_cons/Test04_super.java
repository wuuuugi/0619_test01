package ch07_cons;
/* super: ���� Ŭ���� ��ü�� ���Ѵ� (���� ��� ����)
 * super() : ���� Ŭ���� ������ ȣ��ȴ� (���̻��)
 */
import java.awt.*;   //Frame

public class Test04_super extends Frame{
	//������ 
	public Test04_super(){
		super("����"); //���� Ŭ���� ������ ȣ�� , ������ �ȿ��� ù�ٿ� �����Ѵ�
		setBackground(Color.yellow);  //����
		//super.setSize(500,500); //width, height ,�ȼ�����
		//this.setSize(500,500); //width, height ,�ȼ�����
		setSize(500,500); //width, height ,�ȼ�����
		setVisible(true); //âǥ�� 
	}
	public static void main(String[] args) {
		new Test04_super();  //��ü���� ,������ ȣ�� 
		
	}//main end

}//class end 
