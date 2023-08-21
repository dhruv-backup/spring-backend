package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    public User findByCustomerID(String customerID);

    public User findByAccountNo(String accountNo);
}
