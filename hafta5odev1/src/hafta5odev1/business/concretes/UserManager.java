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
			System.out.println("Giri� ba�ar�l�");
		}
	}

	@Override
	public void register(User user) {
		if (checkEmailExist(user.getEmail()) && checkEmailFormat(user.getEmail()) && nameCheck(user.getFirstName()) 
				&& controlPassword(user.getPassword())) {
			userDao.add(user);
			System.out.println("Kay�t i�lemi ba�ar�l�");
			sendEmail(user);
		}
	}

	@Override
	public void sendEmail(User user) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("��lemi do�rulamak i�in 1 e ba��n�z : ");
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
			System.out.println("Hesab�n�z do�ruland�.");
		} else {
			System.out.println("Hesap do�rulamas� ba�ar�s�z.");
		}
	}

	// BusinessCodes
	private boolean controlPassword(String password) {
		if (password.length() < 6) {
			System.out.println("�ifre uzunlu�u 6 karakterden uzun olmal�d�r.");
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
			System.out.println("Email format�n�z yanl�� tekrar deneyiniz.");
			return false;
		}
	}

	private boolean checkEmailExist(String email) {
		for (User user : userDao.getall()) {
			if (email == user.getEmail()) {
				System.out.println("Bu email ile kay�t mevcut farkl� bir email deneyiniz.");
				return false;
			}
		}
		return true;
	}

	private boolean nameCheck(String firstName) {
		if (firstName.length() < 2) {
			System.out.println("�sim 2 karakterden uzun olmal�d�r.");
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
					System.out.println("Hesab�n�z do�rulanmam��.");
					return false;
				}
			}
		}
		System.out.println("Ge�erli bir kullan�c� ad� veya �ifre giri�i yapmad�n�z.");
		return false;
	}
	// End of the BusinessCodes
}
