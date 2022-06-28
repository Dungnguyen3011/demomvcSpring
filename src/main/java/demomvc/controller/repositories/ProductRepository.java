package demomvc.controller.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import demomvc.controller.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
