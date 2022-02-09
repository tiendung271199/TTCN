package vn.shopttcn.model;

import java.sql.Timestamp;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	private int productId;
	private Category cat;

	@NotEmpty
	private String productName;

	private String productSlug;
	private String productImage; // hình ảnh chính (hiển thị trang chủ, trang shop)

	@NotEmpty
	private String productDesc;

	@NotEmpty
	private String productDetail;

	@NotNull
	@Min(0)
	private Integer productPrice; // giá bán

	@NotNull
	@Min(0)
	private Integer productQuantity; // số lượng sản phẩm đang có

	private int productSold; // số lượng sản phẩm đã bán
	private int productView;
	private int deleteStatus;
	private Timestamp createAt;
	private Timestamp updateAt;

	public Product(int productId) {
		super();
		this.productId = productId;
	}

	public Product(int productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}

}
