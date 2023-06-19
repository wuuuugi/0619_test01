package day01;

public class Sample5 {
	public static void main(String[] args) {
		int arr[] = {4,3,5,2,1};
		int min=arr[0];
		int min2=arr[0];
		for(int i=1 ; i <arr.length ;i++){
			if(min>arr[i]){
				min=arr[i];
			}
		}
		System.out.println(min);
		for (int i =0 ; i<arr.length ; i++){
			min2=Math.min(min2, arr[i]);
		}
		System.out.println(min2);
	
	}

}
