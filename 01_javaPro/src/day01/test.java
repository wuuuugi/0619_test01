package day01;

import java.util.Scanner;
import java.util.Random;

public class test {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		int i= 0; 
		
		System.out.println("컴퓨터1가 1~100중 랜덤 숫자 하나를 정합니다 ");
		int a =r.nextInt(100)+1;
		System.out.println("이숫자를 맞춰주세요");
		while(true){
			System.out.print(i+1+" 번째 1-100 숫자입력 : ");
			int an = s.nextInt();
			i++;
			if(a==an){
				System.out.println("정답 "+i+" 번만에 맞춤");
				break;
			}
			else if(a>an) {
				System.out.println("up");
			}else if (a<an){
				System.out.println("down");
			
			}//for end 
		}
		System.out.println("끝");
		s.close();



	//while end



	}//main end

}//class end