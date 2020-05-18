package com.group29.srs.model;

import org.springframework.security.core.userdetails.UserDetails;

import java.util.HashSet;
import java.util.Set;

public class MyUser {
    Long user_id;
    String firstname;
    String lastname;
    String mail;
    String password;
    UserRole role;
    public MyUser() {

    }

    public MyUser(Long user_id, String firstname, String lastname, String mail, String password) {
        this.user_id = user_id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.mail = mail;
        this.password = password;
    }



    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public Set<UserRole> getUserRole() {
        Set<UserRole> set = new HashSet<UserRole>();
        set.add(role);
        return set;
    }
}
