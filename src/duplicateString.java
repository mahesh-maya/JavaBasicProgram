import java.util.Scanner;

public class duplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dupStr();
	}
	
	public static void dupStr() {
		
		String str;
		int cnt=0;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter String : ");
		str = in.nextLine();
		char[] inp =str.toCharArray();
		System.out.println("Duplicate String : ");
		for(int i=0; i<str.length(); i++) {
			for(int j=i+1; j<str.length(); j++) {
				if(inp[i] == inp[j]) {
					System.out.println(inp[j]);
					cnt++;
					break;
				}
			}
		}
		
	}
}
