import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Ahmet");
		student1.setLastName("Fırat");
		student1.setEmail("ahmetfirat@gmail.com");
		student1.setPassword("12345");
		student1.setTakenCourse(0);
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(2);
		instructor1.setFirstName("Burak");
		instructor1.setLastName("Fırat");
		instructor1.setEmail("burakfirat@gmail.com");
		instructor1.setPassword("54321");
		instructor1.setTakenCourse(0);
		instructor1.setGivenCourse(0);
		
		User[] users = new User[] {student1, instructor1};
		
		for(User user : users) {
			System.out.println(user.getFirstName() + " " + user.getLastName());
		}
		
		
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		
		studentManager.add(student1);
		studentManager.takeCourse(student1);
		studentManager.takeCourse(student1);
		studentManager.dropCourse(student1);
		
		instructorManager.giveCourse(instructor1);
		instructorManager.giveCourse(instructor1);
		instructorManager.giveCourse(instructor1);
		
		
		
		
		

	}

}
