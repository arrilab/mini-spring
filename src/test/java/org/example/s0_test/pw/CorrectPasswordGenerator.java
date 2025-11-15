package org.example.s0_test.pw;

public class CorrectPasswordGenerator implements PasswordGeneratePolicy {
    @Override
    public String generatePassword() {
        return "aaabbbcc"; // 8글자
    }
}
