package hafta5odev1.business.abstracts;

import hafta5odev1.entities.concretes.User;

public interface UserService {
	void login(String email, String password);

	void register(User user);
	
	void sendEmail(User user);
	
	void verifyEmail(boolean verificationCode);
}
