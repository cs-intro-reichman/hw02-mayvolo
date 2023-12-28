/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int N = Integer.parseInt(args[0]);
		int sum = 0;
		String s =  N + " is a perfect number since " + N + " = 1";
		for(int i = 1; i < N; i++) {
			if(N % i == 0) {
				sum = sum + i;
				if(sum > 1) {
					s = s + " + ";
				}
				s += i;
			}
		}
		if (sum == N) {
			System.out.println(s);
		} else {
			System.out.println(N + " is not a perfect number");
		}
		

	}
}
