package day09;

import java.util.*;

public class StringTokenTest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();

		StringTokenizer st = new StringTokenizer(str, " ");
		System.out.println("어절 개수는 : " + st.countTokens());
		// int cnt=0;
		// while (st.hasMoreTokens()){
		// System.out.println(st.nextToken());
		// cnt++;
		// }
		// System.out.println("어절 개수는 : " +cnt);
	}

}
