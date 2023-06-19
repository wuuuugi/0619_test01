package ch05_array;
/* Math 사용
 * 주사위 나올수 있는 가지수 : 6
 * int a =(int)(Math.random()*6+1)
 * int a =(int)(Math.random()*가지수+ 나올수있는 가장 작은수 )
    						가지수= 큰수 -작은수 +1
   Math.random(): 0<x<1 실수 발생  defalt값 
 */
public class Test11_Math {
	public static void main(String[] args) {
		
		for (int i=1;i<=10;i++){
			int a=(int)(Math.random()*6+1);
			System.out.println(a+" ");
		}
		System.out.println();
		for(int i=1; i<=10; i++){
			System.out.println(Math.random());
		}
		System.out.println();
		for(int i =1 ; i<=10; i++){
			int a=(int)(Math.random()*91+10);
			System.out.println(a);
			
		}
		
	}

}
