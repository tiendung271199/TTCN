package vn.shopttcn.util.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AjaxStatus {
	// dùng trong các hàm ajax (admin)
	private int code; // 0: thành công, 1: lỗi
	private String content; // nội dung trả về cho view

}
