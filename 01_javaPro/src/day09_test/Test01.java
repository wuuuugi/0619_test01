package day09_test;

public class Test01 {
	public static void main(String[] args) {

		String str1 = "�ڹ�";
		String str2 = new String("�ڹ�");
		if (str1.equals(str2)) { // ���ڿ� ��
			System.out.println("����");// ���ڿ��� ���ٸ� ���
		} else {
			System.out.println("�ٸ�");
		}

	}

}
