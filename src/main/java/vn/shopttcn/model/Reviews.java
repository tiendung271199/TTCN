package vn.shopttcn.model;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reviews {
	private int reviewsId;
	private User user;
	private Product product;
	private String reviewsContent;
	private int reviewsRating; // 1 2 3 4 5 (sao)
	private int reviewsStatus; // trạng thái (1: hiển thị, 0: ẩn)
	private Timestamp createAt;
	private Timestamp updateAt;

	// update status
	public Reviews(int reviewsId, int reviewsStatus) {
		super();
		this.reviewsId = reviewsId;
		this.reviewsStatus = reviewsStatus;
	}

	public Reviews(User user, Product product, String reviewsContent, int reviewsRating) {
		super();
		this.user = user;
		this.product = product;
		this.reviewsContent = reviewsContent;
		this.reviewsRating = reviewsRating;
	}

}
