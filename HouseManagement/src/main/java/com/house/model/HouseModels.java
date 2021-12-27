package com.house.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="house_table")
public class HouseModels {
	
	@Id
	private int houseId;
	private int houseNo;
	private String status;
	private String type;
	public int getHouseId() {
		return houseId;
	}
	public void setHouseId(int houseId) {
		this.houseId = houseId;
	}
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public HouseModels(int houseId, int houseNo, String status, String type) {
		super();
		this.houseId = houseId;
		this.houseNo = houseNo;
		this.status = status;
		this.type = type;
	}
	
	public HouseModels() {
		super();
	}


}
