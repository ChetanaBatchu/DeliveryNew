package com.deliveryservice.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Delivery {
	@Id
	@Column(name="deliveryid")
	private Integer deliveryId;
	@Column(name="phoneno")
private Integer custPhoneNo;
	@Column(name="custaddress")
	private String custAddress;
	@Column(name="orderstatus")
	private String orderStatus;
	public Delivery(Integer deliveryId, Integer custPhoneNo, String custAddress, String orderStatus) {
		super();
		this.deliveryId = deliveryId;
		this.custPhoneNo = custPhoneNo;
		this.custAddress = custAddress;
		this.orderStatus = orderStatus;
	}
	public Integer getDeliveryId() {
		return deliveryId;
	}
	public void setDeliveryId(Integer deliveryId) {
		this.deliveryId = deliveryId;
	}
	public Integer getCustPhoneNo() {
		return custPhoneNo;
	}
	public void setCustPhoneNo(Integer custPhoneNo) {
		this.custPhoneNo = custPhoneNo;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Delivery() {
		super();
	}
	@Override
	public String toString() {
		return "Delivery [deliveryId=" + deliveryId + ", custPhoneNo=" + custPhoneNo + ", custAddress=" + custAddress
				+ ", orderStatus=" + orderStatus + "]";
	}
	
}


