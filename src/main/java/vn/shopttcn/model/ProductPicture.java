package vn.shopttcn.model;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductPicture {
	private int pictureId;
	private int productId;
	private String pictureName;
	private Timestamp createAt;
	private Timestamp updateAt;

	public ProductPicture(int productId, String pictureName) {
		super();
		this.productId = productId;
		this.pictureName = pictureName;
	}

	public ProductPicture(int productId) {
		super();
		this.productId = productId;
	}

	public ProductPicture(String pictureName) {
		super();
		this.pictureName = pictureName;
	}

}
