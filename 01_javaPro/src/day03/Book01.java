package day03;

public class Book01 {
	String title;
	String author;
	
	public Book01(String title){
		this(title, "���ڹ̻�");
		//this.title = title; 
		//author = "���ڹ̻�";
		
	}
	public Book01(String title, String author){
		this.title = title ;
		this.author = author;
	}
	
	public static void main(String[] args) {
		Book01 little = new Book01("����� ", "�������丮");
		Book01 love = new Book01("������");
		System.out.println(little.title+little.author);
		System.out.println(love.title+love.author);
		
	}

}
