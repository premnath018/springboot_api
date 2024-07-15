package com.apitest.api.Users.Controller;

import com.apitest.api.Users.Entity.User;
import com.apitest.api.Users.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.security.SecureRandom;
import java.util.List;

@Controller
public class GraphqlController {

    @Autowired
    private UserService service;

    @QueryMapping
    public List<User> findAll() {
        return service.getUsers();
    }

    @QueryMapping
    public User findOne(@Argument Integer id) {
        return service.getById(id);
    }

    @MutationMapping
    public String createUser(@Argument String name , @Argument String email , @Argument String phone, @Argument String password){
        User newUser = new User(name,email,phone,password);
        if (service.save(newUser) != null ){
            return "User is Created";
        }
        return "User is not created";
    }

}
