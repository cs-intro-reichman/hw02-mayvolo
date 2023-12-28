public class OneOfEachStats1 {
	public static void main (String[] args) {
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
				if(Math.random() < 0.5) {
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
