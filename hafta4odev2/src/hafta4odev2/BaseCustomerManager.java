package hafta4odev2;

public class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println("Veritabanýna kaydedildi : " + customer.getFirstName());
	}
	
}
