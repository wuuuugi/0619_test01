package ch03_oper;
/*==: 기본 자료형 비교할때 사용
  equals() : 문자열 비교( 대소문자 구분하여 비교 )
  equalsIgnoreCase() : 문자열 비교 (대소문자 구분 않고 비교)
  
  객체 instanceof 클래스 :객체 비교 
 
 */
public class Test09 {

	public static void main(String[] args) {
		//기본자료형 : boolean, byte ,short,int, long, float, double
		//기본자료형 비교 
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
