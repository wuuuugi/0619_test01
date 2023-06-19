package day09_test;

import java.util.Arrays;

public class Test03 {
	public static void main(String[] args) {
		int arr[] ={3,5,2,9,8};
		int maxIndex=0;
		for(int i =1;i<arr.length;i++){
			if(arr[maxIndex]<arr[i]){
				maxIndex=i;
			}
		}
		int temp = arr[maxIndex];
		arr[maxIndex]=arr[0];
		arr[0]=temp;
		System.out.println(Arrays.toString(arr));
	}

}
