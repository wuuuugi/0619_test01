package ch01;
//입력기능
import java.util.Scanner; //JDK5 추가된 기능

public class Test05 {
	public static void main(String args[]){
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);//객체생성
		
		System.out.print("정수 입력>>");
		int a=scan.nextInt();//정수를 입력 받아서 a에 저장
		
		System.out.print("실수 입력>>");
		double d=scan.nextDouble();//실수를 입력 받아서 d에 저장

		System.out.print("문자열 입력>>");
		String name=scan.next();//문자열을 입력 받아서 name에 저장
		
		//출력 
		System.out.printf("나이 %d\n",a); // %d : 정수 출력
		System.out.printf("키 %5.1f\n",d); // %f : 실수 출력
		//System.out.printf("키 %f\n",d); // %f : 실수 출력
		System.out.printf("이름 %s\n",name); // %s : 문자열 출력
		System.out.println();//줄바꿈
		
		System.out.printf("%-7s %-7s %-7s\n","나이","키","이름");
		System.out.printf("%-5d %-7.1f %-7s\n", a,d,name);
		
	} 

}
