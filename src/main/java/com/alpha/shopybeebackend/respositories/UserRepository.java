package com.alpha.shopybeebackend.respositories;

import com.alpha.shopybeebackend.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    public List<User> findByEmail(String password);

}
