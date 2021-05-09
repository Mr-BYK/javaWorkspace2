package WorkSpace;

public class InstructorManager extends UserManager{
	
	
	
	@Override
	public void add(User user) {
		System.out.println("Instructor " + user.getFirstName() +" added.");
	}
	
	@Override
	public void remove(User user) {
		System.out.println("Instructor " + user.getFirstName() +" remove.");
	}
	
	@Override
	public void update(User user) {
		System.out.println("Instructor " + user.getFirstName() +" update.");
}
}
