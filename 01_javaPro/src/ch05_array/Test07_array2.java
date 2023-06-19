package ch05_array;

public class Test07_array2 {
	public static void main(String[] args) {
		int a[][]={{10,20},{30,40,50}};
		
		System.out.println("Çà °¹¼ö"+a.length);
		System.out.println("¿­ °¹¼öa[0]"+a[0].length);
		System.out.println("¿­ °¹¼öa[1]"+a[1].length);
		
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
