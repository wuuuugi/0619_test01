package day08;

import java.util.*;

public class Test01 {
	static int score(Scanner s, String kind,int limit) {
		System.out.println(kind + " 점수를 입력해주세요.");
		int num;
		while (true) {
			num = s.nextInt();
			if (num > limit || num < 0) {
				System.out.print("0~"+limit+" 사이 값 입력");
			} else {
				break;
			}
		}
		return num;
	}

	public static void main(String[] args) {
		ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.print("(1)입력, (2)삭제, (3)출력, (4)종료 : ");
			int num = s.nextInt();
			if (num == 1) {
				HashMap<String, Object> map =
						new HashMap<String, Object>();
				System.out.print("이름을 입력하세요 ");
				map.put("name", s.next());
				System.out.print("나이를 입력하세요 ");
				map.put("age", s.next());
				map.put("java", score(s, "자바",100));
				map.put("oracle", score(s, "오라클",100));
				map.put("html", score(s, "html",50));
				map.put("javascript", score(s, "javascript",80));
				list.add(map);
			} else if (num == 2) {
				System.out.println("삭제할 사용자 이름 입력 : ");
				String name = s.next();
				System.out.println("삭제할 사용자 나이 입력 : ");
				int age = s.nextInt();
				for (int i = 0; i < list.size(); i++) {
					HashMap<String, Object> map = list.get(i);
					if (map.get("name").equals(name)
							&& (int) map.get("age") == age) {
						list.remove(i);
					}
				}
			} else if (num == 3) {
				for (int i = 0; i < list.size(); i++) {
					System.out.print("이름 : " + list.get(i).get("name"));
					System.out.print(" 나이 : " + list.get(i).get("age"));
					System.out.print(" 자바점수 : " + list.get(i).get("java"));
					System.out.println(" 오라클점수 : " + list.get(i).get("oracle"));
				}

			} else {
				System.out.println("종료 되었습니다.");
				break;

			}

		}

	}

}
