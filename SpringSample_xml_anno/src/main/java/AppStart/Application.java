package AppStart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.BlackJack.Service.CustomerService;
import com.BlackJack.Service.ICustomerService;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		ICustomerService service = appContext.getBean("customerService", CustomerService.class);
		
		System.out.println(
				service.findAll().get(0).getFirstname() 
							+" "+ 
				service.findAll().get(0).getLastname()
				);  
		
		// AppConfig (Constructor/Setter - injection) with java annotations (without xml)
		ApplicationContext appContext2 = new AnnotationConfigApplicationContext(AppConfig.class);
		ICustomerService service2 =  appContext2.getBean("customerService", CustomerService.class);
		
		System.out.println(
				service2.findAll().get(0).getFirstname()
							+" "+
				service2.findAll().get(0).getLastname()		
				);

	}

}
