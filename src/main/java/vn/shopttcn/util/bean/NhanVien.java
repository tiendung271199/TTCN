package vn.shopttcn.util.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NhanVien {
	// dùng cho thống kê
	private int userId;
	private String userFullname;
	private int orderQuantity;
	private int orderProductQuantity;
	private long totalSales;

}
