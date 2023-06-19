package ch02_data_type;

public class Test04 {

	public static void main(String[] args) {
		// 4. 문자 자료형 : char : 2byte ( 유니코드)
		// 'A' , 'B' 'ABC' 사용못함
		// '\n', '\t'
		
		char a1='A';
		char a2='B';
		// char a3='ABC'; 에러
		System.out.println("a1:"+a1);
		System.out.println("a2:"+a2);
		
		//5. 문자열  : 기본자료형  X 클래스 자료형 
		// "ABC","홍길동"
		String name="박은민";
		String erum="김태리";
		
		System.out.println("name:"+name);
		System.out.println("erum:"+erum);
		
		

	}

}
