package ch06_oop;
/*배열을 매개변수로 전달하는 예제
  
 */
public class Test06_array {
	public void arr(int a[]){
		System.out.println("배열값 출력");
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
		}//for end
	}//arr()-end
	
	public static void main(String[] args) {
		int m[]={10,20,30,40,50};
		Test06_array test06 = new Test06_array();
		test06.arr(m);
		
		
	}//main-end

}//class-end
