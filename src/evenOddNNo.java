import java.util.Scanner;

public class evenOddNNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		evenOdd();
	}

	public static void evenOdd()
	{
		int a=0, i=0;
		System.out.println("Enter an Intger : ");
		Scanner in= new Scanner(System.in);
		a=in.nextInt();
		
		for(i=1; i<a; i++)
		{
			if(i % 2 == 0)
			{
				System.out.println(i+"is even no");
			}else {
				System.out.println(i+"is odd no");
			}
			
		}
		
		
	}
	
}
