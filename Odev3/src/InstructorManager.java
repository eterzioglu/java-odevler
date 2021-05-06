
public class InstructorManager extends UserManager {

	@Override
	public void add(User user) {
		System.out.println("eðitmen eklendi");
	}

	@Override
	public void update(User user) {
		System.out.println("eðitmen güncellendi");
	}

	@Override
	public void delete(User user) {
		System.out.println("eðitmen silindi");
	}
}
