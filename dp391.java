public class dp391 {
	public static void main (String[] args) {
		// way to hold strings
		String prev="";
		String curr="";
		// iterator for the letters, keeping track of where we are
		char[] alpha= new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		for (char i : alpha) {
			// look at previous string to add to current
			curr=prev+i+prev;
			prev=curr;
		}
		
		// write out current
		System.out.println(curr);
	}
}