package day02;

public class CircleMain {

	public static void main(String[] args)  {
		Circle pizza = new Circle(); // Circle ��ü ����
		pizza.radius = 10; // ������ �������� 10���� ����
		pizza.name = "�ڹ�����"; // ������ �̸� ����
		double area = pizza.getArea(); // ������ ���� �˾Ƴ���
		System.out.println(pizza.name + "�� ������ " + area);
		
		
		Circle donut = new Circle(); // Circle ��ü ����	
		donut.radius = 2; // ������ �������� 2�� ����
		donut.name = "�ڹٵ���"; // ������ �̸� ����
		area = donut.getArea(); // ������ ���� �˾Ƴ���
		System.out.println(donut.name + "�� ������ " + area);

	}

}
