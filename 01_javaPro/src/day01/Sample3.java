package day01;

import java.util.Scanner;
import java.util.Random;

public class Sample3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();

		while(true){
			System.out.println("컴퓨터가 1~100중 랜덤 숫자 하나를 정합니다 ");
			int a =r.nextInt(100)+1;
			System.out.println("이숫자를 맞춰주세요");

			for(int i =1 ; ; i++){
				System.out.print("1-100 숫자입력 : ");
				int an = s.nextInt();
				if(a==an){
					System.out.println("정답 "+i+" 번만에 맞춤");
					break;
				}
				else if(a>an) {
					System.out.println("up");
				}else if (a<an){
					System.out.println("down");
				}
			}//for end 
			System.out.println("계속하시겠습니까? 0누르면 종료");
			int end = s.nextInt();  
			if (end == 0) {
				System.out.println("종료");
				break;
			}
			System.out.println("끝");
			s.close();

		
			

		}//while end



	}//main end

}//class end
