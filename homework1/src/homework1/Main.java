package homework1;

public class Main {

	public static void main(String[] args) {
		Course course = new Course(1,"Java & React kursu");
		User user = new User(1,"Ebru","Terzioğlu");
		
		System.out.println(course.name);
		System.out.println(user.name);
		
		CourseManager courseManager = new CourseManager();
		courseManager.add(course);
		
		UserManager userManager = new UserManager();
		userManager.add(user);

	}

}
