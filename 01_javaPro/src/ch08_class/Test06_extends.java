package ch08_class;
//����Ŭ����
class PanMaeSuper{
	//��������
	protected String pum; //��ǰ�̸�
	protected int su;	  //��ǰ ����
	protected int dan;	  // ��ǰ �ܰ�

	//����Ʈ ������
	public PanMaeSuper(){}

	//���� �ִ� ������  
	public PanMaeSuper(String pum, int su , int dan){
		this.pum = pum;
		this.su = su;
		this.dan = dan;
	}//cons end 

	//����� ���� �޼���
	protected void disp(){
		System.out.println("ǰ�� :"+pum);
		System.out.println("���� :"+su);
		System.out.println("�ܰ� :"+dan+"\n");
	}//disp end

}//class end

//�Ļ�Ŭ����
class PanMaeSub extends PanMaeSuper{
	private double rate; //���η�

	//����Ʈ ������
	public PanMaeSub(){}
	//�����ִ� ������
	public PanMaeSub(String pum,int su , int dan, double rate){
		super(pum,su,dan); //����Ŭ���� ������ ȣ��
		this.rate =rate;
	}//cons end

	/* �������̵� :��ӹ��� �޼��� ���� ������
	 * ������, �޼����̸�, �Ű������� �ݵ�� ���ƾ� �Ѵ�
	 * �� ���� �����ڴ� ������ ���ų� �� ���� ���� ����� �� �ִ�
	 *  ���� ���� �����ڰ�  protected�̸� public�� �� �� �ִ�.   
	 */
	public void disp(){
		System.out.println("ǰ�� :"+pum);
		System.out.println("���� :"+su);
		System.out.println("�ܰ� :"+dan);
		System.out.println("������:"+rate+"%");
		System.out.println("��������:"+(dan-(dan*0.2)));
		System.out.println();
	}
	

}//class end 

//�� Ŭ����
public class Test06_extends {
	public static void main(String[] args) {
		//������� Ŭ������ ��ü�����Ͽ� ����Ѵ� 
		PanMaeSuper super2=new PanMaeSuper("����",1,9000); //��ü����,������ ȣ�� 
		super2.disp();
		//����Ŭ���� ������ ���� ��üó�� :�ڵ� ����ȯ�� ����
		super2 = new PanMaeSub("����",4,5000,0.2);
		super2.disp();

	}//main end

}//class end











