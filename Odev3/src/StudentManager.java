
public class StudentManager extends UserManager {

	@Override
	public void add(User user) {
		System.out.println("��renci eklendi");
	}

	@Override
	public void update(User user) {
		System.out.println("��renci g�ncellendi");
	}

	@Override
	public void delete(User user) {
		System.out.println("��renci silindi");
	}
}
