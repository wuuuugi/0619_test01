package ch03_oper;
/*���迬����
 > >= < <= == !=  
 */
public class Test03 {

	public static void main(String[] args) {
		int a= 7, b=5 ;
		
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		a=1;
		b=5;
		
		if(a>b){
			System.out.println("a>b");
		}
		if(a>=b){
			System.out.println("a>=b");
		}
		else{
			System.out.println("a>=b �ƴϴ�");
		}
		
	}
}
