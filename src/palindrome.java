import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palin();
	}

	public static void palin() {
		
		String original,reverse="";
		System.out.println("Enter String : ");
		Scanner in = new Scanner(System.in);
		original = in.nextLine();
		int length = original.length();
		for(int i=length-1; i>=0; i--)
			reverse = reverse + original.charAt(i);
		if(original.equals(reverse))
			System.out.println("String is palindrome");
		else
			System.out.println("String is not palindrome");
	}
	
}
