package chapter_test;

public class FunctionTest {

	public static void main(String[] args) {
		int num1 =40;
		int num2 =20;
		
		int sum1 = add(num1, num2);
		int sum2 = min(num1, num2);
		int sum3 = mul(num1, num2);
		int sum4 = div(num1, num2);
		System.out.println(num1+ "+"+num2+"="+sum1+"�Դϴ�");
		System.out.println(num1+ "-"+num2+"="+sum2+"�Դϴ�");
		System.out.println(num1+ "*"+num2+"="+sum3+"�Դϴ�");
		System.out.println(num1+ "/"+num2+"="+sum4+"�Դϴ�");
	}
	public static int add(int n1, int n2){
		int result = n1+ n2;
		return result;
	}
	public static int min(int n1, int n2){
		int result = n1 - n2;
		return result;
	}
	public static int mul(int n1, int n2){
		int result = n1 * n2;
		return result;
	}
	public static int div(int n1, int n2){
		int result = n1 / n2;
		return result;
	}

}
