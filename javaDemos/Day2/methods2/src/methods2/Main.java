package methods2;

public class Main {

	public static void main(String[] args) {
		
		String message = "Bugün hava çok güzel";
		String newMessage = getCity();
		System.out.println(newMessage);
		int number = calculator(15,7);
		System.out.println(number);
		
	}
	
	public static void add() {
		System.out.println("Eklendi");
	}
	public static void delete() {
		System.out.println("Sil");
	}
	public static void update() {
		System.out.println("Güncellendi");
	}
	
	public static int calculator(int number1, int number2) {
		return number1 + number2;
	}
	public static String getCity() {
		return "Ankara";
	}

}
