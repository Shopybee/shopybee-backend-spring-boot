package com.alpha.shopybeebackend.controllers;

//import com.alpha.shopybeebackend.models.Order;
import com.alpha.shopybeebackend.models.Orders;
import com.alpha.shopybeebackend.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/shopybee/order")
@RestController
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/get-all-orders/{userId}")
    public ResponseEntity<List<Orders>> getOrdersByUserId(@PathVariable int userId){
        return new ResponseEntity<List<Orders>>(orderService.getOrdersByUserId(userId), HttpStatus.OK);
    }

    @PostMapping("/create-order")
    public ResponseEntity<Orders> createOrder(@RequestBody Orders order){
        return new ResponseEntity<Orders>(orderService.createNewOrder(order),HttpStatus.OK);
    }

}
