package ch05_array;
/* Math ���
 * �ֻ��� ���ü� �ִ� ������ : 6
 * int a =(int)(Math.random()*6+1)
 * int a =(int)(Math.random()*������+ ���ü��ִ� ���� ������ )
    						������= ū�� -������ +1
   Math.random(): 0<x<1 �Ǽ� �߻�  defalt�� 
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
