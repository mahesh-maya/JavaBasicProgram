import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {

		fact();

	}
	
	public static void fact()
	{
		int fact = 1;
		System.out.print("Enter no. : ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		if(n<=0)
		{
			System.out.println("no should be non negative");
		}
		for(int i=1; i<=n; i++)
		{
			fact = fact * i;
		}
		System.out.println("factorial of "+n+"is "+fact);
		
	}

}
