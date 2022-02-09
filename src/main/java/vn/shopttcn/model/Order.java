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
public class Order {
	private int orderId;
	private int orderTotalQuantity; // tổng số lượng
	private int orderTotalPrice; // tổng tiền
	private int userId; // user đặt hàng
	
	@NotEmpty
	private String orderName;
	
	@NotEmpty
	@Email
	private String orderEmail;
	
	@NotEmpty
	private String orderPhone;
	
	private String orderAddress;
	private String orderNote;
	private int orderStatus; // trạng thái đơn hàng (do nhân viên xử lý)
	private int orderPayment; // trạng thái thanh toán (1: đã thanh toán, 0: chưa thanh toán)
	private User user; // nhân viên xử lý đơn hàng
	private Timestamp createAt;
	private Timestamp updateAt;

	public Order(String orderName, String orderEmail, String orderPhone) {
		super();
		this.orderName = orderName;
		this.orderEmail = orderEmail;
		this.orderPhone = orderPhone;
	}

}
