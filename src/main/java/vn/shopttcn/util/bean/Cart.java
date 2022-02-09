package vn.shopttcn.util.bean;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
	private int userId;
	private List<CartDetail> listCartDetail;
	private int totalQuantity;
	private int totalPrice;

}
