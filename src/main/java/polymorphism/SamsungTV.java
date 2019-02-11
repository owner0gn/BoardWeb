package polymorphism;

public class SamsungTV implements TV{
	
	private SonySpeaker speaker;
	public SamsungTV() {
		System.out.println("===> SamsungTV Object be created");
	}
	public SamsungTV(SonySpeaker speaker) {
		System.out.println("===> SamsungTV(2) Object be created");
		this.speaker = speaker;
	}
	
	public void initMethod() {
		System.out.println("객체 초기화 작업 처리..");
	}

	public void destroyMethod() {
		System.out.println("객체 삭제 저네 처리할 로직 처리...");
	}
	
	public void powerOn() {
		System.out.println("SamsungTV---power on.");
	}
	
	public void powerOff() {
		System.out.println("SamsungTV---power off.");
	}
	
	public void volumeUp() {
		speaker.volumeUp();
		//System.out.println("SamsungTV---volume up.");
	}
	
	public void volumeDown() {
		speaker.volumeDown();
		//System.out.println("SamsungTV---volume down.");
	}
}
