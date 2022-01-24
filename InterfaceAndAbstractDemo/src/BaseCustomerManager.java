
public abstract class BaseCustomerManager implements ICustomerService {

	//virtual şeklinde yazdı
	public void Save(Customer customer) {
		System.out.println("Saved to db : "+customer.getFirstName());
	}
  	
}
