package com.test.mapper;

import java.util.List;

import com.test.model.Order;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
	
	List<Order> getOrderListByUserId(Integer userId);
	
	void createOrder(Order order);

	List<Order> selectAll(@Param("start")Long start,@Param("end")Long end);
}
