
public class Student extends User {
	private int UserId;
	private String firstName;
	private String lastName;

	public Student() {

	}

	public Student(int userId, String firstName, String lastName, String email) {
		super();
		this.email = email;
		UserId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
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
