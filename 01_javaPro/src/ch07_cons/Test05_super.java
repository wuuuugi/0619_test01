package ch07_cons;
//����Ŭ���� 
class SuperTest{
	//��������
	String title;
	int num;
	
	//����Ʈ ������
	public SuperTest(){}
	
	//�����ִ� ������
	public SuperTest(String title, int num){
		this.title=title;
		this.num=num;
	}
	
	//����� ���� �޼���
	public void disp(){
		System.out.println("title:"+title);
		System.out.println("num:"+num);
	}
	
}//class end

//����Ŭ���� =�Ļ� Ŭ���� 
class SubTest extends SuperTest{
	//����Ʈ ������
	public SubTest(){
		super("����",100); //���� Ŭ���� ������ ȣ�� 
	}
	
}//class end

public class Test05_super {
	public static void main(String[] args) {
		SubTest sub = new SubTest();
		sub.disp();
		
	}//main end

}//class end
