package vn.shopttcn.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {
	// 3 quyền: ADMIN, MOD (nhân viên), USER (khách hàng)
	private int roleId;
	private String roleName;
	private String roleDesc;

	public Role(int roleId) {
		super();
		this.roleId = roleId;
	}

}
