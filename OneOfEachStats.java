import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);  
		int T = Integer.parseInt(args[0]);
		int twoChildren = 0;
		int threeChildren = 0;
		int fourOrMoreChildren = 0;
		int totalchildren = 0;
		for(int i=0; i<T; i++) {
			boolean itisaboy = false;
			boolean itisagirl = false;
			int sum = 0;
			while(!itisaboy || !itisagirl) {
				if(generator.nextDouble() < 0.5) {
					sum++;
					itisaboy = true;
				} else {
					sum++;
					itisagirl = true;
			}
		} 
			totalchildren = totalchildren +sum;
			if(sum == 2) {
				twoChildren++;
			} else if(sum == 3) {
				threeChildren++;
			} else {
				fourOrMoreChildren++;
			}
		}
		double average = (double) totalchildren / T;
		int max = Math.max(twoChildren, Math.max(threeChildren,fourOrMoreChildren));
		String common = "";
		if(max == twoChildren){
			common = "2";
		} else if (max == threeChildren ) {
			common = "3";
		} else {
			common = "4 or more";
		}
		System.out.println();
		System.out.println("Average: " + average +  " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + twoChildren);
		System.out.println("Number of families with 3 children: " + threeChildren);
		System.out.println("Number of families with 4 or more children: " + fourOrMoreChildren);
		System.out.println("The most common number of children is " + common + ".");
	}
}
