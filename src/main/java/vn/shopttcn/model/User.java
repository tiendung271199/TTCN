package vn.shopttcn.model;

import java.sql.Timestamp;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	private int userId;

	@NotEmpty
	private String userFullname;

	@NotEmpty
	@Email
	private String userEmail;

	@NotEmpty
	private String userPhone;

	private Address userAddress;
	private String avatar;

	@NotEmpty
	private String username;

	private String password;
	private Role role;
	private int enabled; // trạng thái tài khoản (1: sử dụng được, 0: bị vô hiệu hoá)
	private Timestamp createAt;
	private Timestamp updateAt;

	public User(int userId, String username) {
		super();
		this.userId = userId;
		this.username = username;
	}

	public User(int userId) {
		super();
		this.userId = userId;
	}

	// sử dụng trong validate
	public User(String userEmail, String userPhone, String username) {
		super();
		this.userEmail = userEmail;
		this.userPhone = userPhone;
		this.username = username;
	}

	// sử dụng trong update status enabled
	public User(int userId, int enabled) {
		super();
		this.userId = userId;
		this.enabled = enabled;
	}

	// join table order
	public User(int userId, @NotEmpty String userFullname, @NotEmpty String username) {
		super();
		this.userId = userId;
		this.userFullname = userFullname;
		this.username = username;
	}

	// reviews
	public User(int userId, @NotEmpty String userFullname, String avatar, @NotEmpty String username) {
		super();
		this.userId = userId;
		this.userFullname = userFullname;
		this.avatar = avatar;
		this.username = username;
	}

}
