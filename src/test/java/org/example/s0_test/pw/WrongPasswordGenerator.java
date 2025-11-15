package org.example.s0_test.pw;

public class WrongPasswordGenerator implements PasswordGeneratePolicy {
    @Override
    public String generatePassword() {
        return "bb";
    }
}