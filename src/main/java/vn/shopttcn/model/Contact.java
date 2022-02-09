package vn.shopttcn.model;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Contact {
	private int contactId;
	private String contactName;
	private String contactEmail;
	private String contactPhone;
	private String contactMessage;
	private int deleteStatus;
	private Timestamp createAt;
	private Timestamp updateAt;

}
