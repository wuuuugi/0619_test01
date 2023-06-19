package day04test;

public class Calc {

	void message() {
		System.out.println("안녕하세요");
	}

	String message2() {
		return "안녕하세요2";
	}

	void sum(int a, int b) {
		System.out.println(a + b);
	}

	int sum2(int a, int b) {
		return a + b;
	}

	double sum2(double a, double b) {
		return a + b;
	}

	void max(int c, int d) {
		int a = Math.max(c, d);
		System.out.println("큰수는 " + a + " 입니다.");
	}

	void arr1(int arr[]) {
		int maxIndex = 0;
		int minIndex = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[maxIndex] < arr[i]) {
				maxIndex = i;
			}
			if (arr[minIndex] > arr[i]) {
				minIndex = i;
			}
		}
		
		int ch = arr[maxIndex];
		arr[maxIndex] = arr[minIndex];
		arr[minIndex] = ch;

	}
	void arr2(int arr[]) {
		int minIndex = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[minIndex] > arr[i]) {
				minIndex = i;
			}
		}
		int temp = arr[minIndex];
		arr[minIndex]= arr[arr.length-1];
		arr[arr.length-1]=temp;
	}

}
