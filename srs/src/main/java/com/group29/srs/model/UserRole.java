package com.group29.srs.model;

import org.springframework.security.core.GrantedAuthority;

public class UserRole implements GrantedAuthority {
    String role;

    public UserRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String getAuthority() {
        return null;
    }
}
