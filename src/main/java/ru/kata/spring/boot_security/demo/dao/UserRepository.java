package com.serdtsev.spring.boot.springbootproject.dao;

import  com.serdtsev.spring.boot.springbootproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUserName(String userName);
}
