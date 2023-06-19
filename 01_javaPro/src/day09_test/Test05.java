package day09_test;

import java.util.*;

public class Test05 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list =
				new ArrayList<HashMap<String, Object>>();
		while (true) {
			System.out.print("(1)입력, (2)삭제, (3)출력, (4)종료 : ");
			int num = s.nextInt();
			if (num == 1) {
				HashMap<String, Object> map = 
						new HashMap<String, Object>();
				System.out.println("이름입력");
				map.put("name", s.next());
				System.out.println("자바점수");
				map.put("java", s.nextInt());
				System.out.println("오라클점수");
				map.put("oracle", s.nextInt());
				System.out.println("html점수");
				map.put("html", s.nextInt());
				list.add(map);
			} else if (num == 2) {
				System.out.println("삭제할 이름 입력");
				String name = s.next();
				for (int i = 0; i < list.size(); i++) {
					HashMap<String, Object> map = list.get(i);
					if (map.get("name").equals(name)) {
						list.remove(i);
						System.out.println("삭제완료");
					} else {
						System.out.println("찾을수 없는 이름입니다");
					}
				}
			} else if (num == 3) {
				for (int i = 0; i < list.size(); i++) {
					System.out.print("이름 : " + list.get(i).get("name"));
					int java = (int) list.get(i).get("java");
					int oracle = (int) list.get(i).get("oracle");
					int html = (int) list.get(i).get("html");
					int sum = java + oracle + html;
					System.out.println(" 총점 : " + sum);
				}
			}  else {
				System.out.println("종료");
				break;
			}

		}
		s.close();

	}

}
