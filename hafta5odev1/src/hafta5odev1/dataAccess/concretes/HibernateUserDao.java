package hafta5odev1.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;
import hafta5odev1.dataAccess.abstracts.UserDao;
import hafta5odev1.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	List<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		users.add(user);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(User user) {
		users.remove(user);

	}

	@Override
	public User get(int id) {
		for (User user : users) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}

	@Override
	public List<User> getall() {
		List<User> userList = new ArrayList<User>();
		for(User user : users) {
			userList.add(user);
		}
		return userList;
	}

}
