package ch09_interface;
//�߻�Ŭ���� 
abstract class Abs{
	String name;
	
	public Abs(){} // ����Ʈ ������ 
	
	public Abs(String name){ //�����ִ� ������
		this.name=name;
	}
	//�Ϲ� �޼��� 
	public void kk(){
		System.out.println("kk() �Ϲ� �޼��� ");
	}
	//�߻� �޼��� 
	public abstract void disp();
	
	
}//class end 
public class Test07_abstract extends Abs{
	//������ 
	public Test07_abstract(String name){
		super(name); //����Ŭ���� ������ȣ�� 
	}
	//�������̵�
	public void disp(){
		System.out.println("�߻� �޼��� �������̵� ");
		System.out.println("name:"+name);
	}
	
	public static void main(String[] args) {
		Abs a =new Test07_abstract("������");//��ü����,������ ȣ��
		a.kk();
		a.disp();
		
		
	}// main end 

}//class end
