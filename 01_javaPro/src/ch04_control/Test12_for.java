package ch04_control;

public class Test12_for {
	
	public static void main(String[] args) {
		// 1~10���� �ձ��ϱ� 
		int sum=0;
		int sum1=0;
		for ( int i=1; i<=10; i++){
			sum+=i;
		}
		System.out.println("1���� 10���� ����"+sum);
		
		for ( int i=1; i<=20; i++){
			if(i%2==0){
			sum1+=i;
			}
		}
		System.out.println("1���� 20���� ¦�� ����"+sum1);
		
		
	}//main end

}//class end
