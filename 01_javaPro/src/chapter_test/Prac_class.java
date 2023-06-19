package chapter_test;

public class Prac_class {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public String getStudentName(){
		return studentName;
	}
	public void setStudentName(String name){
		studentName = name ;
	}

	public static void main(String[] args) {
		Prac_class studentAhn = new Prac_class();
		studentAhn.studentName = "¾È¿¬¼ö";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
		

	}

}
