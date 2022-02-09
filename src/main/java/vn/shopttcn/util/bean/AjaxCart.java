package vn.shopttcn.util.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AjaxCart {
	// dùng trong hàm ajax của giỏ hàng: thêm, tăng, giảm, xoá
	private int quantity; // số lượng 1 sản phẩm
	private int totalQuantity; // tổng số lượng sản phẩm
	private int price; // giá bán 1 sản phẩm (theo số lượng)
	private int totalPrice; // tổng giá
	private int error; // 0: không lỗi, 1: có lỗi
	private String errorContent; // nội dung thông báo lỗi (nếu có)

	public AjaxCart(int error) {
		super();
		this.error = error;
	}

}
