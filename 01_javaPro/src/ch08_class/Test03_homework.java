package ch08_class;
import java.util.Scanner;

public class Test03_homework {
	public static void main(String[] args) {
		//�ֹ� ��ȣ�� �Է� �޾� �������� �������� �����Ͽ� ����Ͻÿ�. 
		//�Է¹ް� : �ֹι�ȣ , ��ȭ ��ȣ , �����ȣ 
		Scanner scanner = new Scanner(System.in);

		System.out.print("�ֹι�ȣ �Է�>>");
		String str1 = scanner.next(); //�ֹι�ȣ �Է� ex 970806 1183135
		//System.out.println(str1.substring(0,6)+"-"+str1.substring(6)); //�ֹι�ȣ ���
		System.out.println(str1);
		String gen=str1.substring(7,8);

		int num= Integer.parseInt(gen);
		System.out.println("num:"+num);

		if(num==1 ||num==3){
			System.out.println(str1+" �����Դϴ�");
		}else if (num==2 || num==4){
			System.out.println(str1+" �����Դϴ�");
		}else{
			System.out.println("�߸��Է��Ͽ����ϴ�.");
		}
		 char ch =str1.charAt(7); 
		/*if(ch=='1' || ch=='3'){
		 	  System.out.println(str1+"����");
	  		}
	  		else if ( ch =='2' || ch == '4'){
	  		  System.out.println(str1+"����");
	  		 }
		 */
		switch(ch){
		case '1':
		case '3':
			System.out.println(str1+"����");
			break;
		case '2':
		case '4':
			System.out.println(str1+"����");
			break;
		}




	}//main 

}//class end
