package com.alpha.shopybeebackend.services;

import com.alpha.shopybeebackend.models.Cart;
import com.alpha.shopybeebackend.respositories.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {
    private final CartRepository repository;

    @Autowired
    public CartService(CartRepository repository) {
        this.repository = repository;
    }

    public List<Cart> getCartItems(int userId){
        return repository.findAllByUserId(userId);
    }

    public Cart addToCart(Cart cart){
        return repository.save(cart);
    }

    public String removeFromCart(int cartId){
        repository.deleteById(cartId);
        return "Success";
    }

    public Cart updateCart(Cart cart){
        return repository.save(cart);
    }

}
