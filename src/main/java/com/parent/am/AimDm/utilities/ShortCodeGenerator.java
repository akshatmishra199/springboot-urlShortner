package com.parent.am.AimDm.utilities;

import org.springframework.stereotype.Component;

import java.security.SecureRandom;

@Component
public class ShortCodeGenerator {

    private static final String BASE = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final SecureRandom random = new SecureRandom();
    private final int length;

    public ShortCodeGenerator(int length) {
        this.length = length;
    }
    public String generate() {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int idx = random.nextInt(BASE.length());  // pick a random index
            sb.append(BASE.charAt(idx));              // add character to the result
        }
        return sb.toString();
    }
}
