package ch07_cons;
//������ �����ε�
class SinSang{
	//��������
	String name;
	int age; 
	
	//����Ʈ ������
	public SinSang(){
		System.out.println("����Ʈ ������ ȣ��");
	}
	
	//�����ִ� ������
	public SinSang(String name,int age){
		System.out.println("String name,ing age ������ ȣ��");
		this.name=name;
		this.age=age;
	}
	//����� ���� �޼���: ����� ����� ���� �޼���
	public void disp(){
		System.out.println("�̸�:"+name);
		System.out.println("����:"+age+"\n");
	}
}

public class Test02_cons {
	public static void main(String[] args) {
		SinSang kim= new SinSang("ȫ�浿",20);
		kim.disp();
		//
		SinSang lee= new SinSang("�̼���",50);
		lee.disp();
		//
		SinSang doo= new SinSang("���Ͽ�",10);
		doo.disp();
	}
	
	

}
