package ch09_interface;
//�������̽� �ǽ�
interface Aaa{
	int MAX=100; // static final int MAX=100; ������ �Ұ� 
	public void aa(); // �߻�޼���
	public void bb(); // �߻�޼��� 
}//interface end

class Bbb implements Aaa{
	//�������̵� 
	public void aa(){
		System.out.println("aa() called");
		System.out.println("MAX:"+MAX);
		//MAX=200; //error ������ ����
	}
	public void bb(){
		System.out.println("bb() called");
	}
}

public class Test01 {
	public static void main(String[] args) {
		Aaa a =new Bbb(); //����Ŭ���� ������ ���� ��ü ���� 
		a.aa();
		a.bb();
	}//main end 

}//class end
