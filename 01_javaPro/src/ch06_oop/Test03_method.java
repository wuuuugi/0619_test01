package ch06_oop;
/*�޼��� ȣ�� ����
 * parameterm = �Ű� ����
 * return �� (���� �ִ� �� )
 */
public class Test03_method {
	public int sum(int a,int b){
		int s =a+b;
		return s;
	}
	
	public static void main(String[] args) {
		Test03_method t3=new Test03_method();
		int aa = t3.sum(100, 200);
		System.out.println(aa);
		
		
	}

}
