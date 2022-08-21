package com.alpha.shopybeebackend.respositories;

//import com.alpha.shopybeebackend.models.Order;
import com.alpha.shopybeebackend.models.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Orders, String> {
    public List<Orders> findAllByUserId(int userId);
}