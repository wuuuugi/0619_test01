package day09;

import java.util.*;

public class CollectionEx {
	static void dolist(LinkedList<Integer> i) {
		Iterator<Integer> it = i.iterator();
		while (it.hasNext()) {
			int p = it.next();
			String o;
			if (it.hasNext()) {
				o = "->";
			} else {
				o = "\n";
			}
			System.out.print(p + o);
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		LinkedList<Integer> ilist = new LinkedList<Integer>();
		for (int i = 0; i < 5; i++) {
			ilist.add(s.nextInt());
		}
		
		Collections.sort(ilist);
		dolist(ilist);
		System.out.println("찾고싶은 숫자위치 ");
		int index = Collections.binarySearch(ilist,s.nextInt())+1;
		System.out.println(index);
		
		s.close();
	}

}
