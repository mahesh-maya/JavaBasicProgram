import java.util.Scanner;

public class additionOfTwoNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		addition();
	}

	public static void addition()
	{
		int a,b,c;
		System.out.println("Enter two integer : ");
		Scanner add =new Scanner(System.in);
		a=add.nextInt();
		b=add.nextInt();
		c=a+b;
		System.out.println("Addition of two no. is : "+c);
		
	}
	
	
}
