package day06;


public class LGPhone implements MobilePhoneInterface,MP3Interface { // �������̽� ����
	// PhoneInterface�� ��� �޼ҵ� ����
	public void sendCall() {
		System.out.println("�츮������");
	}

	public void receiveCall() {
		System.out.println("��ȭ�� �Խ��ϴ�.");
	}

	// �޼ҵ� �߰� �ۼ�
	public void flash() {
		System.out.println("��ȭ�⿡ ���� �������ϴ�.");
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receiveSMS() {
		// TODO Auto-generated method stub
		
	}
}
