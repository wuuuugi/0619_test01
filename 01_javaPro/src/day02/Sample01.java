package day02;
//구구단 3의 배수만
public class Sample01 {
	public static void main(String[] args) {
		for(int i =2;i<10;i++){
			for(int j =1;j<10;j++){
				if(i%3==0){
					System.out.println(i+" X "+ j+" = "+ i*j);
				}
				
			}
			System.out.println();
		}
		
	}

}
