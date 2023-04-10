package week3.day1;

public class Students {

		public void getStudentInfo(int id)
		{
			System.out.println("The ID is:"+id);
		}
		public void getStudentInfo(int id,String name,long number,String email)
		{
			System.out.println("Name:"+name+"\nID:"+id+"\nNumber:"+number+"\nEmail:"+email);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students details=new Students();
		details.getStudentInfo(230);
		details.getStudentInfo(230, "santhya",77605132, "santhyaoffical@gmail.com");
	}

}
