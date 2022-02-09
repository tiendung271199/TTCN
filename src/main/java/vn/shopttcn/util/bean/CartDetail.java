package vn.shopttcn.util.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.shopttcn.model.Product;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartDetail {
	private Product product;
	private int quantity;

}
