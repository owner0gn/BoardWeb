package polymorphism;

public class LgTV implements TV {
	public LgTV() {
		System.out.println("===> LgTV Object be created");
	}
	public void powerOn() {
		System.out.println("LgTV---power on.");
	}
	
	public void powerOff() {
		System.out.println("LgTV---power off.");
	}
	
	public void volumeUp() {
		System.out.println("LgTV---volume up.");
	}
	
	public void volumeDown() {
		System.out.println("LgTV---volume down.");
	}
}
