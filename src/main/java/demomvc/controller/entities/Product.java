package demomvc.controller.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="tbl_product")
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ProductID", nullable = false, updatable = false)
	private int productID;
	@Column(name = "product_name")
	private String productName;
	@Column(name = "unit_price")
	private float unitPrice;
	@Column(name = "units_in_stock")
	private int unitsInStock;
	@Column(name = "description")
	private String description;
	@Column(name = "manufacturer")
	private String manufacturer;
	@Column(name = "category")
	private String category;
	@Column(name = "condition")
	private String condition;
	@Column(name = "product_image_file")
	private String productImage;
	
	public Product() {
		super();
	}
	
	public Product(int productID, String productName, float unitPrice, int unitsInStock, String description,
			String manufacturer, String category, String condition, String productImage) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.unitsInStock = unitsInStock;
		this.description = description;
		this.manufacturer = manufacturer;
		this.category = category;
		this.condition = condition;
		this.productImage = productImage;
	}
	
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public String getProductImage() {
		return productImage;
	}
	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}
	
	
}
