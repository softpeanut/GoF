package com.example.designpatterns._02_structuralpatterns._01_adapter.before.security;

public interface UserDetailsService {
    UserDetails loadUser(String username);
}
