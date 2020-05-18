package com.group29.srs.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class CustomUserDetails implements UserDetails {
    private MyUser myUser;

    public CustomUserDetails(final MyUser _My_user) {
        this.myUser = _My_user;
    }

    public CustomUserDetails() {
    }

    @Override
    public Collection<GrantedAuthority> getAuthorities() {
        final Set<GrantedAuthority> _grntdAuths = new HashSet<GrantedAuthority>();

        UserRole _role = null;

        if (myUser !=null) {
            _role = myUser.getRole();
        }

        if (_role!=null) {
            _grntdAuths.add(new SimpleGrantedAuthority(_role.getRole()));
        }

        return _grntdAuths;
    }

    @Override
    public String getPassword() {
        return myUser.getPassword();
    }

    @Override
    public String getUsername() {
        if (this.myUser == null) {
            return null;
        }
        return String.valueOf(this.myUser.getUser_id());
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public MyUser getMyUser() {
        return myUser;
    }

    @Override
    public String toString() {
        return "CustomUserDetails [user=" + myUser + "]";
    }

    public Set<UserRole> getUserRole() {
        return myUser.getUserRole();
    }
}
