package day07;

import java.util.*;

public class HashMapScoreEx {
	public static void main(String[] args) {
		HashMap<String, Integer> scoreMap =
				new HashMap<String, Integer>();

		scoreMap.put("�輺��", 97);
		scoreMap.put("Ȳ����", 88);
		scoreMap.put("�賲��", 98);
		scoreMap.put("���繮", 70);
		scoreMap.put("�ѿ���", 99);

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("�̸��� �Է��ϼ��� : ");
			String name = sc.nextLine();
			if(name.equals("exit")){
				System.out.println("����");
				break;
			}
			if(!scoreMap.containsKey(name)){
				System.out.println("�׷���� ����");
			}else {
				System.out.println(scoreMap.get(name));
			}
			
		}
		sc.close();

	}

}
