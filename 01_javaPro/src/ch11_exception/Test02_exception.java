package ch11_exception;
//���2: ���� ���� ó�� 
public class Test02_exception {
	public static void main(String[] args) throws Exception{
		int num = Integer.parseInt(args[0]); //���ڿ��� ���ڷ� ��ȯ 
		if (num%0==0){
			System.out.println(num+" �� ¦��");
		}else {
			System.out.println(num+" �� Ȧ�� ");
		}
		
	}//main end

}//class end 

/*  0. �����ϸ� �迭 ���� �߻�
1. �迭���� ���ڷ� �Է��ϰ� ���� : ����ó��
2. �迭�� �Է� ���� �ʰ� ����  :�迭���� �߻� 
3. a���� �Է� �ϰ� ����
4. ���� �Է�, ���ĺ���(���꿡��)  3/0
*/
