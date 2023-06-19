package ch02_data_type;

public class Test03 {
	public static void main(String args[]){
		//정수 자료형
		// byte : 1byte (-128~+127)
		// short: 2byte (-32768 ~ +32767 )
		// int  : 4byte (-2147483648 ~ +2147483647)
		// long : 8byte (-2^63 ~ +2^63-1)
		byte a1=127;
		short a2=32767;
		int a3=2147483467;
		long a4=Long.MAX_VALUE;
		
		System.out.println("a1:"+a1);
		System.out.println("a2:"+a2);
		System.out.println("a3:"+a3);
		System.out.println("a4:"+a4);
		
		//3. 실수 자료형  
		// float : 4byte (정수부, 지수부)  (정밀도가 낮다)
		// double: 8byte  (정수부, 지수부) (정밀도가 높다)
		
		// float f1=12.7 //에러  double이 디폴트값이기에
		float f1=12.712345678912345678f;
		double d1=12.712345678912345678;
		
		System.out.println("f1:"+f1);
		System.out.println("d1:"+d1);
		
	}

}
