package day02;
public class Sample01_3 {
	public static void main(String[] args) {
		int arr[] = { 40, -20, -30, -10, 50 };
		/*
		  int min = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i]<0){
					arr[i]= -(arr[i]);
				}
				if (arr[i] > arr[j]) {
					min = arr[j];
					arr[j] = arr[i];
					arr[i] = min;
				}
			}
		}
		
		System.out.println("가장큰수 : " + arr[arr.length - 1] + " 가장작은수 : "
				+ arr[0] + " 결과 : " + (arr[arr.length - 1] + arr[0]));
		System.out.println(Arrays.toString(arr));
		*/
		int max =arr[0];
		int min =Math.abs(arr[0]);
		for(int i=0; i<arr.length; i++){
			max =Math.max(max, Math.abs(arr[i]));
			min =Math.min(min, Math.abs(arr[i]));
		}
		System.out.println(max - min);
		
		 
		

	}

}
