package methodOverloading;

public class Main {

	public static void main(String[] args) {
		
		FourTransactions fourTransactions = new FourTransactions();
		System.out.println(fourTransactions.add(2, 30));
		System.out.println(fourTransactions.add(2,3,4));
	}

}
