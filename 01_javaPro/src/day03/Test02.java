package day03;

public class Test02 {
	public static void main(String[] args) {
		
		Circle [] cArray = new Circle[5];
		for ( int i =0; i < cArray.length; i++){
			cArray[i] = new Circle(i);
		}
		for ( int i =0; i < cArray.length; i++){
			System.out.println(cArray[i].getRadius());
		}
		
	    
		
		
		
	}

}
