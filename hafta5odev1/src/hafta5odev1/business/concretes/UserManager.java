package hafta5odev1.business.concretes;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import hafta5odev1.business.abstracts.UserService;
import hafta5odev1.dataAccess.abstracts.UserDao;
import hafta5odev1.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;

	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void login(String email, String password) {
		if(emailPasswordCheck(email, password)) {
			System.out.println("Giriþ baþarýlý");
		}
	}

	@Override
	public void register(User user) {
		if (checkEmailExist(user.getEmail()) && checkEmailFormat(user.getEmail()) && nameCheck(user.getFirstName()) 
				&& controlPassword(user.getPassword())) {
			userDao.add(user);
			System.out.println("Kayýt iþlemi baþarýlý");
			sendEmail(user);
		}
	}

	@Override
	public void sendEmail(User user) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ýþlemi doðrulamak için 1 e baþýnýz : ");
		int verificationcode = scanner.nextInt();
		
		if(verificationcode == 1) {
			user.setVerification(true);
		}else {
			user.setVerification(false);
		}

	}

	@Override
	public void verifyEmail(boolean verificationCode) {
		if (verificationCode) {
			System.out.println("Hesabýnýz doðrulandý.");
		} else {
			System.out.println("Hesap doðrulamasý baþarýsýz.");
		}
	}

	// BusinessCodes
	private boolean controlPassword(String password) {
		if (password.length() < 6) {
			System.out.println("þifre uzunluðu 6 karakterden uzun olmalýdýr.");
			return false;
		} else {
			return true;
		}
	}

	private boolean checkEmailFormat(String email) {
		String regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);

		if (matcher.matches()) {
			return true;
		} else {
			System.out.println("Email formatýnýz yanlýþ tekrar deneyiniz.");
			return false;
		}
	}

	private boolean checkEmailExist(String email) {
		for (User user : userDao.getall()) {
			if (email == user.getEmail()) {
				System.out.println("Bu email ile kayýt mevcut farklý bir email deneyiniz.");
				return false;
			}
		}
		return true;
	}

	private boolean nameCheck(String firstName) {
		if (firstName.length() < 2) {
			System.out.println("Ýsim 2 karakterden uzun olmalýdýr.");
			return false;
		} else {
			return true;
		}
	}
	
	private boolean emailPasswordCheck(String email,String password) {
		for(int i = 0; i< userDao.getall().size(); i++) {
			if(userDao.getall().get(i).getEmail() == email && userDao.getall().get(i).getPassword() == password) {
				if(userDao.getall().get(i).isVerification())
				{
					return true;
				}else {
					System.out.println("Hesabýnýz doðrulanmamýþ.");
					return false;
				}
			}
		}
		System.out.println("Geçerli bir kullanýcý adý veya þifre giriþi yapmadýnýz.");
		return false;
	}
	// End of the BusinessCodes
}
