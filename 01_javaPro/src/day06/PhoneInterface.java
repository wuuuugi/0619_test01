package day06;

public interface PhoneInterface {
	void sendCall();

	void receiveCall();

}

class SamsungPhone implements PhoneInterface { // �������̽� ����
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
}
