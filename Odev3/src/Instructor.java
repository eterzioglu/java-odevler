
public class Instructor extends User {
	private int UserId;
	private String firstName;
	private String lastName;
	

	public Instructor() {

	}


	public Instructor(int userId, String firstName, String lastName,String email) {
		super();
		UserId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}


	public int getUserId() {
		return UserId;
	}


	public void setUserId(int userId) {
		UserId = userId;
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

}
