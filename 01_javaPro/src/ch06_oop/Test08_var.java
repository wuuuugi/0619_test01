package ch06_oop;
/* �������� : Ŭ�����ȿ�, �޼��� �ۿ��� ����� ����. �ڵ��ʱ�ȭ O
 * �������� : �޼���ȿ��� ����� ���� . �ڵ��ʱ�ȭ X 
      �迭�� ���������� �ڵ� �ʱ�ȭ �ȴ� 
      �������� ���� 
 */
public class Test08_var {
	//�������� =�ʵ� >> �ڵ��ʱ�ȭ O 
	int age;
	double ki;
	String name;
	
	public static void main(String[] args) {
	//	int a; //�ڵ��ʱ�ȭ X 
	//    System.out.println("age:"+age);  
	//static �޼���� static���� ����� ����,�޼��常 ��밡��  
	//	System.out.println("a:"+a);
	//���� ������ �ڵ����� �ʱ�ȭX 
		
		Test08_var test08 = new Test08_var();//��ü����,heap������ �޸��Ҵ� �޴´� 
		System.out.println("test08.age: "+test08.age);   //0
		System.out.println("test08.ki: "+test08.ki);	    //0.0
		System.out.println("test08.name: "+test08.name); //null
		
	}//main end

}//class end
