package constructor;

public class Main {

	public static void main(String[] args) {
		
	//	Product product = new Product(1,"Laptop","Asus Laptop",3000,2,"Black");
		//Atadığımız değerleri vermez isek çalışmaz. (Parametreli constructor)
		
		Product product = new Product();	// getter ve setter ile yapmak için örnek
		System.out.println("Kod çalıştı"); 	// iki durumda kullanılabilir.
	}

}
