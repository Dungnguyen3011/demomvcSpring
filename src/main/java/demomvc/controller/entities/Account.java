package demomvc.controller.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Table(name="tbl_account")
//@Getter
//@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Account {
	@Id
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
	
//	public String getUsername() {
//		return username;
//	}
//	public void setUsername(String username) {
//		this.username = username;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
	
}
