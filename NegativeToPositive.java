package Week1.day1;

public class NegativeToPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = -40;
		if(num < 0)
		{
			System.out.println("Number is Negative: " + num);
			num = num * -1;
			System.out.println("Number negative To positive: " + num);
			
		}
		else
		{
			System.out.println("Numbe is Positive: " + num);
			
		}
	}

}
