package day04test;

import java.util.Arrays;
import java.util.Scanner;

public class Calc_main {
	public static void main(String[] args) {
		Calc calc =new Calc();
//		calc.message();// 안녕하세요 문구 출력 
//		System.out.println(calc.message2()); //안녕하세요 2 문구 출력
//		calc.sum(1,2);
//		int a = calc.sum2(3,4);
//		System.out.println(a);
//	
//		double b = calc.sum2(1,2.5);
//		System.out.println(b);
		
//		Scanner s = new Scanner(System.in);
//		System.out.println("두개의 숫자를 입력하세요  ");
//		int c =s.nextInt();
//		int d =s.nextInt();
//		calc.max(c,d);
//		s.close();
//		
		int arr[]={3,2,6,5,4};
//		calc.arr1(arr);
//		System.out.println(Arrays.toString(arr));
		
		calc.arr2(arr);
		System.out.println(Arrays.toString(arr));
		
		
		
	}

}
