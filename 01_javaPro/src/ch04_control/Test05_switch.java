package ch04_control;
import java.util.Scanner;
public class Test05_switch {

	public static void main(String[] args) {
		//����: ����� �Է¹޾� ¦������ Ȧ������ �����Ͽ� ����Ͻÿ� .
		Scanner scanner=new Scanner(System.in);
		System.out.print("���� �� �Է�>>");
		int su = scanner.nextInt();
		
		switch(su%2){
		case 0:
			System.out.print(su+"�� ¦��");
			break;
		case 1:
			System.out.print(su+"�� Ȧ��");
			break;
			
		}
		scanner.close();

	}

}
