package com.example.travellist.dao;

import com.example.travellist.entity.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyUserRepository extends JpaRepository<MyUser,Long> {
    MyUser findByUsername(String username);
}
