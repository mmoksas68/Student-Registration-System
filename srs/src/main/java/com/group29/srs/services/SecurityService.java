package com.group29.srs.services;

public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);

    void logout();
}