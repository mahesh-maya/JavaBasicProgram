import java.util.Scanner;

public class primeNo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a no : ");
		int n=in.nextInt();
		
		if (isPrime(n))
		{
			System.out.println("is prime no");
		}else {
			System.out.println("is not prime no");
		}
	}

	public static boolean isPrime(int n)
	{
		if(n<=1)
		{
			return false;
		}
		for(int i=2; i<=Math.sqrt(n); i++)
		{
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}

