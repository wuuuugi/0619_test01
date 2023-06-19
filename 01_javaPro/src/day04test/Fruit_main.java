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
		
		System.out.println(price+"원 "+f.getName() + "를 담았습니다. ");
		
	}

	public static void main(String[] args) {
		Banana banana = new Banana("바나나", "노란색", 1000);
		Orange orange = new Orange("오렌지", "주황색", 2000);
		Apple apple = new Apple("사과", "빨간색", 1500);
		
		pack(banana);
		pack(orange);
		pack(apple);

//		banana.view();
//		orange.view();
//		apple.view();
		
//		System.out.print("\"홍길동\"\n");
//		System.out.print(" \"\\n은 줄바꿈이다.\" ");
	}

}
