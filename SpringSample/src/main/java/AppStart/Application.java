package AppStart;

import com.BlackJack.Service.CustomerService;
import com.BlackJack.Service.ICustomerService;

public class Application {

	public static void main(String[] args) {
		
		ICustomerService service = new CustomerService();
		
		System.out.println(
				service.findAll().get(0).getFirstname()
				+" "+
				service.findAll().get(0).getLastname()		
		);
	}

}
