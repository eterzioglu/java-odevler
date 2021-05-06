package hafta5odev1;

import hafta5odev1.business.concretes.UserManager;
import hafta5odev1.core.GoogleAuthAdapter;
import hafta5odev1.dataAccess.concretes.HibernateUserDao;
import hafta5odev1.entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		UserManager userManager = new UserManager(new HibernateUserDao());
		User user = new User(1, "Ebru", "Terzioðlu", "ebru@ebru.com", "123456");

		userManager.register(user);
		userManager.verifyEmail(user.isVerification());

		userManager.login("ebru@ebru.com", "123456");

		System.out.println();
		System.out.println("------------- Google ile giriþ -------------");
		System.out.println();

		GoogleAuthAdapter google = new GoogleAuthAdapter();
		google.loginGoogle("ebru@ebru.com");

	}

}
