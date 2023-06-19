package ch08_class;
//����Ŭ����
class Person77{
	//��������
	protected String name;
	protected int age;
	protected double height;

	//����Ʈ������
	public Person77(){}

	//���� �ִ� ������
	public Person77(String name, int age, double height){
		this.name=name;
		this.age=age;
		this.height=height;
	}//cons end

	//����� ���� �޼���
	public void eat(){
		System.out.println(name+"�� ���� ��Ը� �Դ´�");
	}
	public void sleep(){
		System.out.println(name+"�� ������ 8�ð� �ܴ�");
	}
}//class end

//�Ļ�Ŭ����
class Child extends Person77{
	//��������
	private String grade;

	//���� �ִ»�����
	public Child(String name, int age,double height ,String grade){
		super(name,age,height); //����Ŭ���� ������ ȣ��
		this.grade=grade;
	}
	//����� ���� �޼���
	public void study(){
		System.out.println(name+" �л��� "+grade+"�̴�");
	}
}//class end

//�Ļ�Ŭ����
class Adult extends Person77{
	//��������
	private String job;

	//���� �ִ� ������
	public Adult(String name, int age , double height , String job){
		super(name,age,height);//����Ŭ���� ������ ȣ��
		this.job=job;
	}//cons end

	//����� ���� �޼���
	public void work(){
		System.out.println("������ "+job+" �Դϴ�.");
	}

}//class end
//�޼���

//��Ŭ���� 
public class Test10_extends {
	public static void main(String[] args) {
		//������� Ŭ���� ������ ��ü �����Ͽ� ����Ѵ� 
		Person77 p = new Person77("kim",35, 177.7);
		p.eat();
		p.sleep();
		System.out.println();

		//���� Ŭ���� ������ ���� ��ü ó��
		p=new Child("�ӵ���",11,145.5,"4�г�");  //��ü����,������ ȣ��
		//p.study();//error
		((Child)p).study();
		System.out.println();

		//���� Ŭ���� ������ ���� ��ü ó��
		p=new Adult("�ӿ���",34,182.3,"����"); //��ü����,������ ȣ��
		p.eat();
		p.sleep();
		((Adult)p).work();



	}//main end

}//class end
