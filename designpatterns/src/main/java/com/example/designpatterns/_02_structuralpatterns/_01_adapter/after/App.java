package com.example.designpatterns._02_structuralpatterns._01_adapter.after;

import com.example.designpatterns._02_structuralpatterns._01_adapter.after.security.LoginHandler;
import com.example.designpatterns._02_structuralpatterns._01_adapter.after.security.UserDetailsService;

public class App {

    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);

        String login = loginHandler.login("beomjin", "beomjin");
        System.out.println(login);
    }
}
