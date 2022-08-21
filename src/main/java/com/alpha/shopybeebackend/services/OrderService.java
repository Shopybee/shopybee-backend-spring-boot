package com.alpha.shopybeebackend.services;

//import com.alpha.shopybeebackend.models.Order;
import com.alpha.shopybeebackend.models.Orders;
import com.alpha.shopybeebackend.respositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepository;


    @Autowired
    public OrderService(OrderRepository repository, OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Orders> getOrdersByUserId(int id){
        return orderRepository.findAllByUserId(id);
    }

    public Orders createNewOrder(Orders order){
        Orders createdOrder = orderRepository.save(order);
        return createdOrder;
    }






}
