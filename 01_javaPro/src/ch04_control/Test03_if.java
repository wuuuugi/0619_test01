package ch04_control;
import java.util.Scanner;
public class Test03_if {
	public static void main(String[] args) {
		// ����� �Է� �޾Ƽ� ¦������ Ȧ������ �����Ͽ� ���
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� �� �Է�>>");
		int su =scanner.nextInt();
		
		if (su%2==0){
			System.out.println(su+"�� ¦��");
		}else if(su%2 != 0){
			System.out.println(su+"�� Ȧ��");
		}
		scanner.close();
	}
}
