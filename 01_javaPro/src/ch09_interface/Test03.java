package ch09_interface;
//�������̽�
interface Animal{
	public void cry();
}
class Cat implements Animal{
	//�������̵�
	public void cry(){
		System.out.println("�ֿ�ֿ� ");
	}
}
class Dog implements Animal{
	//�������̵�
	public void cry(){
		System.out.println(" ���� ���� ");
	}
}

public class Test03 {
	public static void main(String[] args) {
		Animal ani = new Cat(); //���� Ŭ���� ������ ���� ��ü ó�� 
		ani.cry();
		
		ani= new Dog();
		ani.cry();
	}

}
