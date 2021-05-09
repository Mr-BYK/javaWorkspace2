package WorkSpace;
public class Main {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor("Wep Program", "Expert");{
		instructor.setSpecialist("C");
		instructor.setTraining("Beginner");
		System.out.println(instructor.getSpecialist());
		}
		
		Student student = new Student("Java + React", "17000" , "Antalya" ); {
		
		student.setCartInfo("1650 ");
		student.setCourseName("Python ");
		student.setAdress("Manisa ");
		System.out.println(student.getCourseName());	
		}
		

		User user = new User(7, 37, "Ricardo ", "Quaresma ", "info@besiktas.com ");
		{
			System.out.println(user.getFirstName() + user.getLastName() + student.getCourseName() + "kursuna kayýt edildi.");
		}	
	}
}



