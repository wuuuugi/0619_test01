package day03;

//5�ܻ��� ��� 
public class Sample02 {
	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			if (i != 5) { // countinue ����ؼ� ���� ������
				for (int j = 1; j < 10; j++) {
					System.out.println(i + " X " + j + " = " + i * j);
				}
			}
		}
	}

}
