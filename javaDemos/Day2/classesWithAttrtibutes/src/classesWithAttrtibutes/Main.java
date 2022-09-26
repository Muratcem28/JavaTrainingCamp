package classesWithAttrtibutes;

public class Main {

	public static void main(String[] args) {

		// SOLİD prensibi. -- Her sınıf kendi işini-tek iş yapar.
		//single responsibility = tek sorumluluk !! Product-Ürün'de ürüne ait özellikler, Manager da ilgili operasyonlar.Ekle sil vs.
		// Encapsulation bu konuya dahil ve ayrıca incelenip anlaşılması lazım. Bende tam oturmadı :/
		
		Product product = new Product();
		product.set_name("Laptop");
		product.set_id(1);
		product.set_description("Asus Laptop");
		product.set_price(5000);
		product.set_stockAmount(3);
		//-- set yaparken kod çıkmıyorken get yaptığımızda + kod çıkar.
		
	//	System.out.println(product.name);
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.get_kod());

	}

}
