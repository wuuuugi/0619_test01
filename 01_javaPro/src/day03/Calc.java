package day03;

public class Calc {
	void sum() {
		System.out.println("Void sum È£Ãâ ");
	}

	int sum2(int a, int b) {
		return a + b;
	}

	double sum2(double a, double b) {
		return a + b;
	}

	int max(int a, int b) {
		int c = a >= b ? a : b;
		return c;
	}

	int abs(int a) {
		int b = a >= 0 ? a : -a;
		return b;
	}

	int min(int a, int b, int c) {
		int d = 0;
		if (a >= b) {
			if (b > c) {
				d = c;
			} else {
				d = b;
			}
		} else if (a < b) {
			if (a < c) {
				d = a;
			} else {
				d = c;
			}
		}
		return d;
	}

	int min(int a, int b) {
		return (a >= b) ? b : a;
	}

	int min3(int a, int b, int c) {
		return (min(a, b) >= c ? c : min(a, b));
	}

	int arr1(int arr[]){
		int max=arr[0];
		for(int num : arr){
		  max =Math.max(max, num);
		}
		return max;
	}
	double avr_ar (int arr[]){
		int avg=0;
		for(int num :arr){
			avg+=num;
		}
		return (double)avg/arr.length;
	}
	void test1(int a){
		a= a+1;
	}
	void test2(int [] arr){
		arr[0]=100;
	}
}
