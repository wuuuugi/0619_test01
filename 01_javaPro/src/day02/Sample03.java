package day02;

public class Sample03 {
	public static void main(String[] args) {
		int avg = 0;
		int count = 0;
		int arr[] = { 10, -20, 30, 40, 50 };
		/*
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				avg += arr[i];
				count++;
			}
		}
		int result = avg / count;
		System.out.println("Æò±Õ°ªÀº" + result);
		*/
		int sum=0; 
		for(int num :arr){
			if(num >0 ){
				sum +=num;
				count++;
			}
			
		}
		System.out.println((double)sum/count);

	}

}
