package ch01;

public class Test06 {
	public static void main(String args[]){
		Demo d1= new Demo(); //��ü ���� 
		d1.aa(); //��ü.�޼���()ȣ��
		
		Demo2 d2= new Demo2(); //��ü ���� 
		d2.bb();
	}
}

class Demo{
	public void aa(){
		System.out.println("aa()�޼���");
	}
}
class Demo2{
	public void bb(){
		System.out.println("bb()�޼���");
	}
}