package day03;

import java.util.Arrays;

public class Sample01 {
	
	public static void main(String[] args) {
		Calc calc = new Calc();
//		calc.sum();
//		int a = calc.sum2(1 ,2 );
//		int b = calc.sum2(10, 20);
//		System.out.println(a);
//		System.out.println(b);
//		int c = calc.max(20, 14);
//		System.out.println(c);
//		int d = calc.abs(-85);
//		System.out.println(d);
//		int e = calc.min(7, 5, 9);
//		System.out.println(e);
//		int f = calc.min3(7, 5, 9);
//		System.out.println(f);
//		double g= calc.sum2(10.2, 3.234);
//		System.out.println(g);
//		int arr[]={4, 5, 2, 1, 3};
//		int ar = calc.arr1(arr);
//		System.out.println(ar);
//		int arr1[]={3,5,10,4,8};
//		double ar2 = calc.avr_ar(arr1);
//		System.out.println(ar2);
		int a=10;
		calc.test1(a);
		System.out.println(a);
		int arr[]={1,2,3,4,5};
		calc.test2(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}
