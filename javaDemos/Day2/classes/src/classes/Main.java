package classes;

public class Main {

	public static void main(String[] args) {
		
		//Class'lar büyük harfle başlar.
		//Class'lar "referance type"dir. ----> heap'de tutulur. 		!!!!
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		// Stack ve heap yapısı çok çok çok önemli!!!
		// heap de referansı tutan kimse kalmazsa garbage collector(GB) -- çöp toplayıcı onu bellekten siler.
		// Bir nesneyi "new"lemek pahalıdır.
		customerManager.add();
		customerManager.remove();
		customerManager.update();
		
		// "value type" ---> stackte tutulur.							!!!!
		int number1 = 10;
		int number2 = 20;
		number2 = number1;
		number1 = 30;
		System.out.println(number2); // ??? ---> 10
		
		
		// "referance type"
		int[] numbers1 = new int[] {1,2,3};
		int[] numbers2 = new int[] {4,5,6};
		numbers2 = numbers1;			
		// heap de numbers1 ile numbers2 aynı referansı alıyor. Bu yüzden numbers1 nın alacağı sonraki tüm değerleri numbers2'de alacak.
		numbers1[0] = 10;	
		System.out.println(numbers2[0]); // ??? ---> 1(false), 10(true)
		
		
		
	}

}
