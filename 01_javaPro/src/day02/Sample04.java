package day02;
import java.util.Arrays;
import java.util.Scanner;

public class Sample04 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr = new int [5];
		
		for(int i =0 ; i<5;i++){
			System.out.println(i+1+" ��° ���ڸ� �Է��ϼ��� ��, ������ ��� ����");
			int num = s.nextInt();
			if(num>0){
				arr[i]=num;
			}else{
				i--;
			}
			
		}
		System.out.println(Arrays.toString(arr));

		
		
	}
	
}
