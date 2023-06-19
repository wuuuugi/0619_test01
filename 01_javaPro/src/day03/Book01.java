package day03;

public class Book01 {
	String title;
	String author;
	
	public Book01(String title){
		this(title, "작자미상");
		//this.title = title; 
		//author = "작자미상";
		
	}
	public Book01(String title, String author){
		this.title = title ;
		this.author = author;
	}
	
	public static void main(String[] args) {
		Book01 little = new Book01("어린왕자 ", "생텍쥐페리");
		Book01 love = new Book01("춘향전");
		System.out.println(little.title+little.author);
		System.out.println(love.title+love.author);
		
	}

}
