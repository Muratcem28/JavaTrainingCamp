package friendlyNumber;

public class main {

	public static void main(String[] args) {
		//Kendileri hariç pozitif tam sayı bölenlerinin toplamı birbirine eşit olan sayılara arkadaş sayılar denir.
		// 220-284
		
		int number1 = 220;
		int number2 = 284;
		int total1 = 0;
		int total2 = 0;
		
		for(int i=1; i<number1; i++) {
			if(number1%i == 0) {
				total1 = total1 + i;
			}
		}
		
		for(int i=1; i<number2; i++) {
			if(number2%i == 0) {
				total2 = total2 + i;
			}
		}
		
		if(number1 == total2 && number2 == total1) {
			System.out.println("This is friendly numbers");
		}else {
			System.out.println("This is not friendly numbers");
		}
	}

}
