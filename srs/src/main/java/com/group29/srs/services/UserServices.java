package com.group29.srs.services;

import com.group29.srs.model.CustomUserDetails;
import com.group29.srs.model.MyUser;
import com.group29.srs.model.UserRole;
import com.group29.srs.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class UserServices {

    @Autowired
    UserRepository userRepository;

    public MyUser getUserByIdAndPassword(Long ID, String password){
        return  userRepository.getUserByIdAndPassword(ID, password);
    }

}
