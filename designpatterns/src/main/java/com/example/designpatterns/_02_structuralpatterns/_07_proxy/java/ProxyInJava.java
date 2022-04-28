package com.example.designpatterns._02_structuralpatterns._07_proxy.java;

import com.example.designpatterns._02_structuralpatterns._07_proxy.after.DefaultGameService;
import com.example.designpatterns._02_structuralpatterns._07_proxy.after.GameService;

import java.lang.reflect.Proxy;

public class ProxyInJava {

    public static void main(String[] args) {
        ProxyInJava proxyInJava = new ProxyInJava();
        proxyInJava.dynamicProxy();
    }

    private void dynamicProxy() {
        GameService gameServiceProxy = getGameServiceProxy(new DefaultGameService());
        gameServiceProxy.startGame();
    }

    private GameService getGameServiceProxy(GameService target) {
        return (GameService) Proxy.newProxyInstance(this.getClass().getClassLoader(),
                new Class[]{GameService.class}, ((proxy, method, args) -> {
                    System.out.println("Hello Dynamic Proxy");
                    method.invoke(target, args);
                    return null;
                }));
    }
}
