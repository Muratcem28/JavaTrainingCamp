package findTheNumber;

public class main {

	public static void main(String[] args) {
		int[] numbers = new int[] {1,2,5,7,9,0};
		int sought = 6; 	// sought = aranan
		boolean isThere = false;	// is there = var mı 
		
		for (int number : numbers) {
			if(number == sought) {
				isThere = true;
				break;
			}
		}
		if(isThere) {
			System.out.println("There is the number");
		}else {
			System.out.println("There is not the number");
		}
	}

}
