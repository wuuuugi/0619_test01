package day09;

import java.util.*;

public class MethodTest {
	private String name;
	private ArrayList<Integer> list;
	private int arr[];

	MethodTest(String name, int java, int oracle, int html) {
		this.name = name;
		list = new ArrayList<Integer>();
		list.add(java);
		list.add(oracle);
		list.add(html);

		arr = new int[3];
		arr[0] = java;
		arr[1] = oracle;
		arr[2] = html;
	}

	HashMap<String,Object> result(){
		HashMap<String,Object> map=new HashMap<>();
		map.put("name",name);
		map.put("list",list);
		map.put("array", arr);
		
		return map;
	}

}
