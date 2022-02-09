package vn.shopttcn.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetail {
	private int orderDetailId;
	private int orderId;
	private int productId;
	private String orderProductName;
	private int orderProductPrice;
	private int orderProductQuantity;

	public OrderDetail(int orderId, int productId, String orderProductName, int orderProductPrice,
			int orderProductQuantity) {
		super();
		this.orderId = orderId;
		this.productId = productId;
		this.orderProductName = orderProductName;
		this.orderProductPrice = orderProductPrice;
		this.orderProductQuantity = orderProductQuantity;
	}

}
