package ch03_oper;
/*
	�Ϲݳ� ������ : && || !
	���迬���ڴ� ������ ���� ���� ����ȴ� 
	���迬���ڰ� �켱������ ����, �����꺸�� 

 */
public class Test04 {

	public static void main(String[] args) {
		int a =7, b=5;
		System.out.println(a>b && a>3);
		System.out.println(a>b && a>10);
		
		System.out.println(a>b || a>10);
		System.out.println(a<b || a>10);
		System.out.println(a<b || a<10);
		
		boolean c = false;
		System.out.println(!c);
		System.out.println(!!c);
		
				
		
	}

}
