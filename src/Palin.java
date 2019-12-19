import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Palin {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>(Arrays.asList("Hello"));
		
		Collections.reverse(al);
		
		System.out.println(al);
		

	}

}
