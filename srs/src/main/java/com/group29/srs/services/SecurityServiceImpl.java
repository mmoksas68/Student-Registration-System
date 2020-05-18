package com.group29.srs.services;

import com.group29.srs.model.CustomUserDetails;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class SecurityServiceImpl implements SecurityService{
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserDetailsService userDetailsService;


    @Override
    public String findLoggedInUsername() {
        SecurityContext sc = SecurityContextHolder.getContext();

        if (sc.getAuthentication().isAuthenticated() && sc.getAuthentication().getPrincipal() != "anonymousUser") {
            return ((User)sc.getAuthentication().getPrincipal()).getUsername();
        }

        return null;
    }

    @Override
    public void autoLogin(String username, String password) {
        UserDetails userDetails = userDetailsService.loadUserByUsername(username);
        if(userDetails == null)
            return;

        try{
            UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(userDetails, password, userDetails.getAuthorities());
            Authentication auth =  authenticationManager.authenticate(usernamePasswordAuthenticationToken);
            SecurityContext sc = SecurityContextHolder.getContext();
            sc.setAuthentication(auth);

            if (sc.getAuthentication().isAuthenticated() && sc.getAuthentication().getPrincipal() != null) {
                System.out.println((String.format("Auto login %s successfully!", username)));
            }else{
                System.out.println("Authentication failed!");
            }
        }catch (Exception e){
            return;
        }


    }

    public void logout(){
        SecurityContextHolder.getContext().setAuthentication(null);
    }
}