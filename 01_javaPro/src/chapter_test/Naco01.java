package chapter_test;

public class Naco01 {

	public static void main(String[] args) {
		int score = 68;
		char grade ;
		if(score>89){
			grade = 'A';
			
		}
		else if(score > 79){
			grade = 'B';
			
		}
		else if(score > 68){
			grade = 'C';
			
		}
		else {
			grade = 'F';
			
		}
		System.out.println("성적은"+ grade + "입니다");

	}

}
