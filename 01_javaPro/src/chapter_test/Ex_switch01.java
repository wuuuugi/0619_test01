package chapter_test;

public class Ex_switch01 {

	public static void main(String[] args) {
		int rank =4 ;
		char medal;
		
		switch (rank){
		case 1: medal = 'G';
		System.out.println("�ݸ޴�");
			break;
		case 2: medal = 'S';
		System.out.println("���޴�");
			break;
		case 3: medal = 'B';
		System.out.println("���޴�");
			break;
		default : medal = 'N';
		System.out.println("�޴��� �����ϴ�");
		}
		System.out.print(medal);

	}

}
