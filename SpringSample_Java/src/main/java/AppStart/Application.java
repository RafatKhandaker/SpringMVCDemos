package AppStart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.BlackJack.Service.CustomerService;
import com.BlackJack.Service.CustomerService2;
import com.BlackJack.Service.CustomerService3;
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
		
		// Adding Singleton annotation to class will only create one instance per class. 
		System.out.println(service2);
		ICustomerService service2_singleTest = appContext2.getBean("customerService", CustomerService.class);
		System.out.println(service2);
		
		// Adding Singleton through xml
		System.out.println(service);
		ICustomerService service_test = appContext.getBean("customerService", CustomerService.class);
		System.out.println(service_test);

		
		// prototype is the opposite of singleton, it guarantees that every instance of the class is unique
		 // to add prototype simply specify in the annotations or xml as "prototype"
		
		/* Other Scopes include:
		 *     - Web Scopes: Request, Session, GlobalSession*/
		
		
		// in order to hardcode values into xml, for instance dbUsername .. we can create app.properties file 
		// and place into resource folder and access + set values into ApplicationContext-- instance of connection strings or usernames in SQL 
		
		ICustomerService serviceAppProp = appContext.getBean("customerService2", CustomerService2.class);
		serviceAppProp.findAll();
		
		ICustomerService serviceAppProp2 = appContext.getBean("customerService3", CustomerService3.class);
		serviceAppProp2.findAll();
		
		
		/* accessing app.properties file from appconfig.java  (class) */
		ApplicationContext appContext3 = new AnnotationConfigApplicationContext(AppConfig.class);
		
		ICustomerService serviceAppProp3 = appContext3.getBean("customerService3", CustomerService3.class);
		serviceAppProp3.findAll();
		
		
	}

}
