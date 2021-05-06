
public class Main {

	public static void main(String[] args) {

		Instructor engin = new Instructor(1, "Engin", "Demirog", "engin@gmail.com");

		Student ebru = new Student(1, "Ebru", "Terzioğlu", "ebru@gmail.com");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(engin);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(ebru);
		
	}

}
