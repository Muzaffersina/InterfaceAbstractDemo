
public class NeroCustomerManager extends BaseCustomerManager 
{
	private IPersonCheckService customerCheckService;
	 
	public NeroCustomerManager(IPersonCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	@Override
	public void Save(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer)) {
			//base.save(customer) yazdı..
			super.Save(customer);
		}
		
		else {
			System.out.println("Not a valid person");
		}
		
		// TODO Auto-generated method stub
		
	}


}
