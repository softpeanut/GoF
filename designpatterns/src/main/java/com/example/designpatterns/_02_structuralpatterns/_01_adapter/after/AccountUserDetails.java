package com.example.designpatterns._02_structuralpatterns._01_adapter.after;

import com.example.designpatterns._02_structuralpatterns._01_adapter.after.security.UserDetails;

public class AccountUserDetails implements UserDetails {

    private final Account account;

    public AccountUserDetails(Account account) {
        this.account = account;
    }

    @Override
    public String getUserName() {
        return this.account.getName();
    }

    @Override
    public String getPassword() {
        return this.account.getPassword();
    }
}
