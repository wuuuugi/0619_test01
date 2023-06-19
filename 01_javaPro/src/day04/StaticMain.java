package day04;

public class StaticMain {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static01.staticNum = 10;
		System.out.println(Static01.staticNum);

		Static01 obj = new Static01();
		obj.nonStaticNum = 20;
		obj.staticNum =30;
		System.out.println(obj.nonStaticNum);
		System.out.println(Static01.staticNum);
		
		Static01 obj2 = new Static01();
		obj2.staticNum =100;
		obj2.nonStaticNum =200;
		System.out.println(Static01.staticNum);
		System.out.println(obj.nonStaticNum);
		System.out.println(obj2.nonStaticNum);
		
		System.out.println(Math.PI);
		
		System.out.println(Calc01.abs(-5));
		System.out.println(Calc01.max(10,8));
		System.out.println(Calc01.min(-3,-8));
		
		System.out.println(Calc02.max(1.5, 2.5));
		System.out.println(Calc02.strmax("test", "test123"));
		
	}

}
