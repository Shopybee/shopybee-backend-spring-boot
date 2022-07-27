package com.alpha.shopybeebackend.services;

import com.alpha.shopybeebackend.models.User;
import com.alpha.shopybeebackend.respositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository repository;

    @Autowired
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User create(User user){
        return repository.save(user);
    }

    public User getById(Long id){
        return repository.findById(id).orElseThrow();
    }
}
