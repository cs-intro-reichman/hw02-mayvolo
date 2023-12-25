/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		String s1 = "";
		String s2 = "";
		for(int i=0; i<n; i++) {
			s1 = s1 + "* ";
			s2 = s2 + " *";
		}
		for(int k=0; k<n; k++) {
			if(k%2 == 0) {
				System.out.println(s1);
			} else {
				System.out.println(s2);
			}
		}
	}
}
