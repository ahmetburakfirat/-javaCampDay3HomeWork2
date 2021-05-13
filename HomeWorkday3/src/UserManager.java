
public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli kullanıcı sisteme eklendi.");
		
	}
	
	public void takeCourse(User user) {
		user.setTakenCourse(user.getTakenCourse() + 1);
		System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli kullanıcının aldığı ders sayısı " + user.getTakenCourse());
	}
	
	public void dropCourse(User user) {
		user.setTakenCourse(user.getTakenCourse() - 1);
		System.out.println(user.getFirstName() + " " + user.getLastName() + " isimli kullanıcının aldığı ders sayısı " + user.getTakenCourse());
	}
}
