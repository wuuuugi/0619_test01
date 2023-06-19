package ch05_array;
//·Î¶Ç : 1~45 6°³ 
public class Test12_lotto {
	public static void main(String[] args) {
		int lotto[]=new int[6];
		
		for(int i =0; i<6 ;i++){
			lotto[i]=(int)(Math.random()*45+1);
			for(int j=0;j<i;j++){
				if(lotto[i]==lotto[j]){
					i--;
					break;
				}//if
				
			}//in for
		}//out for
		for (int i =0;i<6; i++){
			System.out.print(lotto[i]+" ");
		}
		
	}//main_end

}//class_end
