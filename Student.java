package WorkSpace;

public class Student 
	{
	
	private String courseName;
	private String cartInfo;
	private String adress;
	
	
	public Student(String courseName, String cartInfo, String adress) {
		super();
		this.courseName = courseName;
		this.cartInfo = cartInfo;
		this.adress = adress;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public String getCartInfo() {
		return cartInfo;
	}


	public void setCartInfo(String cartInfo) {
		this.cartInfo = cartInfo;
	}


	public String getAdress() {
		return adress;
	}


	public void setAdress(String adress) {
		this.adress = adress;
	}
}
