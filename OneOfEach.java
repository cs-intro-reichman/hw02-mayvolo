
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		int sum = 0;
		boolean itisaboy = false;
		boolean itisagirl = false;
		while(!itisaboy || !itisagirl) {
			if(Math.random() < 0.5) {
				System.out.print("b ");
				sum++;
				itisaboy = true;
			} else {
				System.out.print("g ");
				sum++;
				itisagirl = true;
			}
		} 
		System.out.println();
		System.out.println("You made it... and you now have " + sum +  " children.");
		}
}
