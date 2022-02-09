package vn.shopttcn.model;

import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
	private int addressId;
	private LocationProvince province;
	private LocationDistrict district;
	private LocationWard ward;

	@NotEmpty
	private String addressDetail;

}
