package ch04_control;

public class Test18_while {
	public static void main(String[] args) {
		//while�� if�� 1~10���� ¦���� ���
		int i =1;
		while(i<11){
			if(i%2==0){
				System.out.println(i);
			}
			i++;
		}
		System.out.println();;
		i=10;
		do{
			if(i%3==0){
				System.out.println(i);	
			}
			i++;
		}
		while(i<21);





	}

}
