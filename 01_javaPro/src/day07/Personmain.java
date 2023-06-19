package day07;

public class Personmain {

	static void info(Person p) {
		if (p instanceof StudentWorker) {
			System.out.println("�������Դϴ�.");
//			StudentWorker obj = (StudentWorker) p;
//			obj.work();
			((StudentWorker) p).work();
		} else if (p instanceof Student) {
			System.out.println("�л��Դϴ�.");
			((Student) p).study();
		} else if (p instanceof Professor) {
			System.out.println("�����Դϴ�");
			
			((Professor) p).teach();
		} else if (p instanceof Researcher) {
			System.out.println("�������Դϴ�");
			((Researcher) p).research();
		}
	}

	public static void main(String[] args) {
		// Student ��ü�� Person������ ��ĳ����
		Person s = new Student();
		Person r = new Researcher();
		Person sw = new StudentWorker();
		Person pr = new Professor();
		// Object Ŭ������ ��� Ŭ������ �θ�Ŭ���� �̱⶧����
		// ��� Ŭ������ ��ĳ������ �����ϴ�.
		Object objpr = new Professor();

		info(s);
		info(r);
		info(sw);
		info(pr);
		
	}

}
