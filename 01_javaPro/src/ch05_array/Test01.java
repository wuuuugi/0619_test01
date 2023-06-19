package ch05_array;

public class Test01 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println();
		
		int d[] = new int[3];
		d[0]=10;
		d[1]=20;
		d[2]=30;
		System.out.println(d[0]);
		System.out.println(d[1]);
		System.out.println(d[2]);
		
		for (int i =0; i<=2 ; i++){
			System.out.println(d[i]);
			
		}
		System.out.println();
		
		int e[]={50,60,70};
		for(int i=0 ; i<3;i++){
			System.out.println(e[i]);
						
			
			
			
		}
		
		
		
		
	}

}
