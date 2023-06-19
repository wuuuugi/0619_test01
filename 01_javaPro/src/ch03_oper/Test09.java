package ch03_oper;
/*==: �⺻ �ڷ��� ���Ҷ� ���
  equals() : ���ڿ� ��( ��ҹ��� �����Ͽ� �� )
  equalsIgnoreCase() : ���ڿ� �� (��ҹ��� ���� �ʰ� ��)
  
  ��ü instanceof Ŭ���� :��ü �� 
 
 */
public class Test09 {

	public static void main(String[] args) {
		//�⺻�ڷ��� : boolean, byte ,short,int, long, float, double
		//�⺻�ڷ��� �� 
		int a =10 , b =10;
		if(a==b){
			System.out.println("a==b");
		}
		else{
			System.out.println("a!=b");
		}
		String str1="hello";
		String str2="hello";		
		String str3="Hello";
		System.out.println(str1.equals(str2));      //T
		System.out.println(str1.equals(str3));      //F
		System.out.println(str1.equalsIgnoreCase(str3));//T 
		System.out.println();
		
		String str =new String("aaa");
		Object ob = new Object();
		
		System.out.println(str instanceof String);  // T
		System.out.println(str instanceof Object);  // T
		System.out.println(ob instanceof Object);   // T
		System.out.println(ob instanceof String);   // F
		
		
		
		
		
	}

}
