package co.edureka.java.util;

public class Product {
	private Integer productId;
	private String productName;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(Integer productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Override
	public String toString() {
		return String.format("Product [%-4d | %-25s]", productId, productName);
	}

}
