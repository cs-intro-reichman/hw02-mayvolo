/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		String s1 = "";
		String s2 = " ";
		for(int i=0; i<n; i++) {
			s1 = s1 + "* ";
			s2 = s2 + "* ";
		}
		if(n%2 == 0) {
			for(int k=0; k<(n/2); k++) {
				System.out.println(s1);
				System.out.println(s2);
			}
		} else {
			for(int j=0; j<((n-1)/2); j++) {
				System.out.println(s1);
				System.out.println(s2);
			} 
			System.out.println(s1);
		}

	}
}
