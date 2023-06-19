package chapter_test;

public class Ex_switch01 {

	public static void main(String[] args) {
		int rank =4 ;
		char medal;
		
		switch (rank){
		case 1: medal = 'G';
		System.out.println("금메달");
			break;
		case 2: medal = 'S';
		System.out.println("은메달");
			break;
		case 3: medal = 'B';
		System.out.println("동메달");
			break;
		default : medal = 'N';
		System.out.println("메달이 없습니다");
		}
		System.out.print(medal);

	}

}
