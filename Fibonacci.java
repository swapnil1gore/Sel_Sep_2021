package Week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int b, c = 1, d = 0 ;
		
		for(int a = 1; a < 8; a++)
		{
			b = c + d;
			System.out.println(+ b);
			d = c;
			c = b;
			
		}
	  } 
	}

