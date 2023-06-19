package day01;

public class Sample4 {
	public static void main(String[] args) {
		int arr[] = {4,3,5,2,1};
		int max=arr[0]; 
		for(int i =1 ; i<arr.length ; i++){
			if(arr[i]>max){
				max=arr[i];
			}	
			//max = Math.max(max, arr[i]);
		}
		System.out.println(max);
		
	}

}
