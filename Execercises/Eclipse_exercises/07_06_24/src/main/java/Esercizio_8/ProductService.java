package Esercizio_8;

public class ProductService implements Controller {
	
	private int productID; 
	private String nameProduct, typeProduct;
	
	public ProductService() {
	}

	public ProductService(int productID, String nameProduct, String typeProduct) {
		this.productID = productID;
		this.nameProduct = nameProduct;
		this.typeProduct = typeProduct;
	}

	public int getProductID() {
		return productID;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public String getTypeProduct() {
		return typeProduct;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public void setTypeProduct(String typeProduct) {
		this.typeProduct = typeProduct;
	}

	public void search(Object obj) {
	}
	
	public void viewInfo() {
		System.out.println("- ProductID: " + productID + ", Product: " + nameProduct + ", Type: " + typeProduct);
	}
}
