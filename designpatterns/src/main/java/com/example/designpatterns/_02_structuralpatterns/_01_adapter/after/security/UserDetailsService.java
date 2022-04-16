package com.example.designpatterns._02_structuralpatterns._01_adapter.after.security;

public interface UserDetailsService {
    UserDetails loadUser(String username);
}
