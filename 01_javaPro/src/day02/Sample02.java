package day02;

// 0이 입력 되기 전까지 입력된 숫자들 더하기 (음수 입력시 다시 입력)
import java.util.Scanner;

public class Sample02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum = 0;
		while (true) {
			System.out.println("숫자를 입력하시오 0을쓰면 종료 , 음수이면 다시");
			int a = s.nextInt();
			if (a > 0) {
				sum += a;
			} else if (a == 0) {
				System.out.println("종료");
				System.out.println(sum);
				break;
			} else if (a < 0) {
				System.out.println("재입력");
			}
		}
	}
}
