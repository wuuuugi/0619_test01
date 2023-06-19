package day07;
import java.util.Vector;

public class VectorString {
	public static void main(String[] args) {
		Vector <String> v =new Vector<String>();
		
		v.add("홍길동");
		v.add("유재석");
		v.add("강호동");
		v.add(1,"박명수");
		
		v.remove(0);
		
		for(int i =0; i<v.size();i++){
			String n = v.get(i);
			System.out.println(n);
		}
		
		
	}

}
