package ch06_oop;
//�޼��� ���ϰ� ����
public class Test04_method {
	
	public int aa(){
		return 100;
	}
	public double bb(){
		return 12.5;
	}
	public String cc(){
		return "������";
	}
	
	public static void main(String[] args) {
		Test04_method t =new Test04_method();
		int a1=t.aa();
		double b1=t.bb();
		String str=t.cc();
		
		System.out.println("a1:"+a1);
		System.out.println("b1:"+b1);
		System.out.println("str:"+str);
		
	}//main end

}//class end 
