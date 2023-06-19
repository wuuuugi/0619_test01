package ch04_control;

public class Test16_while {
	public static void main(String[] args) {
		int i=1;
		while(i<6){
			System.out.println("목요일");
			i++;
		}
		i=1;
		do{
			System.out.println("내일은 금요일");
			i++;
		}while(i<6);
	}

}
