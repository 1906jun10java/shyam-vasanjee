package challenges;

import strings.Strings;

public class Strings {

	public static void main(String[] args) {
		String s = "pocat";
		char[] original = s.toCharArray();
		int n = original.length;
		//for (int i = 0; i < n; i++) {
			//System.out.print(original[(n-1)-i]);
		Strings.reverse(s);
		// I know what I want to do but the reverse method is giving me problems
		// I'm going to fix it after work today
		
		
			
		}

	
	public static void reverse(String s) {
		char[] original = s.toCharArray();
		char reverse;
		int n = original.length;
		for(int i = 0; i < n; i++) {
			reverse = original[(n-1)-i];
			
		}
	}
	public static void pal(String s) {
		
		if (reverse() == ) {
			System.out.println("Pal");
		}
		else {
			System.out.println("No Pal");
		}
	}

}
