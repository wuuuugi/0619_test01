package ch08_class;
/* Ŭ extends Ŭ
 * �� extends ��
 * Ŭ implements ��  
 */
class SuperTest{
	//��� ���迡 �ִ��� private����� ������� ���� ���� 
	//private static int roomNo = 3; //��������
	protected static int roomNo = 3; //�������� 
}//class end

public class Test04_extends extends SuperTest{
	public static void main(String[] args) {
		//static �޼���� static���� ����� ���� , �޼��常 ����� �� �ִ�.
		System.out.println("roomNo: "+roomNo);
	}//main end

}//class end
