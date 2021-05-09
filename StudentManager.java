package WorkSpace;

public class StudentManager extends UserManager {
	
	
	@Override
	public void add(User user) {
		System.out.println("Student" + user.getFirstName() + " " + "added.");
	}
	
	@Override
	public void remove(User user) {
		System.out.println("Student" + user.getFirstName() + " " + "remove." );
	}
	
	@Override
	public void update(User user) {
		System.out.println("Student" + user.getFirstName() + " " + "update.");
	}
}

	

