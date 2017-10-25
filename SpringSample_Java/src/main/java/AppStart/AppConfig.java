package AppStart;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.BlackJack.Repository.HibernateCustomerRepository;
import com.BlackJack.Repository.ICustomerRepository;
import com.BlackJack.Service.CustomerService;
import com.BlackJack.Service.CustomerService3;
import com.BlackJack.Service.ICustomerService;

@Configuration
@ComponentScan({"com.SpringSample_Java"})  // using autowire 
@PropertySource("app.properties")
public class AppConfig {
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesplaceholderConfgurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
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
    
	@Bean(name = "customerService3")
	public ICustomerService getCostumerService3() {
		CustomerService3 customerService3 = new CustomerService3();
		customerService3.setCustomerRepository(getCustomerRepository());
		return customerService3;
	}  
	// AUTOWIRED
/*	@Bean(name = "customerService")
	public ICustomerService getCostumerService() {
		CustomerService customerService = new CustomerService();
		//customerService.setCustomerRepository(getCustomerRepository());
		return customerService;
	}  */
} 
