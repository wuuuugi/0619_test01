package ch04_control;
import java.util.Scanner;
public class Test04_if {
	public static void main(String[] args) {
		/* ���� : ������ �Է� �޾Ƽ� ���� ���ϱ�
		  		100~90 : 'A'
		  		 89~80 : 'B'
		  	   	 79~70 : 'C'
		  		 69~60 : 'D'
		  		 59~0  : 'F'
		 */
		char grade = ' '; 
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �Է�>>");
		int score = scanner.nextInt();

		if(score>100 || score <0){
			System.out.println("0~100���̸� �Է� �ϼ���");
		}else{
			if(score<=100 && score>=90){
				grade='A';
			}else if (score>=80){
				grade='B';
			}else if (score>=70){
				grade='C';
			}else if (score>=60){
				grade='D';
			}else{
				grade='F';
			}
			System.out.println("����"+score+"����"+grade+"�Դϴ�.");

		}
		scanner.close();
	}
}





