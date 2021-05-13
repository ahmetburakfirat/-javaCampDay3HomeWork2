
public class InstructorManager extends UserManager{
	public void giveCourse(Instructor user) {
		user.setGivenCourse(user.getGivenCourse() + 1);
		System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli kullanıcının verdiği ders sayısı " + user.getGivenCourse());
	} 
	
}
