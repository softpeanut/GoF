package com.example.designpatterns._01_credentialpatterns._01_singleton;

/**
 * static inner 클래스 홀더 (추천)
 */
public class Settings4 {

    private Settings4() { }

    private static class Settings4Holder {
        private static final Settings4 INSTANCE = new Settings4();
    }

    public static Settings4 getInstance() {
        return Settings4Holder.INSTANCE;
    }
}
