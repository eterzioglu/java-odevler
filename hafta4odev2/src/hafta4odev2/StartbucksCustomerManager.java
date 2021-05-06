package hafta4odev2;

public class StartbucksCustomerManager extends BaseCustomerManager{
	
	private CustomerCheckService customerService;
	
	
	public StartbucksCustomerManager(CustomerCheckService customerService) {
		this.customerService = customerService;
	}


	@Override
	public void save(Customer customer) {
		if(customerService.CheckIfRealPerson(customer)) {
			System.out.println("Veritaban�na kay�t ba�ar�l� : " + customer.getFirstName());
		}
		else {
			System.out.println("Kullan�c� kay�tl� de�il.");
		}
	}
}
