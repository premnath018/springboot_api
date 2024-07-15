package com.apitest.api.Users.Controller;

import com.apitest.api.Users.Entity.User;
import com.apitest.api.Users.ResponseHandler.ResponseHandler;
import com.apitest.api.Users.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping("/getAllUsers")
    public ResponseEntity<Object> getAllUsers(){
        return ResponseHandler.responseBuilder("All Users Data Sent", HttpStatus.OK,service.getUsers());
    }
    @GetMapping("/User/{user_id}")
    public ResponseEntity<Object> GetUser(@PathVariable Integer user_id) {
        return ResponseHandler.responseBuilder("User Detail Fetched Successfully", HttpStatus.OK, service.getById(user_id));
    }

    @GetMapping("/User/")
    public ResponseEntity<Object> GetUserByPhone(@RequestBody User user) {
        System.out.println(user);
        return ResponseHandler.responseBuilder("User Detail Fetched Successfully", HttpStatus.OK, service.getUserByPhone(user.getPhone()));
    }

    @PostMapping("/User")
    public ResponseEntity<Object> createUser(@RequestBody User user){
        return ResponseHandler.responseBuilder("User Created Successfully",HttpStatus.CREATED,service.save(user));
    }

    @PutMapping("/User")
    public ResponseEntity<Object> UpdateUser(@RequestBody User user){
        return ResponseHandler.responseBuilder("User Updated Successfully",HttpStatus.OK,service.update(user));
    }

    @DeleteMapping("/User")
    public ResponseEntity<Object> DeleteUser(@RequestBody Integer id){
        return ResponseHandler.responseBuilder("User Deleted Successfully",HttpStatus.OK,service.deleteUser(id));
    }
}
