package com.alpha.shopybeebackend.controllers;

import com.alpha.shopybeebackend.models.User;
import com.alpha.shopybeebackend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("shopybee/user")
@RestController
public class UserController {

    private final UserService service;

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping("/login")
    public ResponseEntity<Object> login(@RequestBody User user){
        return new ResponseEntity<Object>(service.login(user), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<User> create(@RequestBody User user){
        return new ResponseEntity<User>(service.create(user), HttpStatus.OK);
    }

    @GetMapping("/get-by-id/{id}")
    public ResponseEntity<User> getById(@PathVariable Long id){
        return new ResponseEntity<User>(service.getById(id), HttpStatus.OK);
    }
}
