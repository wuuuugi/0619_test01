package ch06_oop;
/* �޼��� : �Ű� ������ �ִ� �޼��� �ǽ� 
   parameter= �Ű����� =�μ�=����
 */
public class Test02_method {
	public void aa(int a){
		System.out.println("aa() called..");
		System.out.println("a:"+a);
	}
	public void bb(String name){
		System.out.println("bb() called...");
		System.out.println("name:"+name);
	}
	
	public static void main(String[] args) {
		Test02_method t2=new Test02_method();
		t2.aa(123);
		t2.bb("���¸�");
	}

}
