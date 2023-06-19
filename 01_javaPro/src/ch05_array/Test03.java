package ch05_array;
/* 전역변수 : 자동으로 초기화 된다 ( 메서드 밖에서 선언된 것 ) 
 * 지역변수 : 자동으로 초기화 안된다
 * 배열 : 지역일지라도 자동으로 초기화 된다
 */

public class Test03 {
	static int a;   //static 메서드에서 사용하기위해 
	int c;			//객체생성
	
	public static void main(String[] args) {
		System.out.println(a);
		
		Test03 test03 = new Test03();
		System.out.println("c:"+test03.c);
		
		int c[]=new int[3];
		for(int i=0; i<c.length; i++){
			System.out.println(c[i]);
		}
	}

}
