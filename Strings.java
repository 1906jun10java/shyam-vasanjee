package challenges;

public class Strings {

	public static void main(String[] args) {
		String s = "pocat";
		char[] original = s.toCharArray();
		int n = original.length;
		//for (int i = 0; i < n; i++) {
			//System.out.print(original[(n-1)-i]);
		Strings.reverse(s);
		// I know what I want to do but the reverse method is giving me problems
		// I'm going to fix it after work to
		System.out.println(Strings.reverse(s));
		
		Strings.pal(s);
		
			
		}

	
	public static String reverse(String s) {
		String reverse ="";
		int n = s.length();
		for(int i = 0; i < n; i++) {
			reverse = reverse +s.charAt((n-1)-i);
		}
		return reverse;
	}
	public static void pal(String s) {
		
		if (Strings.reverse(s) == s) {
			System.out.println("Pal");
		}
		else {
			System.out.println("No Pal");
		}
	}

}
