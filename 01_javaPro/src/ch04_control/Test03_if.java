package ch04_control;
import java.util.Scanner;
public class Test03_if {
	public static void main(String[] args) {
		// 어떤수를 입력 받아서 짝수인지 홀수인지 판정하여 출력
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("임의 수 입력>>");
		int su =scanner.nextInt();
		
		if (su%2==0){
			System.out.println(su+"는 짝수");
		}else if(su%2 != 0){
			System.out.println(su+"는 홀수");
		}
		scanner.close();
	}
}
