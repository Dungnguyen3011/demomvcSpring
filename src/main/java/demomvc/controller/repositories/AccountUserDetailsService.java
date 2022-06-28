package demomvc.controller.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import demomvc.controller.entities.Account;

public class AccountUserDetailsService implements UserDetailsService {
	
	@Autowired
	private AccountRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Account acc = repo.findByUsername(username);
		if(acc==null) {
			throw new UsernameNotFoundException("User does not exist");
		}
		return new AccountUserDetails(acc);
	}

}
