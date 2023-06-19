package ch11_exception;
/*throw  :���� ����
  throws :���ܰ� �߻��ϸ� �޼��带 ȣ���� �װ����� ������� �ѱ��
 */
public class Test04_exception {
	public static void main(String[] args) {
		int jumsu[]={66,77,88,99,100,99};

		try{
			double avg=Jumsu.calcAvg(jumsu); //�޼��� ȣ�� 
			System.out.println("���: "+avg);
		}catch(JumsuException e){
			System.out.println(e);
		}

	}//main end

}//class end
class Jumsu{
	public static double calcAvg(int []score) throws JumsuException{
		if (score.length !=5){ //���� �߻�����
			//���ܹ߻�
			throw new JumsuException("�迭 ����~~~");// ���ܹ߻� 
		}//if end 

		//����ó��
		int sum=0;
		for(int i =0; i<score.length; i++){
			sum+=score[i];
		}
		double a = (double)sum/score.length;
		return a;

	}// calcAvg end 
}//class end 
class JumsuException extends Exception{
	//������
	public JumsuException(String msg){
		super(msg); //����Ŭ���� ������ ȣ�� 
	}
}






