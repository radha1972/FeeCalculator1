package com.radha;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;

import javax.persistence.Table;
@Entity
@Table (name="Contact")
 public class Contact {
	private int id;
	private String customername;
	private String address;
	private String zipcode;
	@Id
	@Column (name="id")
	public int  getId()
	{return id;}
	public void setId(int id)
	{this.id=id;}
	@Column (name="customername")
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	@Column(name="address")
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Column (name="zipcode")
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

}
