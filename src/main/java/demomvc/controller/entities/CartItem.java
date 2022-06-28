package demomvc.controller.entities;

import lombok.Data;

@Data
public class CartItem {
	private int productID;
	private String productName;
	private float unitPrice;
	private int unitsInStock;
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getUnitsInStock() {
		return unitsInStock;
	}
	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
	public CartItem(int productID, String productName, float unitPrice, int unitsInStock) {
		this.productID = productID;
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.unitsInStock = unitsInStock;
	}
	public CartItem() {		
	}
	
	
}
