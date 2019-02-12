package polymorphism;

<<<<<<< HEAD
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		// 1. Run Spring Container
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicactionContext.xml");
		
		// 2. Look up Object from Spring Container
		TV tv = (TV)factory.getBean("tv");
=======
public class TVUser {
	public static void main(String[] args) {
		BeanFactory factory = new BeanFactory();
		TV tv = (TV)factory.getBean(args[0]);
>>>>>>> 904d3f12b0cfebbaf864a633428c6286a5b4f95f
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
<<<<<<< HEAD
		// 3. close Spring Container
		factory.close();
=======
>>>>>>> 904d3f12b0cfebbaf864a633428c6286a5b4f95f
	}
}
