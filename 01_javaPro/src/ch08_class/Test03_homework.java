package ch08_class;
import java.util.Scanner;

public class Test03_homework {
	public static void main(String[] args) {
		//주민 번호를 입력 받아 남자인지 여자인지 판정하여 출력하시오. 
		//입력받고 : 주민번호 , 전화 번호 , 우편번호 
		Scanner scanner = new Scanner(System.in);

		System.out.print("주민번호 입력>>");
		String str1 = scanner.next(); //주민번호 입력 ex 970806 1183135
		//System.out.println(str1.substring(0,6)+"-"+str1.substring(6)); //주민번호 출력
		System.out.println(str1);
		String gen=str1.substring(7,8);

		int num= Integer.parseInt(gen);
		System.out.println("num:"+num);

		if(num==1 ||num==3){
			System.out.println(str1+" 남자입니다");
		}else if (num==2 || num==4){
			System.out.println(str1+" 여자입니다");
		}else{
			System.out.println("잘못입력하였습니다.");
		}
		 char ch =str1.charAt(7); 
		/*if(ch=='1' || ch=='3'){
		 	  System.out.println(str1+"남자");
	  		}
	  		else if ( ch =='2' || ch == '4'){
	  		  System.out.println(str1+"여자");
	  		 }
		 */
		switch(ch){
		case '1':
		case '3':
			System.out.println(str1+"남자");
			break;
		case '2':
		case '4':
			System.out.println(str1+"여자");
			break;
		}




	}//main 

}//class end
