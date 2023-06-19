package day07;

public class Personmain {

	static void info(Person p) {
		if (p instanceof StudentWorker) {
			System.out.println("직장인입니다.");
//			StudentWorker obj = (StudentWorker) p;
//			obj.work();
			((StudentWorker) p).work();
		} else if (p instanceof Student) {
			System.out.println("학생입니다.");
			((Student) p).study();
		} else if (p instanceof Professor) {
			System.out.println("교수입니다");
			
			((Professor) p).teach();
		} else if (p instanceof Researcher) {
			System.out.println("연구원입니다");
			((Researcher) p).research();
		}
	}

	public static void main(String[] args) {
		// Student 객체를 Person형으로 업캐스팅
		Person s = new Student();
		Person r = new Researcher();
		Person sw = new StudentWorker();
		Person pr = new Professor();
		// Object 클래스는 모든 클래스의 부모클래스 이기때문에
		// 모든 클래스가 업캐스팅이 가능하다.
		Object objpr = new Professor();

		info(s);
		info(r);
		info(sw);
		info(pr);
		
	}

}
