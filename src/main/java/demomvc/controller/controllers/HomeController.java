package demomvc.controller.controllers;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import demomvc.controller.entities.Product;
import demomvc.controller.repositories.ProductRepository;
import demomvc.controller.repositories.ProductService;

@Controller
public class HomeController {
	@Autowired
	private ProductRepository productRepo;
	@Autowired
	private ProductService productService;

	@RequestMapping(value = { "", "home" })
	public String showHome(ModelMap model) {
		Iterable<Product> prlist = productRepo.findAll();
		model.addAttribute("prlist", prlist);
		return "home";
	}

	@RequestMapping(value = "admin_page")
	public String adminPage(ModelMap model) {
//		setAdminCookie(response);
		Iterable<Product> prlist = productRepo.findAll();
		model.addAttribute("prlist", prlist);
		return "admin_page";
	}

	@GetMapping("/view_product/{id}")
	public String getProductId(ModelMap model, @PathVariable("id") Integer id) {
		Product product = productService.get(id);
		//Product product = productRepo.getById(id);
		model.addAttribute("product", product);
		return "product_detail";
	}

	@RequestMapping("/new")
	public String newProduct(ModelMap model) {
		Product product = new Product();
		model.addAttribute("product", product);
		return "add_product";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("product") Product product, ModelMap model) {
		productService.save(product);
		List<Product> listProduct = productRepo.findAll();
		model.addAttribute("listProduct", listProduct);
		return "redirect:/admin_page";
	}
//	private void setAdminCookie(HttpServletResponse respronse) {
//		Cookie cookie = new Cookie("adminCookie", "admin_cookie");
//		cookie.setMaxAge(60);
//		cookie.setPath("/admin_page");
//		respronse.addCookie(cookie);
//	}
}
