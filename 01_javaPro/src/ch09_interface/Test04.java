package ch09_interface;
//�������̽� 

interface Animal2{
	public void cry();//�߻�޼���
}
interface Pet{
	public void play();//�߻�޼��� 
}

//�������̽� ���߻��
class Cat2 implements Animal2,Pet{
	//�������̵�
	public void cry(){
		System.out.println("�ֿ�ֿ�ֿ�");
	}
	//�������̵�
	public void play(){
		System.out.println("����� ���� ");
	}
}//class end 

//�������̽� ���� ���
class Dog2 implements Animal2,Pet{
	//�������̵�
	public void cry(){
		System.out.println("���責�責��");
	}
	public void play(){
		System.out.println("��å�ϱ� ");
	}
	
}// interface end 


public class Test04 {
	public static void main(String[] args) {
		Cat2 c =new Cat2();//��ü����
		c.cry();
		c.play();
		System.out.println();
		
		Dog2 d= new Dog2();
		d.cry();
		d.play();
		
	}//main end

	
}//class end
