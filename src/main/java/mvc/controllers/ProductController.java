package mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {
	private ItemService itemService;

	@RequestMapping(value = "Order-form", method = RequestMethod.GET)
	public ModelAndView register() {

		ProductDto p = itemService.getInfo();
		System.out.println(p.toString());
		ModelAndView mod = new ModelAndView("Order-form");

		mod.addObject("Object", p);

		return mod;

	}

	@RequestMapping(value = "Received", method = RequestMethod.POST)

	public ModelAndView orderReived(ProductDto product) {

		ModelAndView mod = new ModelAndView("Order-Received");

		mod.addObject("pt", product);

		return mod;

	}

	public ItemService getItemService() {
		return itemService;
	}

	public void setItemService(ItemService itemService) {
		this.itemService = itemService;
	}
	
}
