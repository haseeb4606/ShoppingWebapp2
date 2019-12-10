package mvc.controllers;

public class ProductDto {

	private String itemName;
	private String department;
	private String descriptions;
	private int itemNumber;

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}

	public int getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}

	@Override
	public String toString() {
		return "ProductDto [itemName=" + itemName + ", department=" + department + ", descriptions=" + descriptions
				+ ", itemNumber=" + itemNumber + "]";
	}

}
