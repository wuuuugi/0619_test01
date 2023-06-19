package day09_test;

public class Test01 {
	public static void main(String[] args) {

		String str1 = "자바";
		String str2 = new String("자바");
		if (str1.equals(str2)) { // 문자열 비교
			System.out.println("같다");// 문자열이 같다면 출력
		} else {
			System.out.println("다름");
		}

	}

}
