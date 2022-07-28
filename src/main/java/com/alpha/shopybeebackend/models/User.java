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
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // auto generates id
    private Long id;
    private String email;
    private String name;
    private String phone;
    private String password;

    public User(String email, String name, String phone) {
        this.email = email;
        this.name = name;
        this.phone = phone;
    }

    public User(String email,String password){
        this.email=email;
        this.password=password;
    }
}
