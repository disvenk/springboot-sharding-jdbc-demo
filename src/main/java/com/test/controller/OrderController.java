package com.test.controller;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.executor.ReuseExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.test.model.Order;
import com.test.service.OrderService;

@Controller
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping(path="/{userId}", method={RequestMethod.GET})
	public List<Order> getOrderListByUserId(@PathVariable("userId") Integer userId) {
		return orderService.getOrderListByUserId(userId);
	}
	
	@RequestMapping(path="/{userId}/{orderId}", method={RequestMethod.GET})
	public String createOrderRest(@PathVariable("userId") Integer userId, @PathVariable("orderId") Integer orderId) {
		Order order = new Order();
		//order.setOrderId(orderId);
		order.setUserId(userId);
		orderService.createOrder(order);
		return "success";
	}
	
	@RequestMapping("createOrder")
	public String createOrder(Integer userId,Integer orderId) {
		Order order = new Order();
		//order.setOrderId(orderId);
		order.setUserId(userId);
		Date date = new Date();
		order.setTimes(date.getTime());
		order.setCreateTime(date);
		orderService.createOrder(order);
		return "success";
	}

	@RequestMapping("selectAll")
	@ResponseBody
	public List<Order> selectAll(Long start,Long end){
		List<Order> orders = orderService.selectAll(start, end);
		return orders;
	}
}
