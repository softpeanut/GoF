package com.example.designpatterns._02_structuralpatterns._01_adapter.after.security;

public class LoginHandler {

    UserDetailsService userDetailsService;

    public LoginHandler(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    public String login(String username, String password) {
        UserDetails userDetails = userDetailsService.loadUser(username);
        if (userDetails.getPassword().equals(password)) {
            return userDetails.getUserName();
        } else {
            throw new IllegalArgumentException();
        }
    }

}
