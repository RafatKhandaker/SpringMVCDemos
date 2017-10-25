package AppStart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.BlackJack.Service.CustomerService;
import com.BlackJack.Service.ICustomerService;

public class Application {

	public static void main(String[] args) {
		
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		ICustomerService service = appContext.getBean("ICustomerService", CustomerService.class);
		
		ApplicationContext appContext2 = new ClassPathXmlApplicationContext("ApplicationContext2.xml");
		ICustomerService service2 = appContext.getBean("ICustomerService", CustomerService.class);
		
		ApplicationContext appContext3 = new ClassPathXmlApplicationContext("ApplicationContext3.xml");
		ICustomerService service3 = appContext.getBean("ICustomerService", CustomerService.class);
		
		ApplicationContext appContext4 = new ClassPathXmlApplicationContext("ApplicationContext4.xml");
		ICustomerService service4 = appContext.getBean("ICustomerService", CustomerService.class);
		
		ApplicationContext appContext5 = new ClassPathXmlApplicationContext("ApplicationContext5.xml");
		ICustomerService service5 = appContext.getBean("ICustomerService", CustomerService.class);
		
		System.out.println(
				 "Setter Injection \n"+
				service.findAll().get(0).getFirstname()
				+" "+
				service.findAll().get(0).getLastname()	
				
				+"\n\nConstructor Injection \n"+	
				service2.findAll().get(0).getFirstname()
				+" "+
				service2.findAll().get(0).getLastname()
				
				+"\n\nAutoWire by Constructor \n"+	
				service3.findAll().get(0).getFirstname()
				+" "+
				service3.findAll().get(0).getLastname()
				
				+"\n\nAutoWire by byType \n"+	
				service4.findAll().get(0).getFirstname()
				+" "+
				service4.findAll().get(0).getLastname()
				
				+"\n\nAutoWire by byName \n"+	
				service5.findAll().get(0).getFirstname()
				+" "+
				service5.findAll().get(0).getLastname()
		);
	}

}
