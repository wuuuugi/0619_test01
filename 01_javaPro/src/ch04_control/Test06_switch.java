package ch04_control;
import java.util.Scanner;
public class Test06_switch {

	public static void main(String[] args) {
		// ������ �Է� �޾� ������ ���Ͻÿ�
		Scanner scanner = new Scanner(System.in);
		char grade = ' ';
		
		System.out.print("���� �Է�>>");
		int score= scanner.nextInt();
		
		if(score>100 || score <0){
			System.out.println("0~100���̸� �Է� �ϼ���");
		}else{
			//���������� �Է� 
			switch(score/10){
			case 9: 
			case 10:
				grade= 'A';
				break;
			case 8:
				grade= 'B';
				break;
			case 7:
				grade= 'C';
				break;
			case 6:
				grade= 'D';
				break;
			default:
				grade= 'F';
			}
			System.out.println("����:"+score);
			System.out.println("����:"+grade);
		}
		scanner.close();
	}

}
