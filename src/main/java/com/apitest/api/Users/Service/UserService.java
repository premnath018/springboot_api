package com.apitest.api.Users.Service;

import com.apitest.api.Users.Entity.User;
import com.apitest.api.Users.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;


    public User save(User user){
        BCryptPasswordEncoder Pass = new BCryptPasswordEncoder();
        String hash = Pass.encode(user.getPassword());
        user.setPassword(hash);
        return repo.save(user);
    }

    public List<User> getUsers(){
        return repo.findAll();
    }

    public User getById(Integer id){
        return repo.getReferenceById(id);
   }

    public User getUserByPhone(String Phone){
        return repo.findByPhone(Phone);
    }

    public String deleteUser(Integer id){
        repo.deleteById(id);
        return "User Deleted Successfully";
    }

    public  User update(User new_){
        User old = repo.findById(new_.getId()).orElse(null);
        assert old != null;
        old.setName(new_.getName());
        old.setEmail(new_.getEmail());
        old.setPhone(new_.getPhone());

        return repo.save(old);
    }

}
