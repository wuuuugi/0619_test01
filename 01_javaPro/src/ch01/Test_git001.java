package ch01;
import java.util.*;
public class Test_git001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//가장큰값과 0번째 인덱스값 바꾸기
		//결 : 9,5,2,3,8
		int arr[] = {3,5,2,9,8};
		int max = 0;
		
		for(int i = 0; i<arr.length; i++){
			if(arr[i] > arr[max]){
				max = i;
	
			}		
		}
		int temp = arr[max];
		arr[max] = arr[0];
		arr[0] = temp;
		
		System.out.println(Arrays.toString(arr));
		
	}

}
