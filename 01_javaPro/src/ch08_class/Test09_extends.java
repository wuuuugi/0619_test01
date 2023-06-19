package ch08_class;
//���� Ŭ����
class PersonSuper{
	//����
	protected String name;
	//������
	public PersonSuper(){}

	//���� �ִ� ������
	public PersonSuper(String name){
		this.name=name;
	}
	//����� ���� �ż���
	public void disp(){
		System.out.println(name);
	}
}//class end

//�Ļ�Ŭ����
class PersonSub extends PersonSuper{
	//��������
	private double left_eye;
	private double right_eye;

	//����Ʈ ������
	public PersonSub(){}

	//�����ִ� ������ 
	public PersonSub(String name , double left_eye , double right_eye){
		super(name); //���� Ŭ���� ������ ȣ�� 
		this.left_eye=left_eye;
		this.right_eye=right_eye;
	}
	//�޼��� �������̵�
	public void disp(){
		System.out.println("�̸�: "+name);
		System.out.println("���ʽ÷�: "+left_eye);
		System.out.println("�����ʽ÷�: "+right_eye);
		System.out.println();
	}//disp end

}//class end

//�Ļ�Ŭ����
class PersonSinsang extends PersonSuper{
	//��������
	private String addr;
	private String tel;

	//����Ʈ������
	public PersonSinsang(){}

	//�����ִ� ������
	public PersonSinsang(String name,String addr, String tel){
		super(name); //����Ŭ���� ������ ȣ�� 
		this.addr=addr;
		this.tel=tel; 
	}//cons end 

	//�޼���:�������̵�
	public void disp(){
		System.out.println("�̸�: "+name);
		System.out.println("�ּ�: "+addr);
		System.out.println("��ȭ: "+tel);
		System.out.println();
	}//disp end
}//class end

public class Test09_extends {

	public static void main(String[] args) {
		PersonSuper s= new PersonSuper("�ӿ���");
		s.disp();
		//���� Ŭ���� ���� ���� ��ü ó��
		s=new PersonSub("������",1.2,1.5); //��ü����, ������ ȣ��
		s.disp();
		//���� Ŭ���� ���� ���� ��ü ó��
		s= new PersonSinsang("��Ʋ��","���� ����", "010-2323-8989");
		s.disp();


	}//main end

}//class end
