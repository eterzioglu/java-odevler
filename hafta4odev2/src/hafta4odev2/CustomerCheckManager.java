package hafta4odev2;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		if(customer.getFirstName() == "Ebru") {
			return true;
		}
		else {
			return false;
		}
	}
}
