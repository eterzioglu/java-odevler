package hafta5odev1.core;

import hafta5odev1.googleAuth.GoogleAuthManager;

public class GoogleAuthAdapter implements AuthService {

	@Override
	public void loginGoogle(String email) {
		GoogleAuthManager authManager = new GoogleAuthManager();
		authManager.login(email);
	}

}
