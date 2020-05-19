package com.group29.srs.services;

import com.group29.srs.model.MyUser;
import com.group29.srs.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {

    @Autowired
    UserRepository userRepository;

    public MyUser getUserByIdAndPassword(Long ID, String password){
        return  userRepository.getUserByIdAndPassword(ID, password);
    }

}
