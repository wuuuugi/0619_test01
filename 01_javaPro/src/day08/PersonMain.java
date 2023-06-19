package day08;

import java.util.*;

public class PersonMain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashMap<String, Person> map = new HashMap<String, Person>();
		while (true) {
			System.out.print("(1)입력, (2)삭제, (3)출력, (4)종료 : ");
			int num = s.nextInt();
			if (num == 1) {
				System.out.println("이름입력");
				String name = s.next();
				System.out.println("나이입력");
				int age = s.nextInt();
				System.out.println("주소입력");
				String addr = s.next();
				Person p = new Person(name, age, addr);
				map.put(name, p);

			} else if (num == 2) {
				System.out.println("삭제할 이름 입력");
				String name = s.next();
				if (map.containsKey(name)) {
					map.remove(name);
				}
			} else if (num == 3) {
				Set<String> Keys = map.keySet();
				Iterator<String> it = Keys.iterator();

				while (it.hasNext()) {
					Person p = map.get(it.next());
					System.out.print("이름: " + p.getName());
					System.out.print(" 나이: " + p.getAge());
					System.out.println(" 주소: " + p.getAddr());
				}

			} else {
				System.out.println("종료 되었습니다.");
				break;
			}
		}

	}

}
