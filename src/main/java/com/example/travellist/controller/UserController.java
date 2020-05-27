package com.example.travellist.controller;


import com.example.travellist.dao.MyUserRepository;
import com.example.travellist.entity.MyUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private MyUserRepository myUserRepository;
    //@Autowired
    //private BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserController(MyUserRepository myUserRepository
            //,BCryptPasswordEncoder bCryptPasswordEncoder
    ){

        this.myUserRepository = myUserRepository;
        //this.bCryptPasswordEncoder = bCryptPasswordEncoder;

    }

    @RequestMapping(value = "/sign-up", method = RequestMethod.POST)
    public void signUp(@RequestBody MyUser user){

        //user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        myUserRepository.save(user);

    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(){

        return "true";

    }

}
