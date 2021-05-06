package hafta4odev2;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StartbucksCustomerManager(new CustomerCheckManager());
		Customer customer = new Customer(1,"Ebru","Terzioðlu","12345678925");
		
		customerManager.save(customer);

	}

}
