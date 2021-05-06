
public class StudentManager extends UserManager {

	@Override
	public void add(User user) {
		System.out.println("öðrenci eklendi");
	}

	@Override
	public void update(User user) {
		System.out.println("öðrenci güncellendi");
	}

	@Override
	public void delete(User user) {
		System.out.println("öðrenci silindi");
	}
}
