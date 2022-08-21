package com.alpha.shopybeebackend.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@Data
@Entity
public class Orders {
    @Id
    @Column(name = "orderId")
    private String orderId;
    private String paymentId;
    private Date orderDate;
    private int userId;
    private double totalAmount;
    private int orderStatus;
    private String orderStatusMessage;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "orderId")
    List<OrderItem> orderItemList = new ArrayList<>();

    public Orders(String orderId, List<OrderItem> orderItemList, String paymentId, Date orderDate, int userId, double totalAmount, int orderStatus, String orderStatusMessage) {
        this.orderId = orderId;
        this.paymentId = paymentId;
        this.orderDate = orderDate;
        this.userId = userId;
        this.totalAmount = totalAmount;
        this.orderStatusMessage = orderStatusMessage;
        this.orderItemList=orderItemList;
        this.orderStatus=orderStatus;
    }
}
