package com.alpha.shopybeebackend.services;

import com.alpha.shopybeebackend.exception.exceptions.authentication.EmailNotFoundException;
import com.alpha.shopybeebackend.exception.exceptions.authentication.EmailPasswordNotMatchingException;
import com.alpha.shopybeebackend.models.User;
import com.alpha.shopybeebackend.respositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository repository;

    @Autowired
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User login(User user){
        List<User> users = repository.findByEmail(user.getEmail());
        if(users.isEmpty()){
            throw new EmailNotFoundException("No email address found");
        }
        else if(users.get(0).getPassword().compareTo(user.getPassword())==0){
            return users.get(0);
        }
        else{
            throw new EmailPasswordNotMatchingException("Incorrect password");
        }
    }

    public User create(User user){
        return repository.save(user);
    }

    public User getById(Long id){
        return repository.findById(id).orElseThrow();
    }
}
