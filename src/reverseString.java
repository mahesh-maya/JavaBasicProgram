import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		
		stringReverse();

	}

	public static void stringReverse() {
		String original, reverse=" ";
		System.out.print("Enter string : ");
		Scanner in = new Scanner(System.in);
		original = in.nextLine();
		int length = original.length();
		for(int i=length-1; i>=0; i--)
			reverse = reverse + original.charAt(i);
		System.out.print("Reverse string is "+reverse);

	}


}
