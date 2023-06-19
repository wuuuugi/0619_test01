package ch04_control;
import java.util.Scanner;
public class Test04_if {
	public static void main(String[] args) {
		/* 문제 : 점수를 입력 받아서 학점 구하기
		  		100~90 : 'A'
		  		 89~80 : 'B'
		  	   	 79~70 : 'C'
		  		 69~60 : 'D'
		  		 59~0  : 'F'
		 */
		char grade = ' '; 
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수 입력>>");
		int score = scanner.nextInt();

		if(score>100 || score <0){
			System.out.println("0~100사이만 입력 하세요");
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
			System.out.println("성적"+score+"점은"+grade+"입니다.");

		}
		scanner.close();
	}
}





