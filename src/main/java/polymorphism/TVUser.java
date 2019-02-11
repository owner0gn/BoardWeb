package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		// 1. Run Spring Container
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicactionContext.xml");
		
		// 2. Look up Object from Spring Container
		TV tv = (TV)factory.getBean("tv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		// 3. close Spring Container
		factory.close();
	}
}
