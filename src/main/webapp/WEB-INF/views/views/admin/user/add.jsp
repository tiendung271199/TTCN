<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/components/taglib.jsp"%>
<div class="row">
	<div class="col-md-12 panel-info">
		<div class="content-box-header panel-heading">
			<div class="panel-title ">Thêm mới người dùng</div>
		</div>
		<div class="content-box-large box-with-header">
			<form action="${urlAdminUser}/add" method="post" enctype="multipart/form-data">
				<div>
					<div class="row mb-10"></div>
					<div class="row">
						<div class="col-sm-6">
							<c:if test="${not empty error}">
								<div class="alert alert-danger" role="alert">
								    ${error}
								</div>
							</c:if>
						
							<div class="form-group">
								<label for="userFullname">Họ tên</label>
								<form:errors path="userError.userFullname" cssStyle="color:red;font-style:italic" ></form:errors>
								<input type="text" name="userFullname" class="form-control" value="${objUser.userFullname}" placeholder="Nhập họ tên">
							</div>

							<div class="form-group">
								<label for="userEmail">Email</label>
								<form:errors path="userError.userEmail" cssStyle="color:red;font-style:italic" ></form:errors>
								<input type="text" name="userEmail" class="form-control" value="${objUser.userEmail}" placeholder="Nhập email">
							</div>

							<div class="form-group">
								<label for="userPhone">Số điện thoại</label>
								<form:errors path="userError.userPhone" cssStyle="color:red;font-style:italic" ></form:errors>
								<input type="text" name="userPhone" class="form-control" value="${objUser.userPhone}" placeholder="Nhập số điện thoại">
							</div>

							<div class="form-group">
								<label for="province.provinceId">Địa chỉ (Tỉnh/Thành phố)</label>
								<form:errors path="addressError.province" cssStyle="color:red;font-style:italic" ></form:errors>
								<select name="province.provinceId" class="form-control" id="province" onchange="getDistrictByProvinceId()">
									<option value="0">-- Tỉnh/Thành phố --</option>
									<c:if test="${not empty listProvince}">
										<c:forEach items="${listProvince}" var="province" >
											<option value="${province.provinceId}" <c:if test='${objAddress.province.provinceId == province.provinceId}'>selected</c:if> >${province.provinceName}</option>
										</c:forEach>
									</c:if>
								</select>
							</div>
							
							<div class="form-group">
								<label for="district.districtId">Địa chỉ (Quận/Huyện)</label>
								<form:errors path="addressError.district" cssStyle="color:red;font-style:italic" ></form:errors>
								<select name="district.districtId" class="form-control" id="district" onchange="getWardByDistrictId()">
									<option value="0">-- Quận/Huyện --</option>
									<c:if test="${not empty listDistrict}">
										<c:forEach items="${listDistrict}" var="district" >
											<option value="${district.districtId}" <c:if test='${objAddress.district.districtId == district.districtId}'>selected</c:if> >${district.districtName}</option>
										</c:forEach>
									</c:if>
								</select>
							</div>
							
							<div class="form-group">
								<label for="ward.wardId">Địa chỉ (Xã/Phường)</label>
								<form:errors path="addressError.ward" cssStyle="color:red;font-style:italic" ></form:errors>
								<select name="ward.wardId" class="form-control" id="ward">
									<option value="0">-- Xã/Phường --</option>
									<c:if test="${not empty listWard}">
										<c:forEach items="${listWard}" var="ward" >
											<option value="${ward.wardId}" <c:if test='${objAddress.ward.wardId == ward.wardId}'>selected</c:if> >${ward.wardName}</option>
										</c:forEach>
									</c:if>
								</select>
							</div>
							
							<div class="form-group">
								<label for="addressDetail">Địa chỉ (Số nhà, tên đường...)</label>
								<form:errors path="addressError.addressDetail" cssStyle="color:red;font-style:italic" ></form:errors>
								<input type="text" name="addressDetail" class="form-control" value="${objAddress.addressDetail}" placeholder="Nhập số nhà, tên đường...">
							</div>
							
							<div class="form-group">
								<label>Ảnh đại diện</label>
								<form:errors path="userError.avatar" cssStyle="color:red;font-style:italic" ></form:errors>
								<input type="file" name="picture" class="btn btn-default">
								<p class="help-block"><em>Định dạng: jpg, png, jpeg</em></p>
							</div>
							
							<div class="form-group">
								<label>Vai trò</label>
								<form:errors path="userError.role" cssStyle="color:red;font-style:italic" ></form:errors>
								<select name="role.roleId" class="form-control">
								   <option value="0">-- Chọn vai trò --</option>
								   <option value="3" <c:if test='${objUser.role.roleId == 3}'>selected</c:if>>Nhân viên</option>
								</select>
							</div>
							
							<div class="form-group">
								<label for="username">Tên đăng nhập</label>
								<form:errors path="userError.username" cssStyle="color:red;font-style:italic" ></form:errors>
								<input type="text" name="username" class="form-control" value="${objUser.username}" placeholder="Nhập tên đăng nhập">
								<p class="help-block"><em>Định dạng: Tên đăng nhập từ 6 - 20 ký tự, không có dấu, không được chứa ký tự đặc biệt và khoảng trắng</em></p>
							</div>
							
							<div class="form-group">
								<label for="password">Mật khẩu</label>
								<form:errors path="userError.password" cssStyle="color:red;font-style:italic" ></form:errors>
								<input type="password" name="password" class="form-control" value="" placeholder="Nhập mật khẩu">
								<p class="help-block"><em>Định dạng: Mật khẩu từ 6 - 20 ký tự, phải chứa ít nhất 1 ký tự hoa, 1 ký tự thường, 1 chữ số và 1 ký tự đặc biệt</em></p>
							</div>
							
							<div class="form-group">
								<label for="confirmPassword">Xác nhận mật khẩu</label>
								<span style="color:red;font-style:italic" >${confirmPasswordError}</span>
								<input type="password" name="confirmPassword" class="form-control" value="" placeholder="Xác nhận mật khẩu">
							</div>
						</div>
					</div>
					<hr>
					<div class="row">
						<div class="col-sm-12">
							<input type="submit" value="Lưu" class="btn btn-success" />
							<input type="reset" value="Nhập lại" class="btn btn-default" />
						</div>
					</div>
				</div>
			</form>
		</div>
	</div>
</div>

<script type="text/javascript">
	// ajax: chọn tỉnh/tp => hiển thị list quận/huyện
	function getDistrictByProvinceId() {
		var ward = '<option value="0">-- Xã/Phường --</option>';
		$("#ward").html(ward);
		var provinceId = $("#province").val();
		$.ajax({
			url: '${urlDistrict}',
			type: 'POST',
			cache: false,
			dataType: 'json',
			data: {
				provinceId: provinceId
			},
			success: function(data){
				var rs = '<option value="0">-- Quận/Huyện --</option>';
				for (var i = 0; i < data.length; i++) {
					rs += '<option value="'+data[i].districtId+'">'+data[i].districtName+'</option>';
				}
				$("#district").html(rs);
			},
			error: function (){
				alert('Có lỗi xảy ra!');
			}
		});
		return false;
	};
	
	// ajax: chọn quận/huyện => hiển thị list xã/phường
	function getWardByDistrictId() {
		var districtId = $("#district").val();
		$.ajax({
			url: '${urlWard}',
			type: 'POST',
			cache: false,
			dataType: 'json',
			data: {
				districtId: districtId
			},
			success: function(data){
				var rs = '<option value="0">-- Xã/Phường --</option>';
				for (var i = 0; i < data.length; i++) {
					rs += '<option value="'+data[i].wardId+'">'+data[i].wardName+'</option>';
				}
				$("#ward").html(rs);
			},
			error: function (){
				alert('Có lỗi xảy ra!');
			}
		});
		return false;
	}
</script>

<script type="text/javascript">
	document.getElementById("admin_user").className = "current";
</script>