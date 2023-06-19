package day03;

//5단빼고 출력 
public class Sample02 {
	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			if (i != 5) { // countinue 사용해서 빠져 나오기
				for (int j = 1; j < 10; j++) {
					System.out.println(i + " X " + j + " = " + i * j);
				}
			}
		}
	}

}
