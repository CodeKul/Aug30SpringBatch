package com.codekul.Aug24Batch.onetoone.controller;


import com.codekul.Aug24Batch.onetoone.entity.Users;
import com.codekul.Aug24Batch.onetoone.entity.UserDetails;
import com.codekul.Aug24Batch.onetoone.repository.UserDetailsRepository;
import com.codekul.Aug24Batch.onetoone.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserDetailsRepository userDetailsRepository;

    @PostMapping("save")
    @Transactional
    public String saveUser(@RequestBody Users user) {
        var u = new Users();
        u.setName(user.getName());
        userRepository.save(u);

        var userDetails = new UserDetails();
        userDetails.setPasscode(user.getUserDetails().getPasscode());
        userDetails.setAddress(user.getUserDetails().getAddress());
        userDetails.setMobileNumber(user.getUserDetails().getMobileNumber());
        userDetails.setUser(u);

        userDetailsRepository.save(userDetails);
        return "user saved";

    }

    @PostMapping("save1")
    private String saveUser1(@RequestBody Users user) {
        userRepository.save(user);
        return "user saved";

    }

    @GetMapping("getUsersById/{id}")
    public Users getUser(@PathVariable("id")Long id){
        return userRepository.getReferenceById(id);
    }


}
