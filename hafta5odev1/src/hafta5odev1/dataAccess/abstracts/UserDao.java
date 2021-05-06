package hafta5odev1.dataAccess.abstracts;

import java.util.List;

import hafta5odev1.entities.concretes.User;

public interface UserDao {
	void add(User user);

	void update(User user);

	void delete(User user);

	User get(int id);

	List<User> getall();
}
