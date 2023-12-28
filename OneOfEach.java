
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		int sum = 0;
		double x = Math.random();
		if(x < 0.5) {
			while(x < 0.5) {
				System.out.print("b ");
				sum++;
				x = Math.random();
				if(x >= 0.5) {
					System.out.print("g ");
					sum++;
			}
		}
		} else {
			while (x >= 0.5) {
				System.out.print("g ");
				sum++;
				x = Math.random();
				if(x < 0.5) {
					System.out.print("b ");
					sum++;
				}
			}
		}
		System.out.println();
		System.out.println("You made it... and you now have " + sum + " children.");
		}
}
