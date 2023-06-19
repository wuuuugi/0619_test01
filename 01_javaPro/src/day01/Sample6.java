package day01;

public class Sample6 {
	//양수 , 음수의 합 
	public static void main(String[] args) {
		int arr[] = {4, -3, 5, -2, 1, -9, 7, -8 };
		int sum=0;
		for(int i=0; i<arr.length ; i++){
			//sum += Mate.abs(arr[i]);
			if(arr[i]>0){
				sum+=arr[i];
			}//if end
			else if(arr[i]<=0){
				sum+=-(arr[i]);
			}// else if end
		}//for end
		System.out.println(sum);	
	}//main end

}//class end
