package challenges;

public class MinimumMutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "AACCGGTT";
		String s2 = "AAACGGTA";
		String s3 = "AB";
		// System.out.println(mutCnt(s1,s2));
		char[] c1 = s3.toCharArray();
		int k =2;
		bank(c1, k);
		
	}

	public static int MinMut(String start, String end, String bank) {
		int count = 0;

		return count;
	}

	public static int mutCnt(String s1, String s2) {// i wanted to figure out how to compare strings
		// check if there were any changes between them
		// the counter counts the number of mutations
		// works but i need to use for an Array of strings instead of strings by themselves
		int count = 0;
		if (s1.equals(s2)) {
			count = 0;
		}
		if (s1.length() != s2.length()) {
			count = 0;
		}
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				count++;
			}
		}

		return count;
	}
	public static void bank(char[] arr, int k) {// idea here was to get all the arrangements of the
		// the values and then implement conditions like no repeated values to shrink the bank
		int n = arr.length;
		bankRec(arr, " ", n, k);// I think array list would work better which something
		// going to try later
		// the attempt but no love; :(
		
		
	}
	public static void bankRec(char[] ch, String box, int n, int k) {
		// base case
		if(k == 0) {
			System.out.println(box);
		}
		for(int i  = 0; i <n; ++i) {// bulids the string
			String nbox = box + ch[i];
			
			bankRec(ch, nbox, n, k-1);// iterates over to get every arrangement until there are none
		}
		
	}

}
