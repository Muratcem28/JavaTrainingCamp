package switchDemo;

public class main {

	public static void main(String[] args) {
		
		char grade = 'B';

		switch(grade){
		
		case 'A':		// ; değil : Dikkat!!
			System.out.println("Excellent : You passed");
		break;

		case 'B':
		case 'C':		// B ve C'nın aynı sonucun dönmesi için böyle yazabiliriz
			System.out.println("Good : You passed");
		break;

		case 'D':
			System.out.println("Acceptable : You passed"); // Terimlerden emin değilim :D
		break;
		
		case 'F':
			System.out.println("Sorry you missed");
		break;
	}

	}

}
