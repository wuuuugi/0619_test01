package day09;
import java.util.*;
public class MethodTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodTest method =new MethodTest("ȫ�浿", 100, 90, 80);
		HashMap<String,Object> map = method.result();
		System.out.println(map.get("name"));
		System.out.println(map.get("list"));
		
		

	}

}
