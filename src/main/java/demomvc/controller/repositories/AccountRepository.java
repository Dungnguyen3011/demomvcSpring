package demomvc.controller.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import demomvc.controller.entities.Account;

public interface AccountRepository extends JpaRepository<Account, String> {
	@Query("SELECT u FROM Account u WHERE u.username = ?1")
	Account findByUsername(String username);
}
