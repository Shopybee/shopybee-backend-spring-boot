package com.alpha.shopybeebackend.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor
@Data
@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // auto generate id
    private int cartId;
    private int userId;
    private int categoryId;
    private int brandId;
    private int productId;

    private int quantity;

    public Cart(int user_id, int category_id, int brand_id, int product_id,int quantity) {
        this.userId = user_id;
        this.categoryId = category_id;
        this.brandId = brand_id;
        this.productId = product_id;
        this.quantity=quantity;
    }

    public Cart(int cartId, int userId, int categoryId, int brandId, int productId, int quantity) {
        this.cartId = cartId;
        this.userId = userId;
        this.categoryId = categoryId;
        this.brandId = brandId;
        this.productId = productId;
        this.quantity = quantity;
    }
}
