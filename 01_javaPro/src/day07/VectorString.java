package day07;
import java.util.Vector;

public class VectorString {
	public static void main(String[] args) {
		Vector <String> v =new Vector<String>();
		
		v.add("ȫ�浿");
		v.add("���缮");
		v.add("��ȣ��");
		v.add(1,"�ڸ��");
		
		v.remove(0);
		
		for(int i =0; i<v.size();i++){
			String n = v.get(i);
			System.out.println(n);
		}
		
		
	}

}
