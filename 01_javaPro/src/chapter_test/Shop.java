package chapter_test;

public class Shop {
	String number;
	String id;
	String data;
	String name;
	int pdnum;
	String address;

	public static void main(String[] args) {
		Shop order1 = new Shop();
		order1.number= "201803120001";
		order1.id="abc123";
		order1.data="2018년 3월 12일";
		order1.name="홍길동";
		order1.name="PD0345-12";
		order1.address="서울시 영등포구 여의도동 20번지";
		
		System.out.println(order1.number);
				
		

	}

}
