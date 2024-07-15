package com.apitest.api.Users.Repository;

import com.apitest.api.Users.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {

    User findByPhone(String phone);

}