
public class InstructorManager extends UserManager {

	@Override
	public void add(User user) {
		System.out.println("e�itmen eklendi");
	}

	@Override
	public void update(User user) {
		System.out.println("e�itmen g�ncellendi");
	}

	@Override
	public void delete(User user) {
		System.out.println("e�itmen silindi");
	}
}
