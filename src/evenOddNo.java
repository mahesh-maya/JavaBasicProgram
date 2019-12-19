import java.util.Scanner;

public class evenOddNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		evenOdd();
	}
	
	public static void evenOdd()
	{
		int a;
		System.out.println("Enter integer No. : ");
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		
		if(a % 2 == 0)
		{
			System.out.println("No is even");
		}else {
			System.out.println("No is Odd");
		}
		
	}

}
