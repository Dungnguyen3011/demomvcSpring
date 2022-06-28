package demomvc.controller.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demomvc.controller.entities.Product;

@Service
public class ProductService {
	@Autowired
	private ProductRepository rep;
	
	public List<Product> listAll() {
		return rep.findAll();
	}
	
	public void save(Product product) {
		rep.save(product);
	}
	
	
	public void delete(Integer id) {
		rep.deleteById(id);
	}

	public Product get(Integer id) {
		// TODO Auto-generated method stub
		return rep.findById(id).get();
	}
}
