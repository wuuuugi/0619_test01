package ch04_control;
import java.util.Scanner;
public class Test06_switch {

	public static void main(String[] args) {
		// 점수를 입력 받아 학점을 구하시오
		Scanner scanner = new Scanner(System.in);
		char grade = ' ';
		
		System.out.print("점수 입력>>");
		int score= scanner.nextInt();
		
		if(score>100 || score <0){
			System.out.println("0~100사이만 입력 하세요");
		}else{
			//정상적으로 입력 
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
			System.out.println("점수:"+score);
			System.out.println("학점:"+grade);
		}
		scanner.close();
	}

}
