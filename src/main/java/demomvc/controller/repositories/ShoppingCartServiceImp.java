package demomvc.controller.repositories;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import demomvc.controller.entities.CartItem;

@Service
@SessionScope
public class ShoppingCartServiceImp implements ShoppingCartService {
	private Map<Integer,CartItem>map=new HashMap<Integer,CartItem>();
	
	@Override
	public void add(CartItem item){
		CartItem existedItem = map.get(item.getProductID());
		if(existedItem!=null){
		    existedItem.setUnitsInStock(1+item.getUnitsInStock());
		}else{		
		    map.put(item.getProductID(),item);
		}
		map.put(item.getProductID(),item);
	}
	
	@Override
	public Collection<CartItem>getCartItems(){
	    return map.values();
	}
	
	@Override
	public void remove(int id) {
		map.remove(id);
	}
	
	@Override
	public void clear(){
	    map.clear();
	}
}
