package week3.day1;

public class Desktop extends Computer{
	
	public void desktopDetails()
	{
		System.out.println("The desktop color is Black");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop property=new Desktop();
		System.out.println("The system Details are given below:");
		property.details();
		property.memory();
		property.desktopDetails();
	}

}
