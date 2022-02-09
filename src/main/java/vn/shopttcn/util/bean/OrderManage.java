package vn.shopttcn.util.bean;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderManage {
	private int orderId;
	private int totalQuantity;
	private int totalPrice;
	private String fullname;
	private String phone;
	private String email;
	private String address;
	private String note;
	private String createAt;
	private int status;
	private List<OrderManageDetail> list;

}
