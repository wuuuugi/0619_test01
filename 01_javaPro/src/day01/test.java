package day01;

import java.util.Scanner;
import java.util.Random;

public class test {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		int i= 0; 
		
		System.out.println("��ǻ��1�� 1~100�� ���� ���� �ϳ��� ���մϴ� ");
		int a =r.nextInt(100)+1;
		System.out.println("�̼��ڸ� �����ּ���");
		while(true){
			System.out.print(i+1+" ��° 1-100 �����Է� : ");
			int an = s.nextInt();
			i++;
			if(a==an){
				System.out.println("���� "+i+" ������ ����");
				break;
			}
			else if(a>an) {
				System.out.println("up");
			}else if (a<an){
				System.out.println("down");
			
			}//for end 
		}
		System.out.println("��");
		s.close();



	//while end



	}//main end

}//class end