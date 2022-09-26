package constructor;

public class Product {

	public Product(int id, String name, String description, double price, int stockAmount, String color) {
		//Yapıcı metot , parametreli
		
		System.out.println("Yapıcı blok çalıştı");
		
		this._id = id;
		this._color = color;
		this._name = name;
		this._description = description;
		this._price = price;
		this._stockAmount = stockAmount;
	}
	
	public Product() {
		//Parametresiz. Bu duruma overloading deniyor. 2 Yapıcı metottan isteyen istediğini kullanabilir.
	}
	
	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String _color;
	private String _kod;
}
