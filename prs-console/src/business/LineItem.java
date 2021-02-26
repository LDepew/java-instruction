package business;

public class LineItem {
	
	public int id;
	public int requestID;
	public int productID;
	public int quantity;
	
	public LineItem() {
		super();
	}

	public LineItem(int id, int requestID, int productID, int quantity) {
		super();
		this.id = id;
		this.requestID = requestID;
		this.productID = productID;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRequestID() {
		return requestID;
	}

	public void setRequestID(int requestID) {
		this.requestID = requestID;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "LineItem [id=" + id + ", requestID=" + requestID + ", productID=" + productID + ", quantity=" + quantity
				+ "]";
	}
	
	

}
