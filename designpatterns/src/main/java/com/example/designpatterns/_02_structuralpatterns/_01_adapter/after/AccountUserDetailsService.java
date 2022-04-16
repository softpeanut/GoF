package com.example.designpatterns._02_structuralpatterns._01_adapter.after;

import com.example.designpatterns._02_structuralpatterns._01_adapter.after.security.UserDetails;
import com.example.designpatterns._02_structuralpatterns._01_adapter.after.security.UserDetailsService;

public class AccountUserDetailsService implements UserDetailsService {

    private final AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        Account account = accountService.findAccountByUsername(username);
        return new AccountUserDetails(account);
    }
}
