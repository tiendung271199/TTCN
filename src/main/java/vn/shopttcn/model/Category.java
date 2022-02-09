package vn.shopttcn.model;

import java.sql.Timestamp;

import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {
	private int catId;

	@NotEmpty
	private String catName;

	private String catSlug; // string hiển thị trên url
	private int catParentId; // danh mục cha
	private int deleteStatus;
	private Timestamp createAt;
	private Timestamp updateAt;

	public Category(int catId, String catName, String catSlug, int catParentId, Timestamp createAt,
			Timestamp updateAt) {
		super();
		this.catId = catId;
		this.catName = catName;
		this.catSlug = catSlug;
		this.catParentId = catParentId;
		this.createAt = createAt;
		this.updateAt = updateAt;
	}

}
