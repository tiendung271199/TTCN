package vn.shopttcn.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LocationDistrict {
	private int districtId;
	private String districtName;
	private int provinceId;

	public LocationDistrict(int districtId, String districtName) {
		super();
		this.districtId = districtId;
		this.districtName = districtName;
	}

}
