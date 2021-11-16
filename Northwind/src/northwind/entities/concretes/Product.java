package northwind.entities.concretes;

public class Product {
	private int id;
	private int categoryId;
	private String produductName;
	private double unitPrice;
	
	public Product() {
		super();
	}

	public Product(int id, int categoryId, String produductName, double unitPrice) {
		super();
		this.id = id;
		this.categoryId = categoryId;
		this.produductName = produductName;
		this.unitPrice = unitPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getProduductName() {
		return produductName;
	}

	public void setProduductName(String produductName) {
		this.produductName = produductName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

}
