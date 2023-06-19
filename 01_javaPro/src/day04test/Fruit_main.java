package day04test;

public class Fruit_main {

	static void pack(Fruit f) {
		int price=0;
		if(f instanceof Banana){
			Banana obj=(Banana)f;
			price = obj.getPrice();
		}
		if(f instanceof Orange){
			Orange obj=(Orange)f;
			price = obj.getPrice();
		}
		if(f instanceof Apple){
			Apple obj=(Apple)f;
			price = obj.getPrice();
		}
		
		System.out.println(price+"�� "+f.getName() + "�� ��ҽ��ϴ�. ");
		
	}

	public static void main(String[] args) {
		Banana banana = new Banana("�ٳ���", "�����", 1000);
		Orange orange = new Orange("������", "��Ȳ��", 2000);
		Apple apple = new Apple("���", "������", 1500);
		
		pack(banana);
		pack(orange);
		pack(apple);

//		banana.view();
//		orange.view();
//		apple.view();
		
//		System.out.print("\"ȫ�浿\"\n");
//		System.out.print(" \"\\n�� �ٹٲ��̴�.\" ");
	}

}
