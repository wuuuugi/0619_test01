package day01;

import java.util.Scanner;
import java.util.Random;

public class Sample3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();

		while(true){
			System.out.println("��ǻ�Ͱ� 1~100�� ���� ���� �ϳ��� ���մϴ� ");
			int a =r.nextInt(100)+1;
			System.out.println("�̼��ڸ� �����ּ���");

			for(int i =1 ; ; i++){
				System.out.print("1-100 �����Է� : ");
				int an = s.nextInt();
				if(a==an){
					System.out.println("���� "+i+" ������ ����");
					break;
				}
				else if(a>an) {
					System.out.println("up");
				}else if (a<an){
					System.out.println("down");
				}
			}//for end 
			System.out.println("����Ͻðڽ��ϱ�? 0������ ����");
			int end = s.nextInt();  
			if (end == 0) {
				System.out.println("����");
				break;
			}
			System.out.println("��");
			s.close();

		
			

		}//while end



	}//main end

}//class end
