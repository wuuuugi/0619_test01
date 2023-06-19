package day08;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Person hong = new Person();
		// hong.setName("홍길동");
		// hong.setAge(30);
		// hong.setAddr("서울");

		Scanner s = new Scanner(System.in);

		// Person yu = new Person("유재석", 40, "인천");
		HashMap<String, Person> map = new HashMap<>();

		while (true) {
			System.out.println("1 = 입력  2= 출력 3= 종료");
			int num = s.nextInt();
			if (num == 1) {
				for (int i = 0; i < 3; i++) {
					String name = s.next();
					int age = s.nextInt();
					String addr = s.next();
					Person p = new Person(name, age, addr);
					map.put(p.getName(), p);
				}
				System.out.println(map);
			} else if (num == 2) {
				Set<String> keys = map.keySet();
				Iterator<String> it = keys.iterator();
				while (it.hasNext()) {
					Person p = map.get(it.next());
					System.out.print("이름 : " + p.getName());
					System.out.print("  나이 : " + p.getAge());
					System.out.println("  주소 : " + p.getAddr());
				}
			} else {
				break;
			}
		}

		// map.put("홍길동", hong);
		// map.put("유재석", yu);

	}

}
