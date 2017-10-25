package AppStart;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.BlackJack.Repository.HibernateCustomerRepository;
import com.BlackJack.Repository.ICustomerRepository;
import com.BlackJack.Service.CustomerService;
import com.BlackJack.Service.ICustomerService;

@Configuration
@ComponentScan({"com.SpringSample_xml_anno"})  // using autowire 
public class AppConfig {
	                                          /*  Use One Or The Other*/
	// CONSTRUCTOR INJECTION 
/*	@Bean(name = "customerService")
	public ICustomerService getCostumerService() {
		CustomerService customerService = new CustomerService(getCustomerRepository());
		return customerService;
	}  */

	@Bean(name = "customerRepository")
	public ICustomerRepository getCustomerRepository() {
		return new HibernateCustomerRepository();
	} 
	
	// SETTER INJECTION
	@Bean(name = "customerService")
	public ICustomerService getCostumerService() {
		CustomerService customerService = new CustomerService();
		customerService.setCustomerRepository(getCustomerRepository());
		return customerService;
	}  

	// AUTOWIRED
/*	@Bean(name = "customerService")
	public ICustomerService getCostumerService() {
		CustomerService customerService = new CustomerService();
		//customerService.setCustomerRepository(getCustomerRepository());
		return customerService;
	}  */
} 
