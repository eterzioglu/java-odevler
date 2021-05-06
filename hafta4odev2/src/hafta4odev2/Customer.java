package hafta4odev2;


public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	private String identity;
	
	public Customer() {
		
	}

	public Customer(int id, String firstName, String lastName, String identity) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identity = identity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}
	
}
