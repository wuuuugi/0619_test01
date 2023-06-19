package day08;
import java.util.*;
public class Iterator01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(2);
		v.add(4);
		v.add(6);
		v.add(1);
//		for(int i=0;i<v.size();i++){
//			System.out.println(v.get(i));
//		}
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		Scanner s =new Scanner(System.in);
		ArrayList<String> a=new ArrayList<>();
		for(int i=0;i<5;i++){
			System.out.println((i+1)+" 번쨰 문자열 입력");
			a.add(s.next());
		}
		Iterator<String> it2 = a.iterator();
		while(it2.hasNext()){
			System.out.println(it2.next());
			
		}
		s.close();

	}

}
