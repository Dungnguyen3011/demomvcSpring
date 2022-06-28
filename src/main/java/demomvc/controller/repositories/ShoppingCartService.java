package demomvc.controller.repositories;

import java.util.Collection;

import demomvc.controller.entities.CartItem;

public interface ShoppingCartService {

	void clear();

	Collection<CartItem> getCartItems();

	void add(CartItem item);

	void remove(int id);

}
