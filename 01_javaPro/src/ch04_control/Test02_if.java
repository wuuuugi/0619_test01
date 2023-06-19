package ch04_control;
import java.util.Scanner;
public class Test02_if {

	public static void main(String[] args) {
		//문제 : 어떤수를 입력받아서 양수인지 판정하시요
		Scanner scanner = new Scanner(System.in);
		System.out.print("임의 정수 입력>>");
		int num = scanner.nextInt();
		
		if(num>0){
			System.out.println(num+"은(는) 양수");
		}
		else if (num ==0 ){
			System.out.println(num+"은 0입니다");
		}
		else{
			System.out.println(num+"은(는) 음수");
		}
		scanner.close();
		
	}

}
