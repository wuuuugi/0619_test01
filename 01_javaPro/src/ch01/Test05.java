package ch01;
//�Է±��
import java.util.Scanner; //JDK5 �߰��� ���

public class Test05 {
	public static void main(String args[]){
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);//��ü����
		
		System.out.print("���� �Է�>>");
		int a=scan.nextInt();//������ �Է� �޾Ƽ� a�� ����
		
		System.out.print("�Ǽ� �Է�>>");
		double d=scan.nextDouble();//�Ǽ��� �Է� �޾Ƽ� d�� ����

		System.out.print("���ڿ� �Է�>>");
		String name=scan.next();//���ڿ��� �Է� �޾Ƽ� name�� ����
		
		//��� 
		System.out.printf("���� %d\n",a); // %d : ���� ���
		System.out.printf("Ű %5.1f\n",d); // %f : �Ǽ� ���
		//System.out.printf("Ű %f\n",d); // %f : �Ǽ� ���
		System.out.printf("�̸� %s\n",name); // %s : ���ڿ� ���
		System.out.println();//�ٹٲ�
		
		System.out.printf("%-7s %-7s %-7s\n","����","Ű","�̸�");
		System.out.printf("%-5d %-7.1f %-7s\n", a,d,name);
		
	} 

}
