/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String s = args[0]; 
		int n = s.length();
		for(int i = 0; i < n; i++) {
			System.out.print(s.charAt(n-1-i));
		} System.out.println();
		if(n%2 != 0) {
			System.out.println("The middle character is " + s.charAt((n-1)/2));
		} else {
			System.out.println("The middle character is " + s.charAt((n/2)-1));
		}
	}
}
