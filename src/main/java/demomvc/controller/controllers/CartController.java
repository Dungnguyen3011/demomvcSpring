package demomvc.controller.controllers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import demomvc.controller.entities.CartItem;
import demomvc.controller.entities.Product;
import demomvc.controller.repositories.ProductService;
import demomvc.controller.repositories.ShoppingCartService;

@Controller
@RequestMapping(value={"cart"})
public class CartController {
	@Autowired
	ProductService prservice;
	
	@Autowired
	ShoppingCartService scservice;
	
	@RequestMapping(value={"/list"})
	public String showCart(ModelMap model) {	
		Collection<CartItem> cartItems = scservice.getCartItems();
		model.addAttribute("cartItems", cartItems);
		return "shopping_cart";
	}
	
	@RequestMapping(value={"/{id}"})
	public String addItem(@PathVariable("id") Integer id) {
		Product product = prservice.get(id);
		if(product !=null) {
			CartItem item = new CartItem();
			BeanUtils.copyProperties(product, item);
			item.setUnitsInStock(1);
			scservice.add(item);
		}
		return "redirect:/cart/list";
	}
	
	@RequestMapping(value={"/remove/{id}"})
	public String remove(ModelMap model, @PathVariable("id") Integer id) {	
		scservice.remove(id);
		return "redirect:/cart/list";
	}
	
	@RequestMapping(value={"/clear"})
	public String clear() {	
		scservice.clear();
		return "redirect:/cart/list";
	}
	
}
