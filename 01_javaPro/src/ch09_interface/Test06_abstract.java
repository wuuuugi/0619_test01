package ch09_interface;
//�߻�Ŭ���� �ǽ�
abstract class AbsTest{
	abstract public void aa(); //�߻�޼���
	
	public void bb(){ //�Ϲ� �޼���
		System.out.println("bb() �Ϲ� �޼���");
	}
	
}//class end

class Demo extends AbsTest{
	
	//�߻�޼��� �������̵�
	public void aa(){
		System.out.println("aa() �߻�޼��� �������̵�");
	}
}//class end

public class Test06_abstract {
	public static void main(String[] args) {
		Demo d= new Demo(); //��ü���� , ������ ȣ��
		d.aa();
		d.bb();
		
	}//main end 

}//class end
