package classesWithAttrtibutes;

public class Product {
	// Bu özelliklere attribute veya field deniyor.
	// kod bloğuna dikkat. Sadece okunabilir. Yazılamaz.
	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String _renk;
	private String _kod;
	
	//getter bloğu
/*	public int getId() {
		return _id;
	}
	
	//setter bloğu
	public void setId(int id) {
		_id = id;
		//this içinde bulunduğumuz class ın id si demek. Biz onun yerin "_" kullandık. "_" field ları temsil eder.
	}*/

	public int get_id() {
		return _id;
	}

	public void set_id(int id) {
		this._id = id;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String name) {
		this._name = name;
	}

	public String get_description() {
		return _description;
	}

	public void set_description(String description) {
		this._description = description;
	}

	public double get_price() {
		return _price;
	}

	public void set_price(double price) {
		this._price = price;
	}

	public int get_stockAmount() {
		return _stockAmount;
	}

	public void set_stockAmount(int stockAmount) {
		this._stockAmount = stockAmount;
	}

	public String get_renk() {
		return _renk;
	}

	public void set_renk(String renk) {
		this._renk = renk;
	}

	public String get_kod() {
		return this._name.substring(0,1) + _id;
	}
	
	
}
