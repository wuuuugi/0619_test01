package ch05_array;
/* �������� : �ڵ����� �ʱ�ȭ �ȴ� ( �޼��� �ۿ��� ����� �� ) 
 * �������� : �ڵ����� �ʱ�ȭ �ȵȴ�
 * �迭 : ���������� �ڵ����� �ʱ�ȭ �ȴ�
 */

public class Test03 {
	static int a;   //static �޼��忡�� ����ϱ����� 
	int c;			//��ü����
	
	public static void main(String[] args) {
		System.out.println(a);
		
		Test03 test03 = new Test03();
		System.out.println("c:"+test03.c);
		
		int c[]=new int[3];
		for(int i=0; i<c.length; i++){
			System.out.println(c[i]);
		}
	}

}
