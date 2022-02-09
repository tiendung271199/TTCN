package vn.shopttcn.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LocationWard {
	private int wardId;
	private String wardName;
	private int districtId;

	public LocationWard(int wardId, String wardName) {
		super();
		this.wardId = wardId;
		this.wardName = wardName;
	}

}
