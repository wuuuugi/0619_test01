package ch04_control;
import java.util.Scanner;
public class Test02_if {

	public static void main(String[] args) {
		//���� : ����� �Է¹޾Ƽ� ������� �����Ͻÿ�
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� ���� �Է�>>");
		int num = scanner.nextInt();
		
		if(num>0){
			System.out.println(num+"��(��) ���");
		}
		else if (num ==0 ){
			System.out.println(num+"�� 0�Դϴ�");
		}
		else{
			System.out.println(num+"��(��) ����");
		}
		scanner.close();
		
	}

}
