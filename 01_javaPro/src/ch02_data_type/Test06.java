package ch02_data_type;

public class Test06 {

	public static void main(String[] args) {
		//연산시 자료형이 큰쪽으로 자동 형변환 된다.
		System.out.println(10+2.5);
		
		//대입 , 할당시에는 왼쪽자료형이 크면 할당되는 왼쪽자료형으로 변환된다 
		double d=100;
		System.out.println(d);
		
		// int a = 12.5; //에러
		
		//2. 강제형 변환
	 	//할당 , 대입시 캐스팅한다
	    int a=(int)12.5;
	    char ch = (char)65;
	    char ch2= (char)66.5;

	    System.out.println(a);
	    System.out.println(ch);
	    System.out.println(ch2);
	    
	}

}
