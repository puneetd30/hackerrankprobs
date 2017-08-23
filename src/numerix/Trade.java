package numerix;

public class Trade {
	String productName;
	double numericalPrice;
	String Buy="Buy";
	int quantity = 1000;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getNumericalPrice() {
		return numericalPrice;
	}

	public void setNumericalPrice(double numericalPrice) {
		this.numericalPrice = numericalPrice;
	}

	public String buy() {
		return Buy;
	}

	public int getQuantity() {
		return quantity;
	}

	public String toString(){
		return getProductName()+","+buy()+","+getNumericalPrice()+","+getQuantity();
	}
	
}
