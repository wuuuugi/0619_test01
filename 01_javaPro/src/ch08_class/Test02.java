package ch08_class;

public class Test02 {
	public static void main(String[] args) {
		String str="banana";
		int idx=str.indexOf('a');  //1
		System.out.println("idx:"+idx);

		String s = "ÃÑºñ¿ëÀº $45.67";
		int idx2=s.indexOf("$45.67");
		System.out.println("idx:"+idx2); //5
		System.out.println(s.substring(5)); //$45.67  


	}//main end

}//class end 
