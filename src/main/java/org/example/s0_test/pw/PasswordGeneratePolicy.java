package org.example.s0_test.pw;

@FunctionalInterface
public interface PasswordGeneratePolicy {
    String generatePassword();
}