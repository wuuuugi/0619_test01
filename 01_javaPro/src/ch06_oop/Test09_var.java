package ch06_oop;
/*��������: Ŭ�����ȿ�,�޼��� �ۿ� ����. �ڵ��ʱ�ȭ O
 */
class Sinsang{
	String name;
	int age;
	
	public void SetData(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void disp(){
		System.out.println("�̸�:"+name);
		System.out.println("����:"+age);
	}
}

public class Test09_var {
	public static void main(String[] args) {
		Sinsang ss=new Sinsang();		//��ü����,heap������ �޸� �Ҵ�
		ss.SetData("������", 30);
		ss.disp();
		
		ss.SetData("�ڹ���", 45);
		ss.disp();
		
	}//main end

}//class end
