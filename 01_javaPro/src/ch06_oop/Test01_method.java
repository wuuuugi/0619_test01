package ch06_oop;
/*�ż��� ������ ó���� �ȴ� 
   �Լ��� �ڹٿ����� �ż����� �Ѵ� 
   �ż���� ó���� �⺻ ���� �̴� (�޼��� ������ ó���ȴ�)
  �ż���� Ŭ���� �ȿ����� �����ִ� 
  ����ó���� �޼��� �ȿ��� ���� ���ִ�.  
  
  main() : JVM�� ���� ���ʷ� ȣ��ȴ� 
 */
public class Test01_method {
	
	public void aa(){
		System.out.println("������ �ݿ���");
	}
	public void bb(){
		System.out.println("������ �����");
	}
	
	public static void main(String[] args) {
		Test01_method test01=new Test01_method();//��ü����
		test01.aa();
		test01.bb();
		
	}//main_end

}//class_end
