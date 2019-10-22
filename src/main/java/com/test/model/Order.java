package com.test.model;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class Order implements Serializable {

	private Integer userId;

	private Integer orderId;

	private Long times;

	private Date createTime;

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getTimes() {
		return times;
	}

	public void setTimes(Long time) {
		this.times = time;
	}


	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

}
