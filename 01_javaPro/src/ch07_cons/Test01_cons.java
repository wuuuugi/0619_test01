package ch07_cons;
/* ������ �ǽ� 
    ����Ʈ �����ڴ� �����ڸ� ���� ������ �ڵ����� ����� ����
    ���� �ִ� �����ڰ� ������ ����Ʈ �����ڴ� �ڵ����� �� ��������� 
  �μ��� ������ �����ε� �����ϴ� 
 */
class Sungjuk{
	//��������
	String name;
	int kor; 
	
	//���ھ��� ����Ʈ ������
	public Sungjuk(){
		//this.name="";
		//this.kr=0;
		System.out.println("����Ʈ ������");
	}
	//�����ִ� ������
	public Sungjuk(String name){
		this.name=name;
		//this.kor =0; //�������� : �ڵ� �ʱ�ȭ �Ǳ� ������
		System.out.println("String name ���� �ִ� ������");
		System.out.println("name:"+name);
	}
	
	//�����ִ� ������
	public Sungjuk(String name, int kor){
		this.name=name;
		this.kor=kor;
		System.out.println("String name, int kor �����ִ� ������ ");
		System.out.println("�̸�:"+name);
		System.out.println("��������:"+kor);
	}
	
}//class end 
public class Test01_cons {
	public static void main(String[] args) {
		new Sungjuk(); //��ü����,������ȣ��
		new Sungjuk("kim");
		new Sungjuk("kim",4);
	}//main end 
}//class end 
