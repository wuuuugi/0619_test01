package ch08_class;
//����Ŭ����
class SuperTest2{
	protected int roomNo;  //���ȣ
	protected int capacity; //����
}//class end

//�Ļ�Ŭ����
class SubTest2 extends SuperTest2{
	String owner; //������
	
	//����� ���� �޼��� 
	public void disp(){
		System.out.println("���ȣ : "+roomNo);
		System.out.println("���� : "+capacity);
		System.out.println("������ : "+ owner);
	}//disp end
	
}//class end

//��Ŭ���� 

public class Test05_extends {
	public static void main(String[] args) {
		//������� Ŭ������ ��ü �����Ͽ� ����ϸ� �ȴ�
		SubTest2 sub2 = new SubTest2();
		sub2.roomNo=3;
		sub2.capacity=50;
		sub2.owner="��ȿ��";
		
		sub2.disp();
		
	}//main end

}//class end
