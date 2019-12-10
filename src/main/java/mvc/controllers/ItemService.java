package mvc.controllers;

public class ItemService {
	
	
	public ProductDto getInfo() {
		
		ProductDto prd =  new ProductDto();
		prd.setItemName("Computer");
		prd.setDepartment("Electronics");
		prd.setDescriptions("HP");
		prd.setItemNumber(5463);
		
		return prd;
	}

}
