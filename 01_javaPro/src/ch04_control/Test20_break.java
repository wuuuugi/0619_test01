package ch04_control;

public class Test20_break {
	public static void main(String[] args) {
		for(int i = 1; i<51; i++){
			System.out.println(i+" ");
			if(i==10){
				break;
			}
		}
		System.out.println();
		
		int a=1;
		while(a<=10000){
			System.out.print(a+" ");
			if(a==10){
				break;
			}
			a++;
		}
	}

}
