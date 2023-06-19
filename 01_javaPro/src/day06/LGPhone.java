package day06;


public class LGPhone implements MobilePhoneInterface,MP3Interface { // 인터페이스 구현
	// PhoneInterface의 모든 메소드 구현
	public void sendCall() {
		System.out.println("띠리리리링");
	}

	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}

	// 메소드 추가 작성
	public void flash() {
		System.out.println("전화기에 불이 켜졌습니다.");
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
