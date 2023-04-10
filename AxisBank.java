package week3.day1;

public class AxisBank extends BankInfo{
	
	protected void deposit()
	{
		System.out.println("The deposit percentage is 5.5%");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bank Details:");
		AxisBank obj=new AxisBank();
		obj.saving();
		obj.fixed();
		obj.deposit();
	}

}
