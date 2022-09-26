package variableArguments;

public class Main {

	public static void main(String[] args) {
		int total = add(1,23,3,4,5,6);
		System.out.println(total);
	}
	
	public static int add(int... numbers){
		int total = 0;	//ayrı sınıfta ayrı referansları ifade eder.
		for (int number : numbers) {
			total += number;
		}
		return total;
	}

}
