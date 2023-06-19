package day02;

import java.util.Arrays;

public class Sample05 {
	public static void main(String[] args) {
		/*
		int arr[] = { 20, 8, 15, 9, 5 };
		int min = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					min = arr[i];
					arr[i] = arr[j];
					arr[j] = min;
				}System.out.println(Arrays.toString(arr));
			}
		}
		System.out.println(Arrays.toString(arr));
		*/
		
		int arr[] ={7,6,9,3,5};
		
		for(int i=0; i<arr.length; i++){
			int index = i;
			for(int j =i+1; j<arr.length; j++){
				if(arr[index] > arr[j]){
					index =j;
				}
			}
			int temp =arr[index];
			arr[index]=arr[i];
			arr[i]= temp;
		}
		System.out.println(Arrays.toString(arr));
		

	}

}
