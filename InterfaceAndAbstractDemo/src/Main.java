
public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());
		Customer customer = new Customer();
		customerManager.Save(customer);	
		
		
	}

}
