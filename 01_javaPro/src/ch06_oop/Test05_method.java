package ch06_oop;
/* �����ε�: �ϳ��� Ŭ�����ȿ� �̸��� ���� �޼��尡 ������ �ִ°�� 
 * �����ε� �޼���� �Ű����� �ڷ����� �ٸ��ų� �Ű����������� �޶���Ѵ� 
 */
public class Test05_method {
	public int sum(int a, int b){
		int s = a+b;
		return s;
	}
	public int sum(int a, int b,int c){
		int s = a+b+c;
		return s;
	}
	public double sum(double a, double b){
		double s= a+b;
		return s; 
	}
	public static void main(String[] args) {
		Test05_method t=new Test05_method();
		int a1 = t.sum(10, 20);
		int a2 =t.sum(100, 200, 300);
		double a3=t.sum(178.8, 167.7);
		
		System.out.println("a1:"+a1);
		System.out.println("a2:"+a2);
		System.out.println("a3:"+a3);
		
		//Math Ŭ���� �����ε� 
		//static �޼���  ��ü ���� �ʰ� ȣ�Ⱑ�� 
		//Ŭ���� �̸�.�޼���();
		System.out.println(Math.max(12.5, 77.7));
		System.out.println(Math.max(3.5f, 5.7f));
		System.out.println(Math.max(10, 20));
		System.out.println(Math.max(30L, 40L));
		
		
		
		
		
	}

}
