package day08;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Person hong = new Person();
		// hong.setName("ȫ�浿");
		// hong.setAge(30);
		// hong.setAddr("����");

		Scanner s = new Scanner(System.in);

		// Person yu = new Person("���缮", 40, "��õ");
		HashMap<String, Person> map = new HashMap<>();

		while (true) {
			System.out.println("1 = �Է�  2= ��� 3= ����");
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
					System.out.print("�̸� : " + p.getName());
					System.out.print("  ���� : " + p.getAge());
					System.out.println("  �ּ� : " + p.getAddr());
				}
			} else {
				break;
			}
		}

		// map.put("ȫ�浿", hong);
		// map.put("���缮", yu);

	}

}
