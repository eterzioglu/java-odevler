package hafta4odev2;

public class StartbucksCustomerManager extends BaseCustomerManager{
	
	private CustomerCheckService customerService;
	
	
	public StartbucksCustomerManager(CustomerCheckService customerService) {
		this.customerService = customerService;
	}


	@Override
	public void save(Customer customer) {
		if(customerService.CheckIfRealPerson(customer)) {
			System.out.println("Veritabanýna kayýt baþarýlý : " + customer.getFirstName());
		}
		else {
			System.out.println("Kullanýcý kayýtlý deðil.");
		}
	}
}
